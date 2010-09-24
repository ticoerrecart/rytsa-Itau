package rytsa.itau.valuaciones;

import java.util.List;

import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;

public class ConverorWStoESB {

	public static RecuperoOperacionesNDFAValuarResponse getRecuperoOperacionesNDFAValuarResponse(
			List<client.ws.rytsa.valuaciones.ArrayOfOperacionNDFAValuarData.OperacionNDFAValuarData> operaciones) {
		RecuperoOperacionesNDFAValuarResponse r = new RecuperoOperacionesNDFAValuarResponse();
		for (client.ws.rytsa.valuaciones.ArrayOfOperacionNDFAValuarData.OperacionNDFAValuarData operacionOrigen : operaciones) {
			OperacionNDFAValuarData operacionDestino = new OperacionNDFAValuarData();
			operacionDestino.setBanca(operacionOrigen.getBanca());
			operacionDestino.setCantidadVN(operacionOrigen.getCantidadVN()
					.doubleValue());
			operacionDestino.setClinum(operacionOrigen.getCliNum());
			operacionDestino.setComprasVigentes(operacionOrigen
					.getComprasVigentes().doubleValue());
			operacionDestino.setContraParte(operacionOrigen.getContraParte());
			operacionDestino.setCUIT(operacionOrigen.getCuit());
			operacionDestino.setDev_Cob(operacionOrigen.getDevCob()
					.doubleValue());
			operacionDestino.setDev_Pag(operacionOrigen.getDevPag()
					.doubleValue());
			operacionDestino.setDev_total(operacionOrigen.getDevTotal()
					.doubleValue());
			operacionDestino.setDias(String.valueOf(operacionOrigen.getDias()));
			operacionDestino.setFecha_proceso(operacionOrigen.getFechaProceso()
					.toGregorianCalendar().getTime());
			operacionDestino.setFechaCargaOperacion(operacionOrigen
					.getFechaCarga().toGregorianCalendar().getTime());
			operacionDestino.setFechaInicio(operacionOrigen.getFechaInicio()
					.toGregorianCalendar().getTime());
			operacionDestino.setFechaVencimiento(operacionOrigen
					.getFechaVencimiento().toGregorianCalendar().getTime());
			operacionDestino.setGestorRiesgoMercado(operacionOrigen
					.getGestorRiesgo());
			operacionDestino.setIdOperacion(String.valueOf(operacionOrigen
					.getIDOperacion()));
			// operacionDestino.setInstrumento(
			operacionDestino.setMercado(operacionOrigen.getMercado());
			operacionDestino.setMetodoFixing(operacionOrigen.getMetodoFixing());
			operacionDestino.setMoneda(operacionOrigen.getMoneda());
			operacionDestino.setMoneda_de_liquidacion(operacionOrigen
					.getMonedaLiquidacion());
			operacionDestino.setMTM(operacionOrigen.getMTM().doubleValue());
			operacionDestino.setNumeroBoleto(String.valueOf(operacionOrigen
					.getNumeroBoleto()));
			operacionDestino.setNumeroOperacion(String.valueOf(operacionOrigen
					.getNumeroOperacion()));
			operacionDestino.setOfficer(operacionOrigen.getOfficer());
			operacionDestino.setPlazo(String
					.valueOf(operacionOrigen.getPlazo()));
			operacionDestino.setPrecio(operacionOrigen.getPrecio()
					.doubleValue());
			// operacionDestino.setPrecioCierreAnteriorContable(
			// operacionDestino.setPrecioCierreContable(
			// operacionDestino.setPrecioCierreContableMesAnterior(
			operacionDestino.setProducto(operacionOrigen.getProducto());
			operacionDestino.setRaiz(operacionOrigen.getRaiz());
			operacionDestino.setRdo_BBA(operacionOrigen.getRdoBBA()
					.doubleValue());
			operacionDestino.setRdo_BBA_no_Dev(operacionOrigen.getRdoBBANoDev()
					.doubleValue());
			operacionDestino.setRdoDiarioContable(operacionOrigen
					.getRdoDiarioContab().doubleValue());
			operacionDestino.setRdoMesContable(operacionOrigen
					.getRdoMesContab().doubleValue());
			operacionDestino.setRdoTotalContable(operacionOrigen
					.getRdoTotalContab().doubleValue());
			operacionDestino.setStrike_ref(operacionOrigen.getStrikeRef()
					.doubleValue());
			operacionDestino.setTipoOperacion(operacionOrigen
					.getTipoOperacion());
			operacionDestino.setVencidos(operacionOrigen.getVencidos()
					.doubleValue());
			operacionDestino.setVentasVigentes(operacionOrigen
					.getVentasVigentes().doubleValue());
			operacionDestino.setVigentes(operacionOrigen.getVigentes()
					.doubleValue());

			r.addOperacionNDFAValuarData(operacionDestino);
		}

		return r;
	}

}
