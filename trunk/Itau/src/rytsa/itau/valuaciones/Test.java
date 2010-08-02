package rytsa.itau.valuaciones;

import java.text.ParseException;

import rytsa.itau.utils.DateUtils;

public class Test {

	public static void main(String[] args) {
		try {
			Valuaciones.calcularMTMParaSwap(DateUtils.stringToDate("02/03/2010"));
		} catch (ParseException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}
