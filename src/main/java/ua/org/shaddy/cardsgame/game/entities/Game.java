package ua.org.shaddy.cardsgame.game.entities;

import java.util.ArrayList;
import java.util.List;

import ua.org.shaddy.cardsgame.game.collections.impl.DeskCardCollection;
import ua.org.shaddy.cardsgame.game.collections.impl.DoorsCardCollection;
import ua.org.shaddy.cardsgame.game.collections.impl.TreasureCardsCollection;

public class Game {
	private final long gameId;
	private List<GamePlayer> playerList = new ArrayList<>();
	private GamePlayer playerTurn;
	private DeskCardCollection deskCards = new DeskCardCollection();
	private DoorsCardCollection dorCards = new DoorsCardCollection();
	private TreasureCardsCollection treasureCards = new TreasureCardsCollection();
	private DoorsCardCollection retainedDorCards = new DoorsCardCollection();
	private TreasureCardsCollection retainedTreasureCards = new TreasureCardsCollection();
	
	public Game(long gameId) {
		super();
		this.gameId = gameId;
	}
	
	public List<GamePlayer> getGamePlayerList() {
		return playerList;
	}

	public GamePlayer getPlayerTurn() {
		return playerTurn;
	}
	public void setPlayerTurn(GamePlayer playerTurn) {
		this.playerTurn = playerTurn;
	}
	public DoorsCardCollection getDorCards() {
		return dorCards;
	}
	public TreasureCardsCollection getTreasureCards() {
		return treasureCards;
	}
	public DoorsCardCollection getRetainedDorCards() {
		return retainedDorCards;
	}
	public TreasureCardsCollection getRetainedTreasureCards() {
		return retainedTreasureCards;
	}
	public DeskCardCollection getDeskCards() {
		return deskCards;
	}
	
	public long getGameId() {
		return gameId;
	}
	@Override
	public int hashCode() {
		return (int) (gameId / 2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (gameId != other.gameId)
			return false;
		return true;
	}
}
