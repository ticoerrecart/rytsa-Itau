package rytsa.itau.valuaciones.dto.swap;

import java.util.ArrayList;
import java.util.List;

public class RecuperarAgendaCuponesOperacionesSWAPAValuarResponse {

	private List<AgendaCuponOperacioneSWAPAValuarData> RecuperarAgendaCuponesOperacionesSWAPAValuarResult = new ArrayList<AgendaCuponOperacioneSWAPAValuarData>();

	public void addAgendaCuponOperacioneSWAPAValuarData(
			AgendaCuponOperacioneSWAPAValuarData agendaCuponOperacioneSWAPAValuarData) {
		this.getRecuperoAgendaCuponesOperacionesSWAPAValuarResult().add(
				agendaCuponOperacioneSWAPAValuarData);
	}

	public List<AgendaCuponOperacioneSWAPAValuarData> getRecuperoAgendaCuponesOperacionesSWAPAValuarResult() {
		return RecuperarAgendaCuponesOperacionesSWAPAValuarResult;
	}

	public void setRecuperoAgendaCuponesOperacionesSWAPAValuarResult(
			List<AgendaCuponOperacioneSWAPAValuarData> recuperoAgendaCuponesOperacionesSWAPAValuarResult) {
		RecuperarAgendaCuponesOperacionesSWAPAValuarResult = recuperoAgendaCuponesOperacionesSWAPAValuarResult;
	}

}
