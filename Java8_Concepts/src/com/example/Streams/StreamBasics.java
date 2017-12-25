package com.example.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Vidit 
   25-Dec-2017 6:56:45 PM
 */
public class StreamBasics {

	public static void main(String[] args) {
	
		String[] arr = {"Vidit","Sumit","Ajit"};
		
		// converting Array to streams
		Stream<String> streams = Stream.of(arr);  // or Stream<String> stream1 = Arrays.stream(arr);
		streams.forEach(System.out::println); 

		
		
		// excluding nulls.
		Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
		List<String> result = language.filter(x -> x!=null).collect(Collectors.toList()); //Convert a Stream to List and filtering null values
		//List<String> result = language.filter(Objects::nonNull).collect(Collectors.toList());
        result.forEach(System.out::println);
        
        
        
   
        
        
	}

}
