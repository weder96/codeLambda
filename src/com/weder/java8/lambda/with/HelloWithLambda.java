package com.weder.java8.lambda.with;

public class HelloWithLambda {
	public static void main(String args[]) {
		//create method lambda para executar displayHello()
		HelloInterface1 helloInterface1 = () -> System.out.println("Hello With Lambda");

		//call displayHello()
		helloInterface1.displayHello();
	}
}
