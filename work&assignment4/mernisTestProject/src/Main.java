import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Berkan");
		customer1.setLastName("Demiral");
		customer1.setBirthDate(new GregorianCalendar(1997, 11, 11).getTime());
		customer1.setIdentityNumber("12345678910");

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(customer1);

	}

}
