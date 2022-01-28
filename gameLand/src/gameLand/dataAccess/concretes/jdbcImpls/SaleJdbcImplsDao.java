package gameLand.dataAccess.concretes.jdbcImpls;

import gameLand.dataAccess.abstracts.SaleDao;
import gameLand.entities.concretes.Sale;

public class SaleJdbcImplsDao implements SaleDao{

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId()+"nolu satýþ Jdbc'e eklendi.");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId()+"nolu satýþ Jdbc'den silindi.");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println(sale.getId()+"nolu satýþ Jdbc'de güncellendi.");
		
	}

}
