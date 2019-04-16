package com.weder.java8.lambda.passingParameterLambda;

public class PassingLambdaExpressionAsParameter {
	public static void main(String args[]) {

		//Passing variable
		String message = "WMS";
		displayMessage(message);

		// Passing Object
		HelloWorld helloWorld = new HelloWorld();
		callHelloWorld(helloWorld);

		//Passing Function/Method
		//method2(method1());

		//Option#1
		addTwoNumbers((a, b) ->  a + b);
		// Lambda enables Functional Programming

		//Option#2
		PassingLambdaAsParamDemo passingLambdaAsParmaDemo = (a, b) -> {
			int sum = a + b;
			return sum;
		};
		addTwoNumbers(passingLambdaAsParmaDemo);
	}

	private static void addTwoNumbers(PassingLambdaAsParamDemo passingLambdaAsParmaDemo) {
		System.out.println("Sum of two numbers : " + passingLambdaAsParmaDemo.sumOfTwoNumbers(200, 200));
	}

	private static void displayMessage(String message) {
		System.out.println(message);
	}
	private static void callHelloWorld(HelloWorld helloWorld) {
		helloWorld.displayHelloWorld();
	}
	private static void method1() {
		System.out.println("Method1");
	}

}
