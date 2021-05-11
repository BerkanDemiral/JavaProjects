package eCommerceSystem.buisness.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface AuthService {
	void signIn(User user);

	void signUp(User user);

	boolean verify(String email, String code);

	boolean userExist(String email);
	
	boolean passwordValidate(String password);
}
