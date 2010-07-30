package rytsa.itau.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import rytsa.itau.utils.FileUtils;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;

public class DB {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		try {

			// create a DBFReader object
			InputStream inputStream = new FileInputStream(
					"/home/rodolfo/workspaces/workspace1/Itau/DBFs/curva_4.DBF");
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
		}
	}

	public static void crearCupon4() {
		try {
			Connection conn = DB.getConnection();
			// create a DBFReader object
			InputStream inputStream = new FileInputStream(
					"/home/rodolfo/workspaces/workspace1/Itau/DBFs/curva_4.DBF");
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
						stmt.setObject(i+1, rowObjects[i]);
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

	}

	public static Connection getConnection() throws Exception {
		String directory = System.getProperty("user.home")
				+ Constantes.DATABASE_DIRECTORY;
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
