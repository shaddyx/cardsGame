package ua.org.shaddy.cardsgame.game.cards.entities;

public class CardScripts {
	private String onUse;
	private String onGetBonus;
		
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
	@Override
	public String toString() {
		return "CardScripts [onUse=" + onUse + ", onGetBonus=" + onGetBonus + "]";
	}
	
}
