package InterfaceAbstractDemo;

public class CustomerCheckManager implements CustomerCheckService {
	//Fake Service
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}


}
