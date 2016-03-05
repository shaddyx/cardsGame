package ua.org.shaddy.cardsgame.testutil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import ua.org.shaddy.cardsgame.config.Config;
import ua.org.shaddy.cardsgame.game.GameLogic;
import ua.org.shaddy.cardsgame.util.MappingExceptionResolver;

@ComponentScan(basePackageClasses={GameLogic.class, MappingExceptionResolver.class})
public class BasicTestSpringConfig {
	@Bean
	public Config config(){
		Config config = new Config();
		config.setGameDataFolder("testGameData");
		return config;
	}
	
}
