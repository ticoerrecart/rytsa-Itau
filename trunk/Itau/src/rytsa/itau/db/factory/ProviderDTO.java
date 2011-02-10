package rytsa.itau.db.factory;

import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.ndf.WSRecuperarOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.AgendaCuponOperacioneSWAPAValuarData;
import rytsa.itau.valuaciones.dto.swap.RecuperarAgendaCuponesOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperarOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.WSRecuperarAgendaCuponesOperacionesSWAPAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.WSRecuperarOperacionesSWAPAValuarResponse;

public abstract class ProviderDTO {

	public static RecuperarOperacionesSWAPAValuarResponse getRecuperarOperacionesSWAPAValuarResponse(
			Object o) {
		if (o instanceof RecuperarOperacionesSWAPAValuarResponse) {
			return (RecuperarOperacionesSWAPAValuarResponse) o;
		}
		return ((WSRecuperarOperacionesSWAPAValuarResponse) o)
				.getRecuperarOperacionesSWAPAValuarResponse();
	}
	
	
	public static RecuperoOperacionesNDFAValuarResponse getRecuperoOperacionesNDFAValuarResponse(
			Object o) {
		if (o instanceof RecuperoOperacionesNDFAValuarResponse) {
			return (RecuperoOperacionesNDFAValuarResponse) o;
		}
		return ((WSRecuperarOperacionesNDFAValuarResponse) o)
				.getRecuperarOperacionesNDFAValuarResponse();
	}
	
	public static RecuperarAgendaCuponesOperacionesSWAPAValuarResponse getRecuperarAgendaCuponesOperacionesSWAPAValuarResponse(
			Object o) {
		if (o instanceof RecuperarAgendaCuponesOperacionesSWAPAValuarResponse) {
			return (RecuperarAgendaCuponesOperacionesSWAPAValuarResponse) o;
		}
		return ((WSRecuperarAgendaCuponesOperacionesSWAPAValuarResponse) o)
				.getRecuperarAgendaCuponesOperacionesSWAPAValuarResponse();
	}
}
