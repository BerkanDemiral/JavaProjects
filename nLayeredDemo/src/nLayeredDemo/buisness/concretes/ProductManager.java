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

	@Override // burada iþ kodlarý ve sorgulamalar yazýlýr
	public void add(Product product) {
		if(product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilemiyor");
			return; //Boþ return --> break gibidir, returnu gördüðü anda döner ve aþaðý inmez. 
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün Loglandý(eklendi)"+ product.getName());
		/*
		HibernateProductDao dao = new HibernateProductDao();
		dao.add(product);
		
		böyle yaparsak çalýþýr ama hibernate dýþýnda alternatif bir sistem kullanýlmak istenirse sýkýntý çýkar
		*/
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
