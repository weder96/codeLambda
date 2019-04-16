package com.weder.java8.lambda.function;

import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FunctionAndThenDemo1 {

	private static final Logger LOGGER = Logger.getLogger(FunctionAndThenDemo1.class.getName());

	public static void main(String [] args) {

		Function<String, String> function1 = s -> s.toUpperCase();
		Function<String, String> function2 = s -> s + " World";

		final String HELLO = "Hello";

		LOGGER.info(Level.INFO + "Output of function1 : {0}" + function1.apply(HELLO));

		LOGGER.info(Level.INFO + "andThen Output : " + function1.andThen(function2).apply(HELLO));

		//The output of the first function will become input to the second function
		LOGGER.info(Level.INFO +"andThen Output 2 : " + function2.andThen(function1).apply(HELLO));

	}

}
