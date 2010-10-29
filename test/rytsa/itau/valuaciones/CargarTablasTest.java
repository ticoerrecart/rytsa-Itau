package rytsa.itau.valuaciones;

import java.util.Date;

import junit.framework.TestCase;
import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;

public class CargarTablasTest extends TestCase {

	public void testCargarTablas() {
		Test t = new Test("C:\\Documents and Settings\\rerrecart\\rytsa\\db");
		Date fecha = null;
		Double price = null;
		try {
			fecha = DateUtils.stringToDate("11/02/2002");
			// Mon Feb 11 00:00:00 BRST 2002
			// 0
			price = DAO.obtenerTipoCambioMoneda(fecha, 0);
			assertTrue(price > 0);
			System.out.println(price);

			fecha = DateUtils.stringToDate("12/02/2002");
			price = DAO.obtenerTipoCambioMoneda(fecha, 2);
			assertTrue(price > 0);
			System.out.println(price);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
}
