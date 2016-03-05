package ua.org.shaddy.cardsgame.game.cards.util;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.entities.CardScripts;

public interface ScriptLoader {

	public CardScripts loadScripts(Card card);

}