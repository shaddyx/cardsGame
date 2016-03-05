package ua.org.shaddy.cardsgame.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ua.org.shaddy.cardsgame.game.cards.impl.TreasureCard;
import ua.org.shaddy.cardsgame.game.collections.impl.RetainedTreasureCardsCollection;
import ua.org.shaddy.cardsgame.game.collections.impl.TreasureCardsCollection;
import ua.org.shaddy.cardsgame.testutil.BasicTestSpringConfig;
import ua.org.shaddy.cardsgame.testutil.TestBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BasicTestSpringConfig.class)
public class CollectionUtilsTest {

	@Autowired
	CollectionUtils collectionUtils;
	
	@Test
	public void testMoveCard() {
		TreasureCardsCollection collection1 = new TreasureCardsCollection();
		RetainedTreasureCardsCollection collection2 = new RetainedTreasureCardsCollection();
		TreasureCard testCard = TestBuilders.createTreasureCard();
		collection1.add(TestBuilders.createTreasureCard());
		collection1.add(TestBuilders.createTreasureCard());
		collection1.add(testCard);
		collection1.add(TestBuilders.createTreasureCard());
		collection1.add(TestBuilders.createTreasureCard());
		collection1.add(TestBuilders.createTreasureCard());
		assertEquals(6, collection1.size());
		assertEquals(0, collection2.size());
		collectionUtils.moveCard(collection1, collection2, testCard);
		assertEquals(5, collection1.size());
		assertEquals(1, collection2.size());
		collection2.add(TestBuilders.createTreasureCard());
		assertEquals(2, collection2.size());
		
	}

}
