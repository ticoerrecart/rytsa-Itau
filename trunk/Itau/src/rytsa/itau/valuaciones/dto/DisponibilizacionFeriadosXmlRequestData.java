package rytsa.itau.valuaciones.dto;

public class DisponibilizacionFeriadosXmlRequestData {
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

	public String getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}
}
