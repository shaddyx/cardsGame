package ua.org.shaddy.cardsgame.game.logic;

import ua.org.shaddy.cardsgame.game.entities.Game;

public interface GameStorage extends Iterable<Game>{
	/**
	 * returns game by gameId
	 * @param gameId
	 * @return
	 */
	public Game getById(int gameId);
	/**
	 * adds game to collection
	 * @param game
	 */
	void add(Game game);
	/**
	 * removes game from collectionW
	 * @param game
	 */
	void remove(Game game);
}
