package Concrete;

import Abstract.CategoryService;
import Entities.Category;

public class CategoryManager implements CategoryService {

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " kategorisi oluþturuldu");

	}

	@Override
	public void update(Category category) {
		System.out.println(category.getName() + " kategorisi güncellendi");

	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getName() + " kategorisi slindi");

	}

}
