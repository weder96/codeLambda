package com.weder.java8.lambda.consumerPredicate;

import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String args[]) {
		Consumer<String> consumer = message -> EmailUtility.sendEmail(message);
		consumer.accept("Your Account has been created");
	}

}
