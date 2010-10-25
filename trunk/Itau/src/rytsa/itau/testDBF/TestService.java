package rytsa.itau.testDBF;

import ar.com.itau.esb.client.ESBClient;
import ar.com.itau.esb.client.ESBClientException;
import ar.com.itau.esb.client.ESBClientFactory;
import ar.com.itau.esb.client.ESBRequest;
import ar.com.itau.esb.client.ESBResponse;

public class TestService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		ESBClient client;

		ESBRequest esbRequest;

		ESBResponse response = new ESBResponse();

		
			client = ESBClientFactory.createInstance(4,"esb_int" , Integer.valueOf(3424));
		
		esbRequest = client.createRequest("WS_ESB_FILES"); // nombre del
															// servicio
		esbRequest.setParameter("param1", "valor1");
		esbRequest.setParameter("param2", "valor2");
		esbRequest.setParameter("paramN", "valorN");

		client.execute(esbRequest, response);

		String sRta = response.getResult();
		System.out.println(sRta);
		} catch (ESBClientException e) {
			// TODO Auto-generated catch block
			System.out.println("Error -> " + e.toString());
		}

	}

}
