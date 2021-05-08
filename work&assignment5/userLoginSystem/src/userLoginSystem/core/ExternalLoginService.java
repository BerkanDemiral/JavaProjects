package userLoginSystem.core;

import userLoginSystem.entities.concretes.LoginDto;


// birden �ok hesap ile (facebook, card system vs.) kay�t ve giri� yap�labilir. 
// bu nedenle aray�z isimlendirmesinde "GoogleLoginService" gibi bir isim kullanmaktansa daha ba��ms�z bir isim kullan�p onu implement etmek daha do�ru.

public interface ExternalLoginService {
	void register(String email);
	boolean userExist(String email);
	void Login(LoginDto loginDto); // Entity > Concretes > LoginDto( email, password i�eren s�n�f)
}
