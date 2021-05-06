package Abstract;

import java.util.Date;

import Entities.Order;

public interface OrderService {
	void add(Date date, int userId, int productId, int campaignId, double unitPrice);
	void update(int orderId, Date date, int userId, int productId, int campaignId, double unitPrice);
	void delete(int orderId);
}
