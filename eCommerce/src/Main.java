import java.util.ArrayList;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.exception.BusinessException;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new HibernateUserDao());
		
		User user1 = new User(1,"Burak","Gültekin","gultekinburak@gmail.com","1234567");
		User user2 = new User(2,"Burak","Gültekin","gultekinburak@gmail.co","12345");
		User user3 = new User(3,"Burak","Gültekin","gultekinburakgmail.c","1234567");
		User user4 = new User(4,"Burak","G","gultekinburak@gmail","1234567");
		User user5 = new User(5,"B","Gültekin","gultekinburak@gmail.com","1234567");
		User user6 = new User(1,"Burak","Gültekin","gultekinburak@gmai","1234567");
		ArrayList<User> members= new ArrayList<User>();
		members.add(user1);
		members.add(user2);
		members.add(user3);
		members.add(user4);
		members.add(user5);
		members.add(user6);
		for (User member : members) {
			try {
				userManager.add(member);
			}catch(BusinessException e) {
				System.out.println(e.getMessage());
			}System.out.println("----------------");
			
		}

	}

}
