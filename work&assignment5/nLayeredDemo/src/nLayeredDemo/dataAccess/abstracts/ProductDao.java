package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entites.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	Product get(int id);
	List<Product> getAll(); 
	// arama iþlemi yapýldýðý zaman ürün döndürecek  
	// arama yapýnca birden çok ürün getirebilir(256 gb ram diye ararsak vs...)
}
