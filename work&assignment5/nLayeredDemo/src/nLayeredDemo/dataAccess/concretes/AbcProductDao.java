package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entites.concretes.Product;

public class AbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		// hibernate yerine abc diye bir yapý tercih edilirse yeni kodlar entegre edilebilir. 
		System.out.println(product.getName()+ " Abc ile eklendi");
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
