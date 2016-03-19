package ua.org.shaddy.cardsgame.game.cards.util.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.impl.MonsterCard;
import ua.org.shaddy.cardsgame.testutil.BasicTestSpringConfig;
import ua.org.shaddy.cardsgame.testutil.TestConstants;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BasicTestSpringConfig.class)
public class FileCardLoaderTest {
	
	@Autowired
	FileCardLoader fileCardLoader;
	
	@Test
	public void test() {
		Card card = fileCardLoader.load(TestConstants.TEST_CARD_NAME);
		Card card1 = fileCardLoader.load(TestConstants.TEST_CARD1_NAME);
		Card card2 = fileCardLoader.load(TestConstants.TEST_CARD2_NAME);
		Card card3 = fileCardLoader.load("TestCardToLoad");
		assertEquals(7, ((MonsterCard) card3).getLvl());
	}
}
