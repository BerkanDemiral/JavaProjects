package kodlamaio.northwind.buisness.abstracts;



import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user); // kullanıcı ekleme işlemi
	DataResult<User> findByEmail(String email); // get veya find ikisi de kullanılabilir ama tüm projede aynısının kullanılması lazım !!! 
}
