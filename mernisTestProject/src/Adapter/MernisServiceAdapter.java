package Adapter;

import java.time.ZoneId;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNumber()),
					customer.getFirstName(), customer.getLastName(),
					customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		if(result) {
			return(true);
		}
		else {
			return(false);
		}

	}
}
