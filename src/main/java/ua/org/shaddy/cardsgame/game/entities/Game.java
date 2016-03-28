package ua.org.shaddy.cardsgame.game.entities;

import java.util.ArrayList;
import java.util.List;

import ua.org.shaddy.cardsgame.game.collections.impl.DeskCardCollection;
import ua.org.shaddy.cardsgame.game.collections.impl.DoorsCardCollection;
import ua.org.shaddy.cardsgame.game.collections.impl.TreasureCardsCollection;

public class Game {
	private final long gameId;
	private List<Player> playerList = new ArrayList<>();
	private Player playerTurn;
	private DeskCardCollection deskCards = new DeskCardCollection();
	private DoorsCardCollection dorCards = new DoorsCardCollection();
	private TreasureCardsCollection treasureCards = new TreasureCardsCollection();
	private DoorsCardCollection retainedDorCards = new DoorsCardCollection();
	private TreasureCardsCollection retainedTreasureCards = new TreasureCardsCollection();
	
	public Game(long gameId) {
		super();
		this.gameId = gameId;
	}
	
	public List<Player> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	public Player getPlayerTurn() {
		return playerTurn;
	}
	public void setPlayerTurn(Player playerTurn) {
		this.playerTurn = playerTurn;
	}
	public DoorsCardCollection getDorCards() {
		return dorCards;
	}
	public void setDorCards(DoorsCardCollection dorCards) {
		this.dorCards = dorCards;
	}
	public TreasureCardsCollection getTreasureCards() {
		return treasureCards;
	}
	public void setTreasureCards(TreasureCardsCollection treasureCards) {
		this.treasureCards = treasureCards;
	}
	public DoorsCardCollection getRetainedDorCards() {
		return retainedDorCards;
	}
	public void setRetainedDorCards(DoorsCardCollection retainedDorCards) {
		this.retainedDorCards = retainedDorCards;
	}
	public TreasureCardsCollection getRetainedTreasureCards() {
		return retainedTreasureCards;
	}
	public void setRetainedTreasureCards(TreasureCardsCollection retainedTreasureCards) {
		this.retainedTreasureCards = retainedTreasureCards;
	}
	public DeskCardCollection getDeskCards() {
		return deskCards;
	}
	public void setDeskCards(DeskCardCollection deskCards) {
		this.deskCards = deskCards;
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
