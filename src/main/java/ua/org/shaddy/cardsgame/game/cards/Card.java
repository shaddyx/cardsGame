package ua.org.shaddy.cardsgame.game.cards;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import ua.org.shaddy.cardsgame.game.cards.entities.CardScripts;
import ua.org.shaddy.cardsgame.game.cards.entities.Description;
import ua.org.shaddy.cardsgame.game.cards.entities.Image;
import ua.org.shaddy.cardsgame.game.cards.impl.DoorCard;
import ua.org.shaddy.cardsgame.game.cards.impl.MonsterCard;
import ua.org.shaddy.cardsgame.game.cards.impl.ThingCard;
import ua.org.shaddy.cardsgame.game.cards.impl.TreasureCard;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;
@JsonTypeInfo(  
	    use = JsonTypeInfo.Id.NAME,  
	    include = JsonTypeInfo.As.PROPERTY,  
	    property = "type")  
@JsonSubTypes({
	@Type(value = ThingCard.class, name = "thing"),
	@Type(value = TreasureCard.class, name = "treasure"),
    @Type(value = DoorCard.class, name = "door"),
    @Type(value = MonsterCard.class, name = "monster"),
}) 
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
