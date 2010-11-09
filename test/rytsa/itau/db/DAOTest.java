package rytsa.itau.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import junit.framework.TestCase;
import rytsa.itau.db.factory.DatabaseFactory;
import rytsa.itau.utils.DateUtils;

public class DAOTest extends TestCase {

	public DAOTest() {
		DAO.crearCupon4();
		DAO.crearCurvas();
		DAO.crearTipoDeCambio();
		DAO.crearTasasDeBadlar();
	}

	@Override
	protected void setUp() throws Exception {
	}

	public void testObtenerTipoCambioMoneda() throws Exception {

		Double d = DAO.obtenerTipoCambioMoneda(DateUtils.convertDate(DateUtils
				.stringToDate("17/10/2010")), 6);
		//assertEquals(5.530064, d.doubleValue());
		assertEquals(5.519598, d.doubleValue());
		

	}

	public void testObtenerTipoCambioMoneda2() throws Exception {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DatabaseFactory.getConnection();
		ps = conn.prepareStatement("SELECT * FROM Calib_div_h ; ");
		rs = ps.executeQuery();
		while (rs.next()) {
			Date date = rs.getDate("D_PROC");
			Double price = rs.getDouble("PRICE");
			System.out.println(date + " - " + price);
		}
	}

}
