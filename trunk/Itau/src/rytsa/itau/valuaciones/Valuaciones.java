package rytsa.itau.valuaciones;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import rytsa.itau.utils.DateUtils;
import rytsa.itau.utils.MyLogger;
import rytsa.itau.valuaciones.dto.FechaData;
import rytsa.itau.valuaciones.dto.FeriadosResponse;
import rytsa.itau.valuaciones.dto.InformarNovedadesValuacionesXmlRequest;
import rytsa.itau.valuaciones.dto.LoginSesionResponseData;
import rytsa.itau.valuaciones.dto.SeguridadResponse;
import rytsa.itau.valuaciones.dto.swap.DisponibilizacionFeriadosXmlRequestData;
import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

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

	protected static List<FechaData> listaDiasHabilesParaCalculo;

	protected static List<FechaData> listaDiasHabiles;

	public static Date fechaProceso;

	static {
		if (fechaProceso == null) {
			throw new RuntimeException("La fecha de proceso no puede ser nula.  Error en clase "
					+ Valuaciones.class.getName());
		}
		resourceBundle = ResourceBundle.getBundle("config");
		DIAS = Integer.parseInt(resourceBundle.getString("cantRegistros"));
		MODO = Integer.parseInt(resourceBundle.getString("esb.modo"));
		PUERTO = Integer.parseInt(resourceBundle.getString("esb.puerto"));
		HOST = resourceBundle.getString("esb.host");

		MyLogger.log("Configuraciï¿½n del ESB: host '" + HOST + "'| modo '" + MODO + "'|puerto '"
				+ PUERTO + "'");
		MyLogger.log("Cantidad de Registros (cantRegistros) '" + DIAS + "'");
		DATE_MASK = "dd-MM-yyyy";
		DATE_MASK_NOVEDADES = "yyyy-MM-dd";
		DATE_MASK_CUPON_SWAP = "yyyy-MM-dd";
		DATE_MASK_RTA_FERIADOS = "MM/dd/yyyy";
		DATE_MASK_OPERACIONES_NDF_PATRON_LISTADO = resourceBundle
				.getString("servicios.RecuperoOperacionesNDFAValuar.dateMask");
		MyLogger.log("Máscara de la fecha de Servicios de RecuperoOperacionesNDFAValuar '"
				+ DATE_MASK_OPERACIONES_NDF_PATRON_LISTADO + "'");
		TABLA_FACTOR_DESC_FRACLI_FRACLIRF = resourceBundle.getString("factorDesc.fraCli_fraCliRf");

		try {
			diasHabiles(fechaProceso);
		} catch (ParseException e) {
			MyLogger.logError("No se pudieron obtener los días habiles iniciales para el cálculo.");
		}
	}

	protected static String convertStreamToString(InputStream is) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		is.close();
		return sb.toString();
	}

	public static InformarNovedadesValuacionesXmlRequest calcularMTM(Date pFechaProceso)
			throws Exception {
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
			esbRequest.setParameter("UserName", resourceBundle.getString("ws.userName"));
			esbRequest.setParameter("Password", resourceBundle.getString("ws.password"));
			esbRequest.setParameter("Ip", resourceBundle.getString("ws.ip"));
			esbRequest.setParameter("IdAplicacion", "2");

			MyLogger.log("Se ejecuto ESB Login ");
			client.execute(esbRequest, esbResponse);
			String sRta = esbResponse.getResult();
			XStream xs = Valuaciones.getXStreamLogin();
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

	protected static XStream getXStreamLogin() {
		XStream xs = new XStream(new DomDriver());
		xs.alias("respuesta", SeguridadResponse.class);
		xs.omitField(SeguridadResponse.class, "cod-retorno");
		xs.omitField(SeguridadResponse.class, "mensajes");
		xs.alias("LoginSesionResponseData", LoginSesionResponseData.class);
		return xs;
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
				esbRequest = client.createRequest("WS_VALUACION_PATRON_MODIFICACION");

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

	/*
	 * Versión de esDiaHabil que usa el arreglo de diasHabiles como cache.
	 */
	public static boolean esDiaHabil(Date pFecha) throws ParseException {
		FechaData fechaData = null;

		for (FechaData fd : listaDiasHabiles) {
			if (DateUtils.dateToString(
					DateUtils.stringToDate(fd.getFecha(), Valuaciones.DATE_MASK_RTA_FERIADOS),
					Valuaciones.DATE_MASK_RTA_FERIADOS).equals(
					DateUtils.dateToString(pFecha, Valuaciones.DATE_MASK_RTA_FERIADOS))) {
				fechaData = fd;
				break;
			}
		}

		if (fechaData == null) {
			Date primerDia = DateUtils.stringToDate(listaDiasHabiles.get(0).getFecha(),
					Valuaciones.DATE_MASK_RTA_FERIADOS);
			Date ultimoDia = DateUtils.stringToDate(
					listaDiasHabiles.get(listaDiasHabiles.size() - 1).getFecha(),
					Valuaciones.DATE_MASK_RTA_FERIADOS);
			if (pFecha.after(ultimoDia) || pFecha.before(primerDia)) {
				FeriadosResponse fr = Valuaciones.getDias(pFecha, DateUtils.addDays(pFecha, 1));
				return !((FechaData) fr.getFeriadosResult().get(0)).getEsFeriado();

			} else {
				return false;
			}
		}

		return true;
	}

	/**
	 * Busca los dias que obtiene del properties. 5400.
	 * 
	 * @param pFechaProceso
	 * @return
	 * @throws ParseException
	 */
	private static void diasHabiles(Date pFechaProceso) throws ParseException {
		/*List<FeriadosResponse> lista = new ArrayList<FeriadosResponse>();

		FeriadosResponse fr = new FeriadosResponse();
		FeriadosResponse frTodos = new FeriadosResponse();
		lista.add(fr);
		lista.add(frTodos);*/
		listaDiasHabilesParaCalculo = new ArrayList<FechaData>();
		listaDiasHabiles = new ArrayList<FechaData>();

		int contDiasHabiles = 0;
		Date fechaDesde = pFechaProceso;
		Date fechaHasta = null;

		fechaHasta = DateUtils.addDays(fechaDesde, DIAS * 2);
		FeriadosResponse feriadosResponse = getDias(DateUtils.addDays(fechaDesde, -60), fechaHasta);

		// esto es para que me compare en vez de 5/5 , 4/5 a las 16:00 para que
		// no de problema de gmt
		fechaDesde = DateUtils.addHours(DateUtils.addDays(fechaDesde, -1), 16);

		if (feriadosResponse != null) {
			Iterator<FechaData> itr = feriadosResponse.getFeriadosResult().iterator();
			while (itr.hasNext()) {
				FechaData fechaData = itr.next();
				if (!fechaData.getEsFeriado()) {// si es habil
					//frTodos.addFechaData(fechaData);
					listaDiasHabiles.add(fechaData);
					if (fechaDesde.before(DateUtils.stringToDate(fechaData.getFecha(),
							Valuaciones.DATE_MASK_RTA_FERIADOS)) && contDiasHabiles < DIAS) {
						//fr.addFechaData(fechaData);
						listaDiasHabilesParaCalculo.add(fechaData);
						contDiasHabiles++;
					}
				}
			}

			MyLogger.log("Dias Habiles. Total: " + listaDiasHabiles.size());
			MyLogger.log("Dias Habiles Necesarios Para el calculo. Total: "
					+ listaDiasHabilesParaCalculo.size());
		}

		//return lista;
	}

	private static XStream getXStreamFeriados() {
		XStream xs = new XStream(new DomDriver());
		xs.alias("respuesta", FeriadosResponse.class);
		xs.alias("DisponibilizacionFeriadosXmlResponseData", FechaData.class);
		xs.omitField(FeriadosResponse.class, "cod-retorno");
		xs.omitField(FeriadosResponse.class, "mensajes");
		xs.alias("DisponibilizacionFeriadosXmlRequestData",
				DisponibilizacionFeriadosXmlRequestData.class);
		return xs;
	}

	protected static FeriadosResponse getDias(Date pFechaDesde, Date pFechaHasta) {
		XStream xs = getXStreamFeriados();

		String idSession = Valuaciones.getIdSession();

		FeriadosResponse fr = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client.createRequest(resourceBundle
					.getString("servicios.Feriados.nombreServicio"));
			esbRequest.setParameter(resourceBundle.getString("servicios.Feriados.paramIdSession"),
					idSession);

			DisponibilizacionFeriadosXmlRequestData feriadosXml = new DisponibilizacionFeriadosXmlRequestData();
			feriadosXml.setFechaIni(pFechaDesde);
			feriadosXml.setFechaFin(pFechaHasta);
			feriadosXml.setIdCalendario(resourceBundle
					.getString("servicios.Feriados.idCalendarioValue"));

			String xml = xs.toXML(feriadosXml);
			xml = xml.replace("\n", "");
			esbRequest.setParameter(resourceBundle.getString("servicios.Feriados.paramXmlRequest"),
					xml);

			client.execute(esbRequest, esbResponse);

			MyLogger.log("Se ejecuto ESB de Feriados");

			String sRtaFeriados = esbResponse.getResult();
			if (sRtaFeriados != null && !sRtaFeriados.startsWith("<error")) {
				fr = (FeriadosResponse) xs.fromXML(sRtaFeriados);
			} else {
				MyLogger.logError("RESPUESTA XML Feriados: " + sRtaFeriados);
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

		return fr;
	}

	private static Date ultimoDiaHabilDelMes(Date pDate) {
		Date ultimoDiaDelMes = DateUtils.ultimoDiaDelMes(pDate);
		try {
			while (!esDiaHabil(ultimoDiaDelMes)) {
				ultimoDiaDelMes = DateUtils.addDays(ultimoDiaDelMes, -1);
			}
		} catch (ParseException e) {
			MyLogger.logError("No se pudo encontrar el último día hábil del mes para la fecha "
					+ pDate);
		}

		return ultimoDiaDelMes;
	}

	public static boolean esFechaProcesoUltimoDiaHabilDelMes() {
		return DateUtils.diferenciaEntreFechas(fechaProceso, ultimoDiaHabilDelMes(fechaProceso)) == 0;
	}

	public static boolean esFechaProcesoUltimoDiaDelMes() {
		return DateUtils.diferenciaEntreFechas(fechaProceso,
				DateUtils.ultimoDiaDelMes(fechaProceso)) == 0;
	}

	public static Date ultimoDiaDelMes() {
		return DateUtils.ultimoDiaDelMes(fechaProceso);
	}

	public static Date getFechaProceso() {
		return fechaProceso;
	}

	public static void setFechaProceso(Date fechaProceso) {
		Valuaciones.fechaProceso = fechaProceso;
	}

}
