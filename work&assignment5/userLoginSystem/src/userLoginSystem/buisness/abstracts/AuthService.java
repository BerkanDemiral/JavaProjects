package userLoginSystem.buisness.abstracts;

import userLoginSystem.entities.concretes.LoginDto;
import userLoginSystem.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user, String token);
	boolean userExist(String email);
	void login(LoginDto loginDto);
}
