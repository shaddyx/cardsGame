package ua.org.shaddy.cardsgame.game.logic.impl;

import ua.org.shaddy.cardsgame.game.entities.GamePlayer;
import ua.org.shaddy.cardsgame.game.logic.PlayerService;
import ua.org.shaddy.cardsgame.game.logic.PlayerStorage;

public class PlayerServiceImpl implements PlayerService {
	PlayerStorage playerStorage;
	
	@Override
	public GamePlayer getByName(String name) {
		GamePlayer player = playerStorage.getByName(name);
		if (player == null){
			player = new GamePlayer();
			player.setName(name);
			playerStorage.add(player);
		}
		return player;
	}

}
