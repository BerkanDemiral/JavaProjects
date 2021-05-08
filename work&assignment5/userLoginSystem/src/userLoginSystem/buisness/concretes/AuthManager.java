package userLoginSystem.buisness.concretes;

import userLoginSystem.buisness.abstracts.AuthService;
import userLoginSystem.buisness.abstracts.UserService;
import userLoginSystem.core.utils.Utils;
import userLoginSystem.entities.concretes.LoginDto;
import userLoginSystem.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	public boolean userValidate(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			System.out.println("Kay�t ba�ar�l�");
			return true;
		}
		else {
		System.out.println("Bo� alan b�rakmay�n�z.");
		return false;
		}
	}

	public boolean passwordValidate(String password) {
		if (password.length() >= 6) {
			return true;
		}
		System.out.println("Parolan�z 6 karakterden uzun olmal�d�r. ");
		return false;
	}

	@Override
	public void register(User user) {
		if (userValidate(user) && passwordValidate(user.getPassword()) && userExist(user.getEmail()) == false
				&& Utils.emailValidate(user.getEmail())) {
			userService.add(user);
			System.out.println(user.getFirstName() + " kullan�c�s� sisteme kaydedilmi�tir");
		} else {
			System.out.println("Kay�t ba�ar�s�z.");
		}

	}

	@Override
	public void verify(User user, String token) {
		if (user != null && token.length() > 15) {
			User existUser = userService.get(user.getEmail());
			existUser.setVerify(true);

			//userService.update(existUser);
			System.out.println("Email do�ruland�.");
		} else {
			System.out.println("Email do�rulamas� ba�ar�s�z.");
		}

	}

	@Override
	public boolean userExist(String email) {
		User user = userService.get(email);

		if (user == null) {
			return false;
		} else {
			System.out.println("Email zaten mevcut. = " + email);
			return true;
		}

	}

	@Override
	public void login(LoginDto loginDto) {
		User user = userService.get(loginDto.getEmail());
		
		if(user !=null && user.getPassword().equals(loginDto.getPassword())) {
			System.out.println("Giri� ba�ar�l�.");
		}
		else {
			System.out.println("Kullan�c� ad� veya �ifre hatal�");
		}
	}

}
