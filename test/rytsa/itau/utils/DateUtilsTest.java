package rytsa.itau.utils;

import java.text.ParseException;
import java.util.Date;

import junit.framework.TestCase;

public class DateUtilsTest extends TestCase {

	public void testUltimoDiaDelMes() {
		Date d1 = null;
		try {
			d1 = DateUtils.stringToDate("18/10/2010");
			Date d2 = DateUtils.ultimoDiaDelMes(d1);
			assertNotNull(d2);

			d1 = DateUtils.stringToDate("14/02/2012");
			d2 = DateUtils.ultimoDiaDelMes(d1);
			assertNotNull(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
