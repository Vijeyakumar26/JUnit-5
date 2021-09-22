package com.debug;

public class DebugCalculator {

	public static void main(String[] args) {
		
		int i = 8;
		int j = 10;
		if(i<10)
			i = j-1;
		j = i+1;
		
		int result = add(i, j);
		System.out.println(result);

	}
	
	static int add(int i , int j) {
		return i+j;
	}

}
