package rytsa.itau.valuaciones;

import java.io.File;
import java.io.FileReader;

import junit.framework.TestCase;
import rytsa.itau.db.factory.ProviderDTO;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.ndf.WSRecuperarOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperarOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.WSRecuperarOperacionesSWAPAValuarResponse;

import com.thoughtworks.xstream.XStream;

public class XStreamTest extends TestCase {

	public void testXS() throws Exception {

		FileReader nuevo = new FileReader(new File(
				"C:\\Desarrollo\\MyEclipse\\WorkspaceRYTSA\\Itau\\test\\rytsa\\itau\\valuaciones\\RecuperarOperacionesNDFAValuar.xml"));
		// ValuacionesSWAP vs = new ValuacionesSWAP();
		XStream xs = ValuacionesNDF.getXStream();
		RecuperoOperacionesNDFAValuarResponse  salida = ProviderDTO.getRecuperoOperacionesNDFAValuarResponse(xs.fromXML(nuevo));
		
		System.out.println("FIN");
	}

	
	public void testXSAgenda() throws Exception {

		FileReader nuevo = new FileReader(new File(
				"C:\\Desarrollo\\MyEclipse\\WorkspaceRYTSA\\Itau\\test\\rytsa\\itau\\valuaciones\\RecuperarAgendaCuponesOperacionesSWAPAValuar.xml"));
		// ValuacionesSWAP vs = new ValuacionesSWAP();
		XStream xs = ValuacionesSWAP.getXStreamAgenda();
		Object o = xs.fromXML(nuevo);
		//Recupero salida = ProviderDTO.getRecuperoOperacionesNDFAValuarResponse(xs.fromXML(nuevo));
		
		System.out.println("FIN");
	}
}
