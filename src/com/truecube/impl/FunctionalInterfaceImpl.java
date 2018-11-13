package com.truecube.impl;

import com.truecube.interfaces.FunctionalInterfaceIF;
import com.truecube.interfaces.FunctionalInterfaceIF2;

public class FunctionalInterfaceImpl implements FunctionalInterfaceIF, FunctionalInterfaceIF2 {

	@Override
	public void doSomething(String stuff) {
		System.out.println("stuff: " + stuff);
	}
	
	@Override
	public void doSomethingElse(String stuff) {
		System.out.println("other stuff: " + stuff);
	}
	
	public void defaultMethod(String details) {
		System.out.println("Details from FII defaultMethod: " + details);
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceIF fi = (stuff) -> System.out.println("main stuff: " +stuff);
		fi.doSomething("testing");
		
		FunctionalInterfaceIF2 fi2 = new FunctionalInterfaceImpl();
		fi2.doSomethingElse("testing again");
		
		return;
	}

}
