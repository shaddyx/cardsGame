package ua.org.shaddy.cardsgame.util.events.listeners;

import ua.org.shaddy.cardsgame.util.events.EventType;

public interface OneIntegerArgEventListener extends EventListener{
	public void call(EventType event, Integer arg);
}
