package business.abstracts;

import java.util.ArrayList;

import core.exception.BusinessException;
import entities.concretes.User;

public interface UserService {
	void add(User user) throws BusinessException;
	void update(User user)throws BusinessException;
	void delete(User user);
	ArrayList<User> getAll();
}
