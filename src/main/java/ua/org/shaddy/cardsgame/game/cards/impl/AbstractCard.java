package ua.org.shaddy.cardsgame.game.cards.impl;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.entities.CardScripts;
import ua.org.shaddy.cardsgame.game.cards.entities.Description;
import ua.org.shaddy.cardsgame.game.cards.entities.Image;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;

public abstract class AbstractCard implements Card {
	private String name;
	private Description description;
	private Image image; 
	private CardScripts cardScripts;
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
	public CardCollection<? extends Card> getCollection() {
		return collection;
	}
	@Override
	public void setCollection(CardCollection<? extends Card> collection) {
		this.collection = collection;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public CardScripts getCardScripts() {
		return cardScripts;
	}
	@Override
	public void setCardScripts(CardScripts cardScripts) {
		this.cardScripts = cardScripts;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[name=" + name + ", description=" + description + ", image=" + image + ", cardScripts="
				+ cardScripts + ", collection=" + collection + "]";
	}
	
}
