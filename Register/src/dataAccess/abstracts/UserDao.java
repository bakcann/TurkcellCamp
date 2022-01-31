package dataAccess.abstracts;

import java.util.ArrayList;

import core.dataAccess.CrudRepository;
import core.entities.Entity;
import entities.concretes.User;

public interface UserDao extends CrudRepository<User> {
	void add(User user);
	ArrayList<User> getAll();

}
