package Concrete;

import Abstract.UserCheckService;
import Entities.Player;

public class PlayerCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		return true;
	}

}
