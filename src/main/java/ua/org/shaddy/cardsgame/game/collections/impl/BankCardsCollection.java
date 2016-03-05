package ua.org.shaddy.cardsgame.game.collections.impl;

import java.util.Collections;

import ua.org.shaddy.cardsgame.game.cards.Card;

public abstract class BankCardsCollection<T extends Card> extends AbstractCardsCollection<T>{
	public void shuffle(){
		Collections.shuffle(cardList);
	}
}
