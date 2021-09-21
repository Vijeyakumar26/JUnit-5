package com.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		
		
		
		getRequestParam(requestMapObject, "requestMap");
	}
	
	public static <T> String getRequestParam(T object, String prefix)
	{
		List<Object> objectList = new ArrayList<>();
		objectList.addAll(((Map)object).keySet());
		System.out.println(objectList);
		for(Object value: objectList)
		{
			String fieldType = value.getClass().getName();
			System.out.println(fieldType);
			String query = (String)value;
		}
		return prefix;	
	}
}
