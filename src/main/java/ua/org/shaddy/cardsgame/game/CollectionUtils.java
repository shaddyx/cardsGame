package ua.org.shaddy.cardsgame.game;

import org.springframework.stereotype.Component;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;
import ua.org.shaddy.cardsgame.game.exceptions.GameException;

@Component
public class CollectionUtils {
	//
	//	TODO: remove SuppressWarnings
	//
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void moveCard(CardCollection from, CardCollection to, Card card){
		if (!from.contains(card)){
			throw new GameException("Error, no such card in collection:" + card);
		}
		from.remove(card);
		to.add(card);
	}
}
