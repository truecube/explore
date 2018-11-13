package com.truecube.interfaces;

public interface FunctionalInterfaceIF2 {

	public void doSomethingElse(String stuff);
	
	public default void defaultMethod(String details) {
		System.out.println("Details from defaultMethod: " + details);
	}
	
}
