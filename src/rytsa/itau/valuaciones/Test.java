package rytsa.itau.valuaciones;

import java.text.ParseException;
import java.util.List;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.ndf.NovedadesValuacionesRequestData;

public class Test {

	public Test() {
		DAO.crearCupon4();
		DAO.crearCurvas();
		DAO.crearTipoDeCambio();
		DAO.crearTasasDeBadlar();
	}

	public static void main(String[] args) {
		try {
			Test t = new Test();
			List<NovedadesValuacionesRequestData> listaSWAP = t.calcularMTMSwap();
			List<NovedadesValuacionesRequestData> listaNDF = t.calcularMTMNdf();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<NovedadesValuacionesRequestData> calcularMTMSwap() throws ParseException, Exception {
		List<NovedadesValuacionesRequestData> listaSWAP = ValuacionesSWAP.calcularMTM(DateUtils
				.stringToDate("02/03/2010"));
		return listaSWAP;
	}

	public List<NovedadesValuacionesRequestData> calcularMTMNdf() throws ParseException, Exception {
		List<NovedadesValuacionesRequestData> listaNDF = ValuacionesNDF.calcularMTM(DateUtils
				.stringToDate("03/06/2010"));
		return listaNDF;
	}
}