package com.weder.java8.lambda.debugLambda;

public class DebugLambdaExpression {

	public static void main(String args[]) {
		System.out.println("Start Main debug ");
		LambdaIntefaceDebug lambdaDebug = (a, b) -> {
			System.out.println("Inside Lambda Expression Debug ");
			int sum = a + b;
			return sum;
		};

		System.out.println("before calling method: addTwoNumbers ");
		addTwoNumbers(lambdaDebug);
		System.out.println("after calling method: addTwoNumbers ");
		System.out.println("End Main debug");

	}

	//create method for debug Lambda
	private static void addTwoNumbers(LambdaIntefaceDebug debugLambda) {
		System.out.println("Start addTwoNumbers ");
		System.out.println("Sum of two numbers : " + debugLambda.sumOfTwoNumbers(300, 700));
		System.out.println("End addTwoNumbers ");
	}

}