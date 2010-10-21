package rytsa.itau.ws;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.xml.ws.Holder;

import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.OperacionSWAPAValuarData;
import client.ws.rytsa.seguridad.BEEstado;
import client.ws.rytsa.seguridad.BESesiones;
import client.ws.rytsa.seguridad.WSSeguridad;
import client.ws.rytsa.seguridad.WSSeguridadSoap;
import client.ws.rytsa.valuaciones.ArrayOfOperacionSWAPAValuarData;
import client.ws.rytsa.valuaciones.OperacionesNDFAValuarRequestData;
import client.ws.rytsa.valuaciones.WSValuaciones;
import client.ws.rytsa.valuaciones.WSValuacionesSoap;

public class ConversorWStoESB {

	private static String IP;
	private static String USER_NAME;
	private static String PASSWORD;
	private static ResourceBundle resourceBundle;
	private static WSSeguridadSoap proxySeguridad;
	private static WSValuacionesSoap proxy;

	static {
		resourceBundle = ResourceBundle.getBundle("config");
		IP = resourceBundle.getString("ws.ip");
		USER_NAME = resourceBundle.getString("ws.userName");
		PASSWORD = resourceBundle.getString("ws.password");
		WSSeguridad wsSeguridad = new WSSeguridad();
		proxySeguridad = wsSeguridad.getWSSeguridadSoap();
		WSValuaciones wsValu = new WSValuaciones();
		proxy = wsValu.getWSValuacionesSoap();
	}

	public static String getLogin() {
		BESesiones bESesiones = new BESesiones();
		proxySeguridad.loginSesion(IP, USER_NAME, PASSWORD, new Holder(
				bESesiones), new Holder(new BEEstado()));
		return bESesiones.getID();
	}

	public static void logout(String pIdSesion) {
		proxySeguridad.logout(pIdSesion);
	}

	public static RecuperoOperacionesNDFAValuarResponse getOperacionesNDFAValuarWS(
			Date pFechaProceso) throws Exception {
		// login
		String idSession = getLogin();
		OperacionesNDFAValuarRequestData request = new OperacionesNDFAValuarRequestData();
		request.setFechaProceso(DateUtils
				.getXMLGregorianCalendar(pFechaProceso));
		List<client.ws.rytsa.valuaciones.ArrayOfOperacionNDFAValuarData.OperacionNDFAValuarData> operaciones = proxy
				.recuperarOperacionesNDFAValuar(idSession, request)
				.getOperacionNDFAValuarData();
		RecuperoOperacionesNDFAValuarResponse recuperoOperacionesNDFAValuarResponse = getRecuperoOperacionesNDFAValuarResponse(operaciones);
		// logout
		logout(idSession);
		return recuperoOperacionesNDFAValuarResponse;
	}

