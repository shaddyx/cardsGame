package ua.org.shaddy.cardsgame.game.cards;

import ua.org.shaddy.cardsgame.game.cards.entities.Description;
import ua.org.shaddy.cardsgame.game.cards.entities.Image;
import ua.org.shaddy.cardsgame.game.cards.scripts.CardScripts;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;

public interface Card {
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
	/**
	 * call this event when user uses his card
	 */
	public void use();
	/**
	 * this event returns bonus level, provided by card for current player
	 */
	public float getBonus();
}
