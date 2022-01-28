package gameLand.dataAccess.concretes.jdbcImpls;

import gameLand.dataAccess.abstracts.UserDao;
import gameLand.entities.concretes.User;

public class UserJdbcImplsDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+"isimli kullan�c� Jdbc'e eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+"isimli kullan�c� Jdbc'den silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+"isimli kullan�c� Jdbc'de g�ncellendi.");
		
	}

}
