package com.example.baledungTutorials;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import javax.lang.model.element.Element;

public class StreamCreation {

	public static void main(String[] args) {
		
		Stream<String> streamEmpty = Stream.empty(); 
		/*empty() method should be used in case of a creation of an empty Stream.
		Its often the case that the empty() method is used upon creation to avoid returning null for streams with no Element.class
		public Stream<String> streamOf(List<String> list) {
		    return list == null || list.isEmpty() ? Stream.empty() : list.stream();
		}*/

		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("a").add("b").add("c").build();
		
		List<String> list = Arrays.asList("A","B","C");
		Stream<List<String>> streamGenerated =
				  Stream.generate(() -> list).limit(10);
		streamGenerated.forEach(System.out::println);
		
		Stream<Integer> streamIterated = Stream.iterate(1, n -> n + 1).limit(20);

		streamIterated.forEach(System.out::println);
		
		List<String> list1 = Arrays.asList("abc1", "abc2", "abc3");
		Stream<String> size = list1.stream().skip(1);
		size.forEach(System.out::println);
		//System.out.println(list1);
		
		List<Integer> list2 = Arrays.asList(3,2,5,6);
		int sum = list2.stream().filter(digit-> digit%2==0).reduce(0,Integer::sum); //Explanation : reduce(param1,param2) : param1 = 0 , param2 = A/c to filter 2+6.
		int mul = list2.stream().filter(digit-> digit%2==0).reduce(1,(a,b) -> a*b); // 1*6*2 in reduce param.
		System.out.println(sum);
		System.out.println(mul);
		
		
		
		
		

	}

}

