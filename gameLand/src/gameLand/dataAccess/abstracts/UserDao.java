package gameLand.dataAccess.abstracts;

import gameLand.entities.concretes.User;

public interface UserDao {
	public void add(User user);
	public void delete(User user);
	public void update(User user);

}
