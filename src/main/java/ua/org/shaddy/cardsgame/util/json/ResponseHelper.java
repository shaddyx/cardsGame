package ua.org.shaddy.cardsgame.util.json;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResponseHelper {
	private static final String EMPTY_CACHED_OBJECT = null;
	private static final Object EMPTY_ERROR_OBJECT = null;
	@Autowired
	JsonHelper jsonHelper;

	public ResponseHelper() {
	
	}
	
	public ResponseHelper(JsonHelper jsonHelper){
		this.jsonHelper = jsonHelper;
	}
	
	public String getHashString(Object object, String error){
		String json = jsonHelper.toJson(object);
		String errorHash;
		if (error != null){
			errorHash = error.hashCode() + ":" + error.length();
		} else {
			errorHash = "nope";
		}
		return json.hashCode() + "_" + json.length() + "_" + errorHash; 
	}
	
	@SuppressWarnings("serial")
    private static List<String> OK_RESP = new ArrayList<String>(){{ add("OK"); }};
        
	private String toJsonAnswer(Object object, String[] fieldsToIgnore) {
		return jsonHelper.toJson(new JsonResponse(object, null, getHashString(object, null), true), fieldsToIgnore);
    }
	
	public JsonResponse toCachedJsonAnswerObject(Object object, String error, String oldHashString) {
		String hashString = getHashString(object, error);
		if (oldHashString != null && oldHashString.equals(hashString)){
			return new JsonResponse(EMPTY_CACHED_OBJECT, EMPTY_ERROR_OBJECT, hashString, false);
		}
		return new JsonResponse(object, error, hashString, true);
    }
	
	public String toCachedJson(Object object, String error, String oldHashString) {
		return toCachedJson(object, error, oldHashString, null);
	}
	
	public String toCachedJson(Object object, String error, String oldHashString, String[] fieldsToIgnore) {
		return jsonHelper.toJson(toCachedJsonAnswerObject(object, error, oldHashString), fieldsToIgnore);
	}

	public String toErrorAnswer(String error) {
		return jsonHelper.toJson(new JsonResponse(null, error, getHashString(null, error), true));
	}
	
	public String toJsonAnswer(Object object) {
		return toJsonAnswer(object, null);
	}
	
    
    public String okJson(){
    	return toJsonAnswer(ok());
    }
    
    public List<String> ok() {
		return OK_RESP;
	}
    

}
