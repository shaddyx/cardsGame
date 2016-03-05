package ua.org.shaddy.cardsgame.game.cards.util.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.impl.AbstractCard;
import ua.org.shaddy.cardsgame.testutil.BasicTestSpringConfig;
import ua.org.shaddy.cardsgame.testutil.TestConstants;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BasicTestSpringConfig.class)
public class FileScriptLoaderImplTest {

	@Autowired
	FileScriptLoaderImpl loader;
	
	@Test
	public void testLoadScripts() {
		Card card = new AbstractCard(){
			
		};
		card.setName(TestConstants.TEST_CARD_NAME);
		card.setCardScripts(loader.loadScripts(card));
		System.out.println(card);
	}

}
