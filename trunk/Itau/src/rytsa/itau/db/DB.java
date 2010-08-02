package rytsa.itau.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import rytsa.itau.utils.FileUtils;
import br.com.softsite.sfc.tini.persistence.FieldNotFoundException;
import br.com.softsite.sfc.tini.persistence.FieldTypeException;
import br.com.softsite.sfc.tini.persistence.Table;
import br.com.softsite.sfc.tini.persistence.TableCorruptException;

public class DB {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		crearCupon4();
		verCupon4Data();
		/*		try {

		 // create a DBFReader object
		 InputStream inputStream = new FileInputStream(
		 "C:\\Documents and Settings\\rerrecart\\Mis documentos\\rytsa\\Itau\\DBFs\\curva_4.DBF");
		 DBFReader reader = new DBFReader(inputStream);

		 // get the field count if you want for some reasons like the
		 // following
		 int campos = reader.getFieldCount();
		 for (int i = 0; i < campos; i++) {
		 DBFField field = reader.getField(i);
		 System.out.println(field.getName());
		 }

		 // Now, lets us start reading the rows
		 int filas = reader.getRecordCount();
		 System.out.println("Otro mÃ©todo!!!!!!!!!!!!!!!!!!!!!");
		 for (int j = 0; j < filas; j++) {
		 try {
		 Object[] rowObjects = reader.nextRecord();
		 for (int i = 0; i < rowObjects.length; i++) {
		 System.out.print(rowObjects[i] + " | ");
		 }
		 System.out.println("---------------------------");

		 } catch (DBFException e) {
		 System.out.println(e.getMessage());
		 }

		 }
		 System.out.println(filas);

		 inputStream.close();

		 crearCupon4();
		 } catch (DBFException e) {
		 System.out.println(e.getMessage());
		 } catch (IOException e) {
		 System.out.println(e.getMessage());
		 } catch (Exception e) {
		 System.out.println(e.getMessage());
		 }*/
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

	/*	public static void crearCupon4() {
	 try {
	 Connection conn = DB.getConnection();
	 // create a DBFReader object
	 InputStream inputStream = new FileInputStream(
	 "C:\\Documents and Settings\\rerrecart\\Mis documentos\\rytsa\\Itau\\DBFs\\curva_4.DBF");
	 DBFReader reader = new DBFReader(inputStream);

	 // Now, lets us start reading the rows
	 int filas = reader.getRecordCount();
	 String sql = "INSERT INTO Cupon_4 VALUES(?, ?, ?, ?, ?);";
	 for (int j = 0; j < filas; j++) {
	 try {
	 Object[] rowObjects = reader.nextRecord();
	 PreparedStatement stmt = conn.prepareStatement(sql);

	 for (int i = 0; i < rowObjects.length; i++) {
	 System.out.print(rowObjects[i] + " | ");
	 stmt.setObject(i + 1, rowObjects[i]);
	 }

	 stmt.execute();
	 System.out.println("---------------------------");

	 } catch (DBFException e) {
	 System.out.println(e.getMessage());
	 }

	 }
	 System.out.println(filas);

	 inputStream.close();

	 } catch (Exception e) {

	 }

	 }*/

	public static void verCupon4Data() {
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Cupon_4 WHERE plazo = ?;");
			ps.setInt(1, 1);
			ResultSet rs = ps.executeQuery();
			Date fecha = rs.getDate("D_PROC");
			System.out.println(fecha);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}

	}

	public static void crearCupon4() {
		Connection conn = null;
		PreparedStatement ps = null;
		Table t = null;
		try {
			conn = DB.getConnectionForBulk();
			/*conn.createStatement().execute("PRAGMA synchronous = OFF;");
			 conn.setAutoCommit(false);*/
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
					ps.setDate(5, new java.sql.Date(dProc.getTime()));
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
				/*if (conn != null) {
				 conn.commit();
				 conn.setAutoCommit(true);
				 conn.createStatement().execute("PRAGMA synchronous =FULL;");
				 }
				 if (ps != null) {
				 ps.close();
				 }*/
				closeConnectionForBulk(conn, ps);
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

	public static void closeConnectionForBulk(Connection pConnection,
			PreparedStatement pPreparedStatement) throws SQLException {
		if (pConnection != null) {
			pConnection.commit();
			pConnection.setAutoCommit(true);
			pConnection.createStatement().execute("PRAGMA synchronous =FULL;");
		}
		if (pPreparedStatement != null) {
			pPreparedStatement.close();
		}
	}

	public static Connection getConnectionForBulk() throws Exception {
		Connection conn = getConnection();
		conn.createStatement().execute("PRAGMA synchronous = OFF;");
		conn.setAutoCommit(false);
		return conn;
	}

	public static Connection getConnection() throws Exception {
		String directory = System.getProperty("user.home") + Constantes.DATABASE_DIRECTORY;
		String fileName = directory + Constantes.DATABASE_SQLITE_URL;
		String url = Constantes.DATABASE_SQLITE + fileName;

		File f = new File(fileName);
		if (!f.exists()) {
			new File(directory).mkdirs();
			File db = new File("DB/rytsa.sqlite");
			FileUtils.copyFile(db, f);
		}

		Class.forName(Constantes.DATABASE_SQLITE_JDBC).newInstance();
		Connection connection = DriverManager.getConnection(url);
		return connection;
	}

}
