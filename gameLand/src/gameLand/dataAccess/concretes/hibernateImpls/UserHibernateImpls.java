package gameLand.dataAccess.concretes.hibernateImpls;

import gameLand.dataAccess.abstracts.UserDao;
import gameLand.entities.concretes.User;

public class UserHibernateImpls implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+ "isimli kullan�c� Hibernate'e eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+ "isimli kullan�c� Hibernate'den silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+ "isimli kullan�c� Hibernate'de g�ncellendi.");
		
	}

}
