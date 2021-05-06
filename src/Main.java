import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.save(new Customer(1,"Esra","Dere","1111111111111",1993));
		
	}

}
