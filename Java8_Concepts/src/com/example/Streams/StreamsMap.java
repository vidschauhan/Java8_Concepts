package com.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.common.Person;

/**
 * @author Vidit 
   25-Dec-2017 6:56:47 PM
 */
public class StreamsMap {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("Vidit", "Singh", 27),
				new Person("Sumit", "Udemy", 57),
				new Person("Pagal", "Sarah", 26), 
				new Person("Verto", "Qowe", 25),
				new Person("Quastery", "Doningh", 64),
				new Person("pupil", "Giningh", 62));
		
		
		
		// map can be used to perform various opertaions on object elements .
		
		String pLastName = personList.stream().filter(p -> "Vidit".equalsIgnoreCase(p.getFirstName())).map(Person::getLastName).findAny().orElse(null); // here extracting element as string from Stream using map.
		System.out.println(pLastName);
		
		
		
		// Converting all  firstname to UpperCase using MAP
		Stream<String> mapObj = personList.stream().map(p -> p.getFirstName().toUpperCase());
		mapObj.forEach(System.out::println);
		
		System.out.println("***************** Sum of all Ages Using Stream & Map *************************");
		
		/*List<Integer> age =personList.stream().map(p->p.getAge()).collect(Collectors.toList());
		System.out.println(age);
		
		int sum =0;
		for(Integer integer : age) {
			sum+=integer;
		}*/
		
		
		int sum = personList.stream().collect(Collectors.summingInt(Person::getAge));
		System.out.println(sum);
		
		System.out.println("***************** GroupBy and Counting each occurance *********************");
		Map<String, Long> map = personList.stream()
								.collect(Collectors.groupingBy(Person::getFirstName, Collectors.counting()));
		System.out.println(map);
	}
}
