package com.weder.java8.lambda.function;

import java.util.function.Function;

public class FunctionIdentityDemo {
	public static void main(String args[]) {
		Function<String, String> function = Function.identity();
		System.out.println(function.apply("Java8"));

		Function<Integer, Integer> function1 = Function.identity();
		System.out.println(function1.apply(1));

		Function<Boolean, Boolean> function2 = Function.identity();
		System.out.println(function2.apply(true));
	}

}
