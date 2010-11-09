package rytsa.itau.valuaciones;

import junit.framework.TestCase;
import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;

public class ESBTest extends TestCase {

	public void testESB() {
		try {

			ESBClient client;
			ESBRequest esbRequest;
			ESBResponse response = new ESBResponse();
			client = ESBClientFactory.createInstance(4, "10.162.139.11", Integer
					.valueOf(2424));
			esbRequest = client.createRequest("OPERACIONES_NDF_PATRON_LISTADO"); // nombre
			// servicio
			esbRequest.setParameter("fechaProceso", "18/10/2010");
			client.execute(esbRequest, response);

			String sRta = response.getResult();
			System.out.println(sRta);
		} catch (ESBClientException e) {
			// TODO Auto-generated catch block
			System.out.println("Error -> " + e.toString());
		}

	}

}
