package nLayeredDemo.buisness.concretes;

import java.util.List;

import nLayeredDemo.buisness.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entites.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;


public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override // burada i� kodlar� ve sorgulamalar yaz�l�r
	public void add(Product product) {
		if(product.getCategoryId() == 1) {
			System.out.println("Bu kategoride �r�n kabul edilemiyor");
			return; //Bo� return --> break gibidir, returnu g�rd��� anda d�ner ve a�a�� inmez. 
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n Logland�(eklendi)"+ product.getName());
		/*
		HibernateProductDao dao = new HibernateProductDao();
		dao.add(product);
		
		b�yle yaparsak �al���r ama hibernate d���nda alternatif bir sistem kullan�lmak istenirse s�k�nt� ��kar
		*/
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
