package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.buisness.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

// dış dünyanın(mobil, web vs..) sistemimizde iletişim kurduğu yerdir.
@RestController
@RequestMapping("/api/products") // kodlama.io/api/products diye bir istekte bulunursak bu çalışacak.
public class ProductsController {

	private ProductService productService; // buisness-api iletişimi yapılması için
	// autoWired sayesinde proje taranıyor ve arkada new'leniyor.

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall") // kodlama.io/api/products/getall diye bir istekte bulunursak bu çalışacak. -- bir şey istediğimiz/aldığımız için (get)
	public DataResult<List<Product>> getAll() {
		return this.productService.getall();
	} 
	@PostMapping("/add") // bir şey gönderdiğimiz için -- post
	public Result add(@RequestBody Product product) { // product sınıfının özelliklerini arkaplanda eşleştirip toplayarak parametre olarak yollamamızı sağlar(@RequestBody)
		return this.productService.add(product);
	}

}
