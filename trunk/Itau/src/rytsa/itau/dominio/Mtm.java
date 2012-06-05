package rytsa.itau.dominio;

import java.sql.SQLException;
import java.util.Date;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.utils.FileUtils;
import rytsa.itau.utils.MyLogger;
import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;

public class Mtm {

	private Long plazoRemanente;

	private Double tipoCambioMoneda;

	private Double tipoCambioMoneda2;

	private Double curvaMoneda;

	private Double curvaMoneda2;

	private Double fwd;

	private Double mtm;

	private OperacionNDFAValuarData operacionNDF;

	public Mtm(Date pFechaProceso, Date pFechaProcesoPlazoRemanente,
			OperacionNDFAValuarData pOperacionNDF, boolean esUltimoDiaHabilDelMes,
			boolean esUltimoDiaDelMes, Date fUltimoDiaDelMes) throws Exception {

		this.setOperacionNDF(pOperacionNDF);

		//cambio 04/06/2012
		calcularPlazoRemanente(pFechaProcesoPlazoRemanente, pOperacionNDF, esUltimoDiaHabilDelMes,
				esUltimoDiaDelMes, fUltimoDiaDelMes);

		this.setTipoCambioMoneda(DAO.obtenerTipoCambioMoneda(pFechaProceso,
				DAO.obtenerMoneda(pOperacionNDF.getMoneda())));

		this.setTipoCambioMoneda2(DAO.obtenerTipoCambioMoneda(pFechaProceso,
				DAO.obtenerMoneda(pOperacionNDF.getMonedaLiquidacion())));

		if (this.getTipoCambioMoneda() == null) {
			MyLogger.logError("tipoCambioMoneda es nulo");
			throw new Exception("tipoCambioMoneda es nulo");
		}
		if (this.getTipoCambioMoneda2() == null) {
			MyLogger.logError("tipoCambioMoneda2 es nulo");
			throw new Exception("tipoCambioMoneda2 es nulo");
		}

		this.setCurvaMoneda(DAO.obtenerFactorDesc(pFechaProceso, this.getPlazoRemanente(),
				FileUtils.getFileName(DAO.obtenerFile(pOperacionNDF.getMoneda()))));

		this.setCurvaMoneda2(DAO.obtenerFactorDesc(pFechaProceso, this.getPlazoRemanente(),
				FileUtils.getFileName(DAO.obtenerFile(pOperacionNDF.getMonedaLiquidacion()))));

		this.calcularFwd();

		this.calcularMtm();

		MyLogger.log("Tipo Cambio Moneda: " + this.getTipoCambioMoneda());
		MyLogger.log("Tipo Cambio Moneda2: " + this.getTipoCambioMoneda2());
		MyLogger.log("Plazo Remanente: " + this.getPlazoRemanente());
		MyLogger.log("Curva Moneda: " + this.getCurvaMoneda());
		MyLogger.log("Curva Moneda2: " + this.getCurvaMoneda2());
		MyLogger.log("Calculo Fwd: " + this.getFwd());
		MyLogger.log("Calculo Mtm: " + this.getMtm());

	}

	private void calcularPlazoRemanente(Date pFechaProceso, OperacionNDFAValuarData pOperacionNDF,
			boolean esUltimoDiaHabilDelMes, boolean esUltimoDiaDelMes, Date fUltimoDiaDelMes)
			throws Exception {
		Date fechaProceso = pFechaProceso;
		if (esUltimoDiaHabilDelMes) {//si es el ultimo dia habil del mes
			if (!esUltimoDiaDelMes) {//si NO es el ultimo dia del mes
				//calculo el plazo remanente con el ultimo dia del mes
				fechaProceso = fUltimoDiaDelMes;
			}
		}

		this.setPlazoRemanente(DateUtils.diferenciaEntreFechas(pOperacionNDF.getFechaVencimiento(),
				fechaProceso));

		if (this.getPlazoRemanente() == null) {
			MyLogger.logError("plazoRemanente es nulo");
			throw new Exception("plazoRemanente es nulo");
		}
	}

	public void calcularFwd() throws NumberFormatException, SQLException, Exception {
		this.setFwd((this.getTipoCambioMoneda() / this.getTipoCambioMoneda2())
				* (this.getCurvaMoneda() / this.getCurvaMoneda2()));
	}

	public void calcularMtm() throws Exception {
		// CantidadVN * (FWD-Precio) * Curva Moneda 2 (Plazo Remanente) * Tipo
		// de Cambio Moneda 2
		this.setMtm(this.getOperacionNDF().getCantidadVN()
				* (this.getFwd() - this.getOperacionNDF().getPrecio()) * this.getCurvaMoneda2()
				* this.getTipoCambioMoneda2());
	}

	public Long getPlazoRemanente() {
		return plazoRemanente;
	}

	private void setPlazoRemanente(Long plazoRemanente) {
		this.plazoRemanente = plazoRemanente;
	}

	public Double getTipoCambioMoneda() {
		return tipoCambioMoneda;
	}

	private void setTipoCambioMoneda(Double tipoCambioMoneda) {
		this.tipoCambioMoneda = tipoCambioMoneda;
	}

	public Double getTipoCambioMoneda2() {
		return tipoCambioMoneda2;
	}

	private void setTipoCambioMoneda2(Double tipoCambioMoneda2) {
		this.tipoCambioMoneda2 = tipoCambioMoneda2;
	}

	public Double getCurvaMoneda() {
		return curvaMoneda;
	}

	private void setCurvaMoneda(Double curvaMoneda) {
		this.curvaMoneda = curvaMoneda;
	}

	public Double getCurvaMoneda2() {
		return curvaMoneda2;
	}

	private void setCurvaMoneda2(Double curvaMoneda2) {
		this.curvaMoneda2 = curvaMoneda2;
	}

	public Double getMtm() {
		return mtm;
	}

	private void setMtm(Double mtm) {
		this.mtm = mtm;
	}

	public Double getFwd() {
		return fwd;
	}

	private void setFwd(Double fwd) {
		this.fwd = fwd;
	}

	public OperacionNDFAValuarData getOperacionNDF() {
		return operacionNDF;
	}

	public void setOperacionNDF(OperacionNDFAValuarData operacionNDF) {
		this.operacionNDF = operacionNDF;
	}
}