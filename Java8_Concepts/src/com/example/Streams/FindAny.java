package com.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.test.common.Person;

/**
 * @author Vidit 
   25-Dec-2017 6:56:27 PM
 */
public class FindAny {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("Vidit", "Singh", 27),
				new Person("Xyz", "uieqw", 57),
				new Person("Pqs", "Srweh", 26), 
				new Person("Suste", "qwew", 25),
				new Person("Qwesd", "reqingh", 64),
				new Person("VWqqw", "gwfingh", 62));
		
		
		// Multiple conditions can also be used in filter method.
		Person pobj = personList.stream().filter(p -> "Vidit".equalsIgnoreCase(p.getFirstName()) && p.getAge() == 27)
								.findAny()
								.orElse(null);  // findAny returns the match object if present or orElse null;
		System.out.println(pobj);
		
		
		// Sum all ages using Collectors
		int sum = personList.stream().collect(Collectors.summingInt(Person::getAge));
		int x = personList.stream().filter(p -> p.getAge() > 60).collect(Collectors.summingInt(Person::getAge)); // appliying filter before summing age
		System.out.println(sum + " ," + x);
	}

}



