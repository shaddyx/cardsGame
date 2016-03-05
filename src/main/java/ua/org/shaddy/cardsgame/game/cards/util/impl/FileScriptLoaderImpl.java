package ua.org.shaddy.cardsgame.game.cards.util.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.org.shaddy.cardsgame.config.Config;
import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.entities.CardScripts;
import ua.org.shaddy.cardsgame.game.cards.util.ScriptLoader;
import ua.org.shaddy.microtools.filetools.FileTools;

@Component
public class FileScriptLoaderImpl implements ScriptLoader {
	@Autowired
	Config config;
	
	@Override
	public CardScripts loadScripts(Card card){
		String folderName = config.getGameDataFolder() + "/" + config.getCardsFolder() + "/" + card.getName() + "/scripts/";
		CardScripts result = new CardScripts();
		result.setOnGetBonus(FileTools.fileGetString(folderName + "getBonus.js"));
		result.setOnUse(FileTools.fileGetString(folderName + "use.js"));
		return result;
	}
}
