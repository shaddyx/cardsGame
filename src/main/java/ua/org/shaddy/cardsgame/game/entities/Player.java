package ua.org.shaddy.cardsgame.game.entities;

import ua.org.shaddy.cardsgame.game.collections.impl.HandCardsCollection;
import ua.org.shaddy.cardsgame.game.collections.impl.TableCardsCollection;

public class Player {
	private HandCardsCollection handCards = new HandCardsCollection();
	private TableCardsCollection tableCards = new TableCardsCollection();
	
	public HandCardsCollection getHandCards() {
		return handCards;
	}
	public void setHandCards(HandCardsCollection handCards) {
		this.handCards = handCards;
	}
	
}
