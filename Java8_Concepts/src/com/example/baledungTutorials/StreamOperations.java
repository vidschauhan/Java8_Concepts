package com.example.baledungTutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		
		String[] alphabet = new String[]{"A", "B", "C","D","X","x"};
		String result = Arrays.stream(alphabet).anyMatch("z"::equalsIgnoreCase) ? "Match Found" :"Match Not Found"; // anyMatch returns boolean.   
		System.out.println(result);
		String str = Arrays.stream(alphabet).filter("x"::equalsIgnoreCase).findAny().orElse("not found");
		System.out.println(str);
				
		List<Integer> integers = Arrays.asList(1, 1, 1);
		Integer reduced = integers.stream().reduce(23, (a, b) -> a + b); // 23+1+1+1=26
		System.out.println(reduced);
		
		List<String> givenList = new ArrayList<String>();
		Map<String, Integer> rel = givenList.stream().collect(Collectors.toMap(Function.identity(), String::length));
	}

}
