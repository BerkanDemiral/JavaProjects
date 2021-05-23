package kodlamaio.northwind.buisness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getall();
	// List<Product> getAll(); eski hali
	
	Result add(Product product);
}
