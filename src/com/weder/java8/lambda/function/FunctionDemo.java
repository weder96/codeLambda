package com.weder.java8.lambda.function;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String args[]) {
		FunctionDemo demo = new FunctionDemo();
		demo.beforeJava8();
		demo.fromJava8();
	}

	//Without Function Interface Functional
	private void beforeJava8() {
		Integer usd = 10;
		Double inrValue = convertUsdToInr(usd);
		System.out.println("From beforeJava8 " +usd + " USD = " + inrValue + " INR");
	}

	// User defined method, this functionality is common in most of the Java
	// application
	private Double convertUsdToInr(Integer usd) {
		//Single input
		Double inrRate = 100.0;
		return usd * inrRate;
	}

	//With Function Interface Functional
	private void fromJava8() {
		Double inrRate = 100.0;

		// Function<T, R>
		// @param <T> the type of the input to the function
		// @param <R> the type of the result of the function
		Function<Integer, Double> varFunction = usd -> usd * inrRate;

		System.out.println("From fromJava8 " +10 + " USD = " + varFunction.apply(10) + " INR");
	}

}















