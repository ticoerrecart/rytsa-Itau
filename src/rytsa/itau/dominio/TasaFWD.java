package rytsa.itau.dominio;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanPropertyValueEqualsPredicate;
import org.apache.commons.collections.CollectionUtils;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.Valuaciones;

public class TasaFWD {
	private Date fechaPublicacion;

	private Double factorDeActualizacion;

	private Date fechaMercado;

	private Date fechaVencimientoPlazoFijo;

	private TasaFWD tasaParafechaPublicacionVencimiento;

	private Double tasaFWD;

	public void calcularFactorDeActualizacion(Date pFechaProceso, Date pFecha)
			throws SQLException, Exception {
		long plazo = DateUtils.diferenciaEntreFechas(pFecha, pFechaProceso);
		this.setFechaPublicacion(pFecha);
		this.setFactorDeActualizacion(DAO
				.obtenerFactorAct(pFechaProceso, plazo));
	}

	private boolean esDiaHabil(Date pFecha) {
		return true;// TODO acï¿½ tendria un llamado al webService
	}

	private Date addDiasHabiles(Date pFecha, int pDays) {
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
	}

	public void calcularFechaPublicacionVencimiento(List<TasaFWD> tasas)
			throws Exception {
		if (fechaVencimientoPlazoFijo == null) {
			throw new Exception("fechaVencimientoPlazoFijo es nula");
		}
		Date fecha = addDiasHabiles(this.getFechaVencimientoPlazoFijo(), 2);
		TasaFWD tasaFwd = (TasaFWD) CollectionUtils
				.find(tasas, new BeanPropertyValueEqualsPredicate(
						"fechaPublicacion", fecha));
		if (tasaFwd == null) {
			throw new Exception("No se encontró taza fwd para fecha:" +  Valuaciones.sdf.format(fecha));
		}		
		this.setTasaParafechaPublicacionVencimiento(tasaFwd);
	}

	public void calcularTasaFWD() {

		long N = DateUtils.diferenciaEntreFechas(this.getFechaPublicacion(),
				this.getTasaParafechaPublicacionVencimiento()
						.getFechaPublicacion());

		this
				.setTasaFWD((((this.getTasaParafechaPublicacionVencimiento()
						.getFactorDeActualizacion() / this
						.getFactorDeActualizacion()) - 1) * 365 / N) * 100);
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
