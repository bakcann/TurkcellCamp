package business.concretes;

import business.abstracts.UserService;

import business.exception.PasswordException;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;


public class UserManager implements UserService{
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) throws PasswordException {
		
		
			if(user.getPassword().length()<6) {
				throw new PasswordException("Þifre 6 karakterden az.");
			}
			
			for (User users : userDao.getAll()) {
				if(users!=null) {
					if(users.geteMail()==user.geteMail()) {
						throw new PasswordException("Mail daha önce sisteme kayýt edilmiþ");
					}
				}
				
			}
		
		
	}

}
