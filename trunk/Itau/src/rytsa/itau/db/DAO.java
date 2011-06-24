package rytsa.itau.db;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import rytsa.itau.db.factory.DatabaseFactory;
import rytsa.itau.dominio.TasaFWD;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.utils.FileUtils;
import rytsa.itau.utils.MyLogger;
import br.com.softsite.sfc.tini.persistence.FieldNotFoundException;
import br.com.softsite.sfc.tini.persistence.FieldTypeException;
import br.com.softsite.sfc.tini.persistence.Table;
import br.com.softsite.sfc.tini.persistence.TableCorruptException;

public class DAO {

	private static HashMap<String, Integer> monedas = new HashMap<String, Integer>();

	private static HashMap<String, String> files = new HashMap<String, String>();

	public static Integer obtenerMoneda(String key) throws Exception {
		Integer moneda = monedas.get(key);
		if (moneda == null) {
			String err = "No se pudo obtener el c√≥digo de Moneda para la moneda " + key;
			MyLogger.logError(err);
			throw new Exception(err);
		}
		return moneda;
	}

	public static String obtenerFile(String key) throws Exception {
		String file = files.get(key);
		if (file == null) {
			String err = "No se pudo obtener el path para la moneda " + key;
			MyLogger.logError(err);
			throw new Exception(err);
		}
		return file;
	}

	public static void crearTipoDeCambio() {
		Connection conn = null;
		PreparedStatement ps = null;
		Table t = null;
		try {
			conn = DatabaseFactory.getConnectionForBulk();
			String sqlDelete = "DELETE FROM Calib_div_h;";// http://www.sqlite.org/lang_delete.html#trucateopt
			ps = conn.prepareStatement(sqlDelete);
			ps.executeUpdate();

			String sql = "INSERT INTO Calib_div_h VALUES(?, ?, ?);";
			ResourceBundle rb = ResourceBundle.getBundle("config");
			t = new Table(rb.getString("calib_div_h"));
			int numRecords = t.getNumberOfRecords();

			// System.out.println(t.getNumberOfRecords() + " registros");
			for (int i = 0; i < numRecords; i++) {
				t.nextRecord();
				try {
					Integer div = t.getFieldInteger("C_DIV");
					Double price = t.getFieldDouble("PRICE");
					Date dProc = t.getFieldDate("D_PROC");
					/*
					 * System.out.println(plazo + " | " + tna + " | " + fDesc +
					 * " | " + fAct + " | " + dProc);
					 */
					ps = conn.prepareStatement(sql);
					ps.setInt(1, div);
					ps.setDouble(2, price);
					ps.setDate(3, DateUtils.convertDate(dProc));
					/*
					 * if (i % 100 == 0) { System.out.println(i +
					 * " registros procesados.Calib_div_h"); }
					 */
					ps.executeUpdate();
				} catch (NumberFormatException nfe) {
					MyLogger.log("NumberFormatException en crearTipoDeCambio");
				}
			}

			/*
			 * ps = conn.prepareStatement(sql); ps.setInt(1, 4); ps.setDouble(2,
			 * 3.25d); ps.setDate(3,
			 * DateUtils.convertDate(DateUtils.stringToDate("03/06/2010")));
			 * ps.executeUpdate();
			 * 
			 * ps = conn.prepareStatement(sql); ps.setInt(1, 1); ps.setDouble(2,
			 * 1d); ps.setDate(3,
			 * DateUtils.convertDate(DateUtils.stringToDate("03/06/2010")));
			 * ps.executeUpdate();
			 */

		} catch (Exception e) {
			MyLogger.logError(e.toString() + " | crearTipoDeCambio");
		} finally {
			try {
				DatabaseFactory.closeConnectionForBulk(conn, ps);
				if (t != null) {
					t.close();
				}
			} catch (Exception e) {
				MyLogger.logError(e.toString());
			}
		}
	}

