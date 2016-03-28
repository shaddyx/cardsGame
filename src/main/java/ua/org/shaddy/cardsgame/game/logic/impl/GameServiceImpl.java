package ua.org.shaddy.cardsgame.game.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.org.shaddy.cardsgame.game.entities.Game;
import ua.org.shaddy.cardsgame.game.entities.Player;
import ua.org.shaddy.cardsgame.game.logic.GameService;
import ua.org.shaddy.cardsgame.game.logic.GameStorage;

@Service
public class GameServiceImpl implements GameService{
	
	@Autowired 
	GameStorage gameStorage;
	volatile long lastGameUid = 0;
	@Override
	public Game create() {
		Game game = new Game(lastGameUid ++);
		gameStorage.add(game);
		return game;
	}
	@Override
	public void addPlayerToGame(Game game, Player player) {
		game.getPlayerList().add(player);
		if (game.getPlayerTurn() == null){
			game.setPlayerTurn(player);
		}
	}
	
	@Override
	public Game get(long id) {
			return gameStorage.getById(id);
	}
	
}
