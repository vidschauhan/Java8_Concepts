package com.stream.flatmaps;

import java.util.stream.Stream;

/**
 * @author Vidit 
   25-Dec-2017 6:56:54 PM
 */
public class Flatmaps {

	public static void main(String[] args) {
		
		
		String arr[][] = new String[][] {{"a", "b"}, {"c", "d"}, {"e", "f"}};
		
		Stream<String[]> temp = Stream.of(arr); // First converted into streams
		Stream<String> flatenList = temp.flatMap(x -> Stream.of(x)); // now flatened into stream to single dimension.
		Stream<String> finalResult = flatenList.filter(x-> !"a".equals(x.toString()));
		finalResult.forEach(System.out::println);
		
		
		// The other way......
		
		Stream.of(arr).flatMap(x -> Stream.of(x)).filter(x-> !"a".equals(x.toString())).forEach(System.out::println);
		
	}

}