	private static RecuperoOperacionesNDFAValuarResponse getRecuperoOperacionesNDFAValuarResponse(
			List<client.ws.rytsa.valuaciones.ArrayOfOperacionNDFAValuarData.OperacionNDFAValuarData> operaciones) {
		RecuperoOperacionesNDFAValuarResponse r = new RecuperoOperacionesNDFAValuarResponse();
		for (client.ws.rytsa.valuaciones.ArrayOfOperacionNDFAValuarData.OperacionNDFAValuarData operacionOrigen : operaciones) {
			OperacionNDFAValuarData operacionDestino = new OperacionNDFAValuarData();
			operacionDestino.setBanca(operacionOrigen.getBanca());
			operacionDestino.setCantidadVN(operacionOrigen.getCantidadVN()
					.doubleValue());
			operacionDestino.setCliNum(operacionOrigen.getCliNum());
			operacionDestino.setComprasVigentes(operacionOrigen
					.getComprasVigentes().doubleValue());
			operacionDestino.setContraparte(operacionOrigen.getContraParte());
			operacionDestino.setCuit(operacionOrigen.getCuit());
			operacionDestino.setDevCob(operacionOrigen.getDevCob()
					.doubleValue());
			operacionDestino.setDevPag(operacionOrigen.getDevPag()
					.doubleValue());
			operacionDestino.setDevTotal(operacionOrigen.getDevTotal()
					.doubleValue());
			operacionDestino.setDias(String.valueOf(operacionOrigen.getDias()));
			operacionDestino.setFechaProceso(operacionOrigen.getFechaProceso()
					.toGregorianCalendar().getTime());
			operacionDestino.setFechaCarga(operacionOrigen.getFechaCarga()
					.toGregorianCalendar().getTime());
			operacionDestino.setFechaInicio(operacionOrigen.getFechaInicio()
					.toGregorianCalendar().getTime());
			operacionDestino.setFechaVencimiento(operacionOrigen
					.getFechaVencimiento().toGregorianCalendar().getTime());
			operacionDestino.setGestorRiesgo(operacionOrigen.getGestorRiesgo());
			operacionDestino.setIDOperacion(String.valueOf(operacionOrigen
					.getIDOperacion()));
			// operacionDestino.setInstrumento(
			operacionDestino.setMercado(operacionOrigen.getMercado());
			operacionDestino.setMetodoFixing(operacionOrigen.getMetodoFixing());
			operacionDestino.setMoneda(operacionOrigen.getMoneda());
			operacionDestino.setMonedaLiquidacion(operacionOrigen
					.getMonedaLiquidacion());
			operacionDestino.setMTM(operacionOrigen.getMTM().doubleValue());
			operacionDestino.setNumeroBoleto(String.valueOf(operacionOrigen
					.getNumeroBoleto()));
			operacionDestino.setNumeroOperacion(String.valueOf(operacionOrigen
					.getNumeroOperacion()));
			operacionDestino.setOfficer(operacionOrigen.getOfficer());
			operacionDestino
					.setPlazo(String.valueOf(operacionOrigen.getPlazo()));
			operacionDestino.setPrecio(operacionOrigen.getPrecio()
					.doubleValue());
			// operacionDestino.setPrecioCierreAnteriorContable(
			// operacionDestino.setPrecioCierreContable(
			// operacionDestino.setPrecioCierreContableMesAnterior(
			operacionDestino.setProducto(operacionOrigen.getProducto());
			operacionDestino.setRaiz(operacionOrigen.getRaiz());
			operacionDestino.setRdoBBA(operacionOrigen.getRdoBBA()
					.doubleValue());
			operacionDestino.setRdoBBANoDev(operacionOrigen.getRdoBBANoDev()
					.doubleValue());
			operacionDestino.setRdoDiarioContable(operacionOrigen
					.getRdoDiarioContab().doubleValue());
			operacionDestino.setRdoMesContab(operacionOrigen.getRdoMesContab()
					.doubleValue());
			operacionDestino.setRdoTotalContab(operacionOrigen
					.getRdoTotalContab().doubleValue());
			operacionDestino.setStrikeRef(operacionOrigen.getStrikeRef()
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

	public static List<OperacionSWAPAValuarData> getOperacionesSWAPAValuarWS(
			Date pFechaProceso) throws Exception {
		String idSession = getLogin();
		client.ws.rytsa.valuaciones.OperacionesSWAPAValuarRequestData request = new client.ws.rytsa.valuaciones.OperacionesSWAPAValuarRequestData();
		request.setFechaProceso(DateUtils
				.getXMLGregorianCalendar(pFechaProceso));
		List<ArrayOfOperacionSWAPAValuarData.OperacionSWAPAValuarData> operacionesSWAPAValuar = proxy
				.recuperarOperacionesSWAPAValuar(idSession, request)
				.getOperacionSWAPAValuarData();
		logout(idSession);
		return getOperacionesSWAPAValuar(operacionesSWAPAValuar);
	}

	private static List<OperacionSWAPAValuarData> getOperacionesSWAPAValuar(
			List<ArrayOfOperacionSWAPAValuarData.OperacionSWAPAValuarData> operaciones)
			throws ParseException {
		List<OperacionSWAPAValuarData> r = new ArrayList<OperacionSWAPAValuarData>();
		for (ArrayOfOperacionSWAPAValuarData.OperacionSWAPAValuarData operacionOrigen : operaciones) {
			OperacionSWAPAValuarData operacionDestino = new OperacionSWAPAValuarData();
			operacionDestino.setBanca(operacionOrigen.getBanca());
			operacionDestino
					.setBase(String.valueOf(operacionOrigen.getBase1()));
			operacionDestino.setBIBAPaga(operacionOrigen.getBIBAPaga());
			operacionDestino.setCantidadVN(operacionOrigen.getCantidadVN()
					.doubleValue());
			operacionDestino.setCliNum(operacionOrigen.getCliNum());
			operacionDestino.setComprasVigentes(operacionOrigen
					.getComprasVigentes().doubleValue());
			operacionDestino.setContraparte(operacionOrigen.getContraparte());
			operacionDestino.setCuit(operacionOrigen.getCuit());
			operacionDestino.setDevCob(operacionOrigen.getDevCob()
					.doubleValue());
			operacionDestino.setDevPag(operacionOrigen.getDevPag()
					.doubleValue());
			operacionDestino.setDevTotal(operacionOrigen.getDevTotal()
					.doubleValue());
			operacionDestino.setDias(operacionOrigen.getDias());
			operacionDestino.setEstrategia(operacionOrigen.getEstrategia());
			operacionDestino.setFechaCarga(DateUtils
					.dateToString(operacionOrigen.getFechaCarga()
							.toGregorianCalendar().getTime()));
			operacionDestino.setFechaInicio(DateUtils
					.dateToString(operacionOrigen.getFechaInicio()
							.toGregorianCalendar().getTime()));
			operacionDestino.setFechaProceso(DateUtils
					.dateToString(operacionOrigen.getFechaProceso()
							.toGregorianCalendar().getTime()));
			operacionDestino.setFechaVencimiento(DateUtils
					.dateToString(operacionOrigen.getFechaVencimiento()
							.toGregorianCalendar().getTime()));
			operacionDestino.setFrencuencia(String.valueOf(operacionOrigen
					.getFrecuencia()));
			operacionDestino.setGestorRiesgo(operacionOrigen.getGestorRiesgo());
			operacionDestino.setIDOperacion(String.valueOf(operacionOrigen
					.getIdOperacion()));
			operacionDestino.setInstrumento(operacionOrigen.getInstrumento());
			operacionDestino.setMetodoFixing(operacionOrigen.getMetodoFixing());
			operacionDestino.setMoneda(operacionOrigen.getMoneda());
			operacionDestino.setMonedaLiquidacion(operacionOrigen
					.getMonedaLiquidacion());
			operacionDestino.setMTMPayment(operacionOrigen.getMTMPayment()
					.doubleValue());
			operacionDestino.setMTMReceived(operacionOrigen.getMTMReceived()
					.doubleValue());
			operacionDestino.setNumeroBoleto(String.valueOf(operacionOrigen
					.getNumeroBoleto()));
			operacionDestino.setNumeroOperacion(String.valueOf(operacionOrigen
					.getNumeroOperacion()));
			operacionDestino.setOfficer(operacionOrigen.getOfficer());
			operacionDestino
					.setPlazo(String.valueOf(operacionOrigen.getPlazo()));
			operacionDestino.setPrecio(operacionOrigen.getPrecio()
					.doubleValue());
			operacionDestino.setProducto(operacionOrigen.getProducto());
			operacionDestino.setRaiz(operacionOrigen.getRaiz());
			operacionDestino.setRdoBBA(operacionOrigen.getRdoBBA()
					.doubleValue());
			operacionDestino.setRdoBBANoDev(operacionOrigen.getRdoBBANoDev()
					.doubleValue());
			operacionDestino.setRdoDiarioContab(operacionOrigen
					.getRdoDiarioContab().doubleValue());
			operacionDestino.setRdoMesContab(operacionOrigen.getRdoMesContab()
					.doubleValue());
			operacionDestino
					.setRendimientoTotalHastaFechaActual(operacionOrigen
							.getRendimientoTotalHastaFechaActual()
							.doubleValue());
			operacionDestino.setRendimientoUltimoPeriodo(operacionOrigen
					.getRendimientoUltimoPeriodo().doubleValue());
			operacionDestino.setRolTotalContable(operacionOrigen
					.getRolTotalContable().doubleValue());
			operacionDestino.setStrikeRef(operacionOrigen.getStrikeRef()
					.doubleValue());
			operacionDestino.setSwapVigentesTasaFija(operacionOrigen
					.getSwapVigentesTasaFija().doubleValue());
			operacionDestino.setTasaFija(String.valueOf(operacionOrigen
					.getTasaFija()));
			operacionDestino.setTasaVariable(operacionOrigen.getTasaVariable());
			operacionDestino.setTipoOperacion(operacionOrigen
					.getTipoOperacion());
			operacionDestino.setVencidos(operacionOrigen.getVencidos()
					.doubleValue());
			operacionDestino.setVentasVigentes(operacionOrigen
					.getVentasVigentes().doubleValue());
			operacionDestino.setVigentes(operacionOrigen.getVigentes()
					.doubleValue());

			/*
			 * operacionOrigen.getCuenta();
			 * operacionOrigen.getIdOperacionRelacionada();
			 * operacionOrigen.getMercado(); operacionOrigen.getSucursal();
			 * operacionOrigen.getSwapVigentesTasaVariable();
			 */

			r.add(operacionDestino);
		}
		return r;
	}
}
