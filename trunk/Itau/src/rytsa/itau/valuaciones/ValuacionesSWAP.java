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
	public static InformarNovedadesValuacionesXmlRequest calcularMTM(Date pFechaProceso)
			throws Exception {

		if (Valuaciones.LOGGEAR) {
			System.out.println("Comienza Calculo MTM para SWAPS para la fecha: "
					+ DateUtils.dateToString(pFechaProceso));
		}
		List<OperacionSWAPAValuarData> operaciones = operacionesSWAP(pFechaProceso);
		if (Valuaciones.LOGGEAR) {
			System.out.println("Comienza CONSTRUCCION DE TASAS FWD. Cantidad de Operaciones: "
					+ operaciones.size());
		}
		armarOperacionesSWAPParteFijaYVariable(operaciones);
		if (Valuaciones.LOGGEAR) {
			System.out.println("Armado de Partes Fijas y Variables.  Partes Fijas : "
					+ operacionesParteFija.size() + "  Partes Variables : "
					+ operacionesParteVariable.size());
		}

		construccionTasasFWD(diasHabiles(pFechaProceso), pFechaProceso);

		if (Valuaciones.LOGGEAR) {
			System.out.println("Comienza Armado de Agenda para Calculo de MTM");
		}
		armarAgendaCuponOperaciones(agendaSWAP(), pFechaProceso);

		if (Valuaciones.LOGGEAR) {
			System.out.println("Comienza Calculo de MTM");
		}
		return calculoMTM();
	}

	public static InformarNovedadesValuacionesXmlRequest calculoMTM() {
		for (List<CuponSWAP> listaCuponSWAP : agendaCuponOperaciones.values()) {
			for (CuponSWAP cuponSWAP : listaCuponSWAP) {
				mtmFija = mtmFija + cuponSWAP.getFraCli();
				mtmVariable = mtmVariable + cuponSWAP.getFraCliRf();
			}

		}

		if (Valuaciones.LOGGEAR) {
			System.out.println("MTM FIJA: " + mtmFija);
			System.out.println("MTM VARIABLE: " + mtmVariable);
		}

		InformarNovedadesValuacionesXmlRequest listaNovedadesRD = new InformarNovedadesValuacionesXmlRequest();
		RequestData novedadF = new RequestData();
		novedadF.setMTM(mtmFija);
		RequestData novedadV = new RequestData();
		novedadV.setMTM(mtmVariable);

		/*
		 * TODO COMPLETAR CAMPOS rd.setCodigo("MTMAC"); rd.setCodUsuario("FOX");
		 * rd.setCorrida("1");
		 * rd.setFecha(DateUtils.dateToString(mtm.getOperacionNDF()
		 * .getFechaProceso(), Valuaciones.DATE_MASK_NOVEDADES));
		 * rd.setIdOperacion(mtm.getOperacionNDF().getIDOperacion());
		 * rd.setMonedaValuacion(1);
		 */
		listaNovedadesRD.addRequestData(novedadF);
		listaNovedadesRD.addRequestData(novedadV);

		// listaNovedadesRD.setCodFormula("MTMAC");
		// listaNovedadesRD.setFechaProceso();

		XStream xs = ValuacionesSWAP.getXStreamInformarNovedades();
		String xml = xs.toXML(listaNovedadesRD);
		xml = xml.replace("\n", "");

		informarValuaciones(xml);

		return listaNovedadesRD;
	}

	private static void armarAgendaCuponOperaciones(
			List<AgendaCuponOperacioneSWAPAValuarData> pOperacionesSWAP, Date pFechaProceso)
			throws Exception {
		for (AgendaCuponOperacioneSWAPAValuarData agendaCupon : pOperacionesSWAP) {

			if (!agendaCupon.getNumeroOperacion().equals("0")) {

				try {
					if (Valuaciones.LOGGEAR) {
						System.out.println("Procesando Cupon Numero:"
								+ agendaCupon.getNumeroOperacion());
					}
					// busco la lista
					List<CuponSWAP> lista = agendaCuponOperaciones
							.get(agendaCupon.getNumeroOperacion());
					if (lista == null) {// si la lista no existe la creo
						lista = new ArrayList<CuponSWAP>();
					}
	
					OperacionSWAPAValuarData parteVariable = operacionesParteVariable.get(agendaCupon
							.getNumeroOperacion());
					if (Valuaciones.LOGGEAR) {
						System.out.println("************Parte Variable***********");
						System.out.println("Número Operación: " + parteVariable.getNumeroOperacion());
						System.out.println("Número de Boleto: " + parteVariable.getNumeroBoleto());
						System.out.println("ID Operación Relacionada: "
								+ parteVariable.getIdoperacionrelacionada());
						System.out.println("Fecha de Inicio: " + parteVariable.getFechaInicio());
						System.out.println("Fecha Vencimiento: " + parteVariable.getFechaVencimiento());
						System.out.println("Cantidad VN: " + parteVariable.getCantidadVN());
						System.out.println("Metodo de Fixing: " + parteVariable.getMetodoFixing());
						System.out.println("Base: " + parteVariable.getBase());
						System.out.println("*************************************");
					}
					OperacionSWAPAValuarData parteFija = operacionesParteFija.get(parteVariable
							.getIdoperacionrelacionada());
	
					if (Valuaciones.LOGGEAR) {
						System.out.println("************Parte Fija***********");
						System.out.println("Número Operación: " + parteFija.getNumeroOperacion());
						System.out.println("Número de Boleto: " + parteFija.getNumeroBoleto());
						System.out.println("ID Operación Relacionada: "
								+ parteFija.getIdoperacionrelacionada());
						System.out.println("Fecha de Inicio: " + parteFija.getFechaInicio());
						System.out.println("Fecha Vencimiento: " + parteFija.getFechaVencimiento());
						System.out.println("Cantidad VN: " + parteFija.getCantidadVN());
						System.out.println("Metodo de Fixing: " + parteFija.getMetodoFixing());
						System.out.println("Base: " + parteFija.getBase());
						System.out.println("*************************************");
					}
	
					CuponSWAP cuponSWAP = new CuponSWAP(pFechaProceso, agendaCupon, parteFija,
							parteVariable);
					if (Valuaciones.LOGGEAR) {
						System.out.println("************Cupon Swap***********");
						System.out.println("Plazo Residual: " + cuponSWAP.getPlazoResidual());
						System.out.println("TNA Index: " + cuponSWAP.getTnaIndex());
						System.out.println("VFutCli: " + cuponSWAP.getVFutCli());
						System.out.println("FraCli: " + cuponSWAP.getFraCli());
						System.out.println("VFutCliRf: " + cuponSWAP.getVFutCliRf());
						System.out.println("FraCliRf: " + cuponSWAP.getFraCliRf());
						System.out.println("*************************************");
					}
	
					lista.add(cuponSWAP);
					agendaCuponOperaciones.put(agendaCupon.getNumeroOperacion(), lista);
				} catch (Exception e) {
					if (Valuaciones.LOGGEAR) {
						System.out.println("Error en Cupon Numero:" + agendaCupon.getNumeroOperacion());
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
				if (operacionSWAP.getMetodoFixing().equalsIgnoreCase("Tasa Fija")) {
					operacionesParteFija.put(operacionSWAP.getIDOperacion(), operacionSWAP);
				} else {
					operacionesParteVariable.put(operacionSWAP.getIDOperacion(), operacionSWAP);
				}
			}
		}
	}

	public static XStream getXStreamOperacionesYFeriados() {
		XStream xs = new XStream(new DomDriver());
		xs.alias(resourceBundle.getString("servicios.FeriadosResponse"), FeriadosResponse.class);
		xs.alias(resourceBundle.getString("servicios.FechaData"), FechaData.class);
		xs.alias(resourceBundle.getString("servicios.RecuperoOperacionesSWAPAValuarResponse"),
				RecuperarOperacionesSWAPAValuarResponse.class);
		xs.alias(resourceBundle.getString("servicios.OperacionSWAPAValuarData"),
				OperacionSWAPAValuarData.class);
		xs.omitField(RecuperarOperacionesSWAPAValuarResponse.class, "count");
		xs.omitField(FeriadosResponse.class, "cod-retorno");
		xs.omitField(FeriadosResponse.class, "mensajes");
		xs.alias(resourceBundle.getString("servicios.DisponibilizacionFeriadosXmlRequestData"),
				DisponibilizacionFeriadosXmlRequestData.class);

		return xs;
	}

	public static XStream getXStreamInformarNovedades() {
		XStream xs = new XStream(new DomDriver());
		xs.alias(resourceBundle
				.getString("servicios.informarNovedades.InformarNovedadesValuacionesXmlRequest"),
				InformarNovedadesValuacionesXmlRequest.class);
		xs.alias(resourceBundle.getString("servicios.informarNovedades.requestData"),
				RequestData.class);
		xs.addImplicitCollection(InformarNovedadesValuacionesXmlRequest.class, "requestDataList");
		return xs;
	}

	public static XStream getXStreamAgenda() {
		XStream xs = new XStream(new DomDriver());
		xs.alias(resourceBundle
				.getString("servicios.RecuperoAgendaCuponesOperacionesSWAPAValuarResponse"),
				RecuperarAgendaCuponesOperacionesSWAPAValuarResponse.class);
		xs.alias(resourceBundle.getString("servicios.AgendaCuponOperacioneSWAPAValuarData"),
				AgendaCuponOperacioneSWAPAValuarData.class);
		xs.omitField(RecuperarAgendaCuponesOperacionesSWAPAValuarResponse.class, "count");
		return xs;
	}

	/**
	 * Busca los dias que obtiene del properties. 5400.
	 * 
	 * @param pFechaProceso
	 * @return
	 */
	public static FeriadosResponse diasHabiles(Date pFechaProceso) {
		FeriadosResponse fr = new FeriadosResponse();
		int diasHabiles = 0;
		Date fechaDesde = pFechaProceso;
		Date fechaHasta = null;
		while (diasHabiles < DIAS) {
			fechaHasta = DateUtils.addDays(fechaDesde, DIAS * 2);
			FeriadosResponse feriadosResponse = getDias(fechaDesde, fechaHasta);
			Iterator<FechaData> itr = feriadosResponse.getFeriadosResult().iterator();
			while (itr.hasNext() && diasHabiles < DIAS) {
				FechaData fechaData = itr.next();
				if (!fechaData.getEsFeriado()) {// si es habil
					fr.addFechaData(fechaData);
					diasHabiles++;
				}
			}

			if (diasHabiles < DIAS) {
				fechaDesde = fechaHasta;
			}
		}

		if (Valuaciones.LOGGEAR) {
			System.out.println("Dias Habiles Necesarios Calculados. Total: "
					+ fr.getFeriadosResult().size());
		}

		return fr;
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
			 * "servicios.RecuperoAgendaCuponesOperacionesSWAPAValuar.paramFechaProceso" ),
			 * DateUtils.dateToString(pFechaProceso, DATE_MASK));
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

	public static List<OperacionSWAPAValuarData> operacionesSWAP(Date pFechaProceso) {
		XStream xs = getXStreamOperacionesYFeriados();
		RecuperarOperacionesSWAPAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client.createRequest(resourceBundle
					.getString("servicios.RecuperoOperacionesSWAPAValuar.nombreServicio"));
			esbRequest.setParameter(resourceBundle
					.getString("servicios.RecuperoOperacionesSWAPAValuar.paramFechaProceso"),
					DateUtils.dateToString(pFechaProceso, DATE_MASK));
			client.execute(esbRequest, esbResponse);
			if (Valuaciones.LOGGEAR) {
				System.out.println("Se ejecuto ESB Operaciones SWAP a Valuar");
			}

			String sRtaOperaciones = esbResponse.getResult();

			salida = (RecuperarOperacionesSWAPAValuarResponse) xs.fromXML(sRtaOperaciones);
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

	private static void construccionTasasFWD(FeriadosResponse pDiasHabiles, Date pFechaProceso) {

		List<TasaFWD> tasasFwd = new ArrayList<TasaFWD>();
		// Double plazo = null;
		for (FechaData fechaData : pDiasHabiles.getFeriadosResult()) {
			try {

				TasaFWD tasa = new TasaFWD(pDiasHabiles.getFeriadosResult());
				// 1) Armado de fechas PUBLIC_T + Factor de Actualizaciï¿½n
				// (Obtenido de Cupon_4).
				if (Valuaciones.LOGGEAR) {
					System.out.println("************************************");
					System.out.println("Calcular Factor de Actualizacion...");
				}
				tasa.calcularFactorDeActualizacion(pFechaProceso, DateUtils.stringToDate(fechaData
						.getFecha(), Valuaciones.DATE_MASK_RTA_FERIADOS));
				// 2) Obtener fechas de mercado (Fecha ï¿½Tï¿½)
				if (Valuaciones.LOGGEAR) {
					System.out.println("Calcular Fecha de Mercado...");
				}
				tasa.calcularFechaMercado();

				// 3) Obtener fechas de Vencimiento Plazos Fijos (Fecha ï¿½Dï¿½)
				if (Valuaciones.LOGGEAR) {
					System.out.println("Calcular Fecha de Vencimiento Plazo Fijo...");
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
					System.out.println("Calcular Fecha de Publicacion Vencimiento ...");
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
