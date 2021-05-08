package userLoginSystem;

import java.util.List;

import userLoginSystem.buisness.abstracts.AuthService;
import userLoginSystem.buisness.abstracts.UserService;
import userLoginSystem.buisness.concretes.AuthManager;
import userLoginSystem.buisness.concretes.UserManager;
import userLoginSystem.core.GoogleMailManagerAdapter;
import userLoginSystem.dataAccess.abstracts.UserDao;
import userLoginSystem.dataAccess.concretes.UserDaoManager;
import userLoginSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserDao userDao = new UserDaoManager();
		UserService userService = new UserManager(userDao, new GoogleMailManagerAdapter());
		userService.getAll();
		// ----------------------------
		User user3 = new User(3,"Leyla","Mutlu","leylamutlu@gmail.com","123456",true);
		userService.add("leylamutlu@gmail.com");
		
		//----------------------------
		
		AuthService authService = new AuthManager(userService);
		authService.userExist("leylamutlu@gmail.com");
		authService.register(user3);
		
		// ---------------------------
		
		authService.verify(user3, "kod123145454645656");
		

	}

}
