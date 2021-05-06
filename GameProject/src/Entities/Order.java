package Entities;

import java.util.Date;

public class Order {
	private int id;
	private Date date;
	private int playerId;
	private int productId;
	private int campaignId;
	private double unitPrice;


	public Order(int id_, Date date2, int userId, int productId, int campaignId, double unitPrice) {
		this.id = id_;
		this.date = date2;
		this.playerId = userId;
		this.productId = productId;
		this.campaignId = campaignId;
		this.unitPrice = unitPrice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getCampaignId() {
		return campaignId;
	}


	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


}
