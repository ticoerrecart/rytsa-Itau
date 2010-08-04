package rytsa.itau.valuaciones;

import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rytsa.itau.db.DAO;
import rytsa.itau.dominio.TasaFWD;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.FechaData;
import rytsa.itau.valuaciones.dto.FeriadosResponse;
import rytsa.itau.valuaciones.dto.swap.AgendaCuponOperacioneSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.OperacionSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.RecuperoAgendaCuponesOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperoOperacionesSWAPAValuarResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @author rerrecart
 * 
 */
public class Valuaciones {

	private static final int DIAS = 6;// 5400

	private static int modo = 2;

	private static int puerto = 2424;

	private static String host = "localhost";

	/**
	 * Para ello es necesario obtener las operaciones de swaps y los cupones
	 * correspondientes de cada SWAP que se obtendrán desde el sistema de
	 * Patrón, para este cometido, se desarrollaron 2 Web Services que retornan
	 * dicha información en formato XML, para ser consumidos desde cualquier
	 * plataforma. Una vez calculadas las valuaciones MTM de cada Swap, se debe
	 * ejecutar un Web Service del sistema Patrón que actualizará los precios de
	 * cada SWAP necesarios para cerrar el día y el cálculo de la contabilidad.
	 * Por último se deberá generar una tabla DBF o se actualizará una tabla SQL
	 * con los Cálculos de tasas FWD.
	 * 
	 * 
	 */
	public static void calcularMTMParaSwap(Date pFechaProceso) {
		/*
		 * ESBClient client = null; ESBRequest esbRequest = null; ESBResponse
		 * response = new ESBResponse(); try { //TODO client =
		 * ESBClientFactory.createInstance(modo, host, puerto); esbRequest =
		 * client.createRequest("RecuperoOperacionesSWAPAValuar"); //nombre del
		 * servicio esbRequest.setParameter("FechaProceso", "23/07/2010");
		 * client.execute(esbRequest, response); String sRtaOperaciones =
		 * response.getResult();
		 * 
		 * esbRequest =
		 * client.createRequest("RecuperoAgendaCuponesOperacionesSWAPAValuar");
		 * //nombre del servicio esbRequest.setParameter("FechaProceso",
		 * "23/07/2010"); client.execute(esbRequest, response); String
		 * sRtaAgendaCuponesOperaciones = response.getResult();
		 */

		RecuperoOperacionesSWAPAValuarResponse operacionesSWAP = operacionesSWAP();
		RecuperoAgendaCuponesOperacionesSWAPAValuarResponse agendaSWAP = agendaSWAP();

		construccionTasasFWD(operacionesSWAP, agendaSWAP, diasHabiles(pFechaProceso), pFechaProceso);
		calculoMTM();
		/*
		 * } catch (ESBClientException e) { e.printStackTrace(); } finally { if
		 * (client != null) { client.close(); } }
		 */
	}

	private static void calculoMTM() {

	}

	private static FeriadosResponse diasHabiles(Date pFechaProceso) {
		XStream xs = new XStream(new DomDriver());
		xs.alias("FeriadosResponse", FeriadosResponse.class);
		xs.alias("FechaData", FechaData.class);

		InputStream is = Valuaciones.class
				.getResourceAsStream("/rytsa/itau/valuaciones/feriados.xml");
		FeriadosResponse fr = (FeriadosResponse) xs.fromXML(is);

		// TODO acá iría el llamado al WS hasta conseguir a partir de la fecha,
		// los 5400 (DIAS) hábiles!!!!!!!!!!!
		/*
		 * esbRequest = client.createRequest("Feriados"); //nombre del servicio
		 * esbRequest.setParameter("FechaProceso", "23/07/2010");
		 * client.execute(esbRequest, response); String sRtaFeriados =
		 * response.getResult();
		 */

		return fr;
	}

	private static RecuperoAgendaCuponesOperacionesSWAPAValuarResponse agendaSWAP() {
		XStream xs = new XStream(new DomDriver());
		xs.alias("RecuperoAgendaCuponesOperacionesSWAPAValuarResponse",
				RecuperoAgendaCuponesOperacionesSWAPAValuarResponse.class);
		xs
				.alias("AgendaCuponOperacioneSWAPAValuarData",
						AgendaCuponOperacioneSWAPAValuarData.class);
		InputStream is = Valuaciones.class
				.getResourceAsStream("/rytsa/itau/valuaciones/agendaCuponOperacioneSWAPAValuar.xml");
		RecuperoAgendaCuponesOperacionesSWAPAValuarResponse salida = (RecuperoAgendaCuponesOperacionesSWAPAValuarResponse) xs
				.fromXML(is);
		return salida;
	}

	private static RecuperoOperacionesSWAPAValuarResponse operacionesSWAP() {
		XStream xs = new XStream(new DomDriver());
		xs.alias("RecuperoOperacionesSWAPAValuarResponse",
				RecuperoOperacionesSWAPAValuarResponse.class);
		xs.alias("OperacionSWAPAValuarData", OperacionSWAPAValuarData.class);
		InputStream is = Valuaciones.class
				.getResourceAsStream("/rytsa/itau/valuaciones/operacionesSwapAValuar.xml");
		RecuperoOperacionesSWAPAValuarResponse salida = (RecuperoOperacionesSWAPAValuarResponse) xs
				.fromXML(is);
		return salida;
	}

	private static void construccionTasasFWD(RecuperoOperacionesSWAPAValuarResponse pOperaciones,
			RecuperoAgendaCuponesOperacionesSWAPAValuarResponse pAgenda,
			FeriadosResponse pDiasHabiles, Date pFechaProceso) {

		List<TasaFWD> tasasFwd = new ArrayList<TasaFWD>();
		// Double plazo = null;
		for (FechaData fechaData : pDiasHabiles.getFeriadosResult()) {
			try {

				TasaFWD tasa = new TasaFWD();
				// 1) Armado de fechas PUBLIC_T + Factor de Actualización
				// (Obtenido de Cupon_4).
				tasa.calcularFactorDeActualizacion(pFechaProceso, DateUtils.stringToDate(fechaData
						.getFecha()));
				// 2) Obtener fechas de mercado (Fecha “T”)
				tasa.calcularFechaMercado();
				// 3) Obtener fechas de Vencimiento Plazos Fijos (Fecha “D”)
				tasa.calcularFechaVencimientoPzoFijo();

				tasasFwd.add(tasa);
			} catch (ParseException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}// end for

		//Tengo q crear 28 Tasas forward mas para calcular las necesarias... porque miramos tasas futuras.
		//En el arreglo final no las agrego
		for (TasaFWD tasa : tasasFwd.subList(0, tasasFwd.size() - 31)) {
			try {
				tasa.calcularFechaPublicacionVencimiento(tasasFwd);
				tasa.calcularTasaFWD();
				System.out.println(tasa.getFechaPublicacion() + "->" + tasa.getTasaFWD());
			} catch (ParseException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}

		DAO.crearTasaFWD(tasasFwd, pFechaProceso);
	}

	public static void calcularMTMParaNdf() {

	}
}
