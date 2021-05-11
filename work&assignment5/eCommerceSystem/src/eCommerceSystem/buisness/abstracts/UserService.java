package eCommerceSystem.buisness.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(String userId);
	User getByEmail(String email);
	List<User> getAll();
}
