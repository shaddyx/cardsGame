package ua.org.shaddy.cardsgame.game.cards;

import ua.org.shaddy.cardsgame.game.cards.entities.CardScripts;
import ua.org.shaddy.cardsgame.game.cards.entities.Description;
import ua.org.shaddy.cardsgame.game.cards.entities.Image;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;

public interface Card {
	public void setName(String name);
	public String getName();
	public Description getDescription();
	public void setDescription(Description description);
	public Image getImage();
	public void setImage(Image setImage);
	public CardScripts getCardScripts();
	public void setCardScripts(CardScripts cardScripts);
	
	
	/**
	 * returns current card collection
	 * @return
	 */
	public CardCollection<? extends Card> getCollection();
	/**
	 * sets current card collection
	 * @param collection
	 */
	public void setCollection(CardCollection<? extends Card> collection);
}
