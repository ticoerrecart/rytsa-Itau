package rytsa.itau.valuaciones;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import org.easymock.EasyMock;

import rytsa.itau.db.DAO;
import rytsa.itau.dominio.Mtm;
import rytsa.itau.dominio.TasaFWD;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.FechaData;
import rytsa.itau.valuaciones.dto.FeriadosResponse;
import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.AgendaCuponOperacioneSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.OperacionSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.RecuperoAgendaCuponesOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperoOperacionesSWAPAValuarResponse;
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
public class Valuaciones {

	private static final int DIAS = 6;// 5400

	private static int modo = 4;

	private static int puerto = 2424;

	private static String host = "localhost";

	/**
	 * Para ello es necesario obtener las operaciones de swaps y los cupones
	 * correspondientes de cada SWAP que se obtendr�n desde el sistema de
	 * Patr�n, para este cometido, se desarrollaron 2 Web Services que retornan
	 * dicha informaci�n en formato XML, para ser consumidos desde cualquier
	 * plataforma. Una vez calculadas las valuaciones MTM de cada Swap, se debe
	 * ejecutar un Web Service del sistema Patr�n que actualizar� los precios de
	 * cada SWAP necesarios para cerrar el d�a y el c�lculo de la contabilidad.
	 * Por �ltimo se deber� generar una tabla DBF o se actualizar� una tabla SQL
	 * con los C�lculos de tasas FWD.
	 * 
	 * 
	 */
	public static void calcularMTMParaSwap(Date pFechaProceso) {
		RecuperoOperacionesSWAPAValuarResponse operacionesSWAP = operacionesSWAP(pFechaProceso);
		RecuperoAgendaCuponesOperacionesSWAPAValuarResponse agendaSWAP = agendaSWAP(pFechaProceso);
		RecuperoOperacionesNDFAValuarResponse operacionesNDF = operacionesNDFAValuar(pFechaProceso);
		ResourceBundle bundle = ResourceBundle.getBundle("config");

		construccionTasasFWD(diasHabiles(pFechaProceso), pFechaProceso);
		calculoMTM(pFechaProceso, bundle, operacionesNDF);
	}

