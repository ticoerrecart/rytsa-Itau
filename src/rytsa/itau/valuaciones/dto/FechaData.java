package rytsa.itau.valuaciones.dto;

public class FechaData {

	private String Fecha;

	private boolean EsFeriado;

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public boolean isEsFeriado() {
		return EsFeriado;
	}

	public void setEsFeriado(boolean esFeriado) {
		EsFeriado = esFeriado;
	}



}
