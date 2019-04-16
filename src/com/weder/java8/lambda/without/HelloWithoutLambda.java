package com.weder.java8.lambda.without;

public class HelloWithoutLambda {
	public static void main(String args[]) {
		//instance implmentation for Interface
		HelloInterface helloInterface = new InterfaceImpl();

		//call method interface in call implementation
		helloInterface.displayHello();
	}
}
