package ua.org.shaddy.cardsgame.game.cards;

import ua.org.shaddy.cardsgame.game.collections.CardCollection;

public interface Card {
	public String getDescription();
	public String getImage();
	public CardCollection getCollection();
	public void setColleciton(CardCollection collection);
}
