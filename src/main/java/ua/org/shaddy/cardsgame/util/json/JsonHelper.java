package ua.org.shaddy.cardsgame.util.json;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.CollectionType;

@Component
public class JsonHelper {
	@JsonFilter("filter1")  
	private class PropertyFilterMixIn {}  
	    
    ObjectMapper mapper = new ObjectMapper();
    
	private String writeValueAsJson(Object map, String[] fieldsToIgnore){
        try {
        	if (fieldsToIgnore == null){
        		return mapper.writeValueAsString( map );              
        	} else {
        		ObjectMapper mapper = new ObjectMapper();
        		SimpleFilterProvider filters = new SimpleFilterProvider();
        		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.serializeAllExcept(fieldsToIgnore);
        		filters.addFilter("filter1", filter);
        		filters.setDefaultFilter(filter);
        		String res = mapper.writer(filters).writeValueAsString(map);
        		System.out.println("filters:" + filters);
        		System.out.println("res:" + res);
        		return res;
        	}
		} catch (IOException e) {
			throw new JsonException("Error packing json", e);
		}      
	}

    
    public String toJson(Object object) {
    	return toJson(object, null);
    }
    
    public String toJson(Object object, String[] fieldsToIgnore) {
		return writeValueAsJson(object, fieldsToIgnore);
	}
    
    public <T> T fromJson(String jsonString, Class<T> type){
    	ObjectMapper mapper = new ObjectMapper();
    	try {
			return (T) mapper.readValue(jsonString, type);
		} catch (IOException e) {
			throw new JsonException("Error deserializing json", e);
		}
    }

    public <T> List<T> listFromJson(String jsonString, Class<T> type){
    	final CollectionType javaType = 
    		      mapper.getTypeFactory().constructCollectionType(List.class, type);
    	ObjectMapper mapper = new ObjectMapper();
		List<T> resultList;
		try {
			resultList = mapper.readValue(jsonString, javaType);
		} catch (IOException e) {
			throw new JsonException("Error deserializing json", e);
		}
		return resultList;
    }

    public void update(String json, Object obj){
    	try {
			mapper.readerForUpdating(obj).readValue(json);
		} catch (IOException e) {
			throw new JsonException("Error deserializing json", e);
		}
    }
    
    public JsonNode deserializeJsonObject(String string){
    	try {
			return mapper.readTree(string);
		} catch (IOException e) {
			throw new JsonException("Error deserializing json", e);
		}
    }

}