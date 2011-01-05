package rytsa.itau.valuaciones;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.ResourceBundle;

import rytsa.itau.utils.MyLogger;
import rytsa.itau.valuaciones.dto.InformarNovedadesValuacionesXmlRequest;
import rytsa.itau.valuaciones.dto.SeguridadResponse;
import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;

import com.thoughtworks.xstream.XStream;

/**
 * @author rerrecart
 * 
 */
public abstract class Valuaciones {

	protected static int DIAS;// 5400

	protected static int MODO;

	protected static int PUERTO;

	protected static String HOST;

	protected static String DATE_MASK;

	protected static String DATE_MASK_NOVEDADES;

	public static String DATE_MASK_RTA_FERIADOS;

	public static String DATE_MASK_CUPON_SWAP;

	public static String DATE_MASK_OPERACIONES_NDF_PATRON_LISTADO;

	public static String TABLA_FACTOR_DESC_FRACLI_FRACLIRF;

	protected static ResourceBundle resourceBundle;

	static {
		resourceBundle = ResourceBundle.getBundle("config");
		DIAS = Integer.parseInt(resourceBundle.getString("cantRegistros"));
		MODO = Integer.parseInt(resourceBundle.getString("esb.modo"));
		PUERTO = Integer.parseInt(resourceBundle.getString("esb.puerto"));
		HOST = resourceBundle.getString("esb.host");

		MyLogger.log("Configuraciï¿½n del ESB: host '" + HOST + "'| modo '"
				+ MODO + "'|puerto '" + PUERTO + "'");
		MyLogger.log("Cantidad de Registros (cantRegistros) '" + DIAS + "'");
		DATE_MASK = "dd-MM-yyyy";
		DATE_MASK_NOVEDADES = "yyyy-MM-dd";
		DATE_MASK_CUPON_SWAP = "yyyy-MM-dd";
		DATE_MASK_RTA_FERIADOS = "MM/dd/yyyy";
		DATE_MASK_OPERACIONES_NDF_PATRON_LISTADO = resourceBundle
				.getString("servicios.RecuperoOperacionesNDFAValuar.dateMask");
		MyLogger.log("Máscara de la fecha de Servicios de RecuperoOperacionesNDFAValuar '"
				+ DATE_MASK_OPERACIONES_NDF_PATRON_LISTADO + "'");
		TABLA_FACTOR_DESC_FRACLI_FRACLIRF = resourceBundle
				.getString("factorDesc.fraCli_fraCliRf");
	}

	protected static String convertStreamToString(InputStream is)
			throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		is.close();
		return sb.toString();
	}

	public static InformarNovedadesValuacionesXmlRequest calcularMTM(
			Date pFechaProceso) throws Exception {
		return null;
	}

	/**
	 * remueve los tags de apertura <soap:Envelope ...> y <soap:Body> y los
	 * respectivos de cierre
	 * 
	 * @param pXml
	 * @return
	 */
	/*
	 * public static String removerHeaderSoap(String pXml) { StringBuffer xml =
	 * new StringBuffer(); Scanner scanner = new Scanner(pXml); while
	 * (scanner.hasNextLine()) { String line = scanner.nextLine(); if
	 * (line.indexOf("soap:") < 0) { xml.append(line); } } return
	 * xml.toString(); }
	 */
	protected static String getIdSession() {
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client.createRequest(resourceBundle
					.getString("servicios.Login.nombreServicio"));
			esbRequest.setParameter("UserName",
					resourceBundle.getString("ws.userName"));
			esbRequest.setParameter("Password",
					resourceBundle.getString("ws.password"));
			esbRequest.setParameter("Ip", resourceBundle.getString("ws.ip"));
			esbRequest.setParameter("IdAplicacion", "2");

			MyLogger.log("Se ejecuto ESB Login ");
			client.execute(esbRequest, esbResponse);
			String sRta = esbResponse.getResult();
			XStream xs = ValuacionesNDF.getXStream();
			SeguridadResponse seg = (SeguridadResponse) xs.fromXML(sRta);
			return seg.getLoginSesionResponseData().getIdSesion();

		} catch (ESBClientException e) {
			MyLogger.logError(e.toString());
		} catch (Exception e) {
			MyLogger.logError(e.toString());
		} finally {
			if (client != null) {
				client.close();
			}
		}
		return null;

	}

	protected static String informarValuaciones(String xml) {
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			MyLogger.log("INFORMA VALUACIONES");
			MyLogger.log(xml);
			String idSession = getIdSession();
			if (idSession != null) {
				client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
				esbRequest = client
						.createRequest("WS_VALUACION_PATRON_MODIFICACION");

				esbRequest.setParameter("IdSesion", idSession);
				esbRequest.setParameter("XmlRequest", xml);

				client.execute(esbRequest, esbResponse);
				return esbResponse.getResult();
			} else {
				MyLogger.logError("No se pudo obtener el IdSession para poder informar las valuaciones");
				return null;
			}
		} catch (ESBClientException e) {
			MyLogger.logError(e.toString());
		} catch (Exception e) {
			MyLogger.logError(e.toString());
		} finally {
			if (client != null) {
				client.close();
			}
		}
		return null;

	}
}
