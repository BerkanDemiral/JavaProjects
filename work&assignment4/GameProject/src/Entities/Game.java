package Entities;

public class Game extends Product{
	private String gameType;
	private String gameProducerId;
	
	public Game(int id, String name, String descrption, double price, int categoryId, String gameType,
			String gameProducerId) {
		super(id, name, descrption, price, categoryId);
		this.gameType = gameType;
		this.gameProducerId = gameProducerId;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getGameProducerId() {
		return gameProducerId;
	}

	public void setGameProducerId(String gameProducerId) {
		this.gameProducerId = gameProducerId;
	}
	

	
	
}
