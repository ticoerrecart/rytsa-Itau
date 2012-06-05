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

	public static InformarNovedadesValuacionesXmlRequest calcularMTM(Date pFechaProceso)
			throws Exception {
		RecuperoOperacionesNDFAValuarResponse operacionesNDF = operacionesNDFAValuar(pFechaProceso);
		if (operacionesNDF != null) {
			MyLogger.log("Comienza Calculo MTM para NDF para la fecha: "
					+ DateUtils.dateToString(pFechaProceso) + ", cantidad de operaciones: "
					+ operacionesNDF.getRecuperoOperacionesNDFAValuarResult().size());
		}
		return calculoMTM(pFechaProceso, operacionesNDF);
	}

	private static Date calcularFechaProcesoParaPlazoRemanente(Date pFechaProceso,
			boolean esUltimoDiaHabilDelMes, boolean esUltimoDiaDelMes, Date fUltimoDiaDelMes) {
		Date fechaProceso = pFechaProceso;
		if (esUltimoDiaHabilDelMes) {//si es el ultimo dia habil del mes
			if (!esUltimoDiaDelMes) {//si NO es el ultimo dia del mes
				//calculo el plazo remanente con el ultimo dia del mes
				fechaProceso = fUltimoDiaDelMes;
			}
		}
		return fechaProceso;
	}

	private static Date calcularFechaProceso(Date pFechaProceso, boolean esUltimoDiaHabilDelMes,
			Date fUltimoDiaDelMes) {
		Date fechaProceso = pFechaProceso;
		if (esUltimoDiaHabilDelMes) {//si es el ultimo dia habil del mes
			fechaProceso = fUltimoDiaDelMes;
		}
		return fechaProceso;
	}

	/*
	 * Copi√© y compromet√≠ la modificaci√≥n hecha por Alexis. FE, Ene/2011
	 */
	private static InformarNovedadesValuacionesXmlRequest calculoMTM(Date pFechaProceso,
			RecuperoOperacionesNDFAValuarResponse pOperacionesNDF) throws Exception {
		if (pOperacionesNDF == null
				|| pOperacionesNDF.getRecuperoOperacionesNDFAValuarResult() == null) {
			MyLogger.logError("No hay operaciones NDF a Valuar");
			// throw new Exception("No hay operaciones NDF a Valuar");
		}
		List<Mtm> listaMtm = new ArrayList<Mtm>();
		if (pOperacionesNDF != null) {
			//cambio 04/06/2012
			boolean esUltimoDiaHabilDelMes = esFechaProcesoUltimoDiaHabilDelMes();
			boolean esUltimoDiaDelMes = esFechaProcesoUltimoDiaDelMes();
			Date fUltimoDiaDelMes = ultimoDiaDelMes();
			MyLogger.log("La fecha de Proceso " + pFechaProceso
					+ " es el ˙ltimo dÌa h·bil del mes: " + esUltimoDiaHabilDelMes
					+ ", es el ˙ltimo dÌa del mes: " + esUltimoDiaDelMes
					+ " y el ˙ltimo dÌa del mes calculado es: "
					+ DateUtils.dateToString(fUltimoDiaDelMes));

			Date fechaProcesoParaPlazoRemanente = calcularFechaProcesoParaPlazoRemanente(
					pFechaProceso, esUltimoDiaHabilDelMes, esUltimoDiaDelMes, fUltimoDiaDelMes);
			Date fechaProceso = calcularFechaProceso(pFechaProceso, esUltimoDiaHabilDelMes,
					fUltimoDiaDelMes);

			MyLogger.log("Fecha de Proceso calculada: " + DateUtils.dateToString(fechaProceso));
			MyLogger.log("Fecha de Proceso para Plazo Remanente: "
					+ DateUtils.dateToString(fechaProcesoParaPlazoRemanente));

			for (OperacionNDFAValuarData operacionNDF : pOperacionesNDF
					.getRecuperoOperacionesNDFAValuarResult()) {
				if (mercadoValido(operacionNDF.getMercado())) {
					Mtm mtm = new Mtm(fechaProceso, fechaProcesoParaPlazoRemanente, operacionNDF,
							esUltimoDiaHabilDelMes, esUltimoDiaDelMes, fUltimoDiaDelMes);
					listaMtm.add(mtm);
				}
			}
		}

		MyLogger.log("Filtro las operaciones con mercado vÔøΩlido ("
				+ resourceBundle.getString("mercados.validos") + ")... total:  " + listaMtm.size());
		InformarNovedadesValuacionesXmlRequest informar = new InformarNovedadesValuacionesXmlRequest();
		for (Mtm mtm : listaMtm) {
			// InformarNovedadesValuaciones.
			RequestData rd = new RequestData();
			rd.setCodigo("MTMAC");
			rd.setCodUsuario("FOX");
			rd.setCorrida("1");

			// Modificaci√≥n Alexis 17-01-2011
			// rd.setFecha(DateUtils.dateToString(mtm.getOperacionNDF()
			// .getFechaProceso(), Valuaciones.DATE_MASK_NOVEDADES));
			rd.setFecha(DateUtils.dateToString(pFechaProceso, Valuaciones.DATE_MASK_NOVEDADES));

			rd.setIdOperacion(mtm.getOperacionNDF().getIDOperacion());
			rd.setMonedaValuacion(1);
			rd.setMTM(mtm.getMtm());

			MyLogger.log("*************************************");
			MyLogger.log("CÔøΩdigo " + rd.getCodigo());
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
			// Modificaci√≥n Alexis 17-01-2011
			// informar.setFechaProceso(DateUtils.dateToString(listaMtm.get(0)
			// .getOperacionNDF().getFechaProceso(),
			// Valuaciones.DATE_MASK_NOVEDADES));
			informar.setFechaProceso(DateUtils.dateToString(pFechaProceso,
					Valuaciones.DATE_MASK_NOVEDADES));

			XStream xs = ValuacionesNDF.getXStream();
			String xml = xs.toXML(informar);
			xml = xml.replace("\n", "");

			String rta = informarValuaciones(xml);

			MyLogger.log(rta);
		} else {
			MyLogger.log("Sin operaciones para valuar ProcesadoCompletamente");
		}

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
		String formatoFecha = resourceBundle
				.getString("servicios.RecuperoOperacionesNDFAValuar.dateMaskRespuesta");
		MyLogger.log("Formato de fecha utilizado para XStream en NDF :'" + formatoFecha + "'");
		xs.registerConverter(new DateConverter(formatoFecha, new String[0]));
		xs.alias("response", RecuperoOperacionesNDFAValuarResponse.class);
		xs.alias("Operacion", OperacionNDFAValuarData.class);
		xs.omitField(RecuperoOperacionesNDFAValuarResponse.class, "count");
		xs.alias("InformarNovedadesValuacionesXmlRequest",
				InformarNovedadesValuacionesXmlRequest.class);
		xs.alias("RequestData", RequestData.class);
		xs.addImplicitCollection(InformarNovedadesValuacionesXmlRequest.class, "requestDataList");

		// Nuevos alias para WS_
		xs.alias("respuesta", WSRecuperarOperacionesNDFAValuarResponse.class);
		xs.alias("RecuperarOperacionesNDFAValuarResponse",
				RecuperoOperacionesNDFAValuarResponse.class);
		xs.omitField(WSRecuperarOperacionesNDFAValuarResponse.class, "cod-retorno");
		xs.omitField(WSRecuperarOperacionesNDFAValuarResponse.class, "mensajes");
		xs.alias("OperacionNDFAValuarData", OperacionNDFAValuarData.class);
		xs.aliasField("RecuperarOperacionesNDFAValuarResult",
				RecuperoOperacionesNDFAValuarResponse.class, "NDF");
		return xs;
	}

	/*
	 * Recupera las Operaciones NDF a Valuar utilizando ESB.
	 */
	private static RecuperoOperacionesNDFAValuarResponse operacionesNDFAValuar(Date pFechaProceso) {
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

				String servicio = resourceBundle
						.getString("servicios.RecuperoOperacionesNDFAValuar.nombreServicio");
				String nombreParamIdSession = resourceBundle
						.getString("servicios.RecuperoOperacionesNDFAValuar.paramIdSession");
				String nombreParamFechaProceso = resourceBundle
						.getString("servicios.RecuperoOperacionesNDFAValuar.paramFechaProceso");
				String maskFechaProceso = resourceBundle
						.getString("servicios.RecuperoOperacionesNDFAValuar.dateMask");

				esbRequest = client.createRequest(servicio);
				esbRequest.setParameter(nombreParamIdSession, idSession);
				esbRequest.setParameter(nombreParamFechaProceso,
						DateUtils.dateToString(pFechaProceso, maskFechaProceso));

				client.execute(esbRequest, esbResponse);
				sRta = esbResponse.getResult();
				if (sRta != null && !sRta.startsWith("<error")) {
					salida = ProviderDTO.getRecuperoOperacionesNDFAValuarResponse(xs.fromXML(sRta));
					MyLogger.log("RESPUESTA XML operacionesNDFAValuar: " + sRta);
				} else {
					MyLogger.logError("RESPUESTA XML operacionesNDFAValuar: " + sRta);
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