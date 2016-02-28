package ua.org.shaddy.cardsgame.util.events;

import java.util.HashMap;
import java.util.Map;

import ua.org.shaddy.cardsgame.util.events.listeners.EventListener;

public class EventProcessor<T extends EventType, L extends EventListener> {
	private Map<T, EventList<L>> events = new HashMap<T,EventList<L>>();
	
	protected EventList<L> getListenerList(T event){
		if (!events.containsKey(event)){
			events.put(event, new EventList<L>());
		}
		return events.get(event);
	}
	
	public void addListener(T event, L listener){
		getListenerList(event).add(listener);
	}
	
	public void removeListener(T event, L listener){
		getListenerList(event).remove(listener);
	}
	
	public void call(T event, Object... args){
		getListenerList(event).call(event, args);			
	}
}
