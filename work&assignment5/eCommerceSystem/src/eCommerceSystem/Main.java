package eCommerceSystem;


import eCommerceSystem.buisness.abstracts.AuthService;
import eCommerceSystem.buisness.concretes.AuthManager;
import eCommerceSystem.buisness.concretes.UserManager;
import eCommerceSystem.dataAccess.concretes.UserDaoManager;
import eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Berkan", "Demiral", "berkandemiral@gmail.com", "123456");
		User user2 = new User(2, "Ahmet", "Tekin", "ahmettekin@gmail.com", "123456");
		

		UserDaoManager userDaoManager = new UserDaoManager();
		UserManager userManager = new UserManager(userDaoManager);
		
		AuthService authService = new AuthManager(userManager);
		authService.signUp(user2);
		
		authService.verify(user1.getEmail(), user1.getVerifyCode()); // kullanýcý bulunamadý
		System.out.println("------");
		authService.verify(user2.getEmail(), user2.getVerifyCode()); // onay ;
		System.out.println("------");
		
		authService.passwordValidate(user2.getPassword());
		
		user2.setFirtName("Barýþ");
		userManager.update(user2);
		
		
	}

}
