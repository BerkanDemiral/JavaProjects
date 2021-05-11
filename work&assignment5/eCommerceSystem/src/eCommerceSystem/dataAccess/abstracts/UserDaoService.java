package eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserDaoService {
	void add(User user);

	void update(User user);

	void delete(String userId);

	User getByEmail(String email);

	List<User> getAll();
}
