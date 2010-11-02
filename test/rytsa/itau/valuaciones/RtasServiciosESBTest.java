package rytsa.itau.valuaciones;

import java.io.InputStream;

import junit.framework.TestCase;
import rytsa.itau.valuaciones.dto.FeriadosResponse;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperarAgendaCuponesOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperarOperacionesSWAPAValuarResponse;

import com.thoughtworks.xstream.XStream;

public class RtasServiciosESBTest extends TestCase {

	public void testAgendaCuponOperacioneSWAP() {
		ValuacionesSWAP valuacionesSWAP = new ValuacionesSWAP();

		XStream xs = valuacionesSWAP.getXStreamAgenda();
		InputStream is = RtasServiciosESBTest.class
				.getResourceAsStream("/rytsa/itau/valuaciones/Cupones Swaps.xml");
		RecuperarAgendaCuponesOperacionesSWAPAValuarResponse salida = (RecuperarAgendaCuponesOperacionesSWAPAValuarResponse) xs
				.fromXML(is);
	}

	public void testRecuperoOperacionesNDFAValuar() {
		ValuacionesNDF valuacionesNDF = new ValuacionesNDF();
		XStream xs = valuacionesNDF.getXStream();
		InputStream is = RtasServiciosESBTest.class
				.getResourceAsStream("/rytsa/itau/valuaciones/NDF.xml");
		RecuperoOperacionesNDFAValuarResponse salida = (RecuperoOperacionesNDFAValuarResponse) xs
				.fromXML(is);
	}

	public void testOperacionesSWAP() {
		ValuacionesSWAP valuacionesSWAP = new ValuacionesSWAP();
		XStream xs = valuacionesSWAP.getXStreamOperacionesYFeriados();
		InputStream is = RtasServiciosESBTest.class
				.getResourceAsStream("/rytsa/itau/valuaciones/Swaps.xml");
		RecuperarOperacionesSWAPAValuarResponse salida = (RecuperarOperacionesSWAPAValuarResponse) xs
				.fromXML(is);
	}

	public void testFeriadosSWAP() {
		ValuacionesSWAP valuacionesSWAP = new ValuacionesSWAP();
		XStream xs = valuacionesSWAP.getXStreamOperacionesYFeriados();
		InputStream is = RtasServiciosESBTest.class
				.getResourceAsStream("/rytsa/itau/valuaciones/Feriados.xml");
		FeriadosResponse salida = (FeriadosResponse) xs.fromXML(is);
	}
}
