package ua.org.shaddy.cardsgame.game.logic;

import ua.org.shaddy.cardsgame.game.entities.GamePlayer;

public interface PlayerStorage {
	GamePlayer getByName(String name);
	void add(GamePlayer player);
}
