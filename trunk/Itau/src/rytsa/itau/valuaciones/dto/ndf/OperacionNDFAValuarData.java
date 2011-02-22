package rytsa.itau.valuaciones.dto.ndf;

import java.util.Date;

public class OperacionNDFAValuarData {
	private String NumeroOperacion;
	private String Moneda;
	private String MonedaLiquidacion;
	private String TipoOperacion;
	private Date FechaVencimiento;
	private Double CantidadVN;
	private Double Precio;
	private String Mercado;
	private String IDOperacion;

	public String getNumeroOperacion() {
		return NumeroOperacion;
	}

	public void setNumeroOperacion(String numeroOperacion) {
		NumeroOperacion = numeroOperacion;
	}

	public String getMoneda() {
		return Moneda;
	}

	public void setMoneda(String moneda) {
		Moneda = moneda;
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

	public Date getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}

	public Double getCantidadVN() {
		return CantidadVN;
	}

	public void setCantidadVN(Double cantidadVN) {
		CantidadVN = cantidadVN;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public String getMercado() {
		return Mercado;
	}

	public void setMercado(String mercado) {
		Mercado = mercado;
	}

	public String getIDOperacion() {
		return IDOperacion;
	}

	public void setIDOperacion(String iDOperacion) {
		IDOperacion = iDOperacion;
	}

}
