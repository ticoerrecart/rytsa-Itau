package rytsa.itau.valuaciones.dto.swap;

import java.util.ArrayList;
import java.util.List;

public class RecuperarOperacionesSWAPAValuarResponse {

	private List<OperacionSWAPAValuarData> Swaps = new ArrayList<OperacionSWAPAValuarData>();

	public void addOperacionSWAPAValuarData(OperacionSWAPAValuarData operacionSWAPAValuarData){
		this.getRecuperoOperacionesSWAPAValuarResult().add(operacionSWAPAValuarData);
	}
	
	public List<OperacionSWAPAValuarData> getRecuperoOperacionesSWAPAValuarResult() {
		return Swaps;
	}

	public void setRecuperoOperacionesSWAPAValuarResult(
			List<OperacionSWAPAValuarData> recuperoOperacionesSWAPAValuarResult) {
		Swaps = recuperoOperacionesSWAPAValuarResult;
	}

}
