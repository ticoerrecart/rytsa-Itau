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
import rytsa.itau.valuaciones.dto.ndf.NovedadesValuacionesRequestData;
import rytsa.itau.valuaciones.dto.swap.AgendaCuponOperacioneSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.OperacionSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.RecuperarAgendaCuponesOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperarOperacionesSWAPAValuarResponse;
import rytsa.itau.ws.ConversorWStoESB;
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
	public static List<NovedadesValuacionesRequestData> calcularMTM(
			Date pFechaProceso) throws Exception {
		List<OperacionSWAPAValuarData> operaciones = null;
		if (USOESB) {
			operaciones = operacionesSWAP(pFechaProceso);
		} else {
			operaciones = ConversorWStoESB
					.getOperacionesSWAPAValuarWS(pFechaProceso);
		}
		armarOperacionesSWAPParteFijaYVariable(operaciones);

		construccionTasasFWD(diasHabiles(pFechaProceso), pFechaProceso);
		armarAgendaCuponOperaciones(agendaSWAP(pFechaProceso), pFechaProceso);
		return calculoMTM();
	}

	public static List<NovedadesValuacionesRequestData> calculoMTM() {
		for (List<CuponSWAP> listaCuponSWAP : agendaCuponOperaciones.values()) {
			for (CuponSWAP cuponSWAP : listaCuponSWAP) {
				mtmFija = mtmFija + cuponSWAP.getFraCli();
				mtmVariable = mtmVariable + cuponSWAP.getFraCliRf();
			}

		}

		List<NovedadesValuacionesRequestData> listaNovedadesRD = new ArrayList<NovedadesValuacionesRequestData>();
		NovedadesValuacionesRequestData novedadF = new NovedadesValuacionesRequestData();
		novedadF.setTotalValuado(mtmFija);
		NovedadesValuacionesRequestData novedadV = new NovedadesValuacionesRequestData();
		novedadV.setTotalValuado(mtmVariable);

		listaNovedadesRD.add(novedadF);
		listaNovedadesRD.add(novedadV);

		return listaNovedadesRD;
	}

	private static void armarAgendaCuponOperaciones(
			List<AgendaCuponOperacioneSWAPAValuarData> pOperacionesSWAP,
			Date pFechaProceso) throws Exception {
		for (AgendaCuponOperacioneSWAPAValuarData agendaCupon : pOperacionesSWAP) {
			// busco la lista
			List<CuponSWAP> lista = agendaCuponOperaciones.get(agendaCupon
					.getNumeroOperacion());
			if (lista == null) {// si la lista no existe la creo
				lista = new ArrayList<CuponSWAP>();
			}

			OperacionSWAPAValuarData parteVariable = operacionesParteVariable
					.get(agendaCupon.getNumeroOperacion());
			OperacionSWAPAValuarData parteFija = operacionesParteFija
					.get(parteVariable.getIdOperacion());
			CuponSWAP cuponSWAP = new CuponSWAP(pFechaProceso, agendaCupon,
					parteFija, parteVariable);

			lista.add(cuponSWAP);
			agendaCuponOperaciones.put(agendaCupon.getNumeroOperacion(), lista);
		}
	}

	private static void armarOperacionesSWAPParteFijaYVariable(
			List<OperacionSWAPAValuarData> pOperacionesSWAP) {
		for (OperacionSWAPAValuarData operacionSWAP : pOperacionesSWAP) {
			if (operacionSWAP.getMetodoFixing().equalsIgnoreCase("Tasa Fija")) {
				operacionesParteFija.put(operacionSWAP.getNumeroOperacion(),
						operacionSWAP);
			} else {
				operacionesParteVariable.put(
						operacionSWAP.getNumeroOperacion(), operacionSWAP);
			}
		}
	}

	private static XStream getXStream() {
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
		xs.alias(
				resourceBundle
						.getString("servicios.RecuperoAgendaCuponesOperacionesSWAPAValuarResponse"),
				RecuperarAgendaCuponesOperacionesSWAPAValuarResponse.class);
		xs.alias(resourceBundle
				.getString("servicios.AgendaCuponOperacioneSWAPAValuarData"),
				AgendaCuponOperacioneSWAPAValuarData.class);
		return xs;
	}

	/**
	 * Busca los dias que obtiene del properties. 5400.
	 * 
	 * @param pFechaProceso
	 * @return
	 */
	private static FeriadosResponse diasHabiles(Date pFechaProceso) {
		FeriadosResponse fr = new FeriadosResponse();
		int diasHabiles = 0;
		Date fechaDesde = pFechaProceso;
		Date fechaHasta = null;
		while (diasHabiles < DIAS) {
			fechaHasta = DateUtils.addDays(fechaDesde, DIAS * 2);
			FeriadosResponse feriadosResponse = getDias(fechaDesde, fechaHasta);
			Iterator<FechaData> itr = feriadosResponse.getFeriadosResult()
					.iterator();
			while (itr.hasNext() && diasHabiles < DIAS) {
				FechaData fechaData = itr.next();
				if (fechaData.getHabil() == 0) {// si es habil
					fr.addFechaData(fechaData);
					diasHabiles++;
				}
			}

			if (diasHabiles < DIAS) {
				fechaDesde = fechaHasta;
			}
		}

		return fr;
	}

	private static FeriadosResponse getDias(Date pFechaDesde, Date pFechaHasta) {
		XStream xs = getXStream();

		// TODO ac� ir�a el llamado al WS hasta conseguir a partir de la
		// fecha,
		// los 5400 (DIAS) h�biles!!!!!!!!!!!
		FeriadosResponse fr = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			/*
			 * TODO easyMock esbResponse =
			 * EasyMock.createMock(ESBResponse.class);
			 * EasyMock.expect(esbResponse.getResult()) .andReturn(
			 * convertStreamToString(Valuaciones.class
			 * .getResourceAsStream("/rytsa/itau/valuaciones/feriados.xml")));
			 * EasyMock.replay(esbResponse); // TODO easyMock
			 */
			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client.createRequest(resourceBundle
					.getString("servicios.Feriados.nombreServicio")); // nombre
																		// del
			// servicio
			esbRequest.setParameter(resourceBundle
					.getString("servicios.Feriados.paramFechaDesde"),
					pFechaDesde);
			esbRequest.setParameter(resourceBundle
					.getString("servicios.Feriados.paramFechaHasta"),
					pFechaHasta);
			client.execute(esbRequest, esbResponse);
			String sRtaFeriados = removerHeaderSoap(esbResponse.getResult());

			fr = (FeriadosResponse) xs.fromXML(sRtaFeriados);
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

		return fr;
	}

	private static List<AgendaCuponOperacioneSWAPAValuarData> agendaSWAP(
			Date pFechaProceso) {
		XStream xs = getXStream();
		RecuperarAgendaCuponesOperacionesSWAPAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			/*
			 * TODO easyMock esbResponse =
			 * EasyMock.createMock(ESBResponse.class);
			 * EasyMock.expect(esbResponse.getResult()) .andReturn(
			 * convertStreamToString(Valuaciones.class .getResourceAsStream(
			 * "/rytsa/itau/valuaciones/agendaCuponOperacioneSWAPAValuar.xml"
			 * ))); EasyMock.replay(esbResponse); // TODO easyMock
			 */

			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client
					.createRequest(resourceBundle
							.getString("servicios.RecuperoAgendaCuponesOperacionesSWAPAValuar.nombreServicio")); // nombre
																													// del
			// servicio
			esbRequest
					.setParameter(
							resourceBundle
									.getString("servicios.RecuperoAgendaCuponesOperacionesSWAPAValuar.paramFechaProceso"),
							pFechaProceso);
			client.execute(esbRequest, esbResponse);
			String sRtaAgendaCupones = removerHeaderSoap(esbResponse
					.getResult());

			salida = (RecuperarAgendaCuponesOperacionesSWAPAValuarResponse) xs
					.fromXML(sRtaAgendaCupones);
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

		return salida.getRecuperoAgendaCuponesOperacionesSWAPAValuarResult();
	}

	private static List<OperacionSWAPAValuarData> operacionesSWAP(
			Date pFechaProceso) {
		XStream xs = getXStream();
		RecuperarOperacionesSWAPAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			/*
			 * TODO easyMock esbResponse =
			 * EasyMock.createMock(ESBResponse.class); EasyMock
			 * .expect(esbResponse.getResult()) .andReturn(
			 * convertStreamToString(Valuaciones.class .getResourceAsStream(
			 * "/rytsa/itau/valuaciones/operacionesSwapAValuar.xml")));
			 * EasyMock.replay(esbResponse); // TODO easyMock
			 */

			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client
					.createRequest(resourceBundle
							.getString("servicios.RecuperoOperacionesSWAPAValuar.nombreServicio")); // nombre
																									// del
			// servicio
			esbRequest
					.setParameter(
							resourceBundle
									.getString("servicios.RecuperoOperacionesSWAPAValuar.paramFechaProceso"),
							pFechaProceso);
			client.execute(esbRequest, esbResponse);
			String sRtaOperaciones = removerHeaderSoap(esbResponse.getResult());

			salida = (RecuperarOperacionesSWAPAValuarResponse) xs
					.fromXML(sRtaOperaciones);
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

		return salida.getRecuperoOperacionesSWAPAValuarResult();
	}

	private static void construccionTasasFWD(FeriadosResponse pDiasHabiles,
			Date pFechaProceso) {

		List<TasaFWD> tasasFwd = new ArrayList<TasaFWD>();
		// Double plazo = null;
		for (FechaData fechaData : pDiasHabiles.getFeriadosResult()) {
			try {

				TasaFWD tasa = new TasaFWD();
				// 1) Armado de fechas PUBLIC_T + Factor de Actualizaci�n
				// (Obtenido de Cupon_4).
				tasa.calcularFactorDeActualizacion(pFechaProceso,
						DateUtils.stringToDate(fechaData.getFecha()));
				// 2) Obtener fechas de mercado (Fecha �T�)
				tasa.calcularFechaMercado();
				// 3) Obtener fechas de Vencimiento Plazos Fijos (Fecha �D�)
				tasa.calcularFechaVencimientoPzoFijo();

				tasasFwd.add(tasa);
			} catch (ParseException e) {
				// TODO Bloque catch generado autom�ticamente
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Bloque catch generado autom�ticamente
				e.printStackTrace();
			}
		}// end for

		// Tengo q crear 28 Tasas forward mas para calcular las necesarias...
		// porque miramos tasas futuras.
		// En el arreglo final no las agrego
		for (TasaFWD tasa : tasasFwd.subList(0, tasasFwd.size() - 31)) {
			try {
				tasa.calcularFechaPublicacionVencimiento(tasasFwd);
				tasa.calcularTasaFWD();
				System.out.println(tasa.getFechaPublicacion() + "->"
						+ tasa.getTasaFWD());
			} catch (ParseException e) {
				// TODO Bloque catch generado autom�ticamente
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Bloque catch generado autom�ticamente
				e.printStackTrace();
			}
		}

		DAO.crearTasaFWD(tasasFwd, pFechaProceso);
	}
}
