package ua.org.shaddy.cardsgame.game.service.impl;

import ua.org.shaddy.cardsgame.game.entities.Game;
import ua.org.shaddy.cardsgame.game.service.GameService;

public class GameServiceImpl implements GameService{

	@Override
	public Game create() {
		Game game = new Game();
		return game;
	}

}
