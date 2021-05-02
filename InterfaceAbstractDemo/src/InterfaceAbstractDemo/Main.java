package InterfaceAbstractDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Sinan", "Kara","62269121896", LocalDate.of(1999, 3, 25));
		customerManager.save(customer);

	}

}
