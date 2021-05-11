package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.UserDaoService;
import eCommerceSystem.entities.concretes.User;

public class UserDaoManager implements UserDaoService {

	private List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirtName() + " " + user.getLastName() + " kullanýcýsý veritabanýna kaydedildi.");

	}

	@Override
	public void update(User user) {
		User updatesUser;
		for (User user1 : users) {
			if (user1.getId() == user.getId()) {
				updatesUser = user1;
				updatesUser.setFirtName(user.getFirtName());
				updatesUser.setLastName(user.getLastName());
				updatesUser.setEmail(user.getEmail());
				updatesUser.setPassword(user.getPassword());
				
				System.out.println("Kullanýcý güncellendi. : "+ user.getFirtName()+" "+user.getLastName());
			}
		}

	}

	@Override
	public void delete(String userId) {
		User deletedUser;
		for (User user : users) {
			if (user.getId() == Integer.parseInt(userId)) {
				deletedUser = user;
				users.remove(deletedUser);
				
				System.out.println("Kullanýcý silindi.");
			}
		}

	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if (user.getEmail() == email) {
				
				return user;
			}
		}
		return null;

	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
