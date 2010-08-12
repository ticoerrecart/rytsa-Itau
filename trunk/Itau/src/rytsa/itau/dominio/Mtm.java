package rytsa.itau.dominio;

import java.sql.SQLException;
import java.util.Date;
import java.util.ResourceBundle;

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

	public void calcularFwd(Date pFechaProceso, OperacionNDFAValuarData pOperacionNDF,
			ResourceBundle pBundle) throws NumberFormatException, SQLException, Exception {
		if (this.getPlazoRemanente() == null) {
			throw new Exception("plazoRemanente es nulo");
		}
		String[] codDivisa1 = pBundle.getString(pOperacionNDF.getMoneda()).split(",");
		this.setTipoCambioMoneda(DAO.obtenerTipoCambioMoneda(DateUtils.convertDate(pFechaProceso),
				new Long(codDivisa1[0])));

		String moneda2 = pBundle.getString("moneda2");
		String[] codDivisa2 = pBundle.getString(moneda2).split(",");
		this.setTipoCambioMoneda2(DAO.obtenerTipoCambioMoneda(DateUtils.convertDate(pFechaProceso),
				new Long(codDivisa2[0])));

		this.setCurvaMoneda(DAO.obtenerFactorDesc(DateUtils.convertDate(pFechaProceso), this
				.getPlazoRemanente(), FileUtils.getFileName(codDivisa1[1])));

		this.setCurvaMoneda2(DAO.obtenerFactorDesc(DateUtils.convertDate(pFechaProceso), this
				.getPlazoRemanente(), FileUtils.getFileName(codDivisa2[1])));

		this.setFwd(this.getTipoCambioMoneda() / this.getTipoCambioMoneda2()
				* this.getCurvaMoneda() / this.getCurvaMoneda2());
	}

	public void calcularMtm(OperacionNDFAValuarData pOperacionNDF) throws Exception {
		if (this.getFwd() == null) {
			throw new Exception("fwd es nulo");
		}
		if (this.getCurvaMoneda2() == null) {
			throw new Exception("curvaMoneda2 es nulo");
		}
		if (this.getTipoCambioMoneda2() == null) {
			throw new Exception("tipoCambioMoneda2 es nulo");
		}
		//CantidadVN  * (Precio - FWD) * Curva Moneda 2 (Plazo Remanente) * Tipo de Cambio Moneda 2
		this.setMtm(pOperacionNDF.getCantidadVN() * (pOperacionNDF.getPrecio() - this.getFwd())
				* this.getCurvaMoneda2() * this.getTipoCambioMoneda2());
	}

	public Long getPlazoRemanente() {
		return plazoRemanente;
	}

	public void setPlazoRemanente(Long plazoRemanente) {
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
