package gameLand.dataAccess.concretes.hibernateImpls;

import gameLand.dataAccess.abstracts.SaleDao;
import gameLand.entities.concretes.Sale;

public class SaleHibernateImpls implements SaleDao {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId()+ "nolu sat�� Hibernate'e eklendi.");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId()+ "nolu sat�� Hibernate'den silindi.");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println(sale.getId()+ "nolu sat�� Hibernate'de g�ncellendi.");
		
	}

}
