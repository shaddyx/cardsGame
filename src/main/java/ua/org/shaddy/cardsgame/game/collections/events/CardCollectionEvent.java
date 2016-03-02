package ua.org.shaddy.cardsgame.game.collections.events;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;

public abstract class CardCollectionEvent {
	private final Card card;
	private final CardCollection<?> cardCollection;
	
	public CardCollectionEvent(CardCollection<?> cardCollection, Card card) {
		super();
		this.card = card;
		this.cardCollection = cardCollection;
	}

	public CardCollection<?> getCardCollection() {
		return cardCollection;
	}

	public Card getCard() {
		return card;
	}
	
}
