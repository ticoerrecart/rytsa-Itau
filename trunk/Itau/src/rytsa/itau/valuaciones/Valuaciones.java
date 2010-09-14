package rytsa.itau.valuaciones;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

import rytsa.itau.valuaciones.dto.ndf.NovedadesValuacionesRequestData;

/**
 * @author rerrecart
 * 
 */
public abstract class Valuaciones {

	protected static int DIAS;// 5400

	protected static int MODO;

	protected static int PUERTO;

	protected static String HOST;

	protected static ResourceBundle resourceBundle;

	static{
		resourceBundle = ResourceBundle.getBundle("config");
		DIAS = Integer.parseInt(resourceBundle.getString("cantRegistros"));
		MODO = Integer.parseInt(resourceBundle.getString("esb.modo"));
		PUERTO = Integer.parseInt(resourceBundle.getString("esb.puerto"));
		HOST = resourceBundle.getString("esb.host");
	}

	protected static String convertStreamToString(InputStream is)
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

	public static List<NovedadesValuacionesRequestData> calcularMTM(
			Date pFechaProceso) throws Exception {
		return null;
	}

	/**
	 * remueve los tags de apertura <soap:Envelope ...> y <soap:Body> y los
	 * respectivos de cierre
	 * 
	 * @param pXml
	 * @return
	 */
	public static String removerHeaderSoap(String pXml) {
		StringBuffer xml = new StringBuffer();
		Scanner scanner = new Scanner(pXml);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.indexOf("soap:") < 0) {
				xml.append(line);
			}
		}
		return xml.toString();
	}
}
