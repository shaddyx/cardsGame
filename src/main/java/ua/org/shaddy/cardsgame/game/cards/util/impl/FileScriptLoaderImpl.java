package ua.org.shaddy.cardsgame.game.cards.util.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.entities.CardScripts;
import ua.org.shaddy.cardsgame.game.cards.util.ScriptLoader;
import ua.org.shaddy.microtools.filetools.FileTools;

@Component
public class FileScriptLoaderImpl implements ScriptLoader {
	private static final String SCRIPTS_FOLDER = "scripts";
	@Autowired
	CardUtils cardUtils;
	
	@Override
	public void loadScripts(Card card){
		String folderName = cardUtils.getCardPath(card.getName());
		CardScripts result = new CardScripts();
		result.setOnGetBonus(FileTools.fileGetString(new File(folderName, SCRIPTS_FOLDER + "/getBonus.js").getAbsolutePath()));
		result.setOnUse(FileTools.fileGetString(new File(folderName, SCRIPTS_FOLDER + "/use.js").getAbsolutePath()));
		card.setCardScripts(result);
	}
}
