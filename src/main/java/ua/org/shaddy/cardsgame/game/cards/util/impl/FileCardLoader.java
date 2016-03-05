package ua.org.shaddy.cardsgame.game.cards.util.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.util.CardLoader;
import ua.org.shaddy.cardsgame.game.cards.util.ScriptLoader;
import ua.org.shaddy.cardsgame.util.json.JsonHelper;
import ua.org.shaddy.microtools.filetools.FileTools;

@Component
public class FileCardLoader implements CardLoader {
	
	private static final String CARD_JSON_NAME = "card.json";

	@Autowired
	CardUtils cardUtils;
	
	@Autowired
	JsonHelper jsonHelper;
	
	@Autowired
	ScriptLoader scriptLoader;
	
	@Override
	public Card load(String name) {
		String cardData = FileTools.fileGetString(new File(cardUtils.getCardPath(name), CARD_JSON_NAME).getAbsolutePath());
		Card card = jsonHelper.fromJson(cardData, Card.class);
		card.setName(name);
		scriptLoader.loadScripts(card);
		return card;
	}
	
}
