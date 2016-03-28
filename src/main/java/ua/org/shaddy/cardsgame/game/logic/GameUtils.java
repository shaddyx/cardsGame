package ua.org.shaddy.cardsgame.game.logic;

import ua.org.shaddy.cardsgame.game.collections.CardCollection;
import ua.org.shaddy.cardsgame.game.entities.GamePlayer;

public interface GameUtils {
	int getCollectionBonus(CardCollection<?> cardsCollection);
}
