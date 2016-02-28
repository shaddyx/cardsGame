package ua.org.shaddy.cardsgame.util.events.listeners;

import ua.org.shaddy.cardsgame.util.events.EventType;

public interface GenericEventListener extends EventListener{
	public void call(EventType event);
}
