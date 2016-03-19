package ua.org.shaddy.cardsgame.game.logic.impl;

import java.util.HashMap;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import ua.org.shaddy.cardsgame.game.entities.Game;
import ua.org.shaddy.cardsgame.game.logic.GameStorage;
@Service
public class GameStorageImpl implements GameStorage {
	final HashMap<Integer, Game> games = new HashMap<>();
	@Override
	public Iterator<Game> iterator() {
		return games.values().iterator();
	}

	@Override
	public Game getById(int gameId) {
		return games.get(gameId);
	}
	@Override
	public void add(Game game){
		games.put(game.getGameId(), game);
	}
	@Override
	public void remove(Game game){
		games.remove(game.getGameId());
	}
}
