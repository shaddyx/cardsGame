package ua.org.shaddy.cardsgame.game;

import java.util.Map;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptableObject;
import org.springframework.stereotype.Service;

import ua.org.shaddy.cardsgame.game.entities.JScript;

@Service
public class ScriptUtils {
	private static final Object RESULT_KEY = "result";

	public Object execute(JScript script){
		return execute(script, null);
	}
	
	public Object execute(JScript script, Map<String, Object> params){
		Context context = Context.enter();
		try{
			ScriptableObject scope = context.initStandardObjects();
			if (params != null){
				for (String paramName: params.keySet()){
					ScriptableObject.putProperty(scope, paramName , Context.javaToJS(params.get(paramName), scope));
				}
			}
			context.evaluateString(scope, script.getScript(), script.getName(), 1, null);
			return scope.get(RESULT_KEY); 
		} finally {
			Context.exit();
		}
	}
	
	
}
