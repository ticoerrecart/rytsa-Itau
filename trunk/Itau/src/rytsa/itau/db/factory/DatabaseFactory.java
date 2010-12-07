package rytsa.itau.db.factory;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import rytsa.itau.db.Constantes;
import rytsa.itau.utils.FileUtils;
import rytsa.itau.utils.MyLogger;
import rytsa.itau.valuaciones.Test;

public abstract class DatabaseFactory {

	public static void closeConnectionForBulk(Connection pConnection,
			PreparedStatement pPreparedStatement) throws SQLException {
		if (pConnection != null) {
			pConnection.commit();
			pConnection.setAutoCommit(true);
			pConnection.createStatement().execute("PRAGMA synchronous =FULL;");
			pConnection.close();
		}
		if (pPreparedStatement != null) {
			pPreparedStatement.close();
		}
	}

	public static void closeConnection(Connection pConnection,
			PreparedStatement pPreparedStatement, ResultSet pRs)
			throws SQLException {
		closeConnection(pConnection, pPreparedStatement);
		if (pRs != null) {
			pRs.close();
		}

	}

	public static void closeConnection(Connection pConnection,
			PreparedStatement pPreparedStatement) throws SQLException {
		if (pConnection != null) {
			pConnection.close();
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

	private static void closeResource(Closeable closeable) throws IOException {
		if (closeable != null)
			closeable.close();
	}

	public static Connection getConnection() throws Exception {

		ResourceBundle resources = ResourceBundle.getBundle("config");
		String ddbbpath = resources.getString("bbdd.path");
		if (!ddbbpath.endsWith("\\")) {
			ddbbpath = ddbbpath + "\\";
		}
		String fileName = ddbbpath + Constantes.DATABASE_SQLITE_URL;
		String url = Constantes.DATABASE_SQLITE + fileName;

		File f = new File(fileName);
		if (!f.exists()) {
			new File(ddbbpath).mkdirs();
			MyLogger.log("Se crea el directorio: " + ddbbpath);
			InputStream is = DatabaseFactory.class
					.getResourceAsStream("/DB/rytsa.sqlite");
			if (is != null) {
				MyLogger.log("recuperé la BD dentro del jar");
				OutputStream out = null;
				try {
					out = new FileOutputStream(f);
					byte buf[] = new byte[1024];
					int len;
					while ((len = is.read(buf)) > 0) {
						out.write(buf, 0, len);
					}
					MyLogger.log("copié la BD desde el jar");
				} finally {
					closeResource(out);
					closeResource(is);
				}
			} else {
				String p = Test.path + "DB" + File.separatorChar
						+ "rytsa.sqlite";
				File db = new File(p);
				MyLogger.log("Se va a copiar la BD desde el path: " + p);
				FileUtils.copyFile(db, f);
			}

			MyLogger.log("Se copió la BD a:" + fileName);
		}

		Class.forName(Constantes.DATABASE_SQLITE_JDBC).newInstance();
		Connection connection = DriverManager.getConnection(url);
		return connection;
	}
}
