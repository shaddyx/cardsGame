package ua.org.shaddy.cardsgame.util.events;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import ua.org.shaddy.cardsgame.util.events.listeners.OneArgEventListener;

public class EventListTest {
	
	@Test
	public void testCall() {
		EventList eventList = new EventList<>();
		final AtomicInteger called = new AtomicInteger();
		final AtomicReference lastValue = new AtomicReference<>();
		eventList.add(new OneArgEventListener(){
			@Override
			public void call(EventType event, Object arg) {
				lastValue.set(arg);
				called.incrementAndGet();
			}
			
		});
		
		eventList.call(null, 1 );
		assertEquals(1, called.get());
		eventList.call(null, new Object[] { 2 });
		assertEquals(2, lastValue.get());
		eventList.call(null, new Object[] { 3 });
		assertEquals(3, lastValue.get());
		eventList.call(null, new Object[] { 4 });
		assertEquals(4, lastValue.get());
		eventList.call(null, new Object[] { 5 });
		assertEquals(5, called.get());
	}

}
