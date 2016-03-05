package ua.org.shaddy.cardsgame.game.cards.util;

import javax.smartcardio.Card;

public interface CardLoader {
	public Card load(String name);
}
