import java.util.GregorianCalendar;

import Abstract.CampaignService;
import Abstract.CategoryService;
import Abstract.OrderService;
import Abstract.ProductService;
import Adapter.MernisServiceAdapter;
import Concrete.BaseUserManager;
import Concrete.CampaignManager;
import Concrete.CategoryManager;
import Concrete.OrderManager;
import Concrete.PlayerManager;
import Concrete.ProductManager;
import Entities.Campaign;
import Entities.Category;
import Entities.Player;
import Entities.Product;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("------------ Categories ---------------");
		CategoryService categoryService = new CategoryManager();
		Category category1 = new Category(1, "FPS");
		Category category2 = new Category(2, "Mobil");
		Category category3 = new Category(3, "RPG");
		
		categoryService.add(category3);
		
		System.out.println("\n----------------- Games ------------------");
		
		ProductService productService = new ProductManager();
		Product game1 = new Product(1, "GTA5", "Rockstar Games 2020 güncelleþtirme", 280, 1);
		Product game2 = new Product(1, "PUBG", "Arkadaþlarýnýzla oyunun keyifini çýkarýn", 140, 2);
		
		productService.add(game1);
		
		System.out.println("\n----------------- Players ------------------");
		
		BaseUserManager baseUserManager = new PlayerManager(new MernisServiceAdapter());
		Player player1 = new Player(1, "001", "BERKAN", "DEMÝRAL",  new GregorianCalendar(1997,11,11).getTime(),"12345678901");
		Player player2 = new Player(2, "002", "Ahmet", "Tekin",  new GregorianCalendar(1998,11,11).getTime(),"123456780100");
		
		baseUserManager.add(player1);
		
		System.out.println("\n----------------- Campaign ------------------");
		
		CampaignService campaignService1 = new CampaignManager();
		Campaign campaign1 = new Campaign(1, "Bahar Kampanyasý", 
				"001",game1, "indirimler baþladý", 10,
				new GregorianCalendar(2021,05,03).getTime(),
				new GregorianCalendar(2021,05,15).getTime());
	
		campaignService1.add(campaign1);
		
		System.out.println("\n----------------- Product ------------------");
		
		
		System.out.println("\n----------------- Order ------------------");
		
		OrderService orderService = new OrderManager();
		orderService.add(new GregorianCalendar(2021,05,06).getTime(), 
				player1.getId(), 
				game1.getId(), 
				campaign1.getId(),
				320);
	
	}
	

}
