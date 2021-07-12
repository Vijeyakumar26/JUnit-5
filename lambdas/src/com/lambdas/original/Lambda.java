package com.lambdas.original;

public class Lambda {
	
	static AddLambda add = (int a,int b) -> a+b;
	public static void main(String[] args) {
		System.out.println(add);
	}
}

interface AddLambda{
	int add1(int x,int y);
}
