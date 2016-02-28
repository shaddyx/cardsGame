package ua.org.shaddy.cardsgame.util.events;

public class EventListenerException extends RuntimeException {
	private static final long serialVersionUID = 6636504301273467034L;

	public EventListenerException() {
		super();
	}

	public EventListenerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EventListenerException(String message, Throwable cause) {
		super(message, cause);
	}

	public EventListenerException(String message) {
		super(message);
	}

	public EventListenerException(Throwable cause) {
		super(cause);
	}

}
