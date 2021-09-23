package com.genericmethods;

import java.awt.List;
import java.util.Map;

public class GenericMethod {
	
	
	//Type parameter is the diamond operator<> which specifies the method is generic 
	//return type is followed by the type parameter
	public static <T> String genericMethod(Class<T> returnType, String param) {
		return param;
		
	}
	//here the return type is generic
	public static <T> T genericMethodReturn(Class<T> returnType, String param) {
		return null;
		
	}	
	
	public static void main(String[] args) {
		genericMethod(List.class, "List");
		genericMethodReturn(Map.class, "Map");
	}
}
