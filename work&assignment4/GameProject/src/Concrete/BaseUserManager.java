package Concrete;

import Abstract.UserService;
import Entities.Player;
import Entities.User;

public class BaseUserManager implements UserService {

	@Override
	public void add(Player player1) {
		System.out.println(player1.getFirstName() + " " + player1.getLastName() + " sisteme eklendi");

	}


}
