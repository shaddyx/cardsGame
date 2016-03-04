package ua.org.shaddy.cardsgame.game.cards.scripts;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.microtools.filetools.FileTools;

public class CardScripts {
	private Card card;
	private String onUse;
	private String onGetBonus;
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public String getOnUse() {
		return onUse;
	}
	public void setOnUse(String onUse) {
		this.onUse = onUse;
	}
	public String getOnGetBonus() {
		return onGetBonus;
	}
	public void setOnGetBonus(String onGetBonus) {
		this.onGetBonus = onGetBonus;
	}
	
	protected String loadCardScript(String name){
		return FileTools.fileGetString(name);
	}
	
	public void loadCardScripts(){
		
	}
}
