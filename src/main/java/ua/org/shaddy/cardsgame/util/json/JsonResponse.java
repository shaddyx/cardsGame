package ua.org.shaddy.cardsgame.util.json;

public class JsonResponse {
	private final Object error;
	private final Object data;
	
	
	public JsonResponse(Object data, Object error) {
		super();
		this.data = data;
		this.error = error;
	}
	
	public JsonResponse(Object data) {
		super();
		this.data = data;
		this.error = null;
	}

	public Object getError() {
		return error;
	}
	
	public Object getData() {
		return data;
	}
	
}
