package nLayeredDemo;

import nLayeredDemo.buisness.abstracts.ProductService;
import nLayeredDemo.buisness.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entites.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		// yanl�� bir kullan�md�r ��nk� entityden ba�ka bir yap� newlenemez.
		// Spring taraf�nda bu durum ��z�lecek
		
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		// Product product = new Product(1,1,"Elma",12,50); �al��maz ��nk� kategori 1
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
