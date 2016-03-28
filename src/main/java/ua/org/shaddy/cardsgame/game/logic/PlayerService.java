package ua.org.shaddy.cardsgame.game.logic;

import ua.org.shaddy.cardsgame.game.entities.GamePlayer;

public interface PlayerService {
	public GamePlayer getByName(String name);
}
