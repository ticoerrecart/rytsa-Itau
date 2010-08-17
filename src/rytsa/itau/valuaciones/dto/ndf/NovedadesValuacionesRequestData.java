package rytsa.itau.valuaciones.dto.ndf;

import java.util.Date;

public class NovedadesValuacionesRequestData {

	private String IdOperacion;

	private Date Fecha;

	private Double TotalValuado;

	private Date FechaUltimaValuacion;

	private String IdUsuarioCargaSE;

	private Date FechaCargaPrecio;

	private String TipoValuacion;

	private String MonedaValuacion;

	private Double Precio;

	private Double TasaUtilizada;

	private Double ValoresNominales;

	private int Plazo;

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Date getFechaCargaPrecio() {
		return FechaCargaPrecio;
	}

	public void setFechaCargaPrecio(Date fechaCargaPrecio) {
		FechaCargaPrecio = fechaCargaPrecio;
	}

	public Date getFechaUltimaValuacion() {
		return FechaUltimaValuacion;
	}

	public void setFechaUltimaValuacion(Date fechaUltimaValuacion) {
		FechaUltimaValuacion = fechaUltimaValuacion;
	}

	public String getIdOperacion() {
		return IdOperacion;
	}

	public void setIdOperacion(String idOperacion) {
		IdOperacion = idOperacion;
	}

	public String getIdUsuarioCargaSE() {
		return IdUsuarioCargaSE;
	}

	public void setIdUsuarioCargaSE(String idUsuarioCargaSE) {
		IdUsuarioCargaSE = idUsuarioCargaSE;
	}

	public String getMonedaValuacion() {
		return MonedaValuacion;
	}

	public void setMonedaValuacion(String monedaValuacion) {
		MonedaValuacion = monedaValuacion;
	}

	public int getPlazo() {
		return Plazo;
	}

	public void setPlazo(int plazo) {
		Plazo = plazo;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public Double getTasaUtilizada() {
		return TasaUtilizada;
	}

	public void setTasaUtilizada(Double tasaUtilizada) {
		TasaUtilizada = tasaUtilizada;
	}

	public String getTipoValuacion() {
		return TipoValuacion;
	}

	public void setTipoValuacion(String tipoValuacion) {
		TipoValuacion = tipoValuacion;
	}

	public Double getTotalValuado() {
		return TotalValuado;
	}

	public void setTotalValuado(Double totalValuado) {
		TotalValuado = totalValuado;
	}

	public Double getValoresNominales() {
		return ValoresNominales;
	}

	public void setValoresNominales(Double valoresNominales) {
		ValoresNominales = valoresNominales;
	}

}
