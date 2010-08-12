package rytsa.itau.valuaciones;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;

public class Test {

	public static void main(String[] args) {
		try {
			DAO.crearCurvas();
			DAO.crearTipoDeCambio();

			Valuaciones.calcularMTMParaSwap(DateUtils.stringToDate("02/03/2010"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
