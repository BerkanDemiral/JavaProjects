package Concrete;

import java.util.Date;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Date date, int userId, int productId, int campaignId, double unitPrice) {
		Order order1 =new Order(1,date,userId,productId,campaignId,unitPrice);
		System.out.println("Sipari� Tarihi: "+ order1.getDate() + 
				" Kullan�c�: "+ order1.getPlayerId() +
				" �r�nId: "+ order1.getProductId() + 
				" KampanyaID: "+ order1.getCampaignId() +
				" Sipari� Tutar�: "+order1.getUnitPrice());
		
	}
	

	@Override
	public void update(int orderId, Date date, int userId, int productId, int campaignId, double unitPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int orderId) {
		// TODO Auto-generated method stub

	}

}
