package ua.org.shaddy.cardsgame.util.events;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import ua.org.shaddy.cardsgame.util.events.listeners.OneArgEventListener;

public class EventProcessorTest {
	private enum EventTypes implements EventType{
		type1, type2, type3
	}
	@FunctionalInterface
	private interface TheListener extends OneArgEventListener<Integer>{
		
	}
	@Test
	public void test() {
		EventProcessor<EventTypes, TheListener> ep = new EventProcessor<>();
		final AtomicInteger called = new AtomicInteger();
		final AtomicReference<Object> lastValue = new AtomicReference<>();
		ep.addListener(EventTypes.type1, (EventType event, Integer arg) -> {
			lastValue.set(arg);
			called.incrementAndGet();
			called.incrementAndGet();
		});
		
		ep.addListener(EventTypes.type3, (EventType event, Integer arg) -> {
			lastValue.set(arg);
			called.incrementAndGet();
		});
		
		ep.call(null, 1 );
		assertEquals(0, called.get());
		
		ep.call(EventTypes.type1, 1 );
		assertEquals(2, called.get());
		
		ep.call(EventTypes.type2, 1 );
		assertEquals(2, called.get());
		
		ep.call(EventTypes.type3, 1 );
		assertEquals(3, called.get());
		
	}

}