	private static void calculoMTM(Date pFechaProceso, ResourceBundle pBundle,
			RecuperoOperacionesNDFAValuarResponse pOperacionesNDF) {

		try {
			List<Mtm> listaMtm = new ArrayList<Mtm>();
			for (OperacionNDFAValuarData operacionNDF : pOperacionesNDF
					.getRecuperoOperacionesNDFAValuarResult()) {
				Mtm mtm = new Mtm();
				mtm.setPlazoRemanente(DateUtils.diferenciaEntreFechas(
						operacionNDF.getFechaVencimiento(), pFechaProceso));
				String[] codDiv = pBundle.getStringArray(operacionNDF
						.getMoneda());
				mtm.setTipoCambioMoneda(DAO.obtenerTipoCambioMoneda(DateUtils
						.convertDate(pFechaProceso), new Long(codDiv[0])));

				String moneda2 = pBundle.getString("moneda2");
				codDiv = pBundle.getStringArray(moneda2);
				mtm.setTipoCambioMoneda2(DAO.obtenerTipoCambioMoneda(DateUtils
						.convertDate(pFechaProceso), new Long(codDiv[0])));

				listaMtm.add(mtm);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static String convertStreamToString(InputStream is)
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

	private static FeriadosResponse diasHabiles(Date pFechaProceso) {
		XStream xs = new XStream(new DomDriver());
		xs.alias("FeriadosResponse", FeriadosResponse.class);
		xs.alias("FechaData", FechaData.class);

		// TODO ac� ir�a el llamado al WS hasta conseguir a partir de la fecha,
		// los 5400 (DIAS) h�biles!!!!!!!!!!!
		FeriadosResponse fr = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = null;
		try {
			// TODO easyMock
			esbResponse = EasyMock.createMock(ESBResponse.class);
			EasyMock
					.expect(esbResponse.getResult())
					.andReturn(
							convertStreamToString(Valuaciones.class
									.getResourceAsStream("/rytsa/itau/valuaciones/feriados.xml")));
			EasyMock.replay(esbResponse);
			// TODO easyMock

			client = ESBClientFactory.createInstance(modo, host, puerto);
			esbRequest = client.createRequest("Feriados"); // nombre del
			// servicio
			esbRequest.setParameter("FechaProceso", pFechaProceso);
			// client.execute(esbRequest, response); TODO descomentar
			String sRtaFeriados = esbResponse.getResult();

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

	private static RecuperoOperacionesNDFAValuarResponse operacionesNDFAValuar(
			Date pFechaProceso) {
		XStream xs = new XStream(new DomDriver());
		xs.alias("RecuperoOperacionesNDFAValuarResponse",
				RecuperoAgendaCuponesOperacionesSWAPAValuarResponse.class);
		xs.alias("OperacionNDFAValuarData",
				AgendaCuponOperacioneSWAPAValuarData.class);

		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = null;
		try {
			// TODO easyMock
			esbResponse = EasyMock.createMock(ESBResponse.class);
			EasyMock
					.expect(esbResponse.getResult())
					.andReturn(
							convertStreamToString(Valuaciones.class
									.getResourceAsStream("/rytsa/itau/valuaciones/operacionesNDFAValuar.xml")));
			EasyMock.replay(esbResponse);
			// TODO easyMock

			client = ESBClientFactory.createInstance(modo, host, puerto);
			esbRequest = client.createRequest("RecuperoOperacionesNDFAValuar"); // nombre
			// del
			// servicio
			esbRequest.setParameter("OperacionesNDFAValuarRequestData",
					pFechaProceso);
			// client.execute(esbRequest, response); TODO descomentar
			String sRta = esbResponse.getResult();

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

	private static RecuperoAgendaCuponesOperacionesSWAPAValuarResponse agendaSWAP(
			Date pFechaProceso) {
		XStream xs = new XStream(new DomDriver());
		xs.alias("RecuperoAgendaCuponesOperacionesSWAPAValuarResponse",
				RecuperoAgendaCuponesOperacionesSWAPAValuarResponse.class);
		xs.alias("AgendaCuponOperacioneSWAPAValuarData",
				AgendaCuponOperacioneSWAPAValuarData.class);

		RecuperoAgendaCuponesOperacionesSWAPAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = null;
		try {
			// TODO easyMock
			esbResponse = EasyMock.createMock(ESBResponse.class);
			EasyMock
					.expect(esbResponse.getResult())
					.andReturn(
							convertStreamToString(Valuaciones.class
									.getResourceAsStream("/rytsa/itau/valuaciones/agendaCuponOperacioneSWAPAValuar.xml")));
			EasyMock.replay(esbResponse);
			// TODO easyMock

			client = ESBClientFactory.createInstance(modo, host, puerto);
			esbRequest = client.createRequest("Feriados"); // nombre del
			// servicio
			esbRequest.setParameter(
					"RecuperoAgendaCuponesOperacionesSWAPAValuar",
					pFechaProceso);
			// client.execute(esbRequest, response); TODO descomentar
			String sRtaAgendaCupones = esbResponse.getResult();

			salida = (RecuperoAgendaCuponesOperacionesSWAPAValuarResponse) xs
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

		return salida;
	}

	private static RecuperoOperacionesSWAPAValuarResponse operacionesSWAP(
			Date pFechaProceso) {
		XStream xs = new XStream(new DomDriver());
		xs.alias("RecuperoOperacionesSWAPAValuarResponse",
				RecuperoOperacionesSWAPAValuarResponse.class);
		xs.alias("OperacionSWAPAValuarData", OperacionSWAPAValuarData.class);

		RecuperoOperacionesSWAPAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = null;
		try {
			// TODO easyMock
			esbResponse = EasyMock.createMock(ESBResponse.class);
			EasyMock
					.expect(esbResponse.getResult())
					.andReturn(
							convertStreamToString(Valuaciones.class
									.getResourceAsStream("/rytsa/itau/valuaciones/operacionesSwapAValuar.xml")));
			EasyMock.replay(esbResponse);
			// TODO easyMock

			client = ESBClientFactory.createInstance(modo, host, puerto);
			esbRequest = client.createRequest("Feriados"); // nombre del
			// servicio
			esbRequest.setParameter("RecuperoOperacionesSWAPAValuar",
					pFechaProceso);
			// client.execute(esbRequest, response); TODO descomentar
			String sRtaOperaciones = esbResponse.getResult();

			salida = (RecuperoOperacionesSWAPAValuarResponse) xs
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

		return salida;
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
				tasa.calcularFactorDeActualizacion(pFechaProceso, DateUtils
						.stringToDate(fechaData.getFecha()));
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

	public static void calcularMTMParaNdf() {

	}
}
