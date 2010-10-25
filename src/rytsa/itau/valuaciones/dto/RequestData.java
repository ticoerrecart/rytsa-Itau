package rytsa.itau.valuaciones.dto;

public class RequestData {

	private String IdOperacion;
	private Double MTM;
	private String Codigo;
	private Integer MonedaValuacion;
	private String CodUsuario;
	private String Fecha;
	private String Corrida;

	public String getIdOperacion() {
		return IdOperacion;
	}

	public void setIdOperacion(String idOperacion) {
		IdOperacion = idOperacion;
	}

	public Double getMTM() {
		return MTM;
	}

	public void setMTM(Double mTM) {
		MTM = mTM;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public Integer getMonedaValuacion() {
		return MonedaValuacion;
	}

	public void setMonedaValuacion(Integer monedaValuacion) {
		MonedaValuacion = monedaValuacion;
	}

	public String getCodUsuario() {
		return CodUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		CodUsuario = codUsuario;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getCorrida() {
		return Corrida;
	}

	public void setCorrida(String corrida) {
		Corrida = corrida;
	}

}
