package rytsa.itau.valuaciones.dto.ndf;

import java.util.ArrayList;
import java.util.List;

public class RecuperoOperacionesNDFAValuarResponse {

	private List<OperacionNDFAValuarData> RecuperoOperacionesNDFAValuarResult = new ArrayList<OperacionNDFAValuarData>();

	public void addOperacionNDFAValuarData(
			OperacionNDFAValuarData pOperacionNDFAValuarData) {
		this.getRecuperoOperacionesNDFAValuarResult().add(
				pOperacionNDFAValuarData);
	}

	public List<OperacionNDFAValuarData> getRecuperoOperacionesNDFAValuarResult() {
		return RecuperoOperacionesNDFAValuarResult;
	}

	public void setRecuperoOperacionesNDFAValuarResult(
			List<OperacionNDFAValuarData> recuperoOperacionesNDFAValuarResult) {
		RecuperoOperacionesNDFAValuarResult = recuperoOperacionesNDFAValuarResult;
	}

}
