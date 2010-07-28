package rytsa.itau.valuaciones;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import rytsa.itau.dominio.TasaFWD;
import rytsa.itau.valuaciones.dto.FeriadosResponse;
import rytsa.itau.valuaciones.dto.swap.OperacionSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.RecuperoAgendaCuponesOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperoOperacionesSWAPAValuarResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @author rerrecart
 *
 */
public class Valuaciones {

	private static final int DIAS = 5400;

	private static int modo = 2;

	private static int puerto = 2424;

	private static String host = "localhost";

	/**
	 * Para ello es necesario obtener las operaciones de swaps y los cupones
	 correspondientes de cada SWAP que se obtendrán desde el sistema de Patrón, para
	 este cometido, se desarrollaron 2 Web Services que retornan dicha información en
	 formato XML, para ser consumidos desde cualquier plataforma.
	 Una vez calculadas las valuaciones MTM de cada Swap, se debe ejecutar un Web
	 Service del sistema Patrón que actualizará los precios de cada SWAP necesarios para
	 cerrar el día y el cálculo de la contabilidad.
	 Por último se deberá generar una tabla DBF o se actualizará una tabla SQL con los
	 Cálculos de tasas FWD.

	 *
	 */
	public static void calcularMTMParaSwap() {
		/*ESBClient client = null;
		 ESBRequest esbRequest = null;
		 ESBResponse response = new ESBResponse();
		 try {
		 client = ESBClientFactory.createInstance(modo, host, puerto);
		 esbRequest = client.createRequest("RecuperoOperacionesSWAPAValuar"); //nombre del servicio
		 esbRequest.setParameter("FechaProceso", "23/07/2010");
		 client.execute(esbRequest, response);
		 String sRtaOperaciones = response.getResult();
		 
		 esbRequest = client.createRequest("RecuperoAgendaCuponesOperacionesSWAPAValuar"); //nombre del servicio
		 esbRequest.setParameter("FechaProceso", "23/07/2010");
		 client.execute(esbRequest, response);
		 String sRtaAgendaCuponesOperaciones = response.getResult();

		 esbRequest = client.createRequest("Feriados"); //nombre del servicio
		 esbRequest.setParameter("FechaProceso", "23/07/2010");
		 client.execute(esbRequest, response);
		 String sRtaFeriados = response.getResult();*/

		RecuperoOperacionesSWAPAValuarResponse operacionesSWAP = operacionesSWAP();
		RecuperoAgendaCuponesOperacionesSWAPAValuarResponse agendaSWAP = agendaSWAP();
		FeriadosResponse feriados = feriados();

		construccionTasasFWD(operacionesSWAP, agendaSWAP, feriados);
		calculoMTM();
		/*} catch (ESBClientException e) {
		 e.printStackTrace();
		 } finally {
		 if (client != null) {
		 client.close();
		 }
		 }*/
	}

	private static void calculoMTM() {

	}

	private static FeriadosResponse feriados() {
		XStream xs = new XStream(new DomDriver());
		InputStream is = Valuaciones.class
				.getResourceAsStream("/rytsa/itau/valuaciones/feriados.xml");
		FeriadosResponse fr = (FeriadosResponse) xs.fromXML(is);
		return fr;
	}

	private static RecuperoAgendaCuponesOperacionesSWAPAValuarResponse agendaSWAP() {
		XStream xs = new XStream(new DomDriver());
		/*RecuperoAgendaCuponesOperacionesSWAPAValuarResponse ar = new RecuperoAgendaCuponesOperacionesSWAPAValuarResponse();
		 AgendaCuponOperacioneSWAPAValuarData data = new AgendaCuponOperacioneSWAPAValuarData();
		 ar.addAgendaCuponOperacioneSWAPAValuarData(data);
		 String w = xs.toXML(ar);*/

		InputStream is = Valuaciones.class
				.getResourceAsStream("/rytsa/itau/valuaciones/agendaCuponOperacioneSWAPAValuar.xml");
		RecuperoAgendaCuponesOperacionesSWAPAValuarResponse salida = (RecuperoAgendaCuponesOperacionesSWAPAValuarResponse) xs
				.fromXML(is);
		return salida;
	}

	private static RecuperoOperacionesSWAPAValuarResponse operacionesSWAP() {
		XStream xs = new XStream(new DomDriver());
		xs.alias("RecuperoOperacionesSWAPAValuarResponse",
				RecuperoOperacionesSWAPAValuarResponse.class);
		xs.alias("OperacionSWAPAValuarData", OperacionSWAPAValuarData.class);
		/*xs.addImplicitCollection(RecuperoOperacionesSWAPAValuarResponse.class,
		 "RecuperoOperacionesSWAPAValuarResult");*/
		/*RecuperoOperacionesSWAPAValuarResponse rs = new RecuperoOperacionesSWAPAValuarResponse();
		 OperacionSWAPAValuarData oa = new OperacionSWAPAValuarData();
		 rs.addOperacionSWAPAValuarData(oa);
		 String w = xs.toXML(rs);*/

		InputStream is = Valuaciones.class
				.getResourceAsStream("/rytsa/itau/valuaciones/operacionesSwapAValuar.xml");
		/*xs.addImplicitCollection(OperacionSWAPAValuarData.class,
		 "operaciones");*/
		RecuperoOperacionesSWAPAValuarResponse salida = (RecuperoOperacionesSWAPAValuarResponse) xs
				.fromXML(is);
		return salida;
	}

	public static void construccionTasasFWD(RecuperoOperacionesSWAPAValuarResponse pOperaciones,
			RecuperoAgendaCuponesOperacionesSWAPAValuarResponse pAgenda, FeriadosResponse pFeriados) {
			//llamo un metodo que me devuelve el arreglo con la catidad DIAS no feriados de tasasFWD 
			List<TasaFWD> tasasFwd =	new ArrayList<TasaFWD>(DIAS);
			for (TasaFWD tasaFWD : tasasFwd) {
				
				tasaFWD.calcularFactorDeActualizacion(new Date());
			}
			
	}

	public static void calcularMTMParaNdf() {

	}
}
