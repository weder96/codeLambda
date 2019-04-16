package com.weder.java8.lambda.functional;

public class FunctionalInterfaceDemo implements MyInterface, DefaultInterface {

	public static void main(String args[]) {
		FunctionalInterfaceDemo obj = new FunctionalInterfaceDemo();
		obj.method1();
		obj.method2();
		obj.method3();
	}

	@Override
	public void method1() {
		System.out.println("Overriding Method1");

	}

	@Override
	public void method2() {
		System.out.println("Overriding Method2");

	}
}
