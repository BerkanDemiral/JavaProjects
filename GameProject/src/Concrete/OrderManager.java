package Concrete;

import java.util.Date;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Date date, int userId, int productId, int campaignId, double unitPrice) {
		Order order1 =new Order(1,date,userId,productId,campaignId,unitPrice);
		System.out.println("Sipariþ Tarihi: "+ order1.getDate() + 
				" Kullanýcý: "+ order1.getPlayerId() +
				" ÜrünId: "+ order1.getProductId() + 
				" KampanyaID: "+ order1.getCampaignId() +
				" Sipariþ Tutarý: "+order1.getUnitPrice());
		
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
