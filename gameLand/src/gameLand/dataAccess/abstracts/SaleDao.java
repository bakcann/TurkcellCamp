package gameLand.dataAccess.abstracts;

import gameLand.entities.concretes.Sale;

public interface SaleDao {
	public void add(Sale sale);
	public void delete(Sale sale);
	public void update(Sale sale);
	

}
