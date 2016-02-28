package ua.org.shaddy.cardsgame.game.collections.impl;

import java.util.ArrayList;

import ua.org.shaddy.cardsgame.game.Card;
import ua.org.shaddy.cardsgame.game.CardCollection;
import ua.org.shaddy.cardsgame.game.collections.events.CardCollectionEvent;
import ua.org.shaddy.cardsgame.game.collections.events.CollectionEventHandler;

public abstract class AbstractCardCollection<T extends Card> extends ArrayList<T> implements CardCollection<T>{
	private static final long serialVersionUID = -3710121034192698540L;

	public void addListener(CardCollectionEvent cardEvent, CollectionEventHandler cardEventHandler){
		
	}
}
