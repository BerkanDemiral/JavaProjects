package Concrete;

import Abstract.UserCheckService;
import Entities.Player;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}
	
}
