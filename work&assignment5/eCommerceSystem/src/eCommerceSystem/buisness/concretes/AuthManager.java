package eCommerceSystem.buisness.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.buisness.abstracts.AuthService;
import eCommerceSystem.buisness.abstracts.UserService;
import eCommerceSystem.core.utils.Utils;
import eCommerceSystem.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;
	List<User> users = new ArrayList<User>();

	public AuthManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void signIn(User user) {
		List<User> users = userService.getAll();
		for (User user2 : users) {
			if (user2.getEmail().equals(user.getEmail()) && user2.getPassword().equals(user.getPassword())
					&& checkUserForLogin(user)) {
				System.out.println("Baþarýyla Giriþ Yapýldý.");
			} else {
				System.out.println("Lütfen bilgilerini eksiksiz giriniz ve kontrol ediniz. ");
			}
		}

	}

	@Override
	public void signUp(User user) {
		if (Utils.emailValidate(user.getEmail())) {
			userService.add(user);
			int random = (int) Math.floor(Math.random() * 9999);
			String code = user.getFirtName().substring(0, 1) + user.getId() + user.getLastName() + random;
			user.setVerifyCode(code);
			System.out.println("Aktivasyon kodu gönderildi lütfen etkinleþtiriniz.");
			
		} else {
			System.out.println("Lütfen Uygun bir mail adresi girip Kayýt Olmayý deneyiniz.");
		}

	}

	@Override
	public boolean verify(String email, String code) {
		User user = userService.getByEmail(email);
		if (userExist(email) && user.isVerify() == false) {
			if (user.getVerifyCode() == code) {
				user.setVerify(true);
				System.out.println("Hesabýnýz onaylandý.\nName: "+ user.getFirtName()+" "+user.getLastName()+"\nEmail: " +user.getEmail());
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Kullanýcý bulunamadý veya Hesap zaten onaylanmýþ bir hesap");
			return false;
		}

	}

	@Override
	public boolean userExist(String email) {
		User user = userService.getByEmail(email);
		if (user == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean checkUserForLogin(User user) {
		if (user.isVerify() && !user.getEmail().isEmpty() && !user.getPassword().isEmpty()
				&& !user.getFirtName().isEmpty() && !user.getLastName().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		} else {
			System.out.println("Lütfen bilgilerinizi eksiksiz giriniz.");
			return false;
		}
	}

	public boolean passwordValidate(String password) {
		if (password.length() >= 6 && !password.isEmpty()) {
			return true;
		} else {
			System.out.println("Parolanýz 6 karakterden uzun olmalýdýr. ");
			return false;
		}
	}

}
