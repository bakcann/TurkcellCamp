package gameLand.business.concretes;


import gameLand.business.abstracts.UserService;
import gameLand.core.abstracts.MernisService;
import gameLand.dataAccess.abstracts.UserDao;
import gameLand.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private MernisService mernisService;
	

	public UserManager(UserDao userDao, MernisService mernisService) {
		super();
		this.userDao = userDao;
		this.mernisService = mernisService;
	}

	@Override
	public void add(User user)   {
		if(this.mernisService.checkIfRealPerson(user)) {
			this.userDao.add(user);
			
		}else {
			System.out.println("Lütfen geçerli bilgi giriniz.");
		}
		
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

}
