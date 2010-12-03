package rytsa.itau.dominio;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.utils.MyLogger;
import rytsa.itau.valuaciones.Valuaciones;
import rytsa.itau.valuaciones.dto.swap.AgendaCuponOperacioneSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.OperacionSWAPAValuarData;

public class CuponSWAP {
	private AgendaCuponOperacioneSWAPAValuarData agendaCupon;

	OperacionSWAPAValuarData operacionParteFija;

	OperacionSWAPAValuarData operacionParteVariable;

	private Date fechaProceso;

	private Long plazoResidual;

	private Double tnaIndex;

	private Double vFutCli;

	private Double fraCli;

	private Double vFutCliRf;

	private Double fraCliRf;

	public CuponSWAP(Date pFechaProceso,
			AgendaCuponOperacioneSWAPAValuarData pAgendaCupon,
			OperacionSWAPAValuarData pOperacionParteFija,
			OperacionSWAPAValuarData pOperacionParteVariable) throws Exception {
		this.setFechaProceso(pFechaProceso);
		this.operacionParteFija = pOperacionParteFija;
		this.operacionParteVariable = pOperacionParteVariable;

		this.setAgendaCupon(pAgendaCupon);
		this.calcularPlazoResidual();
		if (operacionParteFija != null) {
			this.calcularVFutCli();
			this.calcularFraCli();
		} else {
			this.calcularTnaIndex();
			this.calcularVFutCliRf();
			this.calcularFraCliRf();
		}

	}

	public void calcularPlazoResidual() throws Exception {
		if (this.getAgendaCupon().getFechavencimiento() == null) {
			MyLogger.logError("FechaVencimiento es nula");
			throw new Exception("FechaVencimiento es nula");
		}
		if (this.getFechaProceso() == null) {
			MyLogger.logError("FechaProceso es nula");
			throw new Exception("FechaProceso es nula");
		}
		this.setPlazoResidual(DateUtils.diferenciaEntreFechas(DateUtils
				.stringToDate(this.getAgendaCupon().getFechavencimiento(),
						Valuaciones.DATE_MASK_CUPON_SWAP), this
				.getFechaProceso()));
	}

	public Date getFechaIndiceInicio() throws ParseException {
		return DateUtils.stringToDate(agendaCupon.getFechaIndiceInicio(),
				Valuaciones.DATE_MASK_CUPON_SWAP);
	}

	public Date getFechaIndiceFin() throws ParseException {
		return DateUtils.stringToDate(agendaCupon.getFechaIndiceFin(),
				Valuaciones.DATE_MASK_CUPON_SWAP);
	}

	public Date getFechaInicio() throws ParseException {
		return DateUtils.stringToDate(agendaCupon.getFechaInicio(),
				Valuaciones.DATE_MASK_CUPON_SWAP);
	}

	public Date getFechaVencimiento() throws ParseException {
		return DateUtils.stringToDate(agendaCupon.getFechavencimiento(),
				Valuaciones.DATE_MASK_CUPON_SWAP);
	}

	public void calcularTnaIndex() throws Exception {
		if (this.getFechaIndiceInicio() == null) {
			MyLogger.logError("FechaIndiceInicio es nula");
			throw new Exception("FechaIndiceInicio es nula");
		}
		if (this.getFechaIndiceFin() == null) {
			MyLogger.logError("FechaIndiceFin es nula");
			throw new Exception("FechaIndiceFin es nula");
		}

		if (this.getFechaIndiceFin().compareTo(this.getFechaProceso()) <= 0) {
			// todas las tasas son anteriores (Badlar)
			this.setTnaIndex(DAO.obtenerPromedioTasasDeBadlar(
					this.getFechaIndiceInicio(), this.getFechaIndiceFin()));
		} else {
			if (this.getFechaIndiceInicio().compareTo(this.getFechaProceso()) > 0) {
				// todas las tasas son posteriores (FWD)
				this.setTnaIndex(DAO.obtenerPromedioTasasFWD(
						this.getFechaIndiceInicio(), this.getFechaIndiceFin()));
			} else {
				// algunas tasas son anteriores (Badlar) y otras son posteriores
				// (FWD)
				Double promedio = DAO.obtenerPromedioBadlarYTasasFWD(
						this.getFechaIndiceInicio(), this.getFechaProceso(),
						DateUtils.addDays(this.getFechaProceso(), 1),
						this.getFechaIndiceFin());
				this.setTnaIndex(promedio);
			}
		}
	}

	public Double getCantidadVNParteFija() {
		return this.getOperacionParteFija().getCantidadVN();
	}

	public Double getTasaFijaParteFija() {
		return new Double(this.getOperacionParteFija().getTasaFija());
	}

	public Double getBaseParteFija() {
		return new Double(this.getOperacionParteFija().getBase());
	}

