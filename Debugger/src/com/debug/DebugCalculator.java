package com.debug;

public class DebugCalculator {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 10;
		i = i+1;
		j = j-1;
		
		int result = add(i, j);
		System.out.println(result);

	}
	
	static int add(int i , int j) {
		return i+j;
	}

}
