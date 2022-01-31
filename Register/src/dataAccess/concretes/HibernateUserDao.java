package dataAccess.concretes;

import java.util.ArrayList;


import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{
	ArrayList<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " baþarýlý bir þekilde eklendi.");
		users.add(user);
		
	}
	public ArrayList<User> getAll(){
	return this.users;}

	
	

}
