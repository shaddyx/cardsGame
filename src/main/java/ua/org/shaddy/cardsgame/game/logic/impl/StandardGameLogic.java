package ua.org.shaddy.cardsgame.game.logic.impl;

import org.springframework.stereotype.Component;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.entities.CardScripts;
import ua.org.shaddy.cardsgame.game.collections.impl.TableCardsCollection;
import ua.org.shaddy.cardsgame.game.entities.Game;
import ua.org.shaddy.cardsgame.game.logic.GameLogic;

@Component
public class StandardGameLogic implements GameLogic {
	
	@Override
	public void processTurn(Game game) {
		TableCardsCollection playersTableCards = game.getPlayerTurn().getTableCards();
		int bonus = game.getPlayerTurn().getLvl();;
		for (Card card: playersTableCards){
			//CardScripts cardScripts = card.getCardScripts(); 
			//bonus += 
		}
	}
	
}
