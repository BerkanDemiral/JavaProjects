package kodlamaio.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{ // interface interfaceti extends eder !!! 
	User findByEmail(String email); // email parametresi vererek kullanıcı döndürür
}
