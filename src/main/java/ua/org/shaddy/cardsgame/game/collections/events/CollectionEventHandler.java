package ua.org.shaddy.cardsgame.game.collections.events;

import ua.org.shaddy.cardsgame.game.Card;
import ua.org.shaddy.cardsgame.game.CardCollection;

public interface CollectionEventHandler {
	/**
	 * calls when card event fires
	 * @param collection
	 * @param card
	 */
	public void call(CardCollection collection, CardCollectionEvent event, Card card);
}
