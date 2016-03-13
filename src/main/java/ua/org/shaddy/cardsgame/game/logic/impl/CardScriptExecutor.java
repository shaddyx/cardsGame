package ua.org.shaddy.cardsgame.game.logic.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.org.shaddy.cardsgame.game.ScriptUtils;
import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.exceptions.GameException;

@Service
public class CardScriptExecutor {
	
	private Map<String, Object>getDefaultParams(Card card){
		HashMap<String, Object> result = new HashMap<>();
		return result;
	}
	@Autowired
	ScriptUtils scriptTools;
	public int doGetBonus(Card card){
		Object res = scriptTools.execute(card.getCardScripts().getOnGetBonus(), getDefaultParams(card));
		
		if (res instanceof Double){
			return ((Double)res).intValue();
		}
		throw new GameException("GetBonus script result has wrong type:" + res);
	}
}
