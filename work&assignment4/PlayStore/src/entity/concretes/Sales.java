package entity.concretes;

public class Sales {
	private int id;
	private Game gameName;
	private Player customer;
	private Store storeName;
	private Game salePrice;

	public Sales() {
		super();
	}

	public Sales(int id, Game gameName, Player customer, Store storeName, Game salePrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.customer = customer;
		this.storeName = storeName;
		this.salePrice = salePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Game getGameName() {
		return gameName;
	}

	public void setGameName(Game gameName) {
		this.gameName = gameName;
	}

	public Player getCustomer() {
		return customer;
	}

	public void setCustomer(Player customer) {
		this.customer = customer;
	}

	public Store getStoreName() {
		return storeName;
	}

	public void setStoreName(Store storeName) {
		this.storeName = storeName;
	}

	public Game getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Game salePrice) {
		this.salePrice = salePrice;
	}

}
