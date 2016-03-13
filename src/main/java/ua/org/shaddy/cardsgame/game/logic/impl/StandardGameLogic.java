package ua.org.shaddy.cardsgame.game.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.org.shaddy.cardsgame.game.entities.Game;
import ua.org.shaddy.cardsgame.game.entities.Player;
import ua.org.shaddy.cardsgame.game.logic.GameLogic;
import ua.org.shaddy.cardsgame.game.logic.GameUtils;

@Component
public class StandardGameLogic implements GameLogic {
	
	@Autowired
	CardScriptExecutor scriptExecutor;
	@Autowired
	GameUtils gameUtils;
	
	@Override
	public void processTurn(Game game) {
		int playerBonus = getPlayerBonus(game.getPlayerTurn());
		
	}

	private int getPlayerBonus(Player playerTurn) {
		return playerTurn.getLvl() + gameUtils.getCollectionBonus(playerTurn.getHandCards());
	}
	
	
}
