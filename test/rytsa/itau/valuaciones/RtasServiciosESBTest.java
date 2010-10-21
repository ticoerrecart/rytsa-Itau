package rytsa.itau.valuaciones;

import java.io.InputStream;
import java.util.List;

import junit.framework.TestCase;
import rytsa.itau.valuaciones.dto.ndf.OperacionNDFAValuarData;
import rytsa.itau.valuaciones.dto.swap.OperacionSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.RecuperarAgendaCuponesOperacionesSWAPAValuarResponse;

import com.thoughtworks.xstream.XStream;

public class RtasServiciosESBTest extends TestCase {

	public void testAgendaCuponOperacioneSWAP() {
		ValuacionesSWAP valuacionesSWAP = new ValuacionesSWAP();
		/*
		 * Field[] fields = ValuacionesSWAP.class.getDeclaredFields(); for
		 * (Field field : fields) { System.out.println(field.getName()); }
		 */
		XStream xs = valuacionesSWAP.getXStream();
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
		List<OperacionNDFAValuarData> lista = (List<OperacionNDFAValuarData>) xs
				.fromXML(is);
	}

	public void testOperacionesSWAP() {
		ValuacionesSWAP valuacionesSWAP = new ValuacionesSWAP();
		XStream xs = valuacionesSWAP.getXStream();
		InputStream is = RtasServiciosESBTest.class
				.getResourceAsStream("/rytsa/itau/valuaciones/Swaps.xml");
		List<OperacionSWAPAValuarData> lista = (List<OperacionSWAPAValuarData>) xs
				.fromXML(is);
	}
}
