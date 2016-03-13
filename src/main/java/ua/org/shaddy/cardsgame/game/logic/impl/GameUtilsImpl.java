package ua.org.shaddy.cardsgame.game.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.collections.CardCollection;
import ua.org.shaddy.cardsgame.game.logic.GameUtils;

@Service
public class GameUtilsImpl implements GameUtils{
	
	@Autowired
	CardScriptExecutor scriptExecutor;
	
	@Override
	public int getCollectionBonus(CardCollection<?> collection){
		int collectionBonusBonus = 0;
		for (Card card: collection){
			collectionBonusBonus += scriptExecutor.doGetBonus(card);
		}
		return collectionBonusBonus;
	}
}
