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
	 * correspondientes de cada SWAP que se obtendrï¿½n desde el sistema de
	 * Patrï¿½n, para este cometido, se desarrollaron 2 Web Services que
	 * retornan dicha informaciï¿½n en formato XML, para ser consumidos desde
	 * cualquier plataforma. Una vez calculadas las valuaciones MTM de cada
	 * Swap, se debe ejecutar un Web Service del sistema Patrï¿½n que
	 * actualizarï¿½ los precios de cada SWAP necesarios para cerrar el dï¿½a y
	 * el cï¿½lculo de la contabilidad. Por ï¿½ltimo se deberï¿½ generar una
	 * tabla DBF o se actualizarï¿½ una tabla SQL con los Cï¿½lculos de tasas
	 * FWD.
	 * 
	 * 
	 */
	public static InformarNovedadesValuacionesXmlRequest calcularMTM(
			Date pFechaProceso) throws Exception {

		if (Valuaciones.LOGGEAR) {
			System.out
					.println("Comienza Calculo MTM para SWAPS para la fecha: "
							+ DateUtils.dateToString(pFechaProceso));
		}
		List<OperacionSWAPAValuarData> operaciones = operacionesSWAP(pFechaProceso);
		if (Valuaciones.LOGGEAR) {
			System.out
					.println("Comienza CONSTRUCCION DE TASAS FWD. Cantidad de Operaciones: "
							+ operaciones.size());
		}
		armarOperacionesSWAPParteFijaYVariable(operaciones);
		if (Valuaciones.LOGGEAR) {
			System.out
					.println("Armado de Partes Fijas y Variables.  Partes Fijas : "
							+ operacionesParteFija.size()
							+ "  Partes Variables : "
							+ operacionesParteVariable.size());
		}

		List<FeriadosResponse> lista = diasHabiles(pFechaProceso);

		construccionTasasFWD(lista.get(0), lista.get(1), pFechaProceso);

		if (Valuaciones.LOGGEAR) {
			System.out.println("Comienza Armado de Agenda para Calculo de MTM");
		}
		armarAgendaCuponOperaciones(agendaSWAP(), pFechaProceso);

		if (Valuaciones.LOGGEAR) {
			System.out.println("Comienza Calculo de MTM");
		}
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
				if (Valuaciones.LOGGEAR) {
					System.out.println("************MTM FIJA*****************");
					System.out.println("Código " + novedadF.getCodigo());
					System.out
							.println("CodUsuario " + novedadF.getCodUsuario());
					System.out.println("Corrida " + novedadF.getCorrida());
					System.out.println("Fecha " + novedadF.getFecha());// la
																		// fecha
					// ya está
					// formateada
					System.out.println("IdOperacion "
							+ novedadF.getIdOperacion());
					System.out.println("MonedaValuacion "
							+ novedadF.getMonedaValuacion());
					System.out.println("MTM " + novedadF.getMTM());
					System.out.println("*************************************");
				}
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
				if (Valuaciones.LOGGEAR) {
					System.out
							.println("************MTM VARIABLE*****************");
					System.out.println("Código " + novedadV.getCodigo());
					System.out
							.println("CodUsuario " + novedadV.getCodUsuario());
					System.out.println("Corrida " + novedadV.getCorrida());
					System.out.println("Fecha " + novedadV.getFecha());// la
																		// fecha
					// ya está
					// formateada
					System.out.println("IdOperacion "
							+ novedadV.getIdOperacion());
					System.out.println("MonedaValuacion "
							+ novedadV.getMonedaValuacion());
					System.out.println("MTM " + novedadV.getMTM());
					System.out.println("*************************************");
				}

			}

			if (Valuaciones.LOGGEAR) {
				System.out.println("NRO OPERACION: " + numeroOperacion);
				System.out.println("MTM FIJA: " + mtmFija);
				System.out.println("MTM VARIABLE: " + mtmVariable);
			}

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
		for (AgendaCuponOperacioneSWAPAValuarData agendaCupon : pOperacionesSWAP) {

			if (!agendaCupon.getNumeroOperacion().equals("0")) {

				try {
					if (Valuaciones.LOGGEAR) {
						System.out
								.println("------------------------------------");
						System.out.println("Procesando Cupon Numero:"
								+ agendaCupon.getNumeroOperacion());
					}

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
							agendaCuponOperaciones.put(
									agendaCupon.getNumeroOperacion(), lista);
						}

						if (agendaCupon.getTipoFlujo().equalsIgnoreCase(
								"Variable")) {

							if (Valuaciones.LOGGEAR) {
								System.out
										.println("************Parte Variable***********");
								System.out.println("Número Operación: "
										+ parteVariable.getNumeroOperacion());
								System.out.println("Número de Boleto: "
										+ parteVariable.getNumeroBoleto());
								System.out.println("ID Operación Relacionada: "
										+ parteVariable
												.getIdoperacionrelacionada());
								System.out.println("Fecha de Inicio: "
										+ parteVariable.getFechaInicio());
								System.out.println("Fecha Vencimiento: "
										+ parteVariable.getFechaVencimiento());
								System.out.println("Cantidad VN: "
										+ parteVariable.getCantidadVN());
								System.out.println("Metodo de Fixing: "
										+ parteVariable.getMetodoFixing());
								System.out.println("Base: "
										+ parteVariable.getBase());
								System.out
										.println("*************************************");
							}
						}

						if (agendaCupon.getTipoFlujo().equalsIgnoreCase("Fijo")) {

							if (Valuaciones.LOGGEAR) {
								System.out
										.println("************Parte Fija***********");
								System.out.println("Número Operación: "
										+ parteFija.getNumeroOperacion());
								System.out.println("Número de Boleto: "
										+ parteFija.getNumeroBoleto());
								System.out
										.println("ID Operación Relacionada: "
												+ parteFija
														.getIdoperacionrelacionada());
								System.out.println("Fecha de Inicio: "
										+ parteFija.getFechaInicio());
								System.out.println("Fecha Vencimiento: "
										+ parteFija.getFechaVencimiento());
								System.out.println("Cantidad VN: "
										+ parteFija.getCantidadVN());
								System.out.println("Metodo de Fixing: "
										+ parteFija.getMetodoFixing());
								System.out.println("Base: "
										+ parteFija.getBase());
								System.out
										.println("*************************************");
							}
						}

						CuponSWAP cuponSWAP = new CuponSWAP(pFechaProceso,
								agendaCupon, parteFija, parteVariable);
						if (Valuaciones.LOGGEAR) {
							System.out
									.println("************Cupon Swap***********");
							System.out.println("Plazo Residual: "
									+ cuponSWAP.getPlazoResidual());
							System.out.println("TNA Index: "
									+ cuponSWAP.getTnaIndex());
							System.out.println("VFutCli: "
									+ cuponSWAP.getVFutCli());
							System.out.println("FraCli: "
									+ cuponSWAP.getFraCli());
							System.out.println("VFutCliRf: "
									+ cuponSWAP.getVFutCliRf());
							System.out.println("FraCliRf: "
									+ cuponSWAP.getFraCliRf());
							System.out
									.println("*************************************");
						}

						lista.add(cuponSWAP);
					}
				} catch (Exception e) {
					if (Valuaciones.LOGGEAR) {
						System.out.println("Error en Cupon Numero:"
								+ agendaCupon.getNumeroOperacion());
						System.out.println(e.getMessage());
					}
				}
			} else {
				if (Valuaciones.LOGGEAR) {
					System.out.println("Cupon Ignorado. Cupon Numero:"
							+ agendaCupon.getNumeroOperacion());
				}
			}
		}
	}

	private static void armarOperacionesSWAPParteFijaYVariable(
			List<OperacionSWAPAValuarData> pOperacionesSWAP) {
		for (OperacionSWAPAValuarData operacionSWAP : pOperacionesSWAP) {

			if (mercadoValido(operacionSWAP.getMercado())) {
				if (operacionSWAP.getMetodoFixing().equalsIgnoreCase(
						"Tasa Fija")) {
					operacionesParteFija.put(operacionSWAP.getIDOperacion(),
							operacionSWAP);
				} else {
					operacionesParteVariable.put(
							operacionSWAP.getIDOperacion(), operacionSWAP);
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
		Iterator<FechaData> itr = feriadosResponse.getFeriadosResult()
				.iterator();

		// esto es para que me compare en vez de 5/5 , 4/5 a las 16:00 para que
		// no de problema de gmt
		fechaDesde = DateUtils.addHours(DateUtils.addDays(fechaDesde, -1), 16);

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

		if (Valuaciones.LOGGEAR) {
			System.out.println("Dias Habiles. Total: "
					+ fr.getFeriadosResult().size());
			System.out
					.println("Dias Habiles Necesarios Para el calculo. Total: "
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

			if (Valuaciones.LOGGEAR) {
				System.out.println("Se ejecuto ESB de Feriados");
			}

			String sRtaFeriados = esbResponse.getResult();

			fr = (FeriadosResponse) xs.fromXML(sRtaFeriados);
		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
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
			if (Valuaciones.LOGGEAR) {
				System.out.println("Se ejecuto ESB Agenda Operaciones SWAP ");
			}

			String sRtaAgendaCupones = esbResponse.getResult();

			salida = (RecuperarAgendaCuponesOperacionesSWAPAValuarResponse) xs
					.fromXML(sRtaAgendaCupones);
		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (client != null) {
				client.close();
			}
		}

		return salida.getRecuperoAgendaCuponesOperacionesSWAPAValuarResult();
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
			if (Valuaciones.LOGGEAR) {
				System.out.println("Se ejecuto ESB Operaciones SWAP a Valuar");
			}

			String sRtaOperaciones = esbResponse.getResult();

			salida = (RecuperarOperacionesSWAPAValuarResponse) xs
					.fromXML(sRtaOperaciones);
		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (client != null) {
				client.close();
			}
		}

		return salida.getRecuperoOperacionesSWAPAValuarResult();
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
				// 1) Armado de fechas PUBLIC_T + Factor de Actualizaciï¿½n
				// (Obtenido de Cupon_4).
				if (Valuaciones.LOGGEAR) {
					System.out.println("************************************");
					System.out.println("Calcular Factor de Actualizacion...");
				}
				tasa.calcularFactorDeActualizacion(pFechaProceso, DateUtils
						.stringToDate(fechaData.getFecha(),
								Valuaciones.DATE_MASK_RTA_FERIADOS));
				// 2) Obtener fechas de mercado (Fecha ï¿½Tï¿½)
				if (Valuaciones.LOGGEAR) {
					System.out.println("Calcular Fecha de Mercado...");
				}
				tasa.calcularFechaMercado();

				// 3) Obtener fechas de Vencimiento Plazos Fijos (Fecha ï¿½Dï¿½)
				if (Valuaciones.LOGGEAR) {
					System.out
							.println("Calcular Fecha de Vencimiento Plazo Fijo...");
				}
				tasa.calcularFechaVencimientoPzoFijo();
				if (Valuaciones.LOGGEAR) {
					System.out.println("************************************");
				}
				tasasFwd.add(tasa);
			} catch (ParseException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}// end for

		// Tengo q crear 28 Tasas forward mas para calcular las necesarias...
		// porque miramos tasas futuras.
		// En el arreglo final no las agrego
		if (Valuaciones.LOGGEAR) {
			System.out.println("***Comienza Calculo de Valores de Taza FWD***");
		}
		for (TasaFWD tasa : tasasFwd.subList(0, tasasFwd.size() - 31)) {
			try {
				if (Valuaciones.LOGGEAR) {
					System.out.println("************************************");
					System.out
							.println("Calcular Fecha de Publicacion Vencimiento ...");
				}
				tasa.calcularFechaPublicacionVencimiento(tasasFwd);

				if (Valuaciones.LOGGEAR) {
					System.out.println("Calcular Tasa Forward ...");
				}
				tasa.calcularTasaFWD();
				if (Valuaciones.LOGGEAR) {
					System.out.println("************************************");
				}
			} catch (ParseException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		DAO.crearTasaFWD(tasasFwd, pFechaProceso);
		if (Valuaciones.LOGGEAR) {
			System.out.println("***Persistiendo Tasas Forward ...***");
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
