package rytsa.itau.valuaciones;

import java.util.Date;

import junit.framework.TestCase;
import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;

public class CargarTablasTest extends TestCase {

	public void testCargarTablas() {
		//Test t = new Test("C:\\Documents and Settings\\rerrecart\\rytsa\\db");
		Date fecha = null;
		Double price = null;
		try {
			fecha = DateUtils.stringToDate("18/10/2010");
			// Mon Feb 11 00:00:00 BRST 2002
			// 0
			/*
			 * price = DAO.obtenerTipoCambioMoneda(fecha, 6); assertTrue(price >
			 * 0); System.out.println(price);
			 * 
			 * fecha = DateUtils.stringToDate("12/02/2002"); price =
			 * DAO.obtenerTipoCambioMoneda(fecha, 2);
			 */

			price = DAO.obtenerFactorDesc(fecha, new Long(2), "curva_6");
			assertTrue(price > 0);
			System.out.println(price);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	public void testDouble(){
		Double d1 = new Double("0");
		Double d2 = new Double("0.0");
		assertTrue(d1==0);
		assertTrue(d1==0.0);
		assertTrue(d2==0);
		assertTrue(d2==0.0);
	}
}
