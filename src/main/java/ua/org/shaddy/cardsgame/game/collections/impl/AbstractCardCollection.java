package ua.org.shaddy.cardsgame.game.collections.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.google.common.eventbus.EventBus;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;
import ua.org.shaddy.cardsgame.game.collections.events.CardAddedEvent;
import ua.org.shaddy.cardsgame.game.collections.events.CardCollectionEvent;
import ua.org.shaddy.cardsgame.game.collections.events.CardMovedEvent;

public abstract class AbstractCardCollection<T extends Card> implements CardCollection<T>{
	private static final long serialVersionUID = -3710121034192698540L;
	EventBus eventBus = new EventBus();
	List<T> cardList = new LinkedList<T>();
	public class CardCollectionIterator implements Iterator<T> {
		volatile int counter = 0;
		@Override
		public boolean hasNext() {
			return cardList.size() > counter;
		}

		@Override
		public T next() {
			return cardList.get(counter ++);
		}
	}

	
	public void addListener(Object listener){
		eventBus.register(listener);
	}
	public void removeListener(Object listener){
		eventBus.unregister(listener);
	}
	protected void trigger(CardCollectionEvent event){
		eventBus.post(event);
	}
	
	@Override
	public void add(T card) {
		cardList.add(card);
		trigger(new CardAddedEvent(this, card));
	}
	
	@Override
	public void remove(T card) {
		cardList.remove(card);
	}
	
	@Override
	public boolean contains(T card) {
		return cardList.contains(card);
	}
	
	@Override
	public void moveTo(CardCollection<T> collection, T card) {
		this.remove(card);
		collection.add(card);
		trigger(new CardMovedEvent(this, collection, card));
	}
	
	@Override
	public Iterator<T> iterator() {
		return new CardCollectionIterator();
	}
	
	@Override
	public int size() {
		return cardList.size();
	}
	
	@Override
	public T get(int index) {
		return cardList.get(index);
	}
	
	
}
