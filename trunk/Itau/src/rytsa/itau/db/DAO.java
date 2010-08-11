package rytsa.itau.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import rytsa.itau.db.factory.DatabaseFactory;
import rytsa.itau.dominio.TasaFWD;
import rytsa.itau.utils.DateUtils;
import br.com.softsite.sfc.tini.persistence.Table;

public class DAO {

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
			t = new Table("DBFs/calib_div_h.DBF");
			int numRecords = t.getNumberOfRecords();

			System.out.println(t.getNumberOfRecords() + " registros");
			for (int i = 0; i < numRecords; i++) {
				t.nextRecord();
				try {
					Integer div = t.getFieldInteger("C_DIV");
					Double price = t.getFieldDouble("PRICE");
					Date dProc = t.getFieldDate("D_PROC");
					/*
					 * System.out.println(plazo + " | " + tna + " | " + fDesc + " | " +
					 * fAct + " | " + dProc);
					 */
					ps = conn.prepareStatement(sql);
					ps.setInt(1, div);
					ps.setDouble(2, price);
					ps.setDate(3, DateUtils.convertDate(dProc));
					if (i % 100 == 0) {
						System.out.println(i + " registros procesados");
					}
					ps.executeUpdate();
				} catch (NumberFormatException nfe) {
					System.err.println(nfe.getMessage());
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DatabaseFactory.closeConnectionForBulk(conn, ps);
				if (t != null) {
					t.close();
				}
			} catch (Exception e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
	}

	public static void crearCurvaA(String codigoPatron) {
		DAO.crearCurva(codigoPatron, "Curva_A");
	}

	public static void crearCurvaB(String codigoPatron) {
		DAO.crearCurva(codigoPatron, "Curva_B");
	}

	/**
	 * Crea las curvas en nuestra base local desde lo dbfs. Codigo patron es
	 * ARP, USD, etc el codigo de moneda Tabla es Curva_A o curva_B de acuerdo
	 * si es Moneda o Moneda2(Moneda de liquidacion)
	 */
	private static void crearCurva(String codigoPatron, String tabla) {
		Connection conn = null;
		PreparedStatement ps = null;
		Table t = null;
		try {

			ResourceBundle codigosPatron = ResourceBundle
					.getBundle("config");
			String linea = codigosPatron.getString(codigoPatron);
			String dbfPath = linea.split(",")[1];	
			conn = DatabaseFactory.getConnectionForBulk();
			String sqlDelete = "DELETE FROM " + tabla + " ;";// http://www.sqlite.org/lang_delete.html#trucateopt
			ps = conn.prepareStatement(sqlDelete);
			ps.executeUpdate();

			String sql = "INSERT INTO " + tabla + " VALUES(?, ?, ?, ?, ?);";
			t = new Table(dbfPath);
			int numRecords = t.getNumberOfRecords();

			System.out.println(t.getNumberOfRecords() + " registros");
			for (int i = 0; i < numRecords; i++) {
				t.nextRecord();
				try {
					Integer plazo = t.getFieldInteger("PLAZO");
					Double tna = t.getFieldDouble("TNA");
					Double fDesc = t.getFieldDouble("F_DESC");
					Double fAct = t.getFieldDouble("F_ACT");
					Date dProc = t.getFieldDate("D_PROC");
					/*
					 * System.out.println(plazo + " | " + tna + " | " + fDesc + " | " +
					 * fAct + " | " + dProc);
					 */
					ps = conn.prepareStatement(sql);
					ps.setInt(1, plazo);
					ps.setDouble(2, tna);
					ps.setDouble(3, fDesc);
					ps.setDouble(4, fAct);
					ps.setDate(5, DateUtils.convertDate(dProc));
					if (i % 100 == 0) {
						System.out.println(i + " registros procesados");
					}
					ps.executeUpdate();
				} catch (NumberFormatException nfe) {
					System.err.println(nfe.getMessage());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DatabaseFactory.closeConnectionForBulk(conn, ps);
				if (t != null) {
					t.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static Double obtenerFactorAct(java.sql.Date pFecha, Long pPlazo)
			throws SQLException, Exception {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double factorAct = null;
		try {
			conn = DatabaseFactory.getConnection();
			ps = conn
					.prepareStatement("SELECT F_ACT FROM Curva_A WHERE D_PROC = ? AND PLAZO = ?;");
			ps.setDate(1, pFecha);
			ps.setLong(2, pPlazo);
			rs = ps.executeQuery();
			if (rs.next()) {
				factorAct = rs.getDouble("F_ACT");
			} else {
				throw new Exception(
						"No se pudo obtener el factor de actualización");
			}
		} finally {
			DatabaseFactory.closeConnection(conn, ps, rs);
		}
		return factorAct;

	}

	public static Double obtenerTipoCambioMoneda(java.sql.Date pFechaProceso,
			Long codDiv) throws SQLException, Exception {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double precio = null;
		try {// " ("C_DIV" NUMERIC, "PRICE" DOUBLE, "D_PROC" DATETIME)
			conn = DatabaseFactory.getConnection();
			ps = conn
					.prepareStatement("SELECT PRICE FROM Calib_div_h WHERE D_PROC = ? AND C_DIV = ?;");
			ps.setDate(1, pFechaProceso);
			ps.setLong(2, codDiv);
			rs = ps.executeQuery();
			if (rs.next()) {
				precio = rs.getDouble("PRICE");
			} else {
				throw new Exception("No se pudo obtener el Tipo Cambio Moneda");
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
			String sql = "INSERT INTO Tasa_FWD VALUES(?, ?, ?, ?);";
			int i = 1;
			for (TasaFWD tasa : pTasas.subList(0, pTasas.size() - 31)) {
				ps = conn.prepareStatement(sql);
				System.out.println(tasa.getFechaPublicacion() + "-"
						+ tasa.getTasaFWD());
				ps.setInt(1, i);
				ps.setDate(2, DateUtils.convertDate(pFechaProceso));
				ps
						.setDate(3, DateUtils.convertDate(tasa
								.getFechaPublicacion()));
				ps.setDouble(4, tasa.getTasaFWD());
				ps.executeUpdate();
				i++;
			}

		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		} finally {
			try {
				DatabaseFactory.closeConnectionForBulk(conn, ps);
			} catch (SQLException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
	}

}
