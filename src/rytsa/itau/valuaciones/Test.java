package rytsa.itau.valuaciones;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.InformarNovedadesValuacionesXmlRequest;

@WebService
@SOAPBinding
public class Test {

	public static String path;

	public Test() {
	}

	public Test(String pPath) {
		Test.path = pPath + File.separator;
		System.out.println("SE CREA CUPON_4...");
		DAO.crearCupon4();
		System.out.println("SE CREAN LAS CURVAS...");
		DAO.crearCurvas();
		System.out.println("SE CREA EL TIPO DE CAMBIO...");
		DAO.crearTipoDeCambio();
		System.out.println("SE CREAN LAS TASAS DE BADLAR...");
		DAO.crearTasasDeBadlar();
	}

	@WebMethod
	public InformarNovedadesValuacionesXmlRequest calcularMTMSwap(String pDate)
			throws ParseException, Exception {
		InformarNovedadesValuacionesXmlRequest listaSWAP = ValuacionesSWAP
				.calcularMTM(DateUtils.stringToDate(pDate));// "02/03/2010"
		return listaSWAP;
	}

	@WebMethod
	public InformarNovedadesValuacionesXmlRequest calcularMTMNdf(String pDate)
			throws ParseException, Exception {
		InformarNovedadesValuacionesXmlRequest listaNDF = ValuacionesNDF
				.calcularMTM(DateUtils.stringToDate(pDate));// "03/06/2010"
		return listaNDF;
	}

	@WebMethod
	public String testSuma1Dia(String pDate) throws ParseException, Exception {
		Date d = DateUtils.addDays(DateUtils.stringToDate(pDate), 1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(d);
	}

}