package Concrete;

import Abstract.CategoryService;
import Entities.Category;

public class CategoryManager implements CategoryService {

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " kategorisi olu�turuldu");

	}

	@Override
	public void update(Category category) {
		System.out.println(category.getName() + " kategorisi g�ncellendi");

	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getName() + " kategorisi slindi");

	}

}
