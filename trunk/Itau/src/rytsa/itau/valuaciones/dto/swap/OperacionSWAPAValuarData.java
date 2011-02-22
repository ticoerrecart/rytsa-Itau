package rytsa.itau.valuaciones.dto.swap;

public class OperacionSWAPAValuarData {
	private String NumeroOperacion;

	private String Mercado;

	private String MetodoFixing;

	private String Moneda;

	private String BIBAPaga;

	private String MonedaLiquidacion;

	private String TipoOperacion;

	private String NumeroBoleto;

	private Double CantidadVN;

	private String Base;

	private Double Precio;

	private String IDOperacion;

	private String idoperacionrelacionada;

	public OperacionSWAPAValuarData() {
	}

	public String getNumeroOperacion() {
		return NumeroOperacion;
	}

	public void setNumeroOperacion(String numeroOperacion) {
		NumeroOperacion = numeroOperacion;
	}

	public String getMercado() {
		return Mercado;
	}

	public void setMercado(String mercado) {
		Mercado = mercado;
	}

	public String getMetodoFixing() {
		return MetodoFixing;
	}

	public void setMetodoFixing(String metodoFixing) {
		MetodoFixing = metodoFixing;
	}

	public String getMoneda() {
		return Moneda;
	}

	public void setMoneda(String moneda) {
		Moneda = moneda;
	}

	public String getBIBAPaga() {
		return BIBAPaga;
	}

	public void setBIBAPaga(String bIBAPaga) {
		BIBAPaga = bIBAPaga;
	}

	public String getMonedaLiquidacion() {
		return MonedaLiquidacion;
	}

	public void setMonedaLiquidacion(String monedaLiquidacion) {
		MonedaLiquidacion = monedaLiquidacion;
	}

	public String getTipoOperacion() {
		return TipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		TipoOperacion = tipoOperacion;
	}

	public String getNumeroBoleto() {
		return NumeroBoleto;
	}

	public void setNumeroBoleto(String numeroBoleto) {
		NumeroBoleto = numeroBoleto;
	}

	public Double getCantidadVN() {
		return CantidadVN;
	}

	public void setCantidadVN(Double cantidadVN) {
		CantidadVN = cantidadVN;
	}

	public String getBase() {
		return Base;
	}

	public void setBase(String base) {
		Base = base;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public String getIDOperacion() {
		return IDOperacion;
	}

	public void setIDOperacion(String iDOperacion) {
		IDOperacion = iDOperacion;
	}

	public String getIdoperacionrelacionada() {
		return idoperacionrelacionada;
	}

	public void setIdoperacionrelacionada(String idoperacionrelacionada) {
		this.idoperacionrelacionada = idoperacionrelacionada;
	}

}
