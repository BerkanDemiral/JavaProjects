package userLoginSystem.buisness.abstracts;

import java.util.List;

import userLoginSystem.entities.concretes.User;

public interface UserService {
	void add(String email);
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(String email);
	List<User> getAll();
}
