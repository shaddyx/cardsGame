package ua.org.shaddy.cardsgame.game.logic.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ua.org.shaddy.cardsgame.game.cards.Card;
import ua.org.shaddy.cardsgame.game.cards.util.impl.FileCardLoader;
import ua.org.shaddy.cardsgame.testutil.BasicTestSpringConfig;
import ua.org.shaddy.cardsgame.testutil.TestConstants;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BasicTestSpringConfig.class)
public class CardScriptExecutorTest {
	@Autowired
	CardScriptExecutor cardScriptExecutor;

	@Autowired
	FileCardLoader fileCardLoader;
	@Test
	public void testDoGetBonus() {
		Card card = fileCardLoader.load(TestConstants.TEST_CARD_NAME);
		assertEquals(3, cardScriptExecutor.doGetBonus(card));
	}
}
