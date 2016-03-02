package ua.org.shaddy.cardsgame.game.collections.events;

import ua.org.shaddy.cardsgame.game.Card;
import ua.org.shaddy.cardsgame.game.CardCollection;

public class CardMovedEvent extends CardCollectionEvent {
	final CardCollection<?> toCollection;
	public CardMovedEvent(CardCollection<?> cardCollection, CardCollection<?> toCollection , Card card) {
		super(cardCollection, card);
		this.toCollection = toCollection;
	}
}
