package ua.org.shaddy.cardsgame.testutil;

import ua.org.shaddy.cardsgame.game.cards.entities.Description;
import ua.org.shaddy.cardsgame.game.cards.entities.Image;
import ua.org.shaddy.cardsgame.game.cards.impl.TreasureCard;

public class TestBuilders {
	public static Description genDescription(){
		Description description = new Description();
		description.setText(Generators.genNewDescription());
		return description; 
	}
	
	public static Image genImage(){
		Image img = new Image();
		img.setUrl(Generators.genNewString());
		return img;
	}
	
	public static TreasureCard createTreasureCard(){
		TreasureCard card = new TreasureCard();
		card.setName(Generators.genNewName());
		card.setDescription(genDescription());
		card.setImage(genImage());
		return card;
	}
}
