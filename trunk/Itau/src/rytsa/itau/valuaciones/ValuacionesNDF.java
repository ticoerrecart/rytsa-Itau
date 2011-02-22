package rytsa.itau.valuaciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rytsa.itau.db.factory.ProviderDTO;
import rytsa.itau.dominio.Mtm;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.utils.MiDoubleConverter;
import rytsa.itau.utils.MyLogger;
import rytsa.itau.valuaciones.dto.InformarNovedadesValuacionesXmlRequest;
import rytsa.itau.valuaciones.dto.RequestData;
import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.ndf.WSRecuperarOperacionesNDFAValuarResponse;
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
		RecuperoOperacionesNDFAValuarResponse operacionesNDF = operacionesNDFAValuar(pFechaProceso);
		if (operacionesNDF != null) {
			MyLogger.log("Comienza Calculo MTM para NDF para la fecha: "
					+ DateUtils.dateToString(pFechaProceso)
					+ ", cantidad de operaciones: "
					+ operacionesNDF.getRecuperoOperacionesNDFAValuarResult()
							.size());
		}
		return calculoMTM(pFechaProceso, operacionesNDF);
	}

	private static InformarNovedadesValuacionesXmlRequest calculoMTM(
			Date pFechaProceso,
			RecuperoOperacionesNDFAValuarResponse pOperacionesNDF)
			throws Exception {
		if (pOperacionesNDF == null
				|| pOperacionesNDF.getRecuperoOperacionesNDFAValuarResult() == null) {
			MyLogger.logError("No hay operaciones NDF a Valuar");
			// throw new Exception("No hay operaciones NDF a Valuar");
		}
		List<Mtm> listaMtm = new ArrayList<Mtm>();
		if (pOperacionesNDF != null) {
			for (OperacionNDFAValuarData operacionNDF : pOperacionesNDF
					.getRecuperoOperacionesNDFAValuarResult()) {
				if (mercadoValido(operacionNDF.getMercado())) {
					Mtm mtm = new Mtm(pFechaProceso, operacionNDF);
					listaMtm.add(mtm);
				}
			}
		}

		MyLogger.log("Filtro las operaciones con mercado v�lido ("
				+ resourceBundle.getString("mercados.validos")
				+ ")... total:  " + listaMtm.size());
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

			MyLogger.log("*************************************");
			MyLogger.log("C�digo " + rd.getCodigo());
			MyLogger.log("CodUsuario " + rd.getCodUsuario());
			MyLogger.log("Corrida " + rd.getCorrida());
			MyLogger.log("Fecha " + rd.getFecha());
			MyLogger.log("IdOperacion " + rd.getIdOperacion());
			MyLogger.log("MonedaValuacion " + rd.getMonedaValuacion());
			MyLogger.log("MTM " + rd.getMTM());
			MyLogger.log("*************************************");

			informar.addRequestData(rd);

		}
		informar.setCodFormula("MTMAC");
		if (listaMtm != null && listaMtm.size() > 0) {
			informar.setFechaProceso(DateUtils.dateToString(listaMtm.get(0)
					.getOperacionNDF().getFechaProceso(),
					Valuaciones.DATE_MASK_NOVEDADES));
		}
		XStream xs = ValuacionesNDF.getXStream();
		String xml = xs.toXML(informar);
		xml = xml.replace("\n", "");

		String rta = informarValuaciones(xml);

		MyLogger.log(rta);
		return informar;
	}

	private static boolean mercadoValido(String pMercado) {
		String mercados = resourceBundle.getString("mercados.validos");
		String[] ms = mercados.split(",");

		for (String mercado : ms) {
			if (mercado.trim().equalsIgnoreCase(pMercado.trim())) {
				return true;
			}
		}
		return false;
	}

	public static XStream getXStream() {
		XStream xs = new XStream(new DomDriver());
		xs.registerConverter(new MiDoubleConverter());
		String formatoFecha = resourceBundle.getString("servicios.RecuperoOperacionesNDFAValuar.dateMaskRespuesta");
		MyLogger.log("Formato de fecha utilizado para XStream en NDF :'"
				+ formatoFecha + "'");
		xs.registerConverter(new DateConverter(formatoFecha, new String[0]));
		xs.alias("response", RecuperoOperacionesNDFAValuarResponse.class);
		xs.alias("Operacion", OperacionNDFAValuarData.class);
		xs.omitField(RecuperoOperacionesNDFAValuarResponse.class, "count");
		xs.alias("InformarNovedadesValuacionesXmlRequest", InformarNovedadesValuacionesXmlRequest.class);
		xs.alias("RequestData", RequestData.class);
		xs.addImplicitCollection(InformarNovedadesValuacionesXmlRequest.class, "requestDataList");
		
		//Nuevos alias para WS_
		xs.alias("respuesta", WSRecuperarOperacionesNDFAValuarResponse.class);
		xs.alias("RecuperarOperacionesNDFAValuarResponse", RecuperoOperacionesNDFAValuarResponse.class);
		xs.omitField(WSRecuperarOperacionesNDFAValuarResponse.class, "cod-retorno");
		xs.omitField(WSRecuperarOperacionesNDFAValuarResponse.class, "mensajes");
		xs.alias("OperacionNDFAValuarData", OperacionNDFAValuarData.class);
		xs.aliasField("RecuperarOperacionesNDFAValuarResult", RecuperoOperacionesNDFAValuarResponse.class, "NDF");
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
		String sRta = null;
		try {
			String idSession = getIdSession();
			if (idSession != null) {
				client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
				
				String servicio = resourceBundle.getString("servicios.RecuperoOperacionesNDFAValuar.nombreServicio");
				String nombreParamIdSession = resourceBundle.getString("servicios.RecuperoOperacionesNDFAValuar.paramIdSession");
				String nombreParamFechaProceso = resourceBundle.getString("servicios.RecuperoOperacionesNDFAValuar.paramFechaProceso");
				String maskFechaProceso = resourceBundle.getString("servicios.RecuperoOperacionesNDFAValuar.dateMask");
				
				esbRequest = client.createRequest(servicio);
				esbRequest.setParameter(nombreParamIdSession,idSession);
				esbRequest.setParameter(nombreParamFechaProceso,DateUtils.dateToString(pFechaProceso,maskFechaProceso));
				
				client.execute(esbRequest, esbResponse);
				sRta = esbResponse.getResult();
				if (sRta != null && !sRta.startsWith("<error")) {
					salida = ProviderDTO.getRecuperoOperacionesNDFAValuarResponse(xs.fromXML(sRta));
				} else {
					MyLogger.logError("RESPUESTA XML operacionesNDFAValuar: "
							+ sRta);
				}
			} else {
				MyLogger.logError("No se pudo obtener el IdSession para recuperar las operacionesNDFAValuar");
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

		return salida;
	}
}