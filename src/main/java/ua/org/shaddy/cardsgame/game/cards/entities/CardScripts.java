package ua.org.shaddy.cardsgame.game.cards.entities;

import ua.org.shaddy.cardsgame.game.entities.JScript;

public class CardScripts {
	private JScript onUse;
	private JScript onGetBonus;
		
	public JScript getOnUse() {
		return onUse;
	}
	public void setOnUse(JScript onUse) {
		this.onUse = onUse;
	}
	public JScript getOnGetBonus() {
		return onGetBonus;
	}
	public void setOnGetBonus(JScript onGetBonus) {
		this.onGetBonus = onGetBonus;
	}
	@Override
	public String toString() {
		return "CardScripts [onUse=" + onUse + ", onGetBonus=" + onGetBonus + "]";
	}
	
}
