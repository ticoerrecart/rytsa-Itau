package rytsa.itau.valuaciones;

import java.io.InputStream;

import junit.framework.TestCase;
import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperarAgendaCuponesOperacionesSWAPAValuarResponse;

import com.thoughtworks.xstream.XStream;

public class RtasServiciosESBTest extends TestCase {

	public void testAgendaCuponOperacioneSWAP() {
		ValuacionesSWAP valuacionesSWAP = new ValuacionesSWAP();
		/*
		 * Field[] fields = ValuacionesSWAP.class.getDeclaredFields(); for
		 * (Field field : fields) { System.out.println(field.getName()); }
		 */
		XStream xs = valuacionesSWAP.getXStreamOperacionesYFeriados();
		InputStream is = RtasServiciosESBTest.class
				.getResourceAsStream("/rytsa/itau/valuaciones/Cupones.xml");
		RecuperarAgendaCuponesOperacionesSWAPAValuarResponse salida = (RecuperarAgendaCuponesOperacionesSWAPAValuarResponse) xs
				.fromXML(is);
	}

	public void testRecuperoOperacionesNDFAValuar() {
		ValuacionesNDF valuacionesNDF = new ValuacionesNDF();
		XStream xs = valuacionesNDF.getXStream();
		InputStream is = RtasServiciosESBTest.class
				.getResourceAsStream("/rytsa/itau/valuaciones/NDFs.xml");
		RecuperoOperacionesNDFAValuarResponse salida = (RecuperoOperacionesNDFAValuarResponse) xs
				.fromXML(is);
	}

	public void testOperacionesSWAP() {
		ValuacionesSWAP valuacionesSWAP = new ValuacionesSWAP();
		XStream xs = valuacionesSWAP.getXStreamAgenda();
		InputStream is = RtasServiciosESBTest.class
				.getResourceAsStream("/rytsa/itau/valuaciones/Swaps.xml");
		RecuperarAgendaCuponesOperacionesSWAPAValuarResponse salida = (RecuperarAgendaCuponesOperacionesSWAPAValuarResponse) xs
				.fromXML(is);
	}
}
