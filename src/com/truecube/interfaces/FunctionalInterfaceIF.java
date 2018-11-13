package com.truecube.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceIF {

	public void doSomething(String stuff);
	
	public default void defaultMethod(String details) {
		System.out.println("Details from defaultMethod: " + details);
	}
}
