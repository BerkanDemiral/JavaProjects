package kodlamaio.northwind.buisness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.buisness.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service // Bu class service görevi görecek demek istedik. 
public class ProductManager implements ProductService {

	// dataAccess tarafındaki ProductDao'ya erişmemiz gerekmekte.
	private ProductDao productDao;
	
	@Autowired // spring arkaplanda buna karşılık gelebilecek (prdouctdao arayüzünün instence'ı) bir şey oluşturur.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
