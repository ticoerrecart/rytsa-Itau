package rytsa.itau.valuaciones;

import java.util.Date;

import junit.framework.TestCase;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.swap.DisponibilizacionFeriadosXmlRequestData;

public class DisponibilizacionFeriadosXmlRequestDataTest extends TestCase {

	public void testDisponibilizacionFeriadosXmlRequestData() {
		try {
			DisponibilizacionFeriadosXmlRequestData feriadosXml = new DisponibilizacionFeriadosXmlRequestData();
			Date fecha1 = DateUtils.stringToDate("01/1/2010");
			Date fecha2 = new Date();
			feriadosXml.setFechaIni(fecha1);
			feriadosXml.setFechaFin(fecha2);
			feriadosXml.setIdCalendario("1");
			String xml = ValuacionesSWAP.getXStreamOperacionesYFeriados()
					.toXML(feriadosXml);
			assertNotNull(xml);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
}