	public void calcularVFutCli() throws Exception {
		if (this.getCantidadVNParteFija() == null) {
			MyLogger.logError("CantidadVNParteFija es nula");
			throw new Exception("CantidadVNParteFija es nula");
		}
		if (this.getTasaFijaParteFija() == null) {
			MyLogger.logError("TasaFijaParteFija es nula");
			throw new Exception("TasaFijaParteFija es nula");
		}
		if (this.getFechaVencimiento() == null) {
			MyLogger.logError("FechaVencimiento es nula");
			throw new Exception("FechaVencimiento es nula");
		}
		if (this.getFechaInicio() == null) {
			MyLogger.logError("FechaInicio es nula");
			throw new Exception("FechaInicio es nula");
		}
		if (this.getBaseParteFija() == null) {
			MyLogger.logError("BaseParteFija es nula");
			throw new Exception("BaseParteFija es nula");
		}

		this.setVFutCli(this.getCantidadVNParteFija()
				* this.getTasaFijaParteFija()
				* (DateUtils.diferenciaEntreFechas(this.getFechaVencimiento(),
						this.getFechaInicio()))
				/ (this.getBaseParteFija() * 100));
	}

	public void calcularFraCli() throws SQLException, Exception {
		if (this.getVFutCli() == null) {
			MyLogger.logError("VFutCli es nula");
			throw new Exception("VFutCli es nula");
		}
		if (this.getPlazoResidual() == null) {
			MyLogger.logError("PlazoResidual es nula");
			throw new Exception("PlazoResidual es nula");
		}

		// FIXME se calculo el FactorDesc con la fecha de Proceso o con la de
		// Inicio del Cupon Parte Fija???
		this.setFraCli(this.getVFutCli()
				* DAO.obtenerFactorDesc(this.getFechaProceso(),
						this.getPlazoResidual(), "Curva_1"));
	}

	public void calcularFraCliRf() throws SQLException, Exception {
		if (this.getVFutCliRf() == null) {
			MyLogger.logError("VFutCliRF es nula");
			throw new Exception("VFutCliRF es nula");
		}
		if (this.getPlazoResidual() == null) {
			MyLogger.logError("PlazoResidual es nula");
			throw new Exception("PlazoResidual es nula");
		}
		// FIXME se calculo el FactorDesc con la fecha de Proceso o con la de
		// Inicio del Cupon Parte Variable???
		this.setFraCliRf(this.getVFutCliRf()
				* DAO.obtenerFactorDesc(this.getFechaProceso(),
						this.getPlazoResidual(), "Curva_1"));
	}

	public Double getCantidadVNParteVariable() {
		return this.getOperacionParteVariable().getCantidadVN();
	}

	public Double getTasaFijaParteVariable() {
		return new Double(this.getOperacionParteVariable().getTasaFija());
	}

	public Double getBaseParteVariable() {
		return new Double(this.getOperacionParteVariable().getBase());
	}

	public void calcularVFutCliRf() throws Exception {
		if (this.getCantidadVNParteVariable() == null) {
			MyLogger.logError("CantidadVNParteVariable es nula");
			throw new Exception("CantidadVNParteVariable es nula");
		}
		if (this.getTnaIndex() == null) {
			MyLogger.logError("TnaIndex es nula");
			throw new Exception("TnaIndex es nula");
		}
		if (this.getFechaInicio() == null) {
			MyLogger.logError("FechaInicio es nula");
			throw new Exception("FechaInicio es nula");
		}
		if (this.getBaseParteVariable() == null) {
			MyLogger.logError("BaseParteVariable es nula");
			throw new Exception("BaseParteVariable es nula");
		}
		this.setVFutCliRf(this.getCantidadVNParteVariable()
				* this.getTnaIndex()
				* DateUtils.diferenciaEntreFechas(this.getFechaVencimiento(),
						this.getFechaInicio())
				/ (this.getBaseParteVariable() * 100));
	}

	public AgendaCuponOperacioneSWAPAValuarData getAgendaCupon() {
		return agendaCupon;
	}

	public void setAgendaCupon(AgendaCuponOperacioneSWAPAValuarData agendaCupon) {
		this.agendaCupon = agendaCupon;
	}

	public Long getPlazoResidual() {
		return plazoResidual;
	}

	protected void setPlazoResidual(Long plazoResidual) {
		this.plazoResidual = plazoResidual;
	}

	public Double getTnaIndex() {
		return tnaIndex;
	}

	protected void setTnaIndex(Double tnaIndex) {
		this.tnaIndex = tnaIndex;
	}

	public Double getVFutCli() {
		return vFutCli;
	}

	protected void setVFutCli(Double futCli) {
		vFutCli = futCli;
	}

	public Date getFechaProceso() {
		return fechaProceso;
	}

	public void setFechaProceso(Date fechaProceso) {
		this.fechaProceso = fechaProceso;
	}

	public OperacionSWAPAValuarData getOperacionParteFija() {
		return operacionParteFija;
	}

	public void setOperacionParteFija(
			OperacionSWAPAValuarData operacionParteFija) {
		this.operacionParteFija = operacionParteFija;
	}

	public OperacionSWAPAValuarData getOperacionParteVariable() {
		return operacionParteVariable;
	}

	public void setOperacionParteVariable(
			OperacionSWAPAValuarData operacionParteVariable) {
		this.operacionParteVariable = operacionParteVariable;
	}

	public Double getFraCli() {
		return fraCli;
	}

	protected void setFraCli(Double fraCli) {
		this.fraCli = fraCli;
	}

	public Double getVFutCliRf() {
		return vFutCliRf;
	}

	protected void setVFutCliRf(Double futCliRf) {
		vFutCliRf = futCliRf;
	}

	public Double getFraCliRf() {
		return fraCliRf;
	}

	protected void setFraCliRf(Double fraCliRf) {
		this.fraCliRf = fraCliRf;
	}

}
