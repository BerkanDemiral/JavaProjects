package nLayeredDemo.buisness.abstracts;

import java.util.List;

import nLayeredDemo.entites.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll(); // birden �ok �r�n hakk�nda i� katman� i�lemi yap�lacak 
}
