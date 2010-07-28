package rytsa.itau.valuaciones.dto.swap;

public class AgendaCuponOperacioneSWAPAValuarData {

	public String numeroOperacion;

	public String idCupon;

	public String tipoFlujo;

	public String receivedOPayment;

	public String fechaInicio;

	public String fechaVencimiento;

	public String fechaIndiceInicio;

	public String fechaIndiceFin;

	public AgendaCuponOperacioneSWAPAValuarData() {
	}

	public String getFechaIndiceFin() {
		return fechaIndiceFin;
	}

	public void setFechaIndiceFin(String fechaIndiceFin) {
		this.fechaIndiceFin = fechaIndiceFin;
	}

	public String getFechaIndiceInicio() {
		return fechaIndiceInicio;
	}

	public void setFechaIndiceInicio(String fechaIndiceInicio) {
		this.fechaIndiceInicio = fechaIndiceInicio;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getIdCupon() {
		return idCupon;
	}

	public void setIdCupon(String idCupon) {
		this.idCupon = idCupon;
	}

	public String getNumeroOperacion() {
		return numeroOperacion;
	}

	public void setNumeroOperacion(String numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}

	public String getReceivedOPayment() {
		return receivedOPayment;
	}

	public void setReceivedOPayment(String receivedOPayment) {
		this.receivedOPayment = receivedOPayment;
	}

	public String getTipoFlujo() {
		return tipoFlujo;
	}

	public void setTipoFlujo(String tipoFlujo) {
		this.tipoFlujo = tipoFlujo;
	}

}
