package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		// Nero ve Starbuck ayný veritabanýna kaydetme iþlemi yapacaðý için ikisinin de
		// veritabanýna kaydetme kodunu bu fonksiyon saðlayacak.
		System.out.println("Veritabanýna kaydedildi: " + customer.firstName); 
	}

}
