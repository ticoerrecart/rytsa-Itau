package rytsa.itau.valuaciones;

import java.text.ParseException;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;

public class Test {

	public static void main(String[] args) {
		try {
			DAO.crearCupon4();
			Valuaciones.calcularMTMParaSwap(DateUtils.stringToDate("02/03/2010"));
		} catch (ParseException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}
