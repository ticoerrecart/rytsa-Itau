package rytsa.itau.db.factory;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import rytsa.itau.db.Constantes;
import rytsa.itau.utils.FileUtils;
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
			PreparedStatement pPreparedStatement, ResultSet pRs) throws SQLException {
		closeConnection(pConnection, pPreparedStatement);
		if (pRs != null) {
			pRs.close();
		}

	}

	public static void closeConnection(Connection pConnection, PreparedStatement pPreparedStatement)
			throws SQLException {
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

	public static Connection getConnection() throws Exception {
		String directory = System.getProperty("user.home") + Constantes.DATABASE_DIRECTORY;
		String fileName = directory + Constantes.DATABASE_SQLITE_URL;
		String url = Constantes.DATABASE_SQLITE + fileName;

		File f = new File(fileName);
		if (!f.exists()) {
			new File(directory).mkdirs();
			File db = new File(Test.path + "/../DB/rytsa.sqlite");
			FileUtils.copyFile(db, f);
		}

		Class.forName(Constantes.DATABASE_SQLITE_JDBC).newInstance();
		Connection connection = DriverManager.getConnection(url);
		return connection;
	}
}
