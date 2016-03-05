package ua.org.shaddy.cardsgame.game.cards.impl;

public class MonsterCard extends DoorCard {
	private int lvl;

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	@Override
	public String toString() {
		return "I'm monster[" + lvl + "]:" + super.toString();
	}
}
