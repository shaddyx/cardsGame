package ua.org.shaddy.cardsgame.game.collections;

import ua.org.shaddy.cardsgame.game.cards.Card;

/**
 * this is an card collection
 * @author shaddy
 *
 * @param <T>
 */
public interface CardCollection<T extends Card> extends Iterable<T>{
	public int size();
	public T get(int index);
	public void add(T card);
	public void remove(T card);
	public boolean contains(T card);
	public void moveTo(CardCollection<T> collection, T card);
}
