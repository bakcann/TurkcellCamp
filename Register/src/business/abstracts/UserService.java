package business.abstracts;

import business.exception.PasswordException;
import entities.concretes.User;

public interface UserService {
	void add(User user) throws PasswordException;

}
