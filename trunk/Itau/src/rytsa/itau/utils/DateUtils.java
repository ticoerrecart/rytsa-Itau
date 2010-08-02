package rytsa.itau.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtils {

	public static Date stringToDate(String pFecha) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedDate = dateFormat.parse(pFecha);
		return convertedDate;
	}

	public static java.sql.Date convertDate(Date pFecha) {
		return new java.sql.Date(pFecha.getTime());
	}
}
