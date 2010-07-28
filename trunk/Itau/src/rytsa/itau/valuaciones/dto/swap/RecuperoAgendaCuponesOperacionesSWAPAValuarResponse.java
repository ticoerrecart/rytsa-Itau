package rytsa.itau.valuaciones.dto.swap;

import java.util.ArrayList;
import java.util.List;

public class RecuperoAgendaCuponesOperacionesSWAPAValuarResponse {

	private List<AgendaCuponOperacioneSWAPAValuarData> RecuperoAgendaCuponesOperacionesSWAPAValuarResult = new ArrayList<AgendaCuponOperacioneSWAPAValuarData>();

	public void addAgendaCuponOperacioneSWAPAValuarData(
			AgendaCuponOperacioneSWAPAValuarData agendaCuponOperacioneSWAPAValuarData) {
		this.getRecuperoAgendaCuponesOperacionesSWAPAValuarResult().add(
				agendaCuponOperacioneSWAPAValuarData);
	}

	public List<AgendaCuponOperacioneSWAPAValuarData> getRecuperoAgendaCuponesOperacionesSWAPAValuarResult() {
		return RecuperoAgendaCuponesOperacionesSWAPAValuarResult;
	}

	public void setRecuperoAgendaCuponesOperacionesSWAPAValuarResult(
			List<AgendaCuponOperacioneSWAPAValuarData> recuperoAgendaCuponesOperacionesSWAPAValuarResult) {
		RecuperoAgendaCuponesOperacionesSWAPAValuarResult = recuperoAgendaCuponesOperacionesSWAPAValuarResult;
	}

}
