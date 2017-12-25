package com.stream.flatmaps;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Vidit 
   25-Dec-2017 6:57:02 PM
 */
public class FlatMapWithArray {

	public static void main(String[] args) {
	
		int[][] intarray = {{56,43,21},{32,53,12}};
		
		int sum =Stream.of(intarray) // converting into stream first.
				.flatMapToInt(x->Arrays.stream(x)).sum(); // Getting stream of Array after flattening and applying sum on elements.
		System.out.println(sum);
		
		
		Integer[][] data = {{1,2},{3,4},{5,6}}; 
		Arrays.stream(data).flatMap(row -> Stream.of(row)) // flatmap used differently for Arrays.
						.filter(num -> num%2 == 0).forEach(System.out::println); // Stream.of can't be used with the flatMapToInt.
		

	}

}
