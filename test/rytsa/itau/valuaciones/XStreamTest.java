package rytsa.itau.valuaciones;

import java.io.File;
import java.io.FileReader;

import junit.framework.TestCase;
import rytsa.itau.valuaciones.dto.swap.RecuperarOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.WSRecuperarOperacionesSWAPAValuarResponse;

import com.thoughtworks.xstream.XStream;

public class XStreamTest extends TestCase {

	public void testXS() throws Exception {

		FileReader viejo = new FileReader(new File(
				"C:\\Documents and Settings\\rdiaz\\Mis documentos\\Downloads\\viejo.xml"));
		FileReader nuevo = new FileReader(new File(
				"C:\\Documents and Settings\\rdiaz\\Mis documentos\\Downloads\\borrame.xml"));
		// ValuacionesSWAP vs = new ValuacionesSWAP();
		XStream xs = ValuacionesSWAP.getXStreamOperacionesYFeriados();
		Object o = xs.fromXML(nuevo);
		Object o2 = xs.fromXML(viejo);
		
		RecuperarOperacionesSWAPAValuarResponse salida;
		if (o2 instanceof RecuperarOperacionesSWAPAValuarResponse ){
			salida = (RecuperarOperacionesSWAPAValuarResponse)o2;
		}else {
			salida = ((WSRecuperarOperacionesSWAPAValuarResponse)o2).getRecuperarOperacionesSWAPAValuarResponse();
		}
		
		
		
		System.out.println("FIN");
	}

}
