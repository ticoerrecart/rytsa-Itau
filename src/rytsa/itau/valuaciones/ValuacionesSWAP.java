package rytsa.itau.valuaciones;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import rytsa.itau.db.DAO;
import rytsa.itau.dominio.CuponSWAP;
import rytsa.itau.dominio.TasaFWD;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.utils.MyLogger;
import rytsa.itau.valuaciones.dto.FechaData;
import rytsa.itau.valuaciones.dto.FeriadosResponse;
import rytsa.itau.valuaciones.dto.InformarNovedadesValuacionesXmlRequest;
import rytsa.itau.valuaciones.dto.RequestData;
import rytsa.itau.valuaciones.dto.swap.AgendaCuponOperacioneSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.DisponibilizacionFeriadosXmlRequestData;
import rytsa.itau.valuaciones.dto.swap.OperacionSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.RecuperarAgendaCuponesOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperarOperacionesSWAPAValuarResponse;
import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ValuacionesSWAP extends Valuaciones {

	private static Map<String, OperacionSWAPAValuarData> operacionesParteFija = new HashMap<String, OperacionSWAPAValuarData>();

	private static Map<String, OperacionSWAPAValuarData> operacionesParteVariable = new HashMap<String, OperacionSWAPAValuarData>();

	private static Map<String, List<CuponSWAP>> agendaCuponOperaciones = new HashMap<String, List<CuponSWAP>>();

	private static Double mtmFija = new Double(0);

	private static Double mtmVariable = new Double(0);

	/**
	 * Para ello es necesario obtener las operaciones de swaps y los cupones
	 * correspondientes de cada SWAP que se obtendr�n desde el sistema de
	 * Patr�n, para este cometido, se desarrollaron 2 Web Services que
	 * retornan dicha informaci�n en formato XML, para ser consumidos desde
	 * cualquier plataforma. Una vez calculadas las valuaciones MTM de cada
	 * Swap, se debe ejecutar un Web Service del sistema Patr�n que
	 * actualizar� los precios de cada SWAP necesarios para cerrar el d�a y
	 * el c�lculo de la contabilidad. Por �ltimo se deber� generar una
	 * tabla DBF o se actualizar� una tabla SQL con los C�lculos de tasas
	 * FWD.
	 * 
	 * 
	 */
	public static InformarNovedadesValuacionesXmlRequest calcularMTM(
			Date pFechaProceso) throws Exception {

		MyLogger.log("Comienza Calculo MTM para SWAPS para la fecha: "
				+ DateUtils.dateToString(pFechaProceso));
		List<OperacionSWAPAValuarData> operaciones = operacionesSWAP(pFechaProceso);
		if (operaciones != null) {
			MyLogger.log("Comienza CONSTRUCCION DE TASAS FWD. Cantidad de Operaciones: "
					+ operaciones.size());
		} else {
			MyLogger.logError("No hay Operaciones SWAP a Valuar");
		}
		armarOperacionesSWAPParteFijaYVariable(operaciones);
		MyLogger.log("Armado de Partes Fijas y Variables.  Partes Fijas : "
				+ operacionesParteFija.size() + "  Partes Variables : "
				+ operacionesParteVariable.size());

		List<FeriadosResponse> lista = diasHabiles(pFechaProceso);

		construccionTasasFWD(lista.get(0), lista.get(1), pFechaProceso);

		MyLogger.log("Comienza Armado de Agenda para Calculo de MTM");
		armarAgendaCuponOperaciones(agendaSWAP(), pFechaProceso);

		MyLogger.log("Comienza Calculo de MTM");

		return calculoMTM(pFechaProceso);
	}

	public static InformarNovedadesValuacionesXmlRequest calculoMTM(
			Date pFechaProceso) throws ParseException {
		// reseteo mtmFija y Variable.

		String SWAPS = "SWAPS";
		String fechaProceso = DateUtils.dateToString(pFechaProceso,
				Valuaciones.DATE_MASK_NOVEDADES);
		InformarNovedadesValuacionesXmlRequest listaNovedadesRD = new InformarNovedadesValuacionesXmlRequest();
		for (String numeroOperacion : agendaCuponOperaciones.keySet()) {
			mtmFija = new Double(0);
			mtmVariable = new Double(0);
			List<CuponSWAP> listaCuponesSWAP = agendaCuponOperaciones
					.get(numeroOperacion);
			for (CuponSWAP cuponSWAP : listaCuponesSWAP) {
				if (cuponSWAP.getOperacionParteFija() != null) {
					mtmFija = mtmFija + cuponSWAP.getFraCli();

				} else {
					mtmVariable = mtmVariable + cuponSWAP.getFraCliRf();

				}
			}// end for

			if (mtmFija != 0) {
				RequestData novedadF = new RequestData();
				novedadF.setCodigo(SWAPS);
				novedadF.setCorrida("1");
				novedadF.setMonedaValuacion(1);
				novedadF.setCodUsuario("FOX");
				novedadF.setFecha(fechaProceso);
				novedadF.setIdOperacion(numeroOperacion);
				novedadF.setMTM(mtmFija);
				listaNovedadesRD.addRequestData(novedadF);
				MyLogger.log("************MTM FIJA*****************");
				MyLogger.log("C�digo " + novedadF.getCodigo());
				MyLogger.log("CodUsuario " + novedadF.getCodUsuario());
				MyLogger.log("Corrida " + novedadF.getCorrida());
				MyLogger.log("Fecha " + novedadF.getFecha());// la
																// fecha
				// ya est�
				// formateada
				MyLogger.log("IdOperacion " + novedadF.getIdOperacion());
				MyLogger.log("MonedaValuacion " + novedadF.getMonedaValuacion());
				MyLogger.log("MTM " + novedadF.getMTM());
				MyLogger.log("*************************************");
			} else {
				RequestData novedadV = new RequestData();
				novedadV.setCodigo(SWAPS);
				novedadV.setCorrida("1");
				novedadV.setMonedaValuacion(1);
				novedadV.setCodUsuario("FOX");
				novedadV.setFecha(fechaProceso);
				novedadV.setIdOperacion(numeroOperacion);
				novedadV.setMTM(mtmVariable);
				listaNovedadesRD.addRequestData(novedadV);
				MyLogger.log("************MTM VARIABLE*****************");
				MyLogger.log("C�digo " + novedadV.getCodigo());
				MyLogger.log("CodUsuario " + novedadV.getCodUsuario());
				MyLogger.log("Corrida " + novedadV.getCorrida());
				MyLogger.log("Fecha " + novedadV.getFecha());// la
																// fecha
				// ya est�
				// formateada
				MyLogger.log("IdOperacion " + novedadV.getIdOperacion());
				MyLogger.log("MonedaValuacion " + novedadV.getMonedaValuacion());
				MyLogger.log("MTM " + novedadV.getMTM());
				MyLogger.log("*************************************");
			}

			MyLogger.log("NRO OPERACION: " + numeroOperacion);
			MyLogger.log("MTM FIJA: " + mtmFija);
			MyLogger.log("MTM VARIABLE: " + mtmVariable);

		}

		listaNovedadesRD.setCodFormula(SWAPS);
		listaNovedadesRD.setFechaProceso(fechaProceso);

		XStream xs = ValuacionesSWAP.getXStreamInformarNovedades();
		String xml = xs.toXML(listaNovedadesRD);
		xml = xml.replace("\n", "");

		informarValuaciones(xml);

		return listaNovedadesRD;
	}

	private static void armarAgendaCuponOperaciones(
			List<AgendaCuponOperacioneSWAPAValuarData> pOperacionesSWAP,
			Date pFechaProceso) throws Exception {
		if (pOperacionesSWAP != null) {
			for (AgendaCuponOperacioneSWAPAValuarData agendaCupon : pOperacionesSWAP) {

				if (!agendaCupon.getNumeroOperacion().equals("0")) {
					try {
						MyLogger.log("------------------------------------");
						MyLogger.log("Procesando Cupon Numero:"
								+ agendaCupon.getNumeroOperacion());

						OperacionSWAPAValuarData parteVariable = operacionesParteVariable
								.get(agendaCupon.getNumeroOperacion());
						OperacionSWAPAValuarData parteFija = operacionesParteFija
								.get(agendaCupon.getNumeroOperacion());
						// busco la lista
						if (parteVariable != null || parteFija != null) {
							List<CuponSWAP> lista = agendaCuponOperaciones
									.get(agendaCupon.getNumeroOperacion());
							if (lista == null) {// si la lista no existe la creo
								lista = new ArrayList<CuponSWAP>();
								agendaCuponOperaciones
										.put(agendaCupon.getNumeroOperacion(),
												lista);
							}

							if (agendaCupon.getTipoFlujo().equalsIgnoreCase(
									"Variable")) {

								MyLogger.log("************Parte Variable***********");
								MyLogger.log("N�mero Operaci�n: "
										+ parteVariable.getNumeroOperacion());
								MyLogger.log("N�mero de Boleto: "
										+ parteVariable.getNumeroBoleto());
								MyLogger.log("ID Operaci�n Relacionada: "
										+ parteVariable
												.getIdoperacionrelacionada());
								MyLogger.log("Fecha de Inicio: "
										+ parteVariable.getFechaInicio());
								MyLogger.log("Fecha Vencimiento: "
										+ parteVariable.getFechaVencimiento());
								MyLogger.log("Cantidad VN: "
										+ parteVariable.getCantidadVN());
								MyLogger.log("Metodo de Fixing: "
										+ parteVariable.getMetodoFixing());
								MyLogger.log("Base: " + parteVariable.getBase());
								MyLogger.log("*************************************");
							}

							if (agendaCupon.getTipoFlujo().equalsIgnoreCase(
									"Fijo")) {
								MyLogger.log("************Parte Fija***********");
								MyLogger.log("N�mero Operaci�n: "
										+ parteFija.getNumeroOperacion());
								MyLogger.log("N�mero de Boleto: "
										+ parteFija.getNumeroBoleto());
								MyLogger.log("ID Operaci�n Relacionada: "
										+ parteFija.getIdoperacionrelacionada());
								MyLogger.log("Fecha de Inicio: "
										+ parteFija.getFechaInicio());
								MyLogger.log("Fecha Vencimiento: "
										+ parteFija.getFechaVencimiento());
								MyLogger.log("Cantidad VN: "
										+ parteFija.getCantidadVN());
								MyLogger.log("Metodo de Fixing: "
										+ parteFija.getMetodoFixing());
								MyLogger.log("Base: " + parteFija.getBase());
								MyLogger.log("*************************************");
							}

							CuponSWAP cuponSWAP = new CuponSWAP(pFechaProceso,
									agendaCupon, parteFija, parteVariable);
							MyLogger.log("************Cupon Swap***********");
							MyLogger.log("Plazo Residual: "
									+ cuponSWAP.getPlazoResidual());
							MyLogger.log("TNA Index: "
									+ cuponSWAP.getTnaIndex());
							MyLogger.log("VFutCli: " + cuponSWAP.getVFutCli());
							MyLogger.log("FraCli: " + cuponSWAP.getFraCli());
							MyLogger.log("VFutCliRf: "
									+ cuponSWAP.getVFutCliRf());
							MyLogger.log("FraCliRf: " + cuponSWAP.getFraCliRf());
							MyLogger.log("*************************************");

							lista.add(cuponSWAP);
						}
					} catch (Exception e) {
						MyLogger.logError("Error en Cupon Numero:"
								+ agendaCupon.getNumeroOperacion());
						MyLogger.logError(e.toString());
					}
				} else {
					MyLogger.log("Cupon Ignorado. Cupon Numero:"
							+ agendaCupon.getNumeroOperacion());
				}
			}
		}
	}

	private static void armarOperacionesSWAPParteFijaYVariable(
			List<OperacionSWAPAValuarData> pOperacionesSWAP) {
		if (pOperacionesSWAP != null) {
			for (OperacionSWAPAValuarData operacionSWAP : pOperacionesSWAP) {

				if (mercadoValido(operacionSWAP.getMercado())) {
					if (operacionSWAP.getMetodoFixing().equalsIgnoreCase(
							"Tasa Fija")) {
						operacionesParteFija.put(
								operacionSWAP.getIDOperacion(), operacionSWAP);
					} else {
						operacionesParteVariable.put(
								operacionSWAP.getIDOperacion(), operacionSWAP);
					}
				}
			}
		}
	}

	public static XStream getXStreamOperacionesYFeriados() {
		XStream xs = new XStream(new DomDriver());
		xs.alias(resourceBundle.getString("servicios.FeriadosResponse"),
				FeriadosResponse.class);
		xs.alias(resourceBundle.getString("servicios.FechaData"),
				FechaData.class);
		xs.alias(resourceBundle
				.getString("servicios.RecuperoOperacionesSWAPAValuarResponse"),
				RecuperarOperacionesSWAPAValuarResponse.class);
		xs.alias(
				resourceBundle.getString("servicios.OperacionSWAPAValuarData"),
				OperacionSWAPAValuarData.class);
		xs.omitField(RecuperarOperacionesSWAPAValuarResponse.class, "count");
		xs.omitField(FeriadosResponse.class, "cod-retorno");
		xs.omitField(FeriadosResponse.class, "mensajes");
		xs.alias(
				resourceBundle
						.getString("servicios.DisponibilizacionFeriadosXmlRequestData"),
				DisponibilizacionFeriadosXmlRequestData.class);

		return xs;
	}

	public static XStream getXStreamInformarNovedades() {
		XStream xs = new XStream(new DomDriver());
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

	public static XStream getXStreamAgenda() {
		XStream xs = new XStream(new DomDriver());
		xs.alias(
				resourceBundle
						.getString("servicios.RecuperoAgendaCuponesOperacionesSWAPAValuarResponse"),
				RecuperarAgendaCuponesOperacionesSWAPAValuarResponse.class);
		xs.alias(resourceBundle
				.getString("servicios.AgendaCuponOperacioneSWAPAValuarData"),
				AgendaCuponOperacioneSWAPAValuarData.class);
		xs.omitField(
				RecuperarAgendaCuponesOperacionesSWAPAValuarResponse.class,
				"count");
		return xs;
	}

	/**
	 * Busca los dias que obtiene del properties. 5400.
	 * 
	 * @param pFechaProceso
	 * @return
	 * @throws ParseException
	 */
	public static List<FeriadosResponse> diasHabiles(Date pFechaProceso)
			throws ParseException {
		List<FeriadosResponse> lista = new ArrayList<FeriadosResponse>();

		FeriadosResponse fr = new FeriadosResponse();
		FeriadosResponse frTodos = new FeriadosResponse();
		lista.add(fr);
		lista.add(frTodos);

		int diasHabiles = 0;
		Date fechaDesde = pFechaProceso;
		Date fechaHasta = null;

		fechaHasta = DateUtils.addDays(fechaDesde, DIAS * 2);
		FeriadosResponse feriadosResponse = getDias(
				DateUtils.addDays(fechaDesde, -60), fechaHasta);

		// esto es para que me compare en vez de 5/5 , 4/5 a las 16:00 para que
		// no de problema de gmt
		fechaDesde = DateUtils.addHours(DateUtils.addDays(fechaDesde, -1), 16);

		if (feriadosResponse != null) {
			Iterator<FechaData> itr = feriadosResponse.getFeriadosResult()
					.iterator();
			while (itr.hasNext()) {
				FechaData fechaData = itr.next();
				if (!fechaData.getEsFeriado()) {// si es habil
					frTodos.addFechaData(fechaData);
					if (fechaDesde.before(DateUtils.stringToDate(
							fechaData.getFecha(),
							Valuaciones.DATE_MASK_RTA_FERIADOS))
							&& diasHabiles < DIAS) {
						fr.addFechaData(fechaData);
						diasHabiles++;
					}
				}
			}

			MyLogger.log("Dias Habiles. Total: "
					+ fr.getFeriadosResult().size());
			MyLogger.log("Dias Habiles Necesarios Para el calculo. Total: "
					+ frTodos.getFeriadosResult().size());
		}

		return lista;
	}

	public static FeriadosResponse getDias(Date pFechaDesde, Date pFechaHasta) {
		XStream xs = getXStreamOperacionesYFeriados();

		String idSession = Valuaciones.getIdSession();

		FeriadosResponse fr = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client.createRequest(resourceBundle
					.getString("servicios.Feriados.nombreServicio"));

			esbRequest.setParameter(resourceBundle
					.getString("servicios.Feriados.paramIdSession"), idSession);

			DisponibilizacionFeriadosXmlRequestData feriadosXml = new DisponibilizacionFeriadosXmlRequestData();
			feriadosXml.setFechaIni(pFechaDesde);
			feriadosXml.setFechaFin(pFechaHasta);
			feriadosXml.setIdCalendario(resourceBundle
					.getString("servicios.Feriados.idCalendarioValue"));

			String xml = xs.toXML(feriadosXml);
			xml = xml.replace("\n", "");
			esbRequest.setParameter(resourceBundle
					.getString("servicios.Feriados.paramXmlRequest"), xml);

			client.execute(esbRequest, esbResponse);

			MyLogger.log("Se ejecuto ESB de Feriados");

			String sRtaFeriados = esbResponse.getResult();

			fr = (FeriadosResponse) xs.fromXML(sRtaFeriados);
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

	public static List<AgendaCuponOperacioneSWAPAValuarData> agendaSWAP() {
		XStream xs = getXStreamAgenda();
		RecuperarAgendaCuponesOperacionesSWAPAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {

			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client
					.createRequest(resourceBundle
							.getString("servicios.RecuperoAgendaCuponesOperacionesSWAPAValuar.nombreServicio"));

			/**
			 * esbRequest .setParameter( resourceBundle .getString(
			 * "servicios.RecuperoAgendaCuponesOperacionesSWAPAValuar.paramFechaProceso"
			 * ), DateUtils.dateToString(pFechaProceso, DATE_MASK));
			 */
			client.execute(esbRequest, esbResponse);
			MyLogger.log("Se ejecuto ESB Agenda Operaciones SWAP ");

			String sRtaAgendaCupones = esbResponse.getResult();

			salida = (RecuperarAgendaCuponesOperacionesSWAPAValuarResponse) xs
					.fromXML(sRtaAgendaCupones);
		} catch (ESBClientException e) {
			MyLogger.logError(e.toString());
		} catch (Exception e) {
			MyLogger.logError(e.toString());
		} finally {
			if (client != null) {
				client.close();
			}
		}

		if (salida != null) {
			return salida
					.getRecuperoAgendaCuponesOperacionesSWAPAValuarResult();
		} else {
			return null;
		}
	}

	public static List<OperacionSWAPAValuarData> operacionesSWAP(
			Date pFechaProceso) {
		XStream xs = getXStreamOperacionesYFeriados();
		RecuperarOperacionesSWAPAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client
					.createRequest(resourceBundle
							.getString("servicios.RecuperoOperacionesSWAPAValuar.nombreServicio"));
			esbRequest
					.setParameter(
							resourceBundle
									.getString("servicios.RecuperoOperacionesSWAPAValuar.paramFechaProceso"),
							DateUtils.dateToString(pFechaProceso, DATE_MASK));
			client.execute(esbRequest, esbResponse);
			MyLogger.log("Se ejecuto ESB Operaciones SWAP a Valuar");

			String sRtaOperaciones = esbResponse.getResult();

			salida = (RecuperarOperacionesSWAPAValuarResponse) xs
					.fromXML(sRtaOperaciones);
		} catch (ESBClientException e) {
			MyLogger.logError(e.toString());
		} catch (Exception e) {
			MyLogger.logError(e.toString());
		} finally {
			if (client != null) {
				client.close();
			}
		}

		if (salida != null) {
			return salida.getRecuperoOperacionesSWAPAValuarResult();
		} else {
			return null;
		}
	}

	private static void construccionTasasFWD(
			FeriadosResponse pDiasHabilesACalcular,
			FeriadosResponse pDiasHabilesParaTasaFWD, Date pFechaProceso) {

		List<TasaFWD> tasasFwd = new ArrayList<TasaFWD>();
		// Double plazo = null;
		for (FechaData fechaData : pDiasHabilesACalcular.getFeriadosResult()) {
			try {

				TasaFWD tasa = new TasaFWD(
						pDiasHabilesParaTasaFWD.getFeriadosResult());
				// 1) Armado de fechas PUBLIC_T + Factor de Actualizaci�n
				// (Obtenido de Cupon_4).
				MyLogger.log("************************************");
				MyLogger.log("Calcular Factor de Actualizacion...");
				tasa.calcularFactorDeActualizacion(pFechaProceso, DateUtils
						.stringToDate(fechaData.getFecha(),
								Valuaciones.DATE_MASK_RTA_FERIADOS));
				// 2) Obtener fechas de mercado (Fecha �T�)
				MyLogger.log("Calcular Fecha de Mercado...");
				tasa.calcularFechaMercado();

				// 3) Obtener fechas de Vencimiento Plazos Fijos (Fecha �D�)
				MyLogger.log("Calcular Fecha de Vencimiento Plazo Fijo...");
				tasa.calcularFechaVencimientoPzoFijo();
				MyLogger.log("************************************");
				tasasFwd.add(tasa);
			} catch (ParseException e) {
				MyLogger.logError(e.toString());
			} catch (Exception e) {
				MyLogger.logError(e.toString());
			}
		}// end for

		// Tengo q crear 28 Tasas forward mas para calcular las necesarias...
		// porque miramos tasas futuras.
		// En el arreglo final no las agrego
		MyLogger.log("***Comienza Calculo de Valores de Taza FWD***");
		if (tasasFwd.size() > 31) {
			for (TasaFWD tasa : tasasFwd.subList(0, tasasFwd.size() - 31)) {
				try {
					MyLogger.log("************************************");
					MyLogger.log("Calcular Fecha de Publicacion Vencimiento ...");
					tasa.calcularFechaPublicacionVencimiento(tasasFwd);

					MyLogger.log("Calcular Tasa Forward ...");
					tasa.calcularTasaFWD();
					MyLogger.log("************************************");
				} catch (ParseException e) {
					MyLogger.logError(e.toString());
				} catch (Exception e) {
					MyLogger.logError(e.toString());
				}
			}
			DAO.crearTasaFWD(tasasFwd, pFechaProceso);
			MyLogger.log("***Persistiendo Tasas Forward ...***");
		}

	}

	private static boolean mercadoValido(String pMercado) {
		String mercados = resourceBundle.getString("mercados.validos.swap");
		String[] ms = mercados.split(",");

		for (String mercado : ms) {
			if (mercado.trim().equalsIgnoreCase(pMercado.trim())) {
				return true;
			}
		}
		return false;
	}

}