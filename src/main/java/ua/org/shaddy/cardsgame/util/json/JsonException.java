package ua.org.shaddy.cardsgame.util.json;

public class JsonException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6235099266096111775L;

	public JsonException() {
	}

	public JsonException(String message) {
		super(message);
	}

	public JsonException(Throwable cause) {
		super(cause);
	}

	public JsonException(String message, Throwable cause) {
		super(message, cause);
	}

	public JsonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
