package com.test.java8;

/**
 * @author Vidit 
   25-Dec-2017 6:57:25 PM
 */
public class C {

	static ADD obj = (a,b)-> {
		a=a+1;
		return b=b+a;
	};

	public static void main(String[] args) {

		/*
		 * B b = new B(); b.objA.show();
		 */
		System.out.println(obj.add(10, 20));

	}

}

interface ADD {

	public int add(int a, int b);
}