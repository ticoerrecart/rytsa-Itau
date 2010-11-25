package rytsa.itau.dominio;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanPropertyValueEqualsPredicate;
import org.apache.commons.collections.CollectionUtils;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.Valuaciones;
import rytsa.itau.valuaciones.ValuacionesSWAP;
import rytsa.itau.valuaciones.dto.FechaData;
import rytsa.itau.valuaciones.dto.FeriadosResponse;

public class TasaFWD {
	
	private Date fechaPublicacion;

	private Double factorDeActualizacion;

	private Date fechaMercado;

	private Date fechaVencimientoPlazoFijo;

	private TasaFWD tasaParafechaPublicacionVencimiento;

	private Double tasaFWD;
	
	private List<FechaData> diasHabiles;

	public TasaFWD(List<FechaData> diasHabiles){
		this.diasHabiles = diasHabiles;
	}

	
	public void calcularFactorDeActualizacion(Date pFechaProceso, Date pFecha)
			throws SQLException, Exception {
		long plazo = DateUtils.diferenciaEntreFechas(pFecha, pFechaProceso);
		this.setFechaPublicacion(pFecha);
		this.setFactorDeActualizacion(DAO
				.obtenerFactorAct(pFechaProceso, plazo));
		if (Valuaciones.LOGGEAR){
			System.out.println("Fecha de Proceso:" + DateUtils.dateToString(pFechaProceso));
			System.out.println("Fecha de Publicación:" + DateUtils.dateToString(pFecha));
			System.out.println("Plazo:" + plazo);
			System.out.println("Factor De Actualizacion: " + this.getFactorDeActualizacion());
		}
	}

	private boolean esDiaHabil(Date pFecha) throws ParseException {
		FechaData fechaData = null;
		
		for (FechaData fd : this.diasHabiles) {
			if (DateUtils.dateToString(DateUtils.stringToDate(fd.getFecha(),Valuaciones.DATE_MASK_RTA_FERIADOS),Valuaciones.DATE_MASK_RTA_FERIADOS).equals(DateUtils.dateToString(pFecha, Valuaciones.DATE_MASK_RTA_FERIADOS))){
				fechaData = fd;
				break;
			}	
		}
		
		if (fechaData == null) {
			Date primerDia = DateUtils.stringToDate(this.diasHabiles.get(0).getFecha(),Valuaciones.DATE_MASK_RTA_FERIADOS);
			Date ultimoDia = DateUtils.stringToDate(this.diasHabiles.get(this.diasHabiles.size() - 1).getFecha(),Valuaciones.DATE_MASK_RTA_FERIADOS);
			if (pFecha.after(ultimoDia) || pFecha.before(primerDia)){
				FeriadosResponse fr = ValuacionesSWAP.getDias(pFecha, DateUtils.addDays(pFecha,1));
				return !((FechaData)fr.getFeriadosResult().get(0)).getEsFeriado();
				
			} else {
				return false;
			}
		}
		
		return true;
	}

	private Date addDiasHabiles(Date pFecha, int pDays) throws ParseException {
		Date fecha = pFecha;
		int factor = 1;
		if (pDays < 0) {
			factor = -1;
		}
		pDays = Math.abs(pDays);
		while (pDays != 0) {
			fecha = DateUtils.addDays(fecha, factor);
			if (esDiaHabil(fecha)) {
				pDays--;
			}
		}
		return fecha;
	}

	public void calcularFechaMercado() throws Exception {
		if (fechaPublicacion == null) {
			throw new Exception("fechaPublicacion es nula");
		}
		this.setFechaMercado(addDiasHabiles(this.getFechaPublicacion(), -2));
		if (Valuaciones.LOGGEAR){
			System.out.println("Fecha de Mercado: " + DateUtils.dateToString(this.getFechaMercado()));
		}
	}

