package rytsa.itau.valuaciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;
import rytsa.itau.db.factory.DatabaseFactory;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.FechaData;
import rytsa.itau.valuaciones.dto.FeriadosResponse;
import rytsa.itau.valuaciones.dto.SeguridadResponse;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.AgendaCuponOperacioneSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.OperacionSWAPAValuarData;
import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;

import com.thoughtworks.xstream.XStream;

public class ComunicacionESBTest extends TestCase {

	public void ctestOperacionesNDF() {
		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();

		try {
			client = ESBClientFactory.createInstance(4, "esb_desa", 3424);
			esbRequest = client.createRequest("OPERACIONES_NDF_PATRON_LISTADO");
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			esbRequest.setParameter("fechaProceso", "18-10-2010");
			client.execute(esbRequest, esbResponse);
			String sRta = esbResponse.getResult();
			System.out.println("exito");

		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void xtestCalcularMTMNdf() throws Exception {
		Test t = new Test("C:\\Documents and Settings\\AM430154\\workspace1\\Itau\\DB",
				"18/10/2010");
		t.calcularMTMNdf("18/10/2010");

	}

	public void testCalcularMTMSwap() throws Exception {
		Test t = new Test("E:\\DESARROLLO\\Workspace\\Itau\\DB", "20/10/2010");
		t.calcularMTMSwap("20/10/2010");

	}

	public void ctestResultadoOperacionesNDF() {
		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();

		try {
			client = ESBClientFactory.createInstance(4, "esb_desa", 3424);
			esbRequest = client.createRequest("WS_SEGURIDAD_PATRON_LOGIN");
			esbRequest.setParameter("UserName", "5G6mzLf/vMA");
			esbRequest.setParameter("Password", "iMq121MyrD5thEd4e10CNQ==");
			esbRequest.setParameter("Ip", "1.1.1.1");
			esbRequest.setParameter("IdAplicacion", "2");

			client.execute(esbRequest, esbResponse);
			String sRta = esbResponse.getResult();
			XStream xs = ValuacionesNDF.getXStream();
			SeguridadResponse seg = (SeguridadResponse) xs.fromXML(sRta);
			String idSession = seg.getLoginSesionResponseData().getIdSesion();

			esbRequest = client.createRequest("WS_VALUACION_PATRON_MODIFICACION");
			esbRequest.setParameter("IdSesion", idSession);
			esbRequest
					.setParameter(
							"XmlRequest",
							"<InformarNovedadesValuacionesXmlRequest><fechaProceso>2010-10-13</fechaProceso><codFormula>MTMAC</codFormula><RequestData><IdOperacion>36</IdOperacion><MTM>100</MTM><Codigo>MTMAC</Codigo><MonedaValuacion>1</MonedaValuacion><CodUsuario>FOX</CodUsuario><Fecha>2010-10-13</Fecha><Corrida>1</Corrida></RequestData><RequestData><IdOperacion>38</IdOperacion><MTM>200</MTM><Codigo>MTMAC</Codigo><MonedaValuacion>1</MonedaValuacion><CodUsuario>FOX</CodUsuario><Fecha>2010-10-13</Fecha><Corrida>1</Corrida></RequestData></InformarNovedadesValuacionesXmlRequest>");

		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void xtestFeriadosNDF() {
		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();

		try {
			client = ESBClientFactory.createInstance(4, "10.162.139.11", 2424);

			String rta = readFile("E:\\DESARROLLO\\Workspace\\Itau\\test\\rytsa\\itau\\valuaciones\\Feri.xml");

			XStream xs = ValuacionesSWAP.getXStreamFeriados();

			esbRequest = client.createRequest("WS_FERIADOS_PATRON_LISTADO");
			esbRequest.setParameter("IdSesion", "5b4e4fd9-a56c-4078-8ab2-ea6832acf145");
			/*
			 * esbRequest .setParameter( "XmlRequest",
			 * "<DisponibilizacionFeriadosXmlRequestData><IdCalendario>1</IdCalendario><FechaIni>1990-01-01</FechaIni><FechaFin>2011-12-31</FechaFin></DisponibilizacionFeriadosXmlRequestData>"
			 * );
			 */esbRequest
					.setParameter(
							"XmlRequest",
							"<DisponibilizacionFeriadosXmlRequestData><IdCalendario>1</IdCalendario><FechaIni>2010-10-13</FechaIni><FechaFin>2011-01-31</FechaFin></DisponibilizacionFeriadosXmlRequestData>");

			client.execute(esbRequest, esbResponse);
			String sRtaFeriados = esbResponse.getResult();

			FeriadosResponse fr = (FeriadosResponse) xs.fromXML(rta);

		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String readFile(String file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		return stringBuilder.toString();
	}

	public void ctestObtenerFactorAct() throws SQLException, Exception {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double factorAct = null;
		Date date = null;
		int plazo = 0;
		try {
			conn = DatabaseFactory.getConnection();
			ps = conn
					.prepareStatement("SELECT * FROM curva_6 WHERE D_PROC > ? ORDER BY D_PROC DESC;");
			ps.setDate(1, DateUtils.convertDate(DateUtils.stringToDate("18/10/2010")));
			// ps.setLong(2, 2);
			rs = ps.executeQuery();
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			while (rs.next()) {
				factorAct = rs.getDouble("F_DESC");
				date = rs.getDate("D_PROC");
				plazo = rs.getInt("PLAZO");

				System.out.println(factorAct + " | " + date + " | " + plazo + " | "
						+ sdf.format(date));

			}

		} finally {
			DatabaseFactory.closeConnection(conn, ps, rs);
		}

	}

	public void ctestFindDiasHabiles() throws Exception {
		List<FeriadosResponse> fr = ValuacionesSWAP.diasHabiles(DateUtils
				.stringToDate("09/01/2011"));
		FechaData fechaData = null;
		for (FechaData fd : fr.get(0).getFeriadosResult()) {
			if (fd.getFecha().equals(
					DateUtils.dateToString(DateUtils.stringToDate("25/10/2010"),
							Valuaciones.DATE_MASK_RTA_FERIADOS))) {
				System.out.println("Encontro");
				fechaData = fd;
				return;
			}
		}

		assertNotNull(fechaData);
	}

	public void xtestGetDiasHabiles() throws Exception {
		FeriadosResponse fr = ValuacionesSWAP.getDias(DateUtils.stringToDate("09/01/2011"),
				DateUtils.stringToDate("10/01/2011"));
		fr.getFeriadosResult().size();
	}

	public void ctestGetOperacionesSWAP() throws Exception {
		List<OperacionSWAPAValuarData> a = ValuacionesSWAP.operacionesSWAP(DateUtils
				.stringToDate("19/10/2010"));
		System.out.println(a.size());
	}

	public void ctestResultadoAgendaOperacionesSWAP() {
		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();

		try {
			client = ESBClientFactory.createInstance(4, "10.162.139.11", 2424);
			esbRequest = client.createRequest("CUPONES_PATRON_LISTADO");
			// esbRequest.setParameter("fechaProceso", "19-10-2010");

			client.execute(esbRequest, esbResponse);
			String sRta = esbResponse.getResult();
			System.out.println(sRta);
		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ctestOperacionesSWAP() throws Exception {
		System.out.println("Operaciones");
		List<OperacionSWAPAValuarData> operaciones = ValuacionesSWAP.operacionesSWAP(DateUtils
				.stringToDate("20/10/2010"));
		for (OperacionSWAPAValuarData operacionSWAPAValuarData : operaciones) {
			System.out.println("ID Operacion = " + operacionSWAPAValuarData.getIDOperacion());
			System.out
					.println("Numero Operacion= " + operacionSWAPAValuarData.getNumeroOperacion());
			System.out.println("Mercado= " + operacionSWAPAValuarData.getMercado());
			System.out.println("*********************************************");
		}

		System.out.println("Cupones");
		List<AgendaCuponOperacioneSWAPAValuarData> cupones = ValuacionesSWAP.agendaSWAP();
		for (AgendaCuponOperacioneSWAPAValuarData cupon : cupones) {
			System.out.println("ID Cupon = " + cupon.getIdCupon());
			System.out.println("Numero Operacion= " + cupon.getNumeroOperacion());
			System.out.println("*********************************************");

		}

	}

}
