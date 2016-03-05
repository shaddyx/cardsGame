package ua.org.shaddy.cardsgame.game.cards.util.impl;

import javax.smartcardio.Card;

import org.springframework.beans.factory.annotation.Autowired;

import ua.org.shaddy.cardsgame.game.cards.util.CardLoader;
import ua.org.shaddy.microtools.filetools.FileTools;

public class FileCardLoader implements CardLoader {
	
	@Autowired
	CardUtils cardUtils;
	
	@Override
	public Card load(String name) {
		String cardData = FileTools.fileGetString(cardUtils.getCardPath(name));
		return null;
	}

}
