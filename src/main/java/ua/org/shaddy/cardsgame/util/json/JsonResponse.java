package ua.org.shaddy.cardsgame.util.json;

public class JsonResponse {
	private final Object error;
	private final Object data;
	private final String hashString;
	private final boolean changed;
		
	public JsonResponse(Object data, Object error, String hashString, boolean changed) {
		super();
		this.error = error;
		this.data = data;
		this.hashString = hashString;
		this.changed = changed;
	}
	public Object getError() {
		return error;
	}
	public Object getData() {
		return data;
	}
	public String getHashString() {
		return hashString;
	}
	public boolean isChanged() {
		return changed;
	}
	@Override
	public String toString() {
		return "JsonResponse [error=" + error + ", data=" + data + ", hashString=" + hashString + ", changed=" + changed
				+ "]";
	}
}
