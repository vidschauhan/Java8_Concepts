package com.example.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.common.Person;

/**
 * @author Vidit 
   25-Dec-2017 6:56:31 PM
 */
public class ListToMap {

	public static void main(String[] args) {
		
		List<Person> personList = Arrays.asList(new Person("Vidit", "Singh", 27),
				new Person("Sumit", "Udemy", 57),
				new Person("Pagal", "Sarah", 26), 
				new Person("Verto", "Qowe", 25),
				new Person("Quastery", "Doningh", 64),
				new Person("pupil", "Giningh", 62),
				new Person("Sumit", "Udemy", 57),
				new Person("Pagal", "Sarah", 26), 
				new Person("Verto", "Qowe", 21));
		
		//TO DO......................................................................................
		List<String> single = Arrays.asList("Vidit","Amit","Sujit");
		
		Map<String,Integer> singleMap = single.stream().collect(Collectors.toMap(Function.identity(),String::length));
		
		System.out.println(singleMap);
		
		//Map<Integer, String> map = personList.stream().collect(Collectors.toMap(Person::getAge,Person::getFirstName)); // this will throw now error as it has duplicate key Sumit.
		
		Map<Integer, String> map = personList.stream()
											 .collect(Collectors.toMap(Person::getAge,Person::getFirstName,(oldValue, newValue) -> oldValue)); // pass third argument (oldValue, newValue) -> oldValue
		// to Maintain order use  "LinkedHashMap::new" as fourth parameter.  
		System.out.println(map);
	
		
		// Using Sort() to sort list while converting into Map
		
		Map<Integer,String> maplist = personList.stream()
												.sorted(Comparator.comparingInt(Person::getAge).reversed())
												.collect(Collectors.toMap(Person::getAge,Person::getFirstName,(oldValue, newValue) -> oldValue));
		
		maplist.forEach((k,v)-> System.out.println(k + " : " +v));
		
		AtomicInteger index = new AtomicInteger(1);
		Map<Integer,String> maplst =  single.stream().collect(
	            Collectors.toMap( s -> index.getAndIncrement(),s -> s,(oldV, newV)->newV));
		maplst.entrySet().stream().forEach(System.out::println);
	}

}
