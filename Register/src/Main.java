import business.abstracts.UserService;
import business.concretes.UserManager;
import business.exception.PasswordException;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;


public class Main {

	public static void main(String[] args) throws PasswordException {
		UserService userService = new UserManager(new HibernateUserDao());
		User user1 = new User(1,"Burak","Gultekýn","burak@gmail.com","12345");
		try {
		userService.add(user1);
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
