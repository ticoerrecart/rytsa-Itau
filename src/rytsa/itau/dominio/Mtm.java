package rytsa.itau.dominio;

import java.sql.SQLException;
import java.util.Date;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.utils.FileUtils;
import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;

public class Mtm {

	private Long plazoRemanente;

	private Double tipoCambioMoneda;

	private Double tipoCambioMoneda2;

	private Double curvaMoneda;

	private Double curvaMoneda2;

	private Double fwd;

	private Double mtm;

	public Mtm(Date pFechaProceso, OperacionNDFAValuarData pOperacionNDF) throws Exception {
		this.setTipoCambioMoneda(DAO.obtenerTipoCambioMoneda(pFechaProceso, DAO.monedas
				.get(pOperacionNDF.getMoneda())));

		this.setTipoCambioMoneda2(DAO.obtenerTipoCambioMoneda(pFechaProceso, DAO.monedas
				.get(pOperacionNDF.getMoneda_de_liquidacion())));

		if (this.getTipoCambioMoneda() == null) {
			throw new Exception("tipoCambioMoneda es nulo");
		}
		if (this.getTipoCambioMoneda2() == null) {
			throw new Exception("tipoCambioMoneda2 es nulo");
		}

		this.setPlazoRemanente(DateUtils.diferenciaEntreFechas(pOperacionNDF.getFechaVencimiento(),
				pFechaProceso));

		if (this.getPlazoRemanente() == null) {
			throw new Exception("plazoRemanente es nulo");
		}

		this.setCurvaMoneda(DAO.obtenerFactorDesc(pFechaProceso, this.getPlazoRemanente(),
				FileUtils.getFileName(DAO.files.get(pOperacionNDF.getMoneda()))));

		this.setCurvaMoneda2(DAO.obtenerFactorDesc(pFechaProceso, this.getPlazoRemanente(),
				FileUtils.getFileName(DAO.files.get(pOperacionNDF.getMoneda_de_liquidacion()))));

		this.calcularFwd();

		this.calcularMtm(pOperacionNDF);
	}

	public void calcularFwd() throws NumberFormatException, SQLException, Exception {

		this.setFwd((this.getTipoCambioMoneda() / this.getTipoCambioMoneda2())
				* (this.getCurvaMoneda() / this.getCurvaMoneda2()));
	}

	public void calcularMtm(OperacionNDFAValuarData pOperacionNDF) throws Exception {

		// CantidadVN * (Precio - FWD) * Curva Moneda 2 (Plazo Remanente) * Tipo
		// de Cambio Moneda 2
		this.setMtm(pOperacionNDF.getCantidadVN() * (pOperacionNDF.getPrecio() - this.getFwd())
				* this.getCurvaMoneda2() * this.getTipoCambioMoneda2());
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

}
