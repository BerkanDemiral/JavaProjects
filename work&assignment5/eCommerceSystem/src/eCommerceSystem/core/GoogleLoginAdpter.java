package eCommerceSystem.core;

import eCommerceSystem.googleRegister.GoogleRegisterManager;

public class GoogleLoginAdpter implements GoogleLoginService {

	@Override
	public void loginToStstem(String email) {
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.signUp(email);

	}

}
