package rytsa.itau.valuaciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import org.easymock.EasyMock;

import rytsa.itau.dominio.Mtm;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.AgendaCuponOperacioneSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.RecuperoAgendaCuponesOperacionesSWAPAValuarResponse;
import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ValuacionesNDF extends Valuaciones {

	public static void calcularMTM(Date pFechaProceso) {
		RecuperoOperacionesNDFAValuarResponse operacionesNDF = operacionesNDFAValuar(pFechaProceso);
		ResourceBundle bundle = ResourceBundle.getBundle("config");
		calculoMTM(pFechaProceso, bundle, operacionesNDF);
	}

	private static void calculoMTM(Date pFechaProceso, ResourceBundle pBundle,
			RecuperoOperacionesNDFAValuarResponse pOperacionesNDF) {

		try {
			List<Mtm> listaMtm = new ArrayList<Mtm>();
			for (OperacionNDFAValuarData operacionNDF : pOperacionesNDF
					.getRecuperoOperacionesNDFAValuarResult()) {
				Mtm mtm = new Mtm();
				mtm.setPlazoRemanente(DateUtils.diferenciaEntreFechas(operacionNDF
						.getFechaVencimiento(), pFechaProceso));

				mtm.calcularFwd(pFechaProceso, operacionNDF, pBundle);

				mtm.calcularMtm(operacionNDF);
				listaMtm.add(mtm);
			}

			for (Mtm mtm : listaMtm) {
				//TODO hay que armar la coleccion para el WS InformarNovedadesValuaciones.
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static RecuperoOperacionesNDFAValuarResponse operacionesNDFAValuar(Date pFechaProceso) {
		XStream xs = new XStream(new DomDriver());
		xs.alias("RecuperoOperacionesNDFAValuarResponse",
				RecuperoAgendaCuponesOperacionesSWAPAValuarResponse.class);
		xs.alias("OperacionNDFAValuarData", AgendaCuponOperacioneSWAPAValuarData.class);

		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = null;
		try {
			// TODO easyMock
			esbResponse = EasyMock.createMock(ESBResponse.class);
			EasyMock
					.expect(esbResponse.getResult())
					.andReturn(
							convertStreamToString(Valuaciones.class
									.getResourceAsStream("/rytsa/itau/valuaciones/operacionesNDFAValuar.xml")));
			EasyMock.replay(esbResponse);
			// TODO easyMock

			client = ESBClientFactory.createInstance(modo, host, puerto);
			esbRequest = client.createRequest("RecuperoOperacionesNDFAValuar"); // nombre
			// del
			// servicio
			esbRequest.setParameter("OperacionesNDFAValuarRequestData", pFechaProceso);
			// client.execute(esbRequest, response); TODO descomentar
			String sRta = esbResponse.getResult();

			salida = (RecuperoOperacionesNDFAValuarResponse) xs.fromXML(sRta);
		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		} finally {
			if (client != null) {
				client.close();
			}
		}

		return salida;
	}

}
