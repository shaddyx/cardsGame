package ua.org.shaddy.cardsgame.game;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ua.org.shaddy.cardsgame.game.entities.JScript;
import ua.org.shaddy.cardsgame.testutil.BasicTestSpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BasicTestSpringConfig.class)

public class ScriptUtilsTest {

	@Autowired
	ScriptUtils scriptUtils;
	@Test
	public void testExecuteAndResult() {
		Object retValue = scriptUtils.execute(new JScript("var result = 1;", "test.js"));
		assertEquals(1D, retValue);
	}
	@Test
	public void testJavaObject(){
		Object retValue = scriptUtils.execute(new JScript("var result = testObject.getName();", "test.js"), new HashMap<String, Object>(){
			{
				put("testObject", new JScript("123", "345"));
			}
		});
		assertEquals("345", retValue);
	}

}
