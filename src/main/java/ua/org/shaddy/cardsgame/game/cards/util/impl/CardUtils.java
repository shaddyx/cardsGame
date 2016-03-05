package ua.org.shaddy.cardsgame.game.cards.util.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.org.shaddy.cardsgame.config.Config;

@Component
public class CardUtils {
	@Autowired
	Config config;
	public String getCardPath(String name){
		File file = new File(config.getGameDataFolder(), config.getCardsFolder());
		File outFile = new File(file, name);
		return outFile.getAbsolutePath();
	}
}
