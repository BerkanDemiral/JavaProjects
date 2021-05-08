package userLoginSystem.buisness.concretes;

import java.util.List;

import userLoginSystem.buisness.abstracts.UserService;
import userLoginSystem.core.EmailService;
import userLoginSystem.dataAccess.abstracts.UserDao;
import userLoginSystem.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService emailService;

	public UserManager(UserDao userDao, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}

	public boolean userValidate(User user) {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
			return true;
		} else {
			System.out.println("Adýnýz ve soyadýnýz minimum 2 karakter uzunluðunda olmalýdýr.");
			return false;
		}
	}

	@Override
	public void add(String email) {
		if (!email.isEmpty()) {
			User user = new User();
			user.setEmail(email);
			userDao.add(user);
			emailService.send(email, "Kayýt baþarýlý");
		}

	}

	@Override
	public void add(User user) {
		if (userValidate(user)) {
			userDao.add(user);
			emailService.send(user.getEmail(), "Kayýt baþarýlý");

		}

	}

	@Override
	public void update(User user) {
		if (userValidate(user)) {
			userDao.update(user);
		}

	}

	@Override
	public void delete(User user) {
		userDao.delete(user);

	}

	@Override
	public User get(String email) {
		return userDao.get(email);
	}

	@Override
	public List<User> getAll() {
		for (User user : userDao.getAll()) {
			System.out.println(user.getEmail() + " " + user.getFirstName() + " " + user.getLastName());
		}
		return userDao.getAll();
	}

}