	public static void crearTasasDeBadlar() {
		Connection conn = null;
		PreparedStatement ps = null;
		Table t = null;
		try {
			conn = DatabaseFactory.getConnectionForBulk();
			String sqlDelete = "DELETE FROM Calib_index_h;";// http://www.sqlite.org/lang_delete.html#trucateopt
			ps = conn.prepareStatement(sqlDelete);
			ps.executeUpdate();

			String sql = "INSERT INTO Calib_index_h (C_INDEX, PRICE, D_PROC, D_PUBLIC) VALUES(?, ?, ?, ?);";
			ResourceBundle rb = ResourceBundle.getBundle("config");
			t = new Table(rb.getString("calib_index_h"));
			int numRecords = t.getNumberOfRecords();

			for (int i = 0; i < numRecords; i++) {
				t.nextRecord();
				try {
					Integer cIndex = t.getFieldInteger("C_INDEX");
					Double price = t.getFieldDouble("PRICE");
					Date dProc = t.getFieldDate("D_PROC");
					Date dPublic = t.getFieldDate("D_PUBLIC");
					ps = conn.prepareStatement(sql);
					ps.setInt(1, cIndex);
					ps.setDouble(2, price);
					ps.setDate(3, DateUtils.convertDate(dProc));
					ps.setDate(4, DateUtils.convertDate(dPublic));
					ps.executeUpdate();
				} catch (FieldNotFoundException fnfe) {
					MyLogger.log("FieldNotFoundException (D_PUBLIC) en crearTasasDeBadlar");
				} catch (NumberFormatException nfe) {
					MyLogger.log("NumberFormatException en crearTasasDeBadlar");
				}
			}

		} catch (Exception e) {
			MyLogger.logError(e.toString() + " | crearTasasDeBadlar");
		} finally {
			try {
				DatabaseFactory.closeConnectionForBulk(conn, ps);
				if (t != null) {
					t.close();
				}
			} catch (Exception e) {
				MyLogger.logError(e.toString());
			}
		}

	}

