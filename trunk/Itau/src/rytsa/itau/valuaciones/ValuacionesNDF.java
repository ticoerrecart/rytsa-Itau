package rytsa.itau.valuaciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.easymock.EasyMock;

import rytsa.itau.dominio.Mtm;
import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ValuacionesNDF extends Valuaciones {

	public static Mtm calcularMTM(Date pFechaProceso) throws Exception {
		RecuperoOperacionesNDFAValuarResponse operacionesNDF = operacionesNDFAValuar(pFechaProceso);
		return calculoMTM(pFechaProceso, operacionesNDF);
	}

	private static Mtm calculoMTM(Date pFechaProceso,
			RecuperoOperacionesNDFAValuarResponse pOperacionesNDF) throws Exception {

			List<Mtm> listaMtm = new ArrayList<Mtm>();
			for (OperacionNDFAValuarData operacionNDF : pOperacionesNDF
					.getRecuperoOperacionesNDFAValuarResult()) {
				Mtm mtm = new Mtm(pFechaProceso, operacionNDF);
				listaMtm.add(mtm);
			}

		/*	for (Mtm mtm : listaMtm) {
				//TODO hay que armar la coleccion para el WS InformarNovedadesValuaciones.
			}*/
			return listaMtm.get(0);
	}

	private static RecuperoOperacionesNDFAValuarResponse operacionesNDFAValuar(Date pFechaProceso) {
		XStream xs = new XStream(new DomDriver());
		xs.registerConverter(new DateConverter("dd/MM/yyyy", new String[0]));
		xs.alias("RecuperoOperacionesNDFAValuarResponse",
				RecuperoOperacionesNDFAValuarResponse.class);
		xs.alias("OperacionNDFAValuarData", OperacionNDFAValuarData.class);

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
