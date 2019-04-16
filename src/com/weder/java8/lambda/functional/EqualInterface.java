package com.weder.java8.lambda.functional;

@FunctionalInterface
interface EqualInterface {
	public void method1();

	// Note:Functional Interface can have methods of java.lang.Object

	public boolean equals(Object obj);
}
