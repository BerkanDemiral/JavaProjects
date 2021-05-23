package kodlamaio.northwind.buisness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.buisness.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>> getall() { // altta if-else koşulları ile hem succes hem da errordataresult kullanılabilir
												// ikisinin de base sınıfı DataResult olduğu için fonksiyon tipi olarak onu kullandık. 
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi"); // data olmadığı için datasız constuctor kullandık. 
	}

}
