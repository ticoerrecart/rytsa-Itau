package rytsa.itau.valuaciones.dto.swap;

import java.util.ArrayList;
import java.util.List;

public class RecuperarAgendaCuponesOperacionesSWAPAValuarResponse {

	private List<AgendaCuponOperacioneSWAPAValuarData> Swaps = new ArrayList<AgendaCuponOperacioneSWAPAValuarData>();

	public void addAgendaCuponOperacioneSWAPAValuarData(
			AgendaCuponOperacioneSWAPAValuarData agendaCuponOperacioneSWAPAValuarData) {
		this.getRecuperoAgendaCuponesOperacionesSWAPAValuarResult().add(
				agendaCuponOperacioneSWAPAValuarData);
	}

	public List<AgendaCuponOperacioneSWAPAValuarData> getRecuperoAgendaCuponesOperacionesSWAPAValuarResult() {
		return Swaps;
	}

	public void setRecuperoAgendaCuponesOperacionesSWAPAValuarResult(
			List<AgendaCuponOperacioneSWAPAValuarData> recuperoAgendaCuponesOperacionesSWAPAValuarResult) {
		Swaps = recuperoAgendaCuponesOperacionesSWAPAValuarResult;
	}

}
