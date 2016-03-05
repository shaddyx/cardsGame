package ua.org.shaddy.cardsgame.game.entities;

import java.util.ArrayList;
import java.util.List;

import ua.org.shaddy.cardsgame.game.collections.impl.DoorsCardCollection;
import ua.org.shaddy.cardsgame.game.collections.impl.TreasureCardsCollection;

public class Game {
	private List<Player> playerList = new ArrayList<>();
	private Player playerTurn;
	private DoorsCardCollection dorCards = new DoorsCardCollection();
	private TreasureCardsCollection treasureCards = new TreasureCardsCollection();
	private DoorsCardCollection retainedDorCards = new DoorsCardCollection();
	private TreasureCardsCollection retainedTreasureCards = new TreasureCardsCollection();
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
}
