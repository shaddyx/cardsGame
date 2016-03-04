package ua.org.shaddy.cardsgame.game.cards.impl;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.entities.Description;
import ua.org.shaddy.cardsgame.game.cards.entities.Image;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;

public abstract class AbstractCard implements Card {
	private Description description;
	private Image image; 
	private CardCollection<? extends Card> collection;
	@Override
	public Description getDescription() {
		return description;
	}
	@Override
	public void setDescription(Description description) {
		this.description = description;
	}
	@Override
	public Image getImage() {
		return image;
	}
	@Override
	public void setImage(Image image) {
		this.image = image;
	}
	@Override
	public CardCollection getCollection() {
		return collection;
	}
	@Override
	public void setCollection(CardCollection collection) {
		this.collection = collection;
	}

	@Override
	public String toString() {
		return "AbstractCard [description=" + description + ", image=" + image + ", cardCollection=" + collection
				+ "]";
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
	}
	@Override
	public float getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
