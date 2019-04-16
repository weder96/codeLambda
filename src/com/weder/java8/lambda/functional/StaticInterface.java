package com.weder.java8.lambda.functional;


@FunctionalInterface
interface StaticInterface {
	public void method1();

	// Note:Functional Interface can have static methods

	static public void method2() {
		System.out.println("From method2 ");
	}

	static public void method3() {
		System.out.println("From method3 ");
	}
}

