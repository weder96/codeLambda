package com.weder.java8.lambda.functional;


//@FunctionalInterface
interface MyInterface2 {
	public void method1();

	// A Functional Interface can't have more than 1 abstract method
	// Please uncomment the below code and check the compilation error
	public void method2();
}
