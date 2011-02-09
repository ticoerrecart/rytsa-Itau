package rytsa.itau.db.factory;

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
}
