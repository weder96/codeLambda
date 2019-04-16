package com.weder.java8.lambda.function;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String args[]) {
		FunctionDemo1 demo1 = new FunctionDemo1();
		demo1.beforeJava8();
		demo1.fromJava8();
	}

	//Without Function Functional Interface
	private void beforeJava8() {
		Integer n1 = 12;
		Integer squareOfNumber = calculateSquareOfNumber(n1);
		System.out.println("From withoutFunction - Square of a number is :" + squareOfNumber);
	}

	// User defined method, this functionality is common in most of the Java
	// application
	private Integer calculateSquareOfNumber(Integer n1) {
		return n1 * n1;
	}

	//With Function Functional Interface
	private void fromJava8() {
		// Function<T, R>
		// @param <T> the type of the input to the function
		// @param <R> the type of the result of the function
		Function<Integer, Integer> varFunction = n1 -> n1 * n1;
		System.out.println("From withFunction - Square of a number is :" + varFunction.apply(12));
	}

}
