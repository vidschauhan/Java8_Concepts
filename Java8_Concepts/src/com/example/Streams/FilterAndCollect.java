package com.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vidit 
   25-Dec-2017 6:56:14 PM
 */
public class FilterAndCollect {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Vidit","Preetu","Chasmu","Kumbkrn");

		List<String> filteredList = list.stream()
				.filter(listobj -> !"Vidit".equalsIgnoreCase(listobj)) // passing a list object into filter to match only elements which is not vidit
				.collect(Collectors.toList()); // collect method collects the result and convert stream to list using Collectors.toList.
		filteredList.forEach(System.out::println);
	}

}
