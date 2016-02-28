package ua.org.shaddy.cardsgame.util.events;

import java.util.ArrayList;

import ua.org.shaddy.cardsgame.util.events.listeners.EventListener;
import ua.org.shaddy.cardsgame.util.events.listeners.GenericEventListener;
import ua.org.shaddy.cardsgame.util.events.listeners.OneArgEventListener;

/**
 * represents list of events
 * @author shaddy
 *
 * @param <T>
 */
class EventList<T extends EventListener> extends ArrayList<T>{
	public void call(EventType event, Object arg) {
		call (event, new Object[]{ arg });
	}

	public void call(EventType event, Object[] args) {
		for (T listener : this){
			if (listener instanceof GenericEventListener){
				((GenericEventListener) listener).call(event);
			} else if (listener instanceof OneArgEventListener){
				if (args.length < 1){
					throw new EventListenerException("Error, event: " + event + " must have at least one argument for OneArgEventListener");
				}
				((OneArgEventListener) listener).call(event, args[0]);
			} else {
				throw new EventListenerException("Error, event: " + event + " listener is non standard");
			}
		}
	}	
}
