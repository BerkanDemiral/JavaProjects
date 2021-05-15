package entity.concretes;

public class Campaign {
	private int id;
	private String campaignCode;
	private double discountPercent;
	
	
	public Campaign() {
		super();
	}

	public Campaign(int id, String campaignCode, double discountPercent) {
		super();
		this.id = id;
		this.campaignCode = campaignCode;
		this.discountPercent = discountPercent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	
	
}