	/**
	 * Crea las curvas en nuestra base local desde lo dbfs. Codigo patron es
	 * ARP, USD.
	 */
	public static void crearCurvas(Date pFechaProceso) {
		ResourceBundle codigosPatron = ResourceBundle.getBundle("config");
		String linea = codigosPatron.getString("codMonedas");
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DatabaseFactory.getConnectionForBulk();
			for (String moneda : linea.split(",")) {
				DAO.monedas.put(moneda.trim(), new Integer(codigosPatron.getString(moneda.trim())
						.split(",")[0]));
				DAO.files.put(moneda.trim(), codigosPatron.getString(moneda.trim()).split(",")[1]);
				crearCurva(conn, ps, moneda.trim(), pFechaProceso);
			}
		} catch (Exception e) {
			MyLogger.logError(e.toString() + " | crearCurvas");
		} finally {
			try {
				DatabaseFactory.closeConnectionForBulk(conn, ps);
			} catch (Exception e) {
				MyLogger.logError(e.toString());
			}
		}
	}

	/*
	 * Este m√©todo crea las tablas o borra sus datos si ya existen (Curva_x y
	 * Cupon_4)
	 */
	private static void crearTablaSiNoExisteOBorrarla(Connection pConnection,
			PreparedStatement pPreparedStatement, String pTabla) throws SQLException {
		ResultSet rs = null;
		try {
			pPreparedStatement = pConnection
					.prepareStatement("SELECT name FROM sqlite_master WHERE name=?;");
			pPreparedStatement.setString(1, pTabla);
			rs = pPreparedStatement.executeQuery();
			if (!rs.next()) {// si no existe la tabla la creo.
				String sqlCreate = "CREATE TABLE " + pTabla + "(" + "PLAZO NUMERIC NULL,"
						+ "TNA DOUBLE NULL," + "F_DESC DOUBLE NULL," + "F_ACT DOUBLE NULL,"
						+ "D_PROC DATETIME NULL)";
				pPreparedStatement = pConnection.prepareStatement(sqlCreate);
				pPreparedStatement.executeUpdate();
			} else {
				String sqlDelete = "DELETE FROM " + pTabla + " ;";// http://www.sqlite.org/lang_delete.html#trucateopt
				pPreparedStatement = pConnection.prepareStatement(sqlDelete);
				pPreparedStatement.executeUpdate();
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
		}
	}

	/*
	 * Crea la Tabla Cupon_4, que tiene la misma estructura que las tablas de
	 * Curvas_x
	 */
	public static void crearCupon4() {
		ResourceBundle codigosPatron = ResourceBundle.getBundle("config");
		String dbfPath = codigosPatron.getString("cupon_4");

		Connection conn = null;
		PreparedStatement ps = null;
		Table t = null;
		String nomTabla = "cupon_4";
		try {
			t = new Table(dbfPath);
			// nomTabla = FileUtils.getFileName(dbfPath);
			conn = DatabaseFactory.getConnectionForBulk();
			crearTabla(nomTabla, t, conn, ps);
		} catch (EOFException eofE) {
			MyLogger.logError("No existe la tabla " + nomTabla);
		} catch (Exception e) {
			MyLogger.logError(e.toString());
		} finally {
			try {
				if (t != null) {
					t.close();
				}
				DatabaseFactory.closeConnectionForBulk(conn, ps);
			} catch (Exception e) {
				MyLogger.logError(e.toString() + " | crearCupon4");
			}
		}

	}

	/*
	 * Este m√©todo crea e inserta en las tablas Curva_x y Cupon_4.
	 */
	private static void crearTabla(String pNombreTabla, Table pTabla, Connection pConn,
			PreparedStatement pPs, Date fechaProceso) throws IOException, FieldNotFoundException,
			FieldTypeException, SQLException, ParseException {

		crearTablaSiNoExisteOBorrarla(pConn, pPs, pNombreTabla);
		String sql = "INSERT INTO " + pNombreTabla + " VALUES(?, ?, ?, ?, ?);";
		int numRecords = pTabla.getNumberOfRecords();

		// System.out.println(t.getNumberOfRecords() + " registros");
		for (int i = 0; i < numRecords; i++) {
			pTabla.nextRecord();
			try {
				Integer plazo = pTabla.getFieldInteger("PLAZO");
				Double tna = pTabla.getFieldDouble("TNA");
				Double fDesc = pTabla.getFieldDouble("F_DESC");
				Double fAct = pTabla.getFieldDouble("F_ACT");
				Date dProc = pTabla.getFieldDate("D_PROC");
				/*
				 * System.out.println(plazo + " | " + tna + " | " + fDesc +
				 * " | " + fAct + " | " + dProc);
				 */
				pPs = pConn.prepareStatement(sql);
				pPs.setInt(1, plazo);
				pPs.setDouble(2, tna);
				pPs.setDouble(3, fDesc);
				pPs.setDouble(4, fAct);
				pPs.setDate(5, DateUtils.convertDate(dProc));
				/*
				 * if (i % 100 == 0) { System.out.println(i +
				 * " registros procesados." + tabla); }
				 */
				pPs.executeUpdate();
			} catch (NumberFormatException nfe) {
				MyLogger.log(nfe.toString());
			}
		}

	}

	/**
	 * Si no encuentra la curva en el path "comun", entonces va a buscarla al path de contingencia.
	 * Dichas curvas son histÛricas, con lo cual, se deberÌa realizar un filtro por la m·xima fecha de proceso 
	 * para llegar a las del dÌa anterior y luego comenzar la importaciÛn.
	 * @param conn
	 * @param ps
	 * @param codigoPatron
	 * @throws TableCorruptException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private static void crearCurvaContingencia(Connection conn, PreparedStatement ps,
			String codigoPatron) throws Exception {
		String nombreTabla = codigoPatron + ".contingencia";
		MyLogger.log("Se va a buscar LA TABLA de contingencia" + nombreTabla);
		String tabla = null;
		Table t = null;
		try {
			ResourceBundle rb = ResourceBundle.getBundle("config");
			try {
				String pathTabla = rb.getString(nombreTabla);
				t = new Table(pathTabla);
				tabla = FileUtils.getFileName(pathTabla);
				MyLogger.log("CREANDO LA TABLA de contingencia" + tabla);
				crearTabla(tabla, t, conn, ps);
			} catch (MissingResourceException e) {
				MyLogger.logError("No se pudo encontrar una entrada en el archivo de configuraciÛn para la tabla de contingencia "
						+ nombreTabla);

			}
		} catch (EOFException eofE) {
			MyLogger.logError("No existe la tabla de contingencia " + tabla);

		} finally {
			if (t != null) {
				t.close();
			}
		}
	}

	private static void crearCurva(Connection conn, PreparedStatement ps, String codigoPatron,
			Date fechaProceso) throws Exception {
		Table t = null;
		try {
			t = new Table(DAO.obtenerFile(codigoPatron));
			String tabla = FileUtils.getFileName(DAO.obtenerFile(codigoPatron));

			MyLogger.log("CREANDO LA TABLA " + tabla);
			crearTabla(tabla, t, conn, ps, fechaProceso);
		} catch (EOFException eofE) {
			MyLogger.logError("No existe la tabla " + DAO.obtenerFile(codigoPatron));

			crearCurvaContingencia(conn, ps, codigoPatron);
		} finally {
			if (t != null) {
				t.close();
			}
		}

	}

	public static Double obtenerFactorAct(Date pFecha, Long pPlazo) throws SQLException, Exception {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double factorAct = null;
		try {
			conn = DatabaseFactory.getConnection();
			ps = conn
					.prepareStatement("SELECT F_ACT, D_PROC  FROM Cupon_4 WHERE D_PROC <= ? AND PLAZO = ? ORDER BY D_PROC DESC;");
			ps.setDate(1, DateUtils.convertDate(DateUtils.addHours(pFecha, 23)));
			ps.setLong(2, pPlazo);
			rs = ps.executeQuery();
			if (rs.next()) {
				factorAct = rs.getDouble("F_ACT");
				Date d = rs.getDate("D_PROC");

				MyLogger.log("Se obtuvo el FactorAct para la fecha " + DateUtils.dateToString(d)
						+ ", plazo " + pPlazo);
			} else {
				MyLogger.logError("No se pudo obtener el factor de actualizaciÔøΩn para la fecha: "
						+ pFecha.toString() + " y el plazo " + pPlazo);
				throw new Exception(
						"No se pudo obtener el factor de actualizaciÔøΩn para la fecha: "
								+ pFecha.toString() + " y el plazo " + pPlazo);
			}
		} finally {
			DatabaseFactory.closeConnection(conn, ps, rs);
		}
		return factorAct;

	}

	public static Double obtenerFactorDesc(Date pFecha, Long pPlazo, String pTabla)
			throws SQLException, Exception {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double factorDesc = null;
		try {
			conn = DatabaseFactory.getConnection();
			ps = conn.prepareStatement("SELECT F_DESC, D_PROC FROM " + pTabla
					+ " WHERE D_PROC <= ? AND PLAZO = ? ORDER BY D_PROC DESC;");
			ps.setDate(1, DateUtils.convertDate(DateUtils.addHours(pFecha, 23)));
			ps.setLong(2, pPlazo);
			rs = ps.executeQuery();
			if (rs.next()) {
				factorDesc = rs.getDouble("F_DESC");
				Date d = rs.getDate("D_PROC");
				MyLogger.log("Se obtuvo el FactorDesc para la fecha " + DateUtils.dateToString(d)
						+ ", plazo " + pPlazo + ", tabla " + pTabla);

			} else {
				MyLogger.logError("No se pudo obtener el factor de descuento para la fecha "
						+ pFecha + ", plazo " + pPlazo + " y tabla " + pTabla);
				throw new Exception("No se pudo obtener el factor de descuento para la fecha "
						+ pFecha + ", plazo " + pPlazo + " y tabla " + pTabla);
			}
		} finally {
			DatabaseFactory.closeConnection(conn, ps, rs);
		}
		return factorDesc;

	}

	public static Double obtenerTipoCambioMoneda(Date pFechaProceso, Integer codDiv)
			throws SQLException, Exception {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double precio = null;
		try {
			conn = DatabaseFactory.getConnection();
			ps = conn
					.prepareStatement("SELECT PRICE, D_PROC FROM Calib_div_h WHERE D_PROC <= ? AND C_DIV = ? ORDER BY D_PROC DESC;");
			ps.setDate(1, DateUtils.convertDate(DateUtils.addHours(pFechaProceso, 23)));
			ps.setLong(2, codDiv);
			rs = ps.executeQuery();
			if (rs.next()) {
				precio = rs.getDouble("PRICE");
				Date d = rs.getDate("D_PROC");
				MyLogger.log("Se obtuvo el TipoCambioMoneda para la fecha "
						+ DateUtils.dateToString(d) + ", codDiv " + codDiv);
			} else {
				MyLogger.logError("No se pudo obtener el Tipo Cambio Moneda para el codigo "
						+ codDiv + " y para la fecha " + DateUtils.dateToString(pFechaProceso));
				throw new Exception("No se pudo obtener el Tipo Cambio Moneda para el codigo "
						+ codDiv + " y para la fecha " + DateUtils.dateToString(pFechaProceso));
			}
		} finally {
			DatabaseFactory.closeConnection(conn, ps, rs);
		}
		return precio;

	}

	public static void crearTasaFWD(List<TasaFWD> pTasas, Date pFechaProceso) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DatabaseFactory.getConnectionForBulk();
			String sqlDelete = "DELETE FROM Tasa_FWD;";// http://www.sqlite.org/lang_delete.html#trucateopt
			ps = conn.prepareStatement(sqlDelete);
			ps.executeUpdate();
			String sql = "INSERT INTO Tasa_FWD VALUES(?, ?, ?, ?, ?, ?, ?);";
			int i = 1;
			for (TasaFWD tasa : pTasas.subList(0, pTasas.size() - 31)) {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, i);//REG
				ps.setDate(2, DateUtils.convertDate(pFechaProceso));//FECHA_PROCESO
				ps.setDate(3, DateUtils.convertDate(tasa.getFechaMercado()));//FECHA
				ps.setDouble(4, tasa.getTasaFWD());//TASA_FWD
				ps.setString(5, DateUtils.dateToString(pFechaProceso));//FECHA_PROCESO_STR
				ps.setString(6, DateUtils.dateToString(tasa.getFechaMercado()));//FECHA_STR
				ps.setLong(7, tasa.getPlazo());//PLAZO
				ps.executeUpdate();
				i++;
			}

		} catch (Exception e) {
			MyLogger.logError(e.toString() + " | crearTasaFWD");
		} finally {
			try {
				DatabaseFactory.closeConnectionForBulk(conn, ps);
			} catch (SQLException e) {
				MyLogger.logError(e.toString());
			}
		}
	}

	public static Double obtenerPromedioTasasDeBadlar(Date pfInicio, Date pfFin) throws Exception {
		Double suma = new Double(0);
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double precio = null;
		Integer total = 0;
		try {
			conn = DatabaseFactory.getConnection();
			ps = conn
					.prepareStatement("SELECT PRICE  FROM Calib_index_h WHERE C_INDEX = 3 AND D_PROC >= ? AND D_PROC <= ?;");
			ps.setDate(1, DateUtils.convertDate(DateUtils.addHours(pfInicio, -23)));
			ps.setDate(2, DateUtils.convertDate(DateUtils.addHours(pfFin, 23)));
			rs = ps.executeQuery();
			while (rs.next()) {
				precio = rs.getDouble("PRICE");
				suma = suma + precio;
				total++;
			}
		} finally {
			DatabaseFactory.closeConnection(conn, ps, rs);
		}
		if (total != 0) {
			MyLogger.log("Promedio Tasas de Badlar entre las fechas ("
					+ DateUtils.dateToString(pfInicio) + "," + DateUtils.dateToString(pfFin)
					+ ") :" + suma / total);
			return suma / total;
		} else {
			MyLogger.logError("No se pudo obtener el Promedio de Tasas de Badlar entre la fecha "
					+ pfInicio + " y la fecha " + pfFin);
			throw new Exception("No se pudo obtener el Promedio de Tasas de Badlar entre la fecha "
					+ pfInicio + " y la fecha " + pfFin);
		}
	}

	public static Double obtenerPromedioBadlarYTasasFWD(Date pfInicioB, Date pfFinB,
			Date pfInicioTF, Date pfFinTF) throws Exception {
		Double sumaTF = new Double(0);
		Double sumaB = new Double(0);
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double tasaFWD = null;
		Double precio = null;
		Integer totalTF = 0;
		Integer totalB = 0;
		try {
			conn = DatabaseFactory.getConnection();
			ps = conn
					.prepareStatement("SELECT TASA_FWD FROM Tasa_FWD WHERE FECHA >= ? AND FECHA <= ? AND PLAZO >= 1;");
			ps.setDate(1, DateUtils.convertDate(DateUtils.addHours(pfInicioTF, -23)));
			ps.setDate(2, DateUtils.convertDate(DateUtils.addHours(pfFinTF, 23)));
			rs = ps.executeQuery();
			while (rs.next()) {
				tasaFWD = rs.getDouble("TASA_FWD");
				sumaTF = sumaTF + tasaFWD;
				totalTF++;
			}

			ps = conn
					.prepareStatement("SELECT PRICE  FROM Calib_index_h WHERE C_INDEX = 3 AND D_PROC >= ? AND D_PROC <= ?;");
			ps.setDate(1, DateUtils.convertDate(DateUtils.addHours(pfInicioB, -23)));
			ps.setDate(2, DateUtils.convertDate(DateUtils.addHours(pfFinB, 23)));
			rs = ps.executeQuery();
			while (rs.next()) {
				precio = rs.getDouble("PRICE");
				sumaB = sumaB + precio;
				totalB++;
			}

		} finally {
			DatabaseFactory.closeConnection(conn, ps, rs);
		}
		if (totalB != 0 || totalTF != 0) {
			MyLogger.log("Promedio Badlar y Tasas FWD entre las fechas ("
					+ DateUtils.dateToString(pfInicioB) + "," + DateUtils.dateToString(pfFinB)
					+ "," + DateUtils.dateToString(pfInicioTF) + ","
					+ DateUtils.dateToString(pfFinTF) + ") :" + (sumaB + sumaTF)
					/ (totalB + totalTF));
			return (sumaB + sumaTF) / (totalB + totalTF);
		} else {
			MyLogger.logError("No se pudo obtener el Promedio de Tasas de Badlar Y FWD entre las fechas ["
					+ DateUtils.dateToString(pfInicioB)
					+ ","
					+ DateUtils.dateToString(pfFinB)
					+ "], ["
					+ DateUtils.dateToString(pfInicioTF)
					+ ","
					+ DateUtils.dateToString(pfFinTF) + "]");
			throw new Exception(
					"No se pudo obtener el Promedio de Tasas de Badlar Y FWD entre las fecha "
							+ DateUtils.dateToString(pfInicioB) + ","
							+ DateUtils.dateToString(pfFinB) + ","
							+ DateUtils.dateToString(pfInicioTF) + ","
							+ DateUtils.dateToString(pfFinTF));
		}
	}

	public static Double obtenerPromedioTasasFWD(Date pfInicio, Date pfFin) throws Exception {
		Double suma = new Double(0);
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double tasaFWD = null;
		Integer total = 0;
		try {
			conn = DatabaseFactory.getConnection();
			ps = conn
					.prepareStatement("SELECT TASA_FWD FROM Tasa_FWD WHERE FECHA >= ? AND FECHA <= ? AND PLAZO > 1;");
			ps.setDate(1, DateUtils.convertDate(DateUtils.addHours(pfInicio, -23)));
			ps.setDate(2, DateUtils.convertDate(DateUtils.addHours(pfFin, 23)));
			rs = ps.executeQuery();
			while (rs.next()) {
				tasaFWD = rs.getDouble("TASA_FWD");
				suma = suma + tasaFWD;
				total++;
			}
		} finally {
			DatabaseFactory.closeConnection(conn, ps, rs);
		}
		if (total != 0) {
			MyLogger.log("Promedio Tasas FWD entre las fechas (" + DateUtils.dateToString(pfInicio)
					+ "," + DateUtils.dateToString(pfFin) + ") :" + suma / total);
			return suma / total;
		} else {
			MyLogger.logError("No se pudo obtener el Promedio de Tasas FWD entre las fecha "
					+ pfInicio + " y la fecha " + pfFin);
			throw new Exception("No se pudo obtener el Promedio de Tasas de FWD entre la fecha "
					+ pfInicio + " y la fecha " + pfFin);
		}
	}
}
