package rytsa.itau.valuaciones.dto.swap;

import java.text.ParseException;
import java.util.Date;

import rytsa.itau.utils.DateUtils;

public class DisponibilizacionFeriadosXmlRequestData {
	private static final String DATE_MASK = "yyyy-MM-dd";
	private String IdCalendario;
	private String FechaIni;
	private String FechaFin;

	public String getIdCalendario() {
		return IdCalendario;
	}

	public void setIdCalendario(String idCalendario) {
		IdCalendario = idCalendario;
	}

	public String getFechaIni() {
		return FechaIni;
	}

	public void setFechaIni(String fechaIni) {
		FechaIni = fechaIni;
	}

	public void setFechaIni(Date fechaIni) throws ParseException {
		FechaIni = DateUtils.dateToString(fechaIni, DATE_MASK);
	}

	public String getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}

	public void setFechaFin(Date fechaFin) throws ParseException {
		FechaFin = DateUtils.dateToString(fechaFin, DATE_MASK);
	}
}
