package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public  void save(Customer customer) throws RemoteException {
		System.out.println("Müþteri kaydedildi" + customer.getFirstName());
		
	}

}
