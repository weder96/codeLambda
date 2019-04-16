package com.weder.java8.lambda.functional;


@FunctionalInterface
interface DefaultInterface {
	public void method1();

	// Note:Functional Interface can have default methods

	default public void method2() {
		System.out.println("From method2 ");
	}

	default public void method3() {
		System.out.println("From method3 ");
	}
}

