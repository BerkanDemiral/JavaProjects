package Adapter;

import java.time.ZoneId;

import Abstract.UserCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(player.getIdentityNumber()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),
					player.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result) {
			return true;
		} else {
			return false;
		}
	}
}
