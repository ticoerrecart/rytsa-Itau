package rytsa.itau.dominio;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanPropertyValueEqualsPredicate;
import org.apache.commons.collections.CollectionUtils;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.utils.MyLogger;
import rytsa.itau.valuaciones.Valuaciones;

public class TasaFWD {

	private Date fechaPublicacion;

	private Double factorDeActualizacion;

	private Date fechaMercado;

	private Date fechaVencimientoPlazoFijo;

	private TasaFWD tasaParafechaPublicacionVencimiento;

	private Double tasaFWD;

	private long plazo;

	//private List<FechaData> diasHabiles;

	/*public TasaFWD(List<FechaData> diasHabiles) {
		this.diasHabiles = diasHabiles;
	}*/

	public TasaFWD() {
	}

	public void calcularFactorDeActualizacion(Date pFechaProceso, Date pfechaProcesoPlazoRemanente,
			Date pFecha) throws SQLException, Exception {
		long plazo = DateUtils.diferenciaEntreFechas(pFecha, pfechaProcesoPlazoRemanente);
		this.setPlazo(plazo);
		this.setFechaPublicacion(pFecha);
		this.setFactorDeActualizacion(DAO.obtenerFactorAct(pFechaProceso, plazo));
		MyLogger.log("Fecha de Proceso:" + DateUtils.dateToString(pFechaProceso));
		MyLogger.log("Fecha de Publicación:" + DateUtils.dateToString(pFecha));
		MyLogger.log("Plazo:" + plazo);
		MyLogger.log("Factor De Actualizacion: " + this.getFactorDeActualizacion());
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
			if (Valuaciones.esDiaHabil(fecha)) {
				pDays--;
			}
		}
		return fecha;
	}

	public void calcularFechaMercado() throws Exception {
		if (fechaPublicacion == null) {
			MyLogger.logError("fechaPublicacion es nula");
			throw new Exception("fechaPublicacion es nula");
		}
		this.setFechaMercado(addDiasHabiles(this.getFechaPublicacion(), -2));
		MyLogger.log("Fecha de Mercado: " + DateUtils.dateToString(this.getFechaMercado()));
	}

	public void calcularFechaVencimientoPzoFijo() throws Exception {
		if (fechaMercado == null) {
			MyLogger.logError("fechaMercado es nula");
			throw new Exception("fechaMercado es nula");
		}
		Date fecha = DateUtils.addDays(this.getFechaMercado(), 30);

		while (!Valuaciones.esDiaHabil(fecha) || DateUtils.esFinDeSemana(fecha)) {
			fecha = DateUtils.addDays(fecha, 1);
		}
		this.setFechaVencimientoPlazoFijo(fecha);
		MyLogger.log("Fecha de Vencimiento Plazo Fijo: "
				+ DateUtils.dateToString(this.getFechaVencimientoPlazoFijo()));

	}

	public void calcularFechaPublicacionVencimiento(List<TasaFWD> tasas) throws Exception {
		if (fechaVencimientoPlazoFijo == null) {
			MyLogger.logError("fechaVencimientoPlazoFijo es nula");
			throw new Exception("fechaVencimientoPlazoFijo es nula");
		}
		Date fecha = addDiasHabiles(this.getFechaVencimientoPlazoFijo(), 2);

		MyLogger.log("Fecha de Publicacion Vencimiento: " + DateUtils.dateToString(fecha));

		TasaFWD tasaFwd = (TasaFWD) CollectionUtils.find(tasas,
				new BeanPropertyValueEqualsPredicate("fechaPublicacion", fecha));
		if (tasaFwd == null) {
			MyLogger.logError("No se encontró tasa fwd para fecha:" + DateUtils.dateToString(fecha));
			throw new Exception("No se encontró tasa fwd para fecha:"
					+ DateUtils.dateToString(fecha));
		}
		this.setTasaParafechaPublicacionVencimiento(tasaFwd);

		MyLogger.log("Tasa Fwd encontrada para Fecha de Publicacion Vencimiento");
	}

	public void calcularTasaFWD() throws ParseException {

		long N = DateUtils.diferenciaEntreFechas(this.getFechaPublicacion(), this
				.getTasaParafechaPublicacionVencimiento().getFechaPublicacion());

		MyLogger.log("Fecha de Publicacion: " + DateUtils.dateToString(this.getFechaPublicacion()));
		MyLogger.log("Fecha de Publicacion de Tasa FWD de Vencimiento: "
				+ DateUtils.dateToString(this.getTasaParafechaPublicacionVencimiento()
						.getFechaPublicacion()));
		MyLogger.log("N: " + N);

		this.setTasaFWD((((this.getTasaParafechaPublicacionVencimiento().getFactorDeActualizacion() / this
				.getFactorDeActualizacion()) - 1) * 365 / N) * 100);

		MyLogger.log("Factor de Actualizacion: " + this.getFactorDeActualizacion());
		MyLogger.log("Factor de Actualizacion de Tasa FWD de Vencimiento: "
				+ this.getTasaParafechaPublicacionVencimiento().getFactorDeActualizacion());
		MyLogger.log("Tasa FWD: " + getTasaFWD());

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

	private void setTasaParafechaPublicacionVencimiento(TasaFWD tasaParafechaPublicacionVencimiento) {
		this.tasaParafechaPublicacionVencimiento = tasaParafechaPublicacionVencimiento;
	}

	public long getPlazo() {
		return plazo;
	}

	public void setPlazo(long plazo) {
		this.plazo = plazo;
	}

}
