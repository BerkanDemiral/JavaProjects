package eCommerceSystem.buisness.concretes;
import java.util.List;

import eCommerceSystem.buisness.abstracts.UserService;
import eCommerceSystem.dataAccess.concretes.UserDaoManager;
import eCommerceSystem.entities.concretes.User;

public class UserManager implements UserService {

	UserDaoManager userDaoManager;

	public UserManager(UserDaoManager userDaoManager) {
		this.userDaoManager = userDaoManager;
	}

	@Override
	public void add(User user) {
		if (userValidate(user)) {
			userDaoManager.add(user);
		}
	}

	@Override
	public void update(User user) {
		if (userValidate(user)) {
			userDaoManager.update(user);
		}

	}

	@Override
	public void delete(String userId) {
		userDaoManager.delete(userId);

	}

	@Override
	public User getByEmail(String email) {
		
		return userDaoManager.getByEmail(email);
	}

	@Override
	public List<User> getAll() {
		return userDaoManager.getAll();
	}

	public boolean userValidate(User user) {
		if (user.getFirtName().length() >= 2 && user.getLastName().length() >= 2) {
			return true;
		} else {
			System.out.println("Adýnýz ve soyadýnýz 2 karakterden büyük olmalýdýr. ");
			return false;
		}
	}

}
