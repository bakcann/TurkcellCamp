package gameLand.business.abstracts;

import gameLand.entities.concretes.Sale;
import gameLand.entities.concretes.User;

public interface SaleService {
	public void add(Sale sale, User user);
	public void delete(Sale sale);
	public void update(Sale sale);
	
	
	

}
