package userLoginSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import userLoginSystem.dataAccess.abstracts.UserDao;
import userLoginSystem.entities.concretes.User;

public class UserDaoManager implements UserDao {

	private List<User> userArrayList = new ArrayList<User>();

	public UserDaoManager() {
		super();
		User user1 = new User(1, "Berkan", "Demiral", "berkdandemiral@gmail.com", "123456", true);
		User user2 = new User(2, "Ahmet", "Tekin", "ahmettekin@gmail.com", "123456", true);

		this.userArrayList.add(user1);
		this.userArrayList.add(user2);
	}

	@Override
	public void add(User user) {

		this.userArrayList.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý sisteme eklendi.");
	}

	@Override
	public void update(User user) {
		this.userArrayList.set(this.userArrayList.indexOf(user), user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsýnýn bilgileri güncellendi.");

	}

	@Override
	public void delete(User user) {
		this.userArrayList.remove(this.userArrayList.indexOf(user));
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý sistemden silindi.");
	}

	@Override
	public User get(String email) {
		User user = this.userArrayList.stream().filter(u -> u.getEmail() == email).findFirst().orElse(null);
		return user;
	}

	@Override
	public List<User> getAll() {
		return this.userArrayList.stream().collect(Collectors.toList());
	}

}
