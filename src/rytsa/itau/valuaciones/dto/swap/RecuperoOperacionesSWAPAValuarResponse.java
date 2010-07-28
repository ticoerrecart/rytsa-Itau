package rytsa.itau.valuaciones.dto.swap;

import java.util.ArrayList;
import java.util.List;

public class RecuperoOperacionesSWAPAValuarResponse {

	private List<OperacionSWAPAValuarData> RecuperoOperacionesSWAPAValuarResult = new ArrayList<OperacionSWAPAValuarData>();

	public void addOperacionSWAPAValuarData(OperacionSWAPAValuarData operacionSWAPAValuarData){
		this.getRecuperoOperacionesSWAPAValuarResult().add(operacionSWAPAValuarData);
	}
	
	public List<OperacionSWAPAValuarData> getRecuperoOperacionesSWAPAValuarResult() {
		return RecuperoOperacionesSWAPAValuarResult;
	}

	public void setRecuperoOperacionesSWAPAValuarResult(
			List<OperacionSWAPAValuarData> recuperoOperacionesSWAPAValuarResult) {
		RecuperoOperacionesSWAPAValuarResult = recuperoOperacionesSWAPAValuarResult;
	}

}
