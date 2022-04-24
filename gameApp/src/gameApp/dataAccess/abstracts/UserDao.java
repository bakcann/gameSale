package gameApp.dataAccess.abstracts;

import gameApp.entities.concretes.User;

public interface UserDao {
	public void add(User user);
	public void delete(User user);
	public void update(User user);

}
