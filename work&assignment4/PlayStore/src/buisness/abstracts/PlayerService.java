package buisness.abstracts;

import entity.concretes.Game;

public interface PlayerService {
	void buyNewGame(Game game);
	void gameToReturn(Game game);
	void payPrice(Game game);
}
