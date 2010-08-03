package rytsa.itau.db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import rytsa.itau.db.factory.DatabaseFactory;
import rytsa.itau.utils.DateUtils;
import br.com.softsite.sfc.tini.persistence.FieldNotFoundException;
import br.com.softsite.sfc.tini.persistence.FieldTypeException;
import br.com.softsite.sfc.tini.persistence.Table;
import br.com.softsite.sfc.tini.persistence.TableCorruptException;

public class DAO {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		crearCupon4();
		verCupon4Data();
	}

	public static void testDBF() {
		try {
			Table t = new Table(
					"C:\\Documents and Settings\\rerrecart\\Mis documentos\\rytsa\\Itau\\DBFs\\curva_4.DBF");
			System.out.println(t.getNumberOfRecords());
			for (int i = 0; i < t.getNumberOfRecords(); i++) {
				t.nextRecord();
				try {
					Integer plazo = t.getFieldInteger("PLAZO");
					Double tna = t.getFieldDouble("TNA");
					Double fDesc = t.getFieldDouble("F_DESC");
					Double fAct = t.getFieldDouble("F_ACT");
					Date dProc = t.getFieldDate("D_PROC");
					System.out.println(plazo + " | " + tna + " | " + fDesc + " | " + fAct + " | "
							+ dProc);
				} catch (NumberFormatException nfe) {
					System.err.println(nfe.getMessage());
				}

			}
			t.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TableCorruptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FieldNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FieldTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void verCupon4Data() {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DatabaseFactory.getConnection();
			ps = conn.prepareStatement("SELECT * FROM Cupon_4 WHERE plazo = ?;");
			ps.setInt(1, 1);
			ResultSet rs = ps.executeQuery();
			Date fecha = rs.getDate("D_PROC");
			System.out.println(fecha);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		} finally {
			try {
				DatabaseFactory.closeConnection(conn, ps);
			} catch (SQLException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}

	}

	public static void crearCupon4() {
		Connection conn = null;
		PreparedStatement ps = null;
		Table t = null;
		try {
			conn = DatabaseFactory.getConnectionForBulk();
			String sql = "INSERT INTO Cupon_4 VALUES(?, ?, ?, ?, ?);";
			t = new Table(
					"C:\\Documents and Settings\\rerrecart\\Mis documentos\\rytsa\\Itau\\DBFs\\curva_4.DBF");
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
					/*System.out.println(plazo + " | " + tna + " | " + fDesc + " | " + fAct + " | "
					 + dProc);*/
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

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TableCorruptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FieldNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FieldTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		} finally {
			try {
				DatabaseFactory.closeConnectionForBulk(conn, ps);
				if (t != null) {
					t.close();
				}
			} catch (SQLException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
	}

	/*	public static TasaFWD obtenerFechaAct(java.sql.Date pFecha, Long pPlazo) {
	 TasaFWD tasa = null;
	 ResultSet rs = null;
	 Connection conn = null;
	 PreparedStatement ps = null;
	 try {
	 conn = DatabaseFactory.getConnection();
	 ps = conn.prepareStatement("SELECT F_ACT FROM Cupon_4 WHERE D_PROC = ? AND PLAZO = ?;");
	 ps.setDate(1, pFecha);
	 ps.setLong(2, pPlazo);
	 rs = ps.executeQuery();
	 if (rs.next()) {
	 tasa = new TasaFWD();
	 tasa.setFechaPublicacion(pFecha);
	 tasa.setFactorDeActualizacion(rs.getDouble("F_ACT"));
	 }
	 } catch (Exception e) {
	 // TODO Bloque catch generado automáticamente
	 e.printStackTrace();
	 }

	 return tasa;

	 }*/

	public static Double obtenerFactorAct(java.sql.Date pFecha, Long pPlazo) throws SQLException,
			Exception {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		Double factorAct = null;

		conn = DatabaseFactory.getConnection();
		ps = conn.prepareStatement("SELECT F_ACT FROM Cupon_4 WHERE D_PROC = ? AND PLAZO = ?;");
		ps.setDate(1, pFecha);
		ps.setLong(2, pPlazo);
		rs = ps.executeQuery();
		if (rs.next()) {
			factorAct = rs.getDouble("F_ACT");
		} else {
			throw new Exception("No se pudo obtener el factor de actualización");
		}

		return factorAct;

	}
}
