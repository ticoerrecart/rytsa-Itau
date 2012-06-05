package rytsa.itau.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public abstract class DateUtils {

	private static final int MILLISECONDS_PER_DAY = 1000 * 60 * 60 * 24;

	public static Date stringToDate(String pFecha) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedDate = dateFormat.parse(pFecha);
		return convertedDate;
	}

	public static Date stringToDate(String pFecha, String mask) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat(mask);
		Date convertedDate = dateFormat.parse(pFecha);
		return convertedDate;
	}

	public static String dateToString(Date pFecha) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String convertedDate = dateFormat.format(pFecha);
		return convertedDate;
	}

	public static String dateToString(Date pFecha, String mask) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat(mask);
		String convertedDate = dateFormat.format(pFecha);
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

	public static Date addHours(Date pDate, int hours) {
		Date newDate = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(pDate);
		cal.add(Calendar.HOUR, hours);
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

	public static long diferenciaEntreFechas(Date fecha1, Date fecha2) {
		Double plazo = 0d;
		if (fecha1.after(fecha2)) {
			plazo = Math.floor((fecha1.getTime() - fecha2.getTime()) / (MILLISECONDS_PER_DAY));
		} else {
			plazo = Math.floor((fecha2.getTime() - fecha1.getTime()) / (MILLISECONDS_PER_DAY));
		}
		return Math.round(plazo);
	}

	public static XMLGregorianCalendar getXMLGregorianCalendar(Date date) throws Exception {
		GregorianCalendar gcal = new GregorianCalendar();
		gcal.setTime(date);
		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		return xgcal;
	}

	public static boolean isValidDateStr(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// declare and initialize testDate variable, this is what will hold
		// our converted string

		Date testDate = null;

		// we will now try to parse the string into date form
		try {
			testDate = sdf.parse(date);
		} catch (ParseException e) {
			// if the format of the string provided doesn't match the format we
			// declared in SimpleDateFormat() we will get an exception
			MyLogger.logError("Formato de fecha invÃ¡lida: " + date);
			return false;
		}

		// dateformat.parse will accept any date as long as it's in the format
		// you defined, it simply rolls dates over, for example, december 32
		// becomes jan 1 and december 0 becomes november 30
		// This statement will make sure that once the string
		// has been checked for proper formatting that the date is still the
		// date that was entered, if it's not, we assume that the date is
		// invalid

		if (!sdf.format(testDate).equals(date)) {
			MyLogger.logError("Fecha invÃ¡lida: " + date);
			return false;
		}

		// if we make it to here without getting an error it is assumed that
		// the date was a valid one and that it's in the proper format

		return true;
	}

	/**
	 * Devuelve una fecha nueva con el día seteado en el último día del mes.
	 * @param pDate
	 * @return
	 */
	public static Date ultimoDiaDelMes(Date pDate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(pDate);
		Integer ultimoDiaMes = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		cal.set(Calendar.DAY_OF_MONTH, ultimoDiaMes);
		Date newDate = new Date();
		newDate.setTime(cal.getTime().getTime());
		return newDate;
	}
}
