package nLayeredDemo.buisness.abstracts;

import java.util.List;

import nLayeredDemo.entites.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll(); // birden çok ürün hakkýnda iþ katmaný iþlemi yapýlacak 
}
