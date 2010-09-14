package rytsa.itau.valuaciones;

import java.io.File;
import java.text.ParseException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.ndf.NovedadesValuacionesRequestData;

@WebService
@SOAPBinding
public class Test {

	public static String path;

	public Test() {
	}

	public Test(String pPath) {
		Test.path = pPath + File.separator;
		DAO.crearCupon4();
		DAO.crearCurvas();
		DAO.crearTipoDeCambio();
		DAO.crearTasasDeBadlar();
	}

	@WebMethod
	public List<NovedadesValuacionesRequestData> calcularMTMSwap(String pDate)
			throws ParseException, Exception {
		List<NovedadesValuacionesRequestData> listaSWAP = ValuacionesSWAP
				.calcularMTM(DateUtils.stringToDate(pDate));// "02/03/2010"
		return listaSWAP;
	}

	@WebMethod
	public List<NovedadesValuacionesRequestData> calcularMTMNdf(String pDate)
			throws ParseException, Exception {
		List<NovedadesValuacionesRequestData> listaNDF = ValuacionesNDF
				.calcularMTM(DateUtils.stringToDate(pDate));// "03/06/2010"
		return listaNDF;
	}
}