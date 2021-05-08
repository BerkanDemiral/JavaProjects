package userLoginSystem.core;

import userLoginSystem.buisness.abstracts.UserService;
import userLoginSystem.entities.concretes.LoginDto;

public class GoogleLoginManagerAdapter implements ExternalLoginService{
	
	private UserService userService;
	
	public GoogleLoginManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public void register(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean userExist(String email) {
		if(userService.get(email) != null) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void Login(LoginDto loginDto) {
		if(loginDto != null && loginDto.getPassword().equals(loginDto.getPassword())) {
			System.out.println("Ba�ar� ile giri� yap�ld�");
		}
		else {
			System.out.println("Kullan�c� ad� veya �ifre hatal�");
		}
		
	} 
	

}
