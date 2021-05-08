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
		// yanlýþ bir kullanýmdýr çünkü entityden baþka bir yapý newlenemez.
		// Spring tarafýnda bu durum çözülecek
		
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		// Product product = new Product(1,1,"Elma",12,50); çalýþmaz çünkü kategori 1
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
