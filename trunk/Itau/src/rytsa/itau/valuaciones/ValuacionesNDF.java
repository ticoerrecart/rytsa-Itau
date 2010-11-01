package rytsa.itau.valuaciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rytsa.itau.dominio.Mtm;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.InformarNovedadesValuacionesXmlRequest;
import rytsa.itau.valuaciones.dto.LoginSesionResponseData;
import rytsa.itau.valuaciones.dto.RequestData;
import rytsa.itau.valuaciones.dto.SeguridadResponse;
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

	public static InformarNovedadesValuacionesXmlRequest calcularMTM(
			Date pFechaProceso) throws Exception {

		RecuperoOperacionesNDFAValuarResponse operacionesNDF = null;
		operacionesNDF = operacionesNDFAValuar(pFechaProceso);

		return calculoMTM(pFechaProceso, operacionesNDF);
	}

	private static InformarNovedadesValuacionesXmlRequest calculoMTM(
			Date pFechaProceso,
			RecuperoOperacionesNDFAValuarResponse pOperacionesNDF)
			throws Exception {

		List<Mtm> listaMtm = new ArrayList<Mtm>();
		for (OperacionNDFAValuarData operacionNDF : pOperacionesNDF
				.getRecuperoOperacionesNDFAValuarResult()) {
			if (mercadoValido(operacionNDF.getMercado())) {
				Mtm mtm = new Mtm(pFechaProceso, operacionNDF);
				listaMtm.add(mtm);
			}
		}

		InformarNovedadesValuacionesXmlRequest informar = new InformarNovedadesValuacionesXmlRequest();
		for (Mtm mtm : listaMtm) {
			// InformarNovedadesValuaciones.
			RequestData rd = new RequestData();
			rd.setCodigo("MTMAC");
			rd.setCodUsuario("FOX");
			rd.setCorrida("1");
			rd.setFecha(DateUtils.dateToString(mtm.getOperacionNDF()
					.getFechaProceso(), Valuaciones.DATE_MASK_NOVEDADES));
			rd.setIdOperacion(mtm.getOperacionNDF().getIDOperacion());
			rd.setMonedaValuacion(1);
			rd.setMTM(mtm.getMtm());
			informar.addRequestData(rd);

		}
		informar.setCodFormula("MTMAC");
		informar.setFechaProceso(DateUtils.dateToString(listaMtm.get(0)
				.getOperacionNDF().getFechaProceso(),
				Valuaciones.DATE_MASK_NOVEDADES));

		XStream xs = ValuacionesNDF.getXStream();
		String xml = xs.toXML(informar);
		xml = xml.replace("\n", "");
		String resutl = informarValuaciones(xml);
		System.out.println(resutl);
		return informar;
	}

	private static boolean mercadoValido(String pMercado) {
		String mercados = resourceBundle.getString("mercados.validos");
		String[] ms = mercados.split(",");

		for (String mercado : ms) {
			if (mercado.equalsIgnoreCase(pMercado)) {
				return true;
			}
		}
		return false;
	}

	public static XStream getXStream() {
		XStream xs = new XStream(new DomDriver());
		xs.registerConverter(new DateConverter("yyyy-MM-dd hh:mm:ss.S",
				new String[0]));
		xs.alias(resourceBundle
				.getString("servicios.RecuperoOperacionesNDFAValuarResponse"),
				RecuperoOperacionesNDFAValuarResponse.class);
		xs.alias(resourceBundle.getString("servicios.OperacionNDFAValuarData"),
				OperacionNDFAValuarData.class);
		xs.omitField(RecuperoOperacionesNDFAValuarResponse.class, "count");
		xs.alias(resourceBundle.getString("servicios.LoginResponse"),
				SeguridadResponse.class);
		xs.omitField(SeguridadResponse.class, "cod-retorno");
		xs.omitField(SeguridadResponse.class, "mensajes");
		xs.alias(resourceBundle.getString("servicios.LoginSesionResponseData"),
				LoginSesionResponseData.class);
		xs.alias(
				resourceBundle
						.getString("servicios.informarNovedades.InformarNovedadesValuacionesXmlRequest"),
				InformarNovedadesValuacionesXmlRequest.class);
		xs.alias(resourceBundle
				.getString("servicios.informarNovedades.requestData"),
				RequestData.class);
		xs.addImplicitCollection(InformarNovedadesValuacionesXmlRequest.class,
				"requestDataList");
		return xs;
	}

	/*
	 * Recupera las Operaciones NDF a Valuar utilizando ESB.
	 */
	private static RecuperoOperacionesNDFAValuarResponse operacionesNDFAValuar(
			Date pFechaProceso) {
		XStream xs = getXStream();

		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client
					.createRequest(resourceBundle
							.getString("servicios.RecuperoOperacionesNDFAValuar.nombreServicio"));
			esbRequest
					.setParameter(
							resourceBundle
									.getString("servicios.RecuperoOperacionesNDFAValuar.paramFechaProceso"),
							DateUtils.dateToString(pFechaProceso, DATE_MASK));
			client.execute(esbRequest, esbResponse);
			String sRta = removerHeaderSoap(esbResponse.getResult());

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