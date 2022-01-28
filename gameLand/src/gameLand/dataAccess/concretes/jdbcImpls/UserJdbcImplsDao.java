package gameLand.dataAccess.concretes.jdbcImpls;

import gameLand.dataAccess.abstracts.UserDao;
import gameLand.entities.concretes.User;

public class UserJdbcImplsDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+"isimli kullanıcı Jdbc'e eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+"isimli kullanıcı Jdbc'den silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+"isimli kullanıcı Jdbc'de güncellendi.");
		
	}

}
