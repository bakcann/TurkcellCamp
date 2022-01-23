package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;


import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService {

	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	public StarbucksCustomerManager() {
		super();
	}
	@Override
	public void save(Customer customer) throws RemoteException {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			super.save(customer);
		}else {
			throw new RemoteException("Kiþi bilgileri hatalý");
		}
		
		
		
	}
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
		return true;
	}

	

}
