package gameLand.core.concretes;

import java.rmi.RemoteException;

import gameLand.core.abstracts.MernisService;
import gameLand.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements MernisService{

	@Override
	public boolean checkIfRealPerson(User user)   {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNumber()),user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),user.getYearOfBirth()); 
				
			
			} catch (NumberFormatException  | RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
		}
	}

