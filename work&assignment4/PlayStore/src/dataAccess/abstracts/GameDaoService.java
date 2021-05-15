package dataAccess.abstracts;

import java.util.List;

import entity.concretes.Game;

public interface GameDaoService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	Game get(int gameId);		
	List<Game> getAll();
}
