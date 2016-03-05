package ua.org.shaddy.cardsgame.game.cards.util.impl;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ua.org.shaddy.cardsgame.testutil.BasicTestSpringConfig;
import ua.org.shaddy.cardsgame.testutil.TestConstants;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BasicTestSpringConfig.class)
public class CardUtilsTest {
	
	@Autowired
	CardUtils cardUtils;
	
	@Test
	public void testGetCardPath() {
		String path = cardUtils.getCardPath(TestConstants.TEST_CARD_NAME);
		File file = new File("testGameData/cards/TestCard");
		assertEquals(file.getAbsolutePath(), path);
	}

}
