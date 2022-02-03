package business.concretes;

import java.util.ArrayList;

import business.abstracts.UserService;
import core.exception.BusinessException;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) throws BusinessException  {
		if(lengthPassword(user)&& oldMail(user)&& realMail(user)&&usefulName(user)&& aboutRegistiration(user)) {
			this.userDao.add(user);
		}
	}

	@Override
	public void update(User user) throws BusinessException {
		if(lengthPassword(user)&& oldMail(user)&& realMail(user)&&usefulName(user)) {
			this.userDao.update(user);
		}
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}
	private boolean lengthPassword(User user) throws BusinessException {
		if(user.getPassword().length()>6) {
			return true;
		}else {
			throw new BusinessException("Þifre 6 karakterden az olamaz");
		
		}
	}
	private boolean oldMail(User user) throws BusinessException {
		for(int i=0; i<getAll().size(); i++) {
		if(user.geteMail()==getAll().get(i).geteMail()) {
			throw new BusinessException("Farklý bir mail adresi deneyiniz.");
		}
			}
		return true;
	}
	private boolean realMail(User user) throws BusinessException {
		if(user.geteMail().contains("@")) {
			return true;
		}else {
			throw new BusinessException("Eksik mail bilgisi girdiniz.");
		}
	}
	private boolean usefulName(User user) throws BusinessException {
		if(user.getFirstName().length()>2 && user.getLastName().length()>2) {
			return true;
		}else {
			throw new BusinessException("Ýsim ve soyisim minimum 2 karekterden oluþmalýdýr");
		}
	}
		private boolean aboutRegistiration(User user) throws BusinessException {
			for (User member : userDao.getAll()) {
				if(member.getId()==user.getId()) {
					throw new BusinessException("Kayýt baþarýsýz.");
				}
			}
			return true;
				
				
			}
			
			
		
	
}
