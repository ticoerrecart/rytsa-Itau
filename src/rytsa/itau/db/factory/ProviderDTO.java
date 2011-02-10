package rytsa.itau.db.factory;

import rytsa.itau.valuaciones.dto.ndf.RecuperoOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.ndf.WSRecuperarOperacionesNDFAValuarResponse;
import rytsa.itau.valuaciones.dto.swap.RecuperarOperacionesSWAPAValuarResponse;
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
}
