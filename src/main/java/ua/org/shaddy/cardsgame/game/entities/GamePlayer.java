package ua.org.shaddy.cardsgame.game.entities;

import ua.org.shaddy.cardsgame.game.collections.impl.HandCardsCollection;
import ua.org.shaddy.cardsgame.game.collections.impl.TableCardsCollection;

public class GamePlayer {
	private HandCardsCollection handCards = new HandCardsCollection();
	private TableCardsCollection tableCards = new TableCardsCollection();
	private Game game;
	private int lvl;
	private String name;
	
	public HandCardsCollection getHandCards() {
		return handCards;
	}
	public void setHandCards(HandCardsCollection handCards) {
		this.handCards = handCards;
	}
	public TableCardsCollection getTableCards() {
		return tableCards;
	}
	public void setTableCards(TableCardsCollection tableCards) {
		this.tableCards = tableCards;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
