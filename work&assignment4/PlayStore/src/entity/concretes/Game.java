package entity.concretes;

public class Game {
	private int id;
	private String name;
	private double discountPercent;
	private double preDiscountPrice;
	private double totalPrice;
	private String gameTitle;
	private String type;
	private String inWitchStore;

	public Game() {
		super();
	}

	public Game(int id, String name, double preDiscountPrice, String gameTitle,String type,String inWitchStore) {
		super();
		this.id = id;
		this.name = name;
		this.preDiscountPrice = preDiscountPrice;
		this.gameTitle = gameTitle;
		this.type = type;
		this.inWitchStore = inWitchStore;
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


	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public double getPreDiscountPrice() {
		return preDiscountPrice;
	}

	public void setPreDiscountPrice(double preDiscountPrice) {
		this.preDiscountPrice = preDiscountPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInWitchStore() {
		return inWitchStore;
	}

	public void setInWitchStore(String inWitchStore) {
		this.inWitchStore = inWitchStore;
	}
	
	

}
