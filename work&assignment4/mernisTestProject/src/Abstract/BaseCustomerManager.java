package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		// Nero ve Starbuck ayn� veritaban�na kaydetme i�lemi yapaca�� i�in ikisinin de
		// veritaban�na kaydetme kodunu bu fonksiyon sa�layacak.
		System.out.println("Veritaban�na kaydedildi: " + customer.firstName); 
	}

}
