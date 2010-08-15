package rytsa.itau.dominio;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
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

	public CuponSWAP(Date pFechaProceso,
			OperacionSWAPAValuarData pOperacionParteFija,
			OperacionSWAPAValuarData pOperacionParteVariable) throws Exception {
		this.setFechaProceso(pFechaProceso);
		this.operacionParteFija = pOperacionParteFija;
		this.operacionParteVariable = pOperacionParteVariable;

		this.setAgendaCupon(agendaCupon);
		this.calcularPlazoResidual();
		this.calcularTnaIndex();
		this.calcularVFutCli();
	}

	public void calcularPlazoResidual() throws ParseException {
		this.setPlazoResidual(DateUtils.diferenciaEntreFechas(DateUtils
				.stringToDate(this.getAgendaCupon().getFechaVencimiento()),
				this.getFechaProceso()));
	}

	public Date getFechaIndiceInicio() throws ParseException {
		return DateUtils.stringToDate(agendaCupon.getFechaIndiceInicio());
	}

	public Date getFechaIndiceFin() throws ParseException {
		return DateUtils.stringToDate(agendaCupon.getFechaIndiceFin());
	}

	public Date getFechaInicio() throws ParseException {
		return DateUtils.stringToDate(agendaCupon.getFechaInicio());
	}

	public Date getFechaVencimiento() throws ParseException {
		return DateUtils.stringToDate(agendaCupon.getFechaVencimiento());
	}

	public void calcularTnaIndex() throws Exception {
		if (this.getFechaIndiceFin().compareTo(this.getFechaProceso()) <= 0) {// todas
																				// las
																				// tasas
																				// son
																				// anteriores
																				// (Badlar)
			this.setTnaIndex(DAO.obtenerPromedioTasasDeBadlar(this
					.getFechaIndiceInicio(), this.getFechaIndiceFin()));
		} else {
			if (this.getFechaIndiceInicio().compareTo(this.getFechaProceso()) > 0) {// todas
																					// las
																					// tasas
																					// son
																					// posteriores
																					// (FWD)
				this.setTnaIndex(DAO.obtenerPromedioTasasFWD(this
						.getFechaIndiceInicio(), this.getFechaIndiceFin()));
			} else {
				// algunas tasas son anteriores (Badlar) y otras son posteriores
				// (FWD)
				Double promedio = DAO.obtenerPromedioTasasDeBadlar(this
						.getFechaIndiceInicio(), this.getFechaProceso());
				promedio = promedio
						+ DAO.obtenerPromedioTasasFWD(DateUtils.addDays(this
								.getFechaProceso(), 1), this
								.getFechaIndiceFin());
				this.setTnaIndex(promedio);
			}
		}
	}

	public Double getCantidadVN() {
		return this.getOperacionParteFija().getCantidadVN();
	}

	public Double getTasaFija() {
		return new Double(this.getOperacionParteFija().getTasaFija());
	}

	public Double getBase() {
		return new Double(this.getOperacionParteFija().getBase1());
	}

	public void calcularVFutCli() throws ParseException {
		this.setVFutCli(this.getCantidadVN()
				* this.getTasaFija()
				* (DateUtils.diferenciaEntreFechas(this.getFechaVencimiento(),
						this.getFechaInicio())) / this.getBase() * 100);
	}

	public void calcularFraCli() throws SQLException, Exception {
		//FIXME se calculo el FactorDesc con la fecha de Proceso o con la de Inicio del Cupon Parte Fija???
		this.setFraCli(this.getVFutCli() * DAO.obtenerFactorDesc(this.getFechaProceso(), this.getPlazoResidual(), "Curva_1"));
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

	
}
