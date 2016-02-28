package ua.org.shaddy.cardsgame.util.events.listeners;

import ua.org.shaddy.cardsgame.util.events.EventType;

public interface OneArgEventListener<T> extends EventListener{
	public void call(EventType event, T arg);
}
