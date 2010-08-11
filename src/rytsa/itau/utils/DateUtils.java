package rytsa.itau.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class DateUtils {

	private static final int MILLISECONDS_PER_DAY = 1000 * 60 * 60 * 24;



	public static Date stringToDate(String pFecha) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedDate = dateFormat.parse(pFecha);
		return convertedDate;
	}

	public static java.sql.Date convertDate(Date pFecha) {
		return new java.sql.Date(pFecha.getTime());
	}

	public static Date addDays(Date pDate, int days) {
		Date newDate = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(pDate);
		cal.add(Calendar.DATE, days);
		newDate.setTime(cal.getTime().getTime());
		return newDate;
	}

	public static boolean esFinDeSemana(Date pDate) {
		boolean esFinDeSemana = false;
		Calendar cal = Calendar.getInstance();
		cal.setTime(pDate);

		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
				|| cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			esFinDeSemana = true;
		}
		return esFinDeSemana;
	}

	
	
	public static long diferenciaEntreFechas (Date fecha1, Date fecha2){
		Double plazo = 0d;
		if (fecha1.after(fecha2)){
			plazo = Math.floor((fecha1.getTime() - fecha2.getTime()) / (MILLISECONDS_PER_DAY));	
		}else {
			plazo = Math.floor((fecha2.getTime() - fecha1.getTime()) / (MILLISECONDS_PER_DAY));
		}
		return Math.round(plazo);
	}
	

	
	
}