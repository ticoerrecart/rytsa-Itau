package rytsa.itau.valuaciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rytsa.itau.dominio.Mtm;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.ndf.NovedadesValuacionesRequestData;
import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;
import client.ws.rytsa.valuaciones.OperacionesNDFAValuarRequestData;
import client.ws.rytsa.valuaciones.WSValuaciones;
import client.ws.rytsa.valuaciones.WSValuacionesSoap;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ValuacionesNDF extends Valuaciones {
	
	public static List<NovedadesValuacionesRequestData> calcularMTM(
			Date pFechaProceso) throws Exception {
		
		RecuperoOperacionesNDFAValuarResponse operacionesNDF = null; 
		if (USOESB){
			operacionesNDF = operacionesNDFAValuar(pFechaProceso);
		} else {
			WSValuaciones wsValu = new WSValuaciones();
			WSValuacionesSoap proxy =  wsValu.getWSValuacionesSoap();
			OperacionesNDFAValuarRequestData request = new OperacionesNDFAValuarRequestData();
			request.setFechaProceso(DateUtils.getXMLGregorianCalendar(pFechaProceso));
			List<client.ws.rytsa.valuaciones.ArrayOfOperacionNDFAValuarData.OperacionNDFAValuarData> operaciones =  proxy.recuperarOperacionesNDFAValuar("", request).getOperacionNDFAValuarData();
			operacionesNDF = ConverorWStoESB.getRecuperoOperacionesNDFAValuarResponse(operaciones);
		}
		
		
		return calculoMTM(pFechaProceso, operacionesNDF);
	}

	

	
	private static List<NovedadesValuacionesRequestData> calculoMTM(
			Date pFechaProceso,
			RecuperoOperacionesNDFAValuarResponse pOperacionesNDF)
			throws Exception {

		List<Mtm> listaMtm = new ArrayList<Mtm>();
		for (OperacionNDFAValuarData operacionNDF : pOperacionesNDF
				.getRecuperoOperacionesNDFAValuarResult()) {
			Mtm mtm = new Mtm(pFechaProceso, operacionNDF);
			listaMtm.add(mtm);
		}

		List<NovedadesValuacionesRequestData> listaNovedadesRD = new ArrayList<NovedadesValuacionesRequestData>();
		for (Mtm mtm : listaMtm) {
			// TODO hay que armar la coleccion para el WS
			// InformarNovedadesValuaciones.
			NovedadesValuacionesRequestData novedad = new NovedadesValuacionesRequestData();
			novedad.setIdOperacion(mtm.getOperacionNDF().getIdOperacion());
			novedad.setFecha(mtm.getOperacionNDF().getFecha_proceso());
			novedad.setFechaCargaPrecio(mtm.getOperacionNDF()
					.getFechaCargaOperacion());
			novedad.setMonedaValuacion(mtm.getOperacionNDF().getMoneda());
			novedad.setPrecio(mtm.getOperacionNDF().getPrecio());
			novedad.setPlazo(mtm.getPlazoRemanente().intValue());
			novedad.setTotalValuado(mtm.getMtm());
			listaNovedadesRD.add(novedad);
			/*
			 * IdOperacion<s:attribute name="IdOperacion" type="s:int"
			 * use="required" /> fecha_proceso<s:attribute name="Fecha"
			 * type="s:dateTime" use="required" />
			 * FechaCargaOperacion<s:attribute name="FechaCargaPrecio"
			 * type="s:dateTime" use="required" /> Moneda<s:attribute
			 * name="MonedaValuacion" type="s:string" /> Precio<s:attribute
			 * name="Precio" type="s:decimal" use="required" />
			 * Plazo<s:attribute name="Plazo" type="s:int" use="required" />
			 * <s:attribute name="TotalValuado" type="s:decimal" use="required"
			 * />
			 * 
			 * <s:attribute name="FechaUltimaValuacion" type="s:dateTime"
			 * use="required" /> <s:attribute name="TasaUtilizada"
			 * type="s:decimal" use="required" /> <s:attribute
			 * name="ValoresNominales" type="s:decimal" use="required" />
			 * <s:attribute name="IdUsuarioCargaSE" type="s:string" />
			 * <s:attribute name="TipoValuacion" type="s:string" />
			 */
		}
		return listaNovedadesRD;
	}

	private static XStream getXStream() {
		XStream xs = new XStream(new DomDriver());
		xs.registerConverter(new DateConverter("dd/MM/yyyy", new String[0]));
		xs.alias(resourceBundle
				.getString("servicios.RecuperoOperacionesNDFAValuarResponse"),
				RecuperoOperacionesNDFAValuarResponse.class);
		xs.alias(resourceBundle.getString("servicios.OperacionNDFAValuarData"),
				OperacionNDFAValuarData.class);
		return xs;
	}

	private static RecuperoOperacionesNDFAValuarResponse operacionesNDFAValuar(
			Date pFechaProceso) {
		XStream xs = getXStream();

		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();
		try {
			/*
			 * TODO easyMock esbResponse =
			 * EasyMock.createMock(ESBResponse.class);
			 * EasyMock.expect(esbResponse.getResult()) .andReturn(
			 * convertStreamToString(Valuaciones.class .getResourceAsStream(
			 * "/rytsa/itau/valuaciones/operacionesNDFAValuar.xml")));
			 * EasyMock.replay(esbResponse); // TODO easyMock
			 */
			client = ESBClientFactory.createInstance(MODO, HOST, PUERTO);
			esbRequest = client
					.createRequest(resourceBundle
							.getString("servicios.RecuperoOperacionesNDFAValuar.nombreServicio")); // nombre
			// del
			// servicio
			esbRequest
					.setParameter(
							resourceBundle
									.getString("servicios.RecuperoOperacionesNDFAValuar.paramFechaProceso"),
							pFechaProceso);
			client.execute(esbRequest, esbResponse);
			String sRta = removerHeaderSoap(esbResponse.getResult());

			salida = (RecuperoOperacionesNDFAValuarResponse) xs.fromXML(sRta);
		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		} finally {
			if (client != null) {
				client.close();
			}
		}

		return salida;
	}

}
