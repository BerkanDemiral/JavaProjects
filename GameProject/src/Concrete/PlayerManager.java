package Concrete;

import Abstract.UserCheckService;
import Entities.Player;

public class PlayerManager extends BaseUserManager {
	UserCheckService userCheckService;
	
	public PlayerManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	
	public void add(Player player) {
		if (userCheckService.checkIfRealPerson(player)) {
			super.add(player);
		} else {
			System.out.println("Hatalý Kullanýcý");
		}
	}
}
