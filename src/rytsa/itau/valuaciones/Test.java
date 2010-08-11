package rytsa.itau.valuaciones;

import rytsa.itau.db.DAO;

public class Test {

	public static void main(String[] args) {
		try {

			DAO.crearCurvaA("USD");
			DAO.crearCurvaB("ARP");
			DAO.crearTipoDeCambio();

			// Valuaciones.calcularMTMParaSwap(DateUtils.stringToDate("02/03/2010"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
