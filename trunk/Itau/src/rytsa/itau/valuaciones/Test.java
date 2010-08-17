package rytsa.itau.valuaciones;

import java.util.List;

import rytsa.itau.db.DAO;
import rytsa.itau.utils.DateUtils;
import rytsa.itau.valuaciones.dto.ndf.NovedadesValuacionesRequestData;

public class Test {

	public static void main(String[] args) {
		try {
			DAO.crearCupon4();
			DAO.crearCurvas();
			DAO.crearTipoDeCambio();
			DAO.crearTasasDeBadlar();

			List<NovedadesValuacionesRequestData> listaSWAP = ValuacionesSWAP.calcularMTM(DateUtils.stringToDate("02/03/2010"));
			List<NovedadesValuacionesRequestData> listaNDF = ValuacionesNDF.calcularMTM(DateUtils
					.stringToDate("03/06/2010"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}