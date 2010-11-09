package rytsa.itau.valuaciones.dto;

public class FechaData {

	private String Fecha; 

	private Boolean EsFeriado;

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public Boolean getEsFeriado() {
		return EsFeriado;
	}

	public void setEsFeriado(Boolean esFeriado) {
		EsFeriado = esFeriado;
	}

	public void setEsFeriado(String esFeriado) {
		EsFeriado = Boolean.parseBoolean(esFeriado);
	}

}
