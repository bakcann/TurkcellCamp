package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User entity) {
		System.out.println(entity.getFirstName() +" "+ entity.getLastName() + " baþarýlý bir þekilde eklendi.");
		users.add(entity);
		
	}

	@Override
	public void update(User entity) {
		for (User user : users) {
			if(user.getId()==entity.getId()) {
				users.set(users.indexOf(user), entity);
				System.out.println(entity.getFirstName() +" "+ entity.getLastName() + " baþarýlý bir þekilde güncellendi.");
			}
			
			
		}
		
	}

	@Override
	public void delete(User entity) {
		System.out.println(entity.getFirstName() +" "+ entity.getLastName() + " baþarýlý bir þekilde silindi.");
		users.remove(entity);
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
