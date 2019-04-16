package com.weder.java8.lambda.without;

public class InterfaceImpl implements HelloInterface {
	@Override
	public void displayHello() {
		//create method without lambda
		System.out.println("Hello without Lambda");
	}
}
