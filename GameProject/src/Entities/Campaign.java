package Entities;

import java.util.Date;

public class Campaign {
	private int id;
	private String name;
	private String campeignCode;
	private Product product;
	private String description;
	private double discountPercent;
	private Date campaignStartDate;
	private Date campaignEndDate;
	
	public Campaign(int id, String name, String campeignCode, Product product, String description,
			double discountPercent, Date campaignStartDate, Date campaignEndDate) {
		this.id = id;
		this.name = name;
		this.campeignCode = campeignCode;
		this.product = product;
		this.description = description;
		this.discountPercent = discountPercent;
		this.campaignStartDate = campaignStartDate;
		this.campaignEndDate = campaignEndDate;
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

	public String getCampeignCode() {
		return campeignCode;
	}

	public void setCampeignCode(String campeignCode) {
		this.campeignCode = campeignCode;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public Date getCampaignStartDate() {
		return campaignStartDate;
	}

	public void setCampaignStartDate(Date campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public Date getCampaignEndDate() {
		return campaignEndDate;
	}

	public void setCampaignEndDate(Date campaignEndDate) {
		this.campaignEndDate = campaignEndDate;
	}
	
	
	
	
}
