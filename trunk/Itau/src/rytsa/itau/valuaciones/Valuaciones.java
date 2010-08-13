package rytsa.itau.valuaciones;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * @author rerrecart
 * 
 */
public abstract class Valuaciones {

	protected static final int DIAS = 6;// 5400

	protected static int modo = 4;

	protected static int puerto = 2424;

	protected static String host = "localhost";

	protected static String convertStreamToString(InputStream is) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		is.close();
		return sb.toString();
	}

	public static void calcularMTM(Date pFechaProceso) throws Exception {
	}
}
