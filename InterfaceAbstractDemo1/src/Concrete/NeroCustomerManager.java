package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;

import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager implements  CustomerCheckService {
	
	CustomerCheckService customerCheckService;
	public NeroCustomerManager() {
		super();
	}

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer)throws RemoteException {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			super.save(customer);
		}else {
			throw new RemoteException("Kiþi bilgileri hatalý");
		}
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
