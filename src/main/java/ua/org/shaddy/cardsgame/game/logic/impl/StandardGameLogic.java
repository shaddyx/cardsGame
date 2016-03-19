package ua.org.shaddy.cardsgame.game.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.org.shaddy.cardsgame.game.entities.Game;
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
		int playerBonus = getPlayerBonus(game);
		int deskBonus = getDeskBonus(game);
		if (playerBonus >= deskBonus){
			upPlayer(game);
		} else {
			killPlayer(game);
		}
	}
	
	private void upPlayer(Game game) {
		game.getPlayerTurn().setLvl(game.getPlayerTurn().getLvl() + 1);
	}

	private void killPlayer(Game game) {
		game.getPlayerTurn().setLvl(game.getPlayerTurn().getLvl() - 1);
	}

	private int getPlayerBonus(Game game) {
		return game.getPlayerTurn().getLvl() + gameUtils.getCollectionBonus(game.getPlayerTurn().getHandCards());
	}
	
	private int getDeskBonus(Game game){
		return gameUtils.getCollectionBonus(game.getDeskCards());
	}
}
