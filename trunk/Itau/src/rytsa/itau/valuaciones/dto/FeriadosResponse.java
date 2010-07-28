package rytsa.itau.valuaciones.dto;

import java.util.ArrayList;
import java.util.List;

public class FeriadosResponse {

	private List<FechaData> FeriadosResult = new ArrayList<FechaData>();

	public void addFechaData(FechaData fechaData) {
		this.getFeriadosResult().add(fechaData);
	}

	public List<FechaData> getFeriadosResult() {
		return FeriadosResult;
	}

	public void setFeriadosResult(List<FechaData> feriadosResult) {
		FeriadosResult = feriadosResult;
	}
}