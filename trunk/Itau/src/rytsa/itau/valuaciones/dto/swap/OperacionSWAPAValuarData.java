package rytsa.itau.valuaciones.dto.swap;

public class OperacionSWAPAValuarData {
	private String NumeroOperacion;

	private String Producto;

	private String Instrumento;

	private String MetodoFixing;

	private String Moneda;

	private String BIBA;

	private String TasaFija;

	private String TasaVariable;

	private String MonedaLiquidacion;

	private String TipoOperacion;

	private String Frencuencia;

	private String FechaCargaOperacion;

	private String FechaInicio;

	private String FechaVencimiento;

	private String Banca;

	private String GestorRiesgoMercado;

	private String Estrategia;

	private String Officier;

	private String Clinum;

	private String Raiz;

	private String CUIT;

	private String ContraParte;

	private String NumeroBoleto;

	private Double CantidadVN;

	private String Base1;

	private String Base2;

	private Double RendimientoUltimoPeriodo;

	private Double RendimientoTotalHastaFechaActual;

	private Double SWAPsVigentesTasaFija;

	private Double Precio;

	private Double StrikeRef;

	private Double MTMPayment;

	private Double MTMReceived;

	private Double RolTotalContable;

	private Double RdoMesContab;

	private Double RdoDiarioContab;

	private Double Vigentes;

	private Double Vencidos;

	private Double ComprasVigentes;

	private Double VentasVigentes;

	private Double DevTotal;

	private Double DevCob;

	private Double DevPag;

	private String Plazo;

	private String Dias;

	private Double RdoBBA;

	private Double RdoBBANoDev;

	private String idOperacion;

	private String FechaProceso;

	public OperacionSWAPAValuarData() {
	}

	public String getBanca() {
		return Banca;
	}

	public void setBanca(String banca) {
		Banca = banca;
	}

	public String getBase1() {
		return Base1;
	}

	public void setBase1(String base1) {
		Base1 = base1;
	}

	public String getBase2() {
		return Base2;
	}

	public void setBase2(String base2) {
		Base2 = base2;
	}

	public String getBIBA() {
		return BIBA;
	}

	public void setBIBA(String biba) {
		BIBA = biba;
	}

	public Double getCantidadVN() {
		return CantidadVN;
	}

	public void setCantidadVN(Double cantidadVN) {
		CantidadVN = cantidadVN;
	}

	public String getClinum() {
		return Clinum;
	}

	public void setClinum(String clinum) {
		Clinum = clinum;
	}

	public Double getComprasVigentes() {
		return ComprasVigentes;
	}

	public void setComprasVigentes(Double comprasVigentes) {
		ComprasVigentes = comprasVigentes;
	}

	public String getContraParte() {
		return ContraParte;
	}

	public void setContraParte(String contraParte) {
		ContraParte = contraParte;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cuit) {
		CUIT = cuit;
	}

	public Double getDevCob() {
		return DevCob;
	}

	public void setDevCob(Double devCob) {
		DevCob = devCob;
	}

	public Double getDevPag() {
		return DevPag;
	}

	public void setDevPag(Double devPag) {
		DevPag = devPag;
	}

	public Double getDevTotal() {
		return DevTotal;
	}

	public void setDevTotal(Double devTotal) {
		DevTotal = devTotal;
	}

	public String getDias() {
		return Dias;
	}

	public void setDias(String dias) {
		Dias = dias;
	}

	public String getEstrategia() {
		return Estrategia;
	}

	public void setEstrategia(String estrategia) {
		Estrategia = estrategia;
	}

	public String getFechaCargaOperacion() {
		return FechaCargaOperacion;
	}

	public void setFechaCargaOperacion(String fechaCargaOperacion) {
		FechaCargaOperacion = fechaCargaOperacion;
	}

	public String getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public String getFechaProceso() {
		return FechaProceso;
	}

	public void setFechaProceso(String fechaProceso) {
		FechaProceso = fechaProceso;
	}

