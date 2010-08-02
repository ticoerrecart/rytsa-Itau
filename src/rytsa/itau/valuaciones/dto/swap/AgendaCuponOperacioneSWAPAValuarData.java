package rytsa.itau.valuaciones.dto.swap;

public class AgendaCuponOperacioneSWAPAValuarData {

	public String NumeroOperacion;

	public String IdCupon;

	public String TipoFlujo;

	public String ReceivedOPayment;

	public String FechaInicio;

	public String FechaVencimiento;

	public String FechaIndiceInicio;

	public String FechaIndiceFin;

	public AgendaCuponOperacioneSWAPAValuarData() {
	}

	public String getFechaIndiceFin() {
		return FechaIndiceFin;
	}

	public void setFechaIndiceFin(String fechaIndiceFin) {
		FechaIndiceFin = fechaIndiceFin;
	}

	public String getFechaIndiceInicio() {
		return FechaIndiceInicio;
	}

	public void setFechaIndiceInicio(String fechaIndiceInicio) {
		FechaIndiceInicio = fechaIndiceInicio;
	}

	public String getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public String getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}

	public String getIdCupon() {
		return IdCupon;
	}

	public void setIdCupon(String idCupon) {
		IdCupon = idCupon;
	}

	public String getNumeroOperacion() {
		return NumeroOperacion;
	}

	public void setNumeroOperacion(String numeroOperacion) {
		NumeroOperacion = numeroOperacion;
	}

	public String getReceivedOPayment() {
		return ReceivedOPayment;
	}

	public void setReceivedOPayment(String receivedOPayment) {
		ReceivedOPayment = receivedOPayment;
	}

	public String getTipoFlujo() {
		return TipoFlujo;
	}

	public void setTipoFlujo(String tipoFlujo) {
		TipoFlujo = tipoFlujo;
	}

}
