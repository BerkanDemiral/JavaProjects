package Concrete;

import java.util.List;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService{

	@Override
	public void add(Product product) {
		System.out.println(product.getName()+ " ürünü eklendi");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName()+ " ürünü silindi");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName()+ " ürünü güncellendi");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
