package com.example.Streams;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Vidit 
   25-Dec-2017 6:56:42 PM
 */
public class ReusableStream {

	public static void main(String[] args) {
		
		
		String[] array = {"a", "b", "c", "d", "e"};
        Stream<String> stream = Arrays.stream(array);

        // loop a stream
        stream.forEach(x -> System.out.println(x));
/*.
        // reuse it to filter again! throws IllegalStateException  // stream can't b reused simply.
        long count = stream.filter(x -> "b".equals(x)).count();
        System.out.println(count);
*/
        
        
        System.out.println("************************Stream Reusablity Solution using Supplier***********************");
        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array); // or ()-> Arrays.stream();
        
      //get new stream using get(). Each get() will return a new stream.
        streamSupplier.get().forEach(x -> System.out.println(x));

        //get another new stream
        long count = streamSupplier.get().filter(x -> "b".equals(x)).count();
        System.out.println(count);
        streamSupplier.get().map(x-> x.toUpperCase()).forEach(System.out::println);
        
	}

}