	public void calcularFechaVencimientoPzoFijo() throws Exception {
		if (fechaMercado == null) {
			throw new Exception("fechaMercado es nula");
		}
		Date fecha = DateUtils.addDays(this.getFechaMercado(), 30);

		while (!esDiaHabil(fecha) || DateUtils.esFinDeSemana(fecha)) {
			fecha = DateUtils.addDays(fecha, 1);
		}
		this.setFechaVencimientoPlazoFijo(fecha);
		if (Valuaciones.LOGGEAR){
			System.out.println("Fecha de Vencimiento Plazo Fijo: " + DateUtils.dateToString(this.getFechaVencimientoPlazoFijo()));
		}

	}

	public void calcularFechaPublicacionVencimiento(List<TasaFWD> tasas)
			throws Exception {
		if (fechaVencimientoPlazoFijo == null) {
			throw new Exception("fechaVencimientoPlazoFijo es nula");
		}
		Date fecha = addDiasHabiles(this.getFechaVencimientoPlazoFijo(), 2);
		
		
		if (Valuaciones.LOGGEAR){
			System.out.println("Fecha de Publicacion Vencimiento: " + DateUtils.dateToString(fecha));
		}
		
		TasaFWD tasaFwd = (TasaFWD) CollectionUtils
				.find(tasas, new BeanPropertyValueEqualsPredicate(
						"fechaPublicacion", fecha));
		if (tasaFwd == null) {
			throw new Exception("No se encontró tasa fwd para fecha:" +  DateUtils.dateToString(fecha));
		}		
		this.setTasaParafechaPublicacionVencimiento(tasaFwd);
		
		if (Valuaciones.LOGGEAR){
			System.out.println("Tasa Fwd encontrada para Fecha de Publicacion Vencimiento");
		}
		
	}

	public void calcularTasaFWD() throws ParseException {

		long N = DateUtils.diferenciaEntreFechas(this.getFechaPublicacion(),
				this.getTasaParafechaPublicacionVencimiento()
						.getFechaPublicacion());

		if (Valuaciones.LOGGEAR){
			System.out.println("Fecha de Publicacion: " + DateUtils.dateToString(this.getFechaPublicacion()));
			System.out.println("Fecha de Publicacion de Tasa FWD de Vencimiento: " + DateUtils.dateToString(this.getTasaParafechaPublicacionVencimiento()
					.getFechaPublicacion()));
			System.out.println("N: " + N);
		}
		
		this
				.setTasaFWD((((this.getTasaParafechaPublicacionVencimiento()
						.getFactorDeActualizacion() / this
						.getFactorDeActualizacion()) - 1) * 365 / N) * 100);
		
		if (Valuaciones.LOGGEAR){
			System.out.println("Factor de Actualizacion: " + this.getFactorDeActualizacion());
			System.out.println("Factor de Actualizacion de Tasa FWD de Vencimiento: " + this.getTasaParafechaPublicacionVencimiento().getFactorDeActualizacion());
			System.out.println("Tasa FWD: " + getTasaFWD());
		}
		
	}

	public Date getFechaVencimientoPlazoFijo() {
		return fechaVencimientoPlazoFijo;
	}

	private void setFechaVencimientoPlazoFijo(Date fechaVencimientoPlazoFijo) {
		this.fechaVencimientoPlazoFijo = fechaVencimientoPlazoFijo;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Double getFactorDeActualizacion() {
		return factorDeActualizacion;
	}

	private void setFactorDeActualizacion(Double factorDeActualizacion) {
		this.factorDeActualizacion = factorDeActualizacion;
	}

	public Date getFechaMercado() {
		return fechaMercado;
	}

	private void setFechaMercado(Date fechaMercado) {
		this.fechaMercado = fechaMercado;
	}

	public Double getTasaFWD() {
		return tasaFWD;
	}

	private void setTasaFWD(Double tasaFWD) {
		this.tasaFWD = tasaFWD;
	}

	public TasaFWD getTasaParafechaPublicacionVencimiento() {
		return tasaParafechaPublicacionVencimiento;
	}

	private void setTasaParafechaPublicacionVencimiento(
			TasaFWD tasaParafechaPublicacionVencimiento) {
		this.tasaParafechaPublicacionVencimiento = tasaParafechaPublicacionVencimiento;
	}

}
