package com.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class GenericReturnType {
	public static void main(String[] args) {
		Map<Object, Object> requestMapObject = new HashMap<>();
		requestMapObject.put(true, true);
		requestMapObject.put("String", true);
		requestMapObject.put('A', true);
		requestMapObject.put(1, true);
		requestMapObject.put(5466L, true);
		requestMapObject.put(5466F, true);
		requestMapObject.put(5.46, true);

		String[] requestArray = {"val"};

		getRequestParam(requestMapObject, "requestMap");
		//getRequestParam(requestArray, "requestArray");
	}

	public static <T> String getRequestParam(T object, String prefix){
		String queryParam = "";
		Class<?> className = object.getClass();
		List<Object> objectList = new ArrayList<>();
		boolean isMap = false;
		if(className.isArray()){
			objectList=Arrays.asList(object);
			queryParam = prefix;
		}
		else if(className.getTypeName().toLowerCase(Locale.ROOT).endsWith("list")){
			objectList.add((List)object);
			queryParam = prefix;
		}
		else if(className.getTypeName().toLowerCase(Locale.ROOT).endsWith("map")){
			objectList.addAll(((Map)object).keySet());
			queryParam = prefix;
			isMap= true;
		}
		for(Object value: objectList){
			if(isMap){
				String fieldType = value.getClass().getName().toLowerCase(Locale.ROOT);
				if(fieldType.endsWith("string")||fieldType.endsWith("boolean")||fieldType.endsWith("character")||
						fieldType.endsWith("float")||fieldType.endsWith("integer")||fieldType.endsWith("int")||
						fieldType.endsWith("double")||fieldType.endsWith("long"))
				{
					queryParam += (String)value +"="+((Map)object).get(value);
				}

			}
			else{
				String fieldType = value.getClass().getName().toLowerCase(Locale.ROOT);
				if(fieldType.endsWith("string")||fieldType.endsWith("boolean")||fieldType.endsWith("character")||
						fieldType.endsWith("float")||fieldType.endsWith("integer")||fieldType.endsWith("int")||
						fieldType.endsWith("double")||fieldType.endsWith("long")) {
					queryParam += (String)value ;
				}
			}
		}
		return queryParam;	
	}
}