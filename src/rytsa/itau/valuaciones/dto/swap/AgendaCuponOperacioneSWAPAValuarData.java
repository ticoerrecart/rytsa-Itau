package rytsa.itau.valuaciones.dto.swap;

public class AgendaCuponOperacioneSWAPAValuarData {
	public String NumeroOperacion;

	public String idCupon;

	public String TipoFlujo;

	public String ReceivedOPayment;

	public String FechaInicio;

	public String fechavencimiento;

	public String FechaIndiceInicio;

	public String FechaIndiceFin;

	public String FechaConcertacion;

	public String Cierre;

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

	public String getFechavencimiento() {
		return fechavencimiento;
	}

	public void setFechavencimiento(String fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public String getIdCupon() {
		return idCupon;
	}

	public void setIdCupon(String idCupon) {
		this.idCupon = idCupon;
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

	public String getFechaConcertacion() {
		return FechaConcertacion;
	}

	public void setFechaConcertacion(String fechaConcertacion) {
		FechaConcertacion = fechaConcertacion;
	}

	public String getCierre() {
		return Cierre;
	}

	public void setCierre(String cierre) {
		Cierre = cierre;
	}
}
