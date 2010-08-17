package rytsa.itau.valuaciones;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;

public class Test {

	public static void main(String[] args) {
		try {
			DAO.crearCupon4();
			DAO.crearCurvas();
			DAO.crearTipoDeCambio();
			DAO.crearTasasDeBadlar();

			// ValuacionesSWAP.calcularMTM(DateUtils.stringToDate("02/03/2010"));
			ValuacionesNDF.calcularMTM(DateUtils.stringToDate("03/06/2010"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
