package ua.org.shaddy.cardsgame.testutil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import ua.org.shaddy.cardsgame.config.Config;
import ua.org.shaddy.cardsgame.game.GameBaseClass;
import ua.org.shaddy.cardsgame.util.MappingExceptionResolver;

@ComponentScan(basePackageClasses={GameBaseClass.class, MappingExceptionResolver.class})
public class BasicTestSpringConfig {
	@Bean
	public Config config(){
		Config config = new Config();
		config.setGameDataFolder("testGameData");
		return config;
	}
	
}
