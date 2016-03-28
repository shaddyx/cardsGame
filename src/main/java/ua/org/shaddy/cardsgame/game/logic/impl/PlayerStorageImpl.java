package ua.org.shaddy.cardsgame.game.logic.impl;

import java.util.HashMap;

import ua.org.shaddy.cardsgame.game.entities.GamePlayer;
import ua.org.shaddy.cardsgame.game.logic.PlayerStorage;

public class PlayerStorageImpl implements PlayerStorage {
	HashMap<String, GamePlayer> playerMap = new HashMap<>(); 
	@Override
	public GamePlayer getByName(String name) {
		return playerMap.get(name);
	}

	@Override
	public void add(GamePlayer player) {
		playerMap.put(player.getName(), player);
	}

}
