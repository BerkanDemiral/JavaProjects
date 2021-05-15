package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.GameDaoService;
import entity.concretes.Game;

public class GameDaoManager implements GameDaoService {

	List<Game> games = new ArrayList<Game>();

	@Override
	public void add(Game game) {
		this.games.add(game);
		System.out.println("New game added: " + game.getGameTitle() + "Price: " + game.getTotalPrice());

	}

	@Override
	public void delete(Game game) {
		this.games.remove(game.getId());
		System.out.println("Deleted this game: " + game.getGameTitle());
	}

	@Override
	public void update(Game game) {
		Game updatesGame;
		for (Game game2 : games) {
			if (game2 == game) {
				updatesGame = game2;
				updatesGame.setGameTitle(game.getGameTitle());
				updatesGame.setInWitchStore(game.getInWitchStore());
				updatesGame.setName(game.getName());
				updatesGame.setType(game.getType());
				updatesGame.setDiscountPercent(game.getDiscountPercent());
				System.out.println("Updates game: " + game.getName());
			}
		}

	}

	@Override
	public Game get(int gameId) {
		for(Game game : games) {
			if(game.getId() == gameId) {
				return game;
			}
			else {
				System.out.println("Not found your searched game :( ");
				
			}
		}
		return null;
	}

	@Override
	public List<Game> getAll() {
		return games;
	}

}
