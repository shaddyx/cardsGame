package ua.org.shaddy.cardsgame.game.cards.entities;

public class Description {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Description [text=" + text + "]";
	}	
}
