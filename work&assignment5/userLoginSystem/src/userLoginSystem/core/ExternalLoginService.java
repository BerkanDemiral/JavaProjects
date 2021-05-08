package userLoginSystem.core;

import userLoginSystem.entities.concretes.LoginDto;


// birden çok hesap ile (facebook, card system vs.) kayýt ve giriþ yapýlabilir. 
// bu nedenle arayüz isimlendirmesinde "GoogleLoginService" gibi bir isim kullanmaktansa daha baðýmsýz bir isim kullanýp onu implement etmek daha doðru.

public interface ExternalLoginService {
	void register(String email);
	boolean userExist(String email);
	void Login(LoginDto loginDto); // Entity > Concretes > LoginDto( email, password içeren sýnýf)
}
