package Abstract;

import java.util.List;

import Entities.Product;

public interface ProductService {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	List<Product> getAll();
}
