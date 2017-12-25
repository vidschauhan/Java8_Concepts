package com.test.java8;

/**
 * @author Vidit 
   25-Dec-2017 6:57:23 PM
 */
public class B {

	A objA = new A() {

	public void show() {
		System.out.println("Anynomous inner");
	} };

}

interface A {
	public void show();
}