	public String getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}

	public String getFrencuencia() {
		return Frencuencia;
	}

	public void setFrencuencia(String frencuencia) {
		Frencuencia = frencuencia;
	}

	public String getGestorRiesgoMercado() {
		return GestorRiesgoMercado;
	}

	public void setGestorRiesgoMercado(String gestorRiesgoMercado) {
		GestorRiesgoMercado = gestorRiesgoMercado;
	}

	public String getIdOperacion() {
		return idOperacion;
	}

	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
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

	public String getMonedaLiquidacion() {
		return MonedaLiquidacion;
	}

	public void setMonedaLiquidacion(String monedaLiquidacion) {
		MonedaLiquidacion = monedaLiquidacion;
	}

	public Double getMTMPayment() {
		return MTMPayment;
	}

	public void setMTMPayment(Double payment) {
		MTMPayment = payment;
	}

	public Double getMTMReceived() {
		return MTMReceived;
	}

	public void setMTMReceived(Double received) {
		MTMReceived = received;
	}

	public String getNumeroBoleto() {
		return NumeroBoleto;
	}

	public void setNumeroBoleto(String numeroBoleto) {
		NumeroBoleto = numeroBoleto;
	}

	public String getNumeroOperacion() {
		return NumeroOperacion;
	}

	public void setNumeroOperacion(String numeroOperacion) {
		NumeroOperacion = numeroOperacion;
	}

	public String getOfficier() {
		return Officier;
	}

	public void setOfficier(String officier) {
		Officier = officier;
	}

	public String getPlazo() {
		return Plazo;
	}

	public void setPlazo(String plazo) {
		Plazo = plazo;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProducto(String producto) {
		Producto = producto;
	}

	public String getRaiz() {
		return Raiz;
	}

	public void setRaiz(String raiz) {
		Raiz = raiz;
	}

	public Double getRdoBBA() {
		return RdoBBA;
	}

	public void setRdoBBA(Double rdoBBA) {
		RdoBBA = rdoBBA;
	}

	public Double getRdoBBANoDev() {
		return RdoBBANoDev;
	}

	public void setRdoBBANoDev(Double rdoBBANoDev) {
		RdoBBANoDev = rdoBBANoDev;
	}

	public Double getRdoDiarioContab() {
		return RdoDiarioContab;
	}

	public void setRdoDiarioContab(Double rdoDiarioContab) {
		RdoDiarioContab = rdoDiarioContab;
	}

	public Double getRdoMesContab() {
		return RdoMesContab;
	}

	public void setRdoMesContab(Double rdoMesContab) {
		RdoMesContab = rdoMesContab;
	}

	public Double getRendimientoTotalHastaFechaActual() {
		return RendimientoTotalHastaFechaActual;
	}

	public void setRendimientoTotalHastaFechaActual(Double rendimientoTotalHastaFechaActual) {
		RendimientoTotalHastaFechaActual = rendimientoTotalHastaFechaActual;
	}

	public Double getRendimientoUltimoPeriodo() {
		return RendimientoUltimoPeriodo;
	}

	public void setRendimientoUltimoPeriodo(Double rendimientoUltimoPeriodo) {
		RendimientoUltimoPeriodo = rendimientoUltimoPeriodo;
	}

	public Double getRolTotalContable() {
		return RolTotalContable;
	}

	public void setRolTotalContable(Double rolTotalContable) {
		RolTotalContable = rolTotalContable;
	}

	public Double getStrikeRef() {
		return StrikeRef;
	}

	public void setStrikeRef(Double strikeRef) {
		StrikeRef = strikeRef;
	}

	public Double getSWAPsVigentesTasaFija() {
		return SWAPsVigentesTasaFija;
	}

	public void setSWAPsVigentesTasaFija(Double psVigentesTasaFija) {
		SWAPsVigentesTasaFija = psVigentesTasaFija;
	}

	public String getTasaFija() {
		return TasaFija;
	}

	public void setTasaFija(String tasaFija) {
		TasaFija = tasaFija;
	}

	public String getTasaVariable() {
		return TasaVariable;
	}

	public void setTasaVariable(String tasaVariable) {
		TasaVariable = tasaVariable;
	}

	public String getTipoOperacion() {
		return TipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		TipoOperacion = tipoOperacion;
	}

	public Double getVencidos() {
		return Vencidos;
	}

	public void setVencidos(Double vencidos) {
		Vencidos = vencidos;
	}

	public Double getVentasVigentes() {
		return VentasVigentes;
	}

	public void setVentasVigentes(Double ventasVigentes) {
		VentasVigentes = ventasVigentes;
	}

	public Double getVigentes() {
		return Vigentes;
	}

	public void setVigentes(Double vigentes) {
		Vigentes = vigentes;
	}

}
