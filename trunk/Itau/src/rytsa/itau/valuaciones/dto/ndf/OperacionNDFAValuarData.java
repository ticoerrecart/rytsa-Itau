package rytsa.itau.valuaciones.dto.ndf;

import java.util.Date;

public class OperacionNDFAValuarData {

	private String NumeroOperacion;
	private String Producto;
	private String Instrumento;
	private String MetodoFixing;
	private String Moneda;
	private String Moneda_de_liquidacion;
	private String TipoOperacion;
	private Date FechaCargaOperacion;
	private Date FechaInicio;
	private Date FechaVencimiento;
	private String Banca;
	private String GestorRiesgoMercado;
	private String Officer;
	private String Clinum;
	private String Raiz;
	private String CUIT;
	private String ContraParte;
	private String NumeroBoleto;
	private Double CantidadVN;
	private Double Precio;
	private Double Strike_ref;
	private Double PrecioCierreContable;
	private Double RdoTotalContable;
	private Double PrecioCierreContableMesAnterior;
	private Double RdoMesContable;
	private Double PrecioCierreAnteriorContable;
	private Double RdoDiarioContable;
	private Double Vigentes;
	private Double Vencidos;
	private Double ComprasVigentes;
	private Double VentasVigentes;
	private Double Dev_total;
	private Double dev_Cob;
	private Double dev_Pag;
	private String Plazo;
	private String Dias;
	private Double Rdo_BBA;
	private Double Rdo_BBA_no_Dev;
	private String Mercado;
	private String IdOperacion;
	private Date fecha_proceso;
	private Double MTM;

	public String getNumeroOperacion() {
		return NumeroOperacion;
	}

	public void setNumeroOperacion(String numeroOperacion) {
		NumeroOperacion = numeroOperacion;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProducto(String producto) {
		Producto = producto;
	}

	public String getInstrumento() {
		return Instrumento;
	}

	public void setInstrumento(String instrumento) {
		Instrumento = instrumento;
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

	public String getMoneda_de_liquidacion() {
		return Moneda_de_liquidacion;
	}

	public void setMoneda_de_liquidacion(String moneda_de_liquidacion) {
		Moneda_de_liquidacion = moneda_de_liquidacion;
	}

	public String getTipoOperacion() {
		return TipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		TipoOperacion = tipoOperacion;
	}

	public Date getFechaCargaOperacion() {
		return FechaCargaOperacion;
	}

	public void setFechaCargaOperacion(Date fechaCargaOperacion) {
		FechaCargaOperacion = fechaCargaOperacion;
	}

	public Date getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public Date getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}

	public String getBanca() {
		return Banca;
	}

	public void setBanca(String banca) {
		Banca = banca;
	}

	public String getGestorRiesgoMercado() {
		return GestorRiesgoMercado;
	}

	public void setGestorRiesgoMercado(String gestorRiesgoMercado) {
		GestorRiesgoMercado = gestorRiesgoMercado;
	}

	public String getOfficer() {
		return Officer;
	}

	public void setOfficer(String officer) {
		Officer = officer;
	}

	public String getClinum() {
		return Clinum;
	}

	public void setClinum(String clinum) {
		Clinum = clinum;
	}

	public String getRaiz() {
		return Raiz;
	}

	public void setRaiz(String raiz) {
		Raiz = raiz;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cuit) {
		CUIT = cuit;
	}

	public String getContraParte() {
		return ContraParte;
	}

	public void setContraParte(String contraParte) {
		ContraParte = contraParte;
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

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public Double getStrike_ref() {
		return Strike_ref;
	}

	public void setStrike_ref(Double strike_ref) {
		Strike_ref = strike_ref;
	}

	public Double getPrecioCierreContable() {
		return PrecioCierreContable;
	}

	public void setPrecioCierreContable(Double precioCierreContable) {
		PrecioCierreContable = precioCierreContable;
	}

	public Double getRdoTotalContable() {
		return RdoTotalContable;
	}

	public void setRdoTotalContable(Double rdoTotalContable) {
		RdoTotalContable = rdoTotalContable;
	}

	public Double getPrecioCierreContableMesAnterior() {
		return PrecioCierreContableMesAnterior;
	}

	public void setPrecioCierreContableMesAnterior(
			Double precioCierreContableMesAnterior) {
		PrecioCierreContableMesAnterior = precioCierreContableMesAnterior;
	}

	public Double getRdoMesContable() {
		return RdoMesContable;
	}

	public void setRdoMesContable(Double rdoMesContable) {
		RdoMesContable = rdoMesContable;
	}

	public Double getPrecioCierreAnteriorContable() {
		return PrecioCierreAnteriorContable;
	}

	public void setPrecioCierreAnteriorContable(
			Double precioCierreAnteriorContable) {
		PrecioCierreAnteriorContable = precioCierreAnteriorContable;
	}

	public Double getRdoDiarioContable() {
		return RdoDiarioContable;
	}

	public void setRdoDiarioContable(Double rdoDiarioContable) {
		RdoDiarioContable = rdoDiarioContable;
	}

	public Double getVigentes() {
		return Vigentes;
	}

	public void setVigentes(Double vigentes) {
		Vigentes = vigentes;
	}

	public Double getVencidos() {
		return Vencidos;
	}

	public void setVencidos(Double vencidos) {
		Vencidos = vencidos;
	}

	public Double getComprasVigentes() {
		return ComprasVigentes;
	}

	public void setComprasVigentes(Double comprasVigentes) {
		ComprasVigentes = comprasVigentes;
	}

	public Double getVentasVigentes() {
		return VentasVigentes;
	}

	public void setVentasVigentes(Double ventasVigentes) {
		VentasVigentes = ventasVigentes;
	}

	public Double getDev_total() {
		return Dev_total;
	}

	public void setDev_total(Double dev_total) {
		Dev_total = dev_total;
	}

	public Double getDev_Cob() {
		return dev_Cob;
	}

	public void setDev_Cob(Double dev_Cob) {
		this.dev_Cob = dev_Cob;
	}

	public Double getDev_Pag() {
		return dev_Pag;
	}

	public void setDev_Pag(Double dev_Pag) {
		this.dev_Pag = dev_Pag;
	}

	public String getPlazo() {
		return Plazo;
	}

	public void setPlazo(String plazo) {
		Plazo = plazo;
	}

	public String getDias() {
		return Dias;
	}

	public void setDias(String dias) {
		Dias = dias;
	}

	public Double getRdo_BBA() {
		return Rdo_BBA;
	}

	public void setRdo_BBA(Double rdo_BBA) {
		Rdo_BBA = rdo_BBA;
	}

	public Double getRdo_BBA_no_Dev() {
		return Rdo_BBA_no_Dev;
	}

	public void setRdo_BBA_no_Dev(Double rdo_BBA_no_Dev) {
		Rdo_BBA_no_Dev = rdo_BBA_no_Dev;
	}

	public String getMercado() {
		return Mercado;
	}

	public void setMercado(String mercado) {
		Mercado = mercado;
	}

	public String getIdOperacion() {
		return IdOperacion;
	}

	public void setIdOperacion(String idOperacion) {
		IdOperacion = idOperacion;
	}

	public Date getFecha_proceso() {
		return fecha_proceso;
	}

	public void setFecha_proceso(Date fecha_proceso) {
		this.fecha_proceso = fecha_proceso;
	}

	public Double getMTM() {
		return MTM;
	}

	public void setMTM(Double mtm) {
		MTM = mtm;
	}

}
