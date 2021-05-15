package core.Utility;

import entity.concretes.Game;

public class AddToCart {
	public static void addToCart(Game game) {
		System.out.println("Added to cart: "+ game.getGameTitle());
	}
}
