package com.lambdas;

public class Greet {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greet greet = new Greet();

		GreetingImplementation greetingImplementation = new GreetingImplementation();//interface Implementation

		Greeting myLambdaExpression = () -> System.out.println("Hwllo World Lambda!");//Lambda 
		
		Greeting innerClassGreeting = new Greeting() {//Anonymous Inner Class
			
			@Override
			public void perform() {
				System.out.println("Hello World Inner Class!");
				
			}
		};
		
		
		greetingImplementation.perform();
		myLambdaExpression.perform();
		
	}


}
