package rytsa.itau.valuaciones.dto;

import java.util.ArrayList;
import java.util.List;

public class FeriadosResponse {

	private List<FechaData> ArrayOfDisponibilizacionFeriadosXmlResponseData = new ArrayList<FechaData>();

	public void addFechaData(FechaData fechaData) {
		this.getFeriadosResult().add(fechaData);
	}

	public List<FechaData> getFeriadosResult() {
		return ArrayOfDisponibilizacionFeriadosXmlResponseData;
	}

	public void setFeriadosResult(List<FechaData> feriadosResult) {
		ArrayOfDisponibilizacionFeriadosXmlResponseData = feriadosResult;
	}
}