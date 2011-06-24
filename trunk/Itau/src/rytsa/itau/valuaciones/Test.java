package rytsa.itau.valuaciones;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.utils.MyLogger;
import rytsa.itau.valuaciones.dto.InformarNovedadesValuacionesXmlRequest;

@WebService
@SOAPBinding
public class Test {

	public static String path;

	private static ResourceBundle resourceBundle = null;

	public Test() {
	}

	public static void main(String[] args) {
		try {
			if (args[0] != null && args[1] != null && !"".equals(args[0]) && !"".equals(args[1])) {
				String tipoOperacion = args[0];
				String fechaProceso = args[1];
				if (DateUtils.isValidDateStr(fechaProceso)) {
					String root = System.getProperty("user.dir");
					Test test = new Test(root, fechaProceso);
					if ("SWAP".equalsIgnoreCase(tipoOperacion)) {
						test.calcularMTMSwap(fechaProceso);
					} else {
						if ("NDF".equalsIgnoreCase(tipoOperacion)) {
							test.calcularMTMNdf(fechaProceso);
						} else {
							MyLogger.logError("Error de parametro de entrada: '" + tipoOperacion
									+ "'.  Valores válidos [SWAP, NDF]");
						}
					}
				}
			} else {
				MyLogger.logError("Error en los par�metros de entrada.  Arg0: '" + args[0]
						+ "', Arg1: '" + args[1] + "'");
			}

		} catch (ParseException e) {
			MyLogger.logError(e.toString());
		} catch (Exception e) {
			MyLogger.logError(e.toString());
		}
	}

	public Test(String pPath, String pFechaProceso) {
		Test.path = pPath + File.separator;
		Date dateFechaProceso = DateUtils.stringToDate(pFechaProceso);

		MyLogger.log("SE EMPIEZAN A CREAR LAS TABLAS...");
		MyLogger.log("SE CREA CUPON_4...");
		DAO.crearCupon4(dateFechaProceso);
		MyLogger.log("SE CREAN LAS CURVAS...");
		DAO.crearCurvas(dateFechaProceso);
		MyLogger.log("SE CREA EL TIPO DE CAMBIO (Calib_div_h)...");
		DAO.crearTipoDeCambio(dateFechaProceso);
		MyLogger.log("SE CREAN LAS TASAS DE BADLAR (Calib_index_h)...");
		DAO.crearTasasDeBadlar(dateFechaProceso);
		MyLogger.log("SE TERMINAN DE CREAR LAS TABLAS...");
	}

	@WebMethod
	public InformarNovedadesValuacionesXmlRequest calcularMTMSwap(String pDate)
			throws ParseException, Exception {
		InformarNovedadesValuacionesXmlRequest listaSWAP = ValuacionesSWAP.calcularMTM(DateUtils
				.stringToDate(pDate));// "02/03/2010"
		return listaSWAP;
	}

	@WebMethod
	public InformarNovedadesValuacionesXmlRequest calcularMTMNdf(String pDate)
			throws ParseException, Exception {
		InformarNovedadesValuacionesXmlRequest listaNDF = ValuacionesNDF.calcularMTM(DateUtils
				.stringToDate(pDate));// "03/06/2010"
		return listaNDF;
	}

	@WebMethod
	public String testSuma1Dia(String pDate) throws ParseException, Exception {
		Date d = DateUtils.addDays(DateUtils.stringToDate(pDate), 1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(d);
	}

	@WebMethod
	public String resetBBDD() throws ParseException, Exception {
		if (resourceBundle == null) {
			resourceBundle = ResourceBundle.getBundle("config");
		}
		MyLogger.log("SE CREA CUPON_4...");
		DAO.crearCupon4();

		MyLogger.log("SE CREAN LAS CURVAS...");
		DAO.crearCurvas();
		MyLogger.log("SE CREA EL TIPO DE CAMBIO (Calib_div_h)...");
		DAO.crearTipoDeCambio();
		MyLogger.log("SE CREAN LAS TASAS DE BADLAR (Calib_index_h)...");
		DAO.crearTasasDeBadlar();

		StringBuffer origenes = new StringBuffer();
		origenes.append("Cupon 4: " + resourceBundle.getString("cupon_4") + ",");
		String linea = resourceBundle.getString("codMonedas");
		for (String moneda : linea.split(",")) {
			origenes.append(moneda + ":" + resourceBundle.getString(moneda.trim()).split(",")[1]
					+ ",");
		}
		origenes.append("Calib_div_h: " + resourceBundle.getString("calib_div_h") + ",");
		origenes.append("Calib_index_h: " + resourceBundle.getString("calib_index_h") + ",");

		MyLogger.log("Tablas Cargadas Con exito. Ubicacion de la BBDD:"
				+ resourceBundle.getString("bbdd.path") + ". Ubicacion de archivos de Origen:"
				+ origenes.toString());
		return "Tablas Cargadas Con exito. Ubicacion de la BBDD:"
				+ resourceBundle.getString("bbdd.path") + ". Ubicacion de archivos de Origen:"
				+ origenes.toString();
	}
}