package ua.org.shaddy.cardsgame.game.logic;

import ua.org.shaddy.cardsgame.game.entities.Game;
import ua.org.shaddy.cardsgame.game.entities.Player;

public interface GameService {
	Game create();
	void addPlayerToGame(Game game, Player player);
}
