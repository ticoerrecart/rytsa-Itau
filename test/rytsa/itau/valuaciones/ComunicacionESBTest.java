package rytsa.itau.valuaciones;

import java.text.SimpleDateFormat;

import junit.framework.TestCase;
import rytsa.itau.valuaciones.dto.SeguridadResponse;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;

import com.thoughtworks.xstream.XStream;

public class ComunicacionESBTest extends TestCase {

	public void xtestOperacionesNDF() {
		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();

		try {
			client = ESBClientFactory.createInstance(4, "esb_desa", 3424);
			esbRequest = client.createRequest("OPERACIONES_NDF_PATRON_LISTADO"); // nombre
																					// del
																					// servicio
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			esbRequest.setParameter("fechaProceso", "18-10-2010");
			client.execute(esbRequest, esbResponse);
			String sRta = esbResponse.getResult();
			System.out.println("exito");

		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
	}

	public void xtestCalcularMTMNdf() throws Exception {
		Test t = new Test(
				"C:\\Documents and Settings\\AM430154\\workspace1\\Itau\\DB");
		t.calcularMTMNdf("18/10/2010");

	}

	public void testCalcularMTMSwap() throws Exception {
		Test t = new Test(
				"C:\\Documents and Settings\\AM430154\\workspace1\\Itau\\DB");
		t.calcularMTMSwap("18/10/2010");

	}
	public void xtestResultadoOperacionesNDF() {
		RecuperoOperacionesNDFAValuarResponse salida = null;
		ESBClient client = null;
		ESBRequest esbRequest = null;
		ESBResponse esbResponse = new ESBResponse();

		try {
			client = ESBClientFactory.createInstance(4, "esb_desa", 3424);
			esbRequest = client.createRequest("WS_SEGURIDAD_PATRON_LOGIN"); 
			esbRequest.setParameter("UserName", "5G6mzLf/vMA");
			esbRequest.setParameter("Password", "iMq121MyrD5thEd4e10CNQ==");
			esbRequest.setParameter("Ip", "1.1.1.1");
			esbRequest.setParameter("IdAplicacion", "2");

			client.execute(esbRequest, esbResponse);
			String sRta = esbResponse.getResult();
			XStream xs = ValuacionesNDF.getXStream();
			SeguridadResponse seg = (SeguridadResponse) xs.fromXML(sRta);
			String idSession = seg.getLoginSesionResponseData().getIdSesion();

			esbRequest = client
					.createRequest("WS_VALUACION_PATRON_MODIFICACION");
			esbRequest.setParameter("IdSesion", idSession);
			esbRequest
					.setParameter(
							"XmlRequest",
							"<InformarNovedadesValuacionesXmlRequest><fechaProceso>2010-10-13</fechaProceso><codFormula>MTMAC</codFormula><RequestData><IdOperacion>36</IdOperacion><MTM>100</MTM><Codigo>MTMAC</Codigo><MonedaValuacion>1</MonedaValuacion><CodUsuario>FOX</CodUsuario><Fecha>2010-10-13</Fecha><Corrida>1</Corrida></RequestData><RequestData><IdOperacion>38</IdOperacion><MTM>200</MTM><Codigo>MTMAC</Codigo><MonedaValuacion>1</MonedaValuacion><CodUsuario>FOX</CodUsuario><Fecha>2010-10-13</Fecha><Corrida>1</Corrida></RequestData></InformarNovedadesValuacionesXmlRequest>");

		} catch (ESBClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
	}

}
