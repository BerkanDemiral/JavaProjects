package Entities;

public class Product {
	private int id;
	private String name;
	private String descrption;
	private double price;
	private int categoryId;
	
	public Product(int id, String name, String descrption, double price, int categoryId) {
		this.id = id;
		this.name = name;
		this.descrption = descrption;
		this.price = price;
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
}
