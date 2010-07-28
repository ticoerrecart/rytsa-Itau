package rytsa.itau.dominio;

import java.util.Date;

public class TasaFWD {
	private Date fechaPublicacion;
	private Double factorDeActualizacion;
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public Double getFactorDeActualizacion() {
		return factorDeActualizacion;
	}
	public void setFactorDeActualizacion(Double factorDeActualizacion) {
		this.factorDeActualizacion = factorDeActualizacion;
	}
	public void calcularFactorDeActualizacion(Date fechaDeProceso) {
		int plazo = fechaPublicacion - fechaDeProceso;
		buscarEnCupon4 para plazo y fechaDeProceso el factor
	}
}
