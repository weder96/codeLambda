package com.weder.java8.lambda.consumerPredicate;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String args[]) {
		beforeJava8();
		fromJava8();
	}

	private static void beforeJava8() {
		displayInUpperCase("Java 8");
	}

	private static void displayInUpperCase(String str) {
		System.out.println(str.toLowerCase());
	}

	private static void fromJava8() {
		Consumer<String> consumer = str -> System.out.println(str.toLowerCase());
		consumer.accept("Java 8");

	}

}
