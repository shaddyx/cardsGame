package ua.org.shaddy.cardsgame.game.collections.events;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;

public class CardAddedEvent extends CardCollectionEvent {
	public CardAddedEvent(CardCollection<?> cardCollection, Card card) {
		super(cardCollection, card);
	}
}
