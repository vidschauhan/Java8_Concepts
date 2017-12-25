package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Vidit 
   25-Dec-2017 6:57:27 PM
 */
public class Java8ForEach {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("VIDIT","KARAN","AMIT");
		List<Product> people = Arrays.asList(
				new Product(1, "Samsung A5", 17000f),
				new Product(3, "Iphone 6S", 65000f),
				new Product(2, "Sony Xperia", 25000f),
				new Product(4, "Nokia Lumia", 15000f),
				new Product(5, "Redmi4 ", 26000f));
			
		/*
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Samsung A5", 17000f));
		list.add(new Product(3, "Iphone 6S", 65000f));
		list.add(new Product(2, "Sony Xperia", 25000f));
		list.add(new Product(4, "Nokia Lumia", 15000f));
		list.add(new Product(5, "Redmi4 ", 26000f));
		list.add(new Product(6, "Lenevo Vibe", 19000f));*/

		
		System.out.println("Iterating over list");
		
		list.forEach(System.out::println);
		
		System.out.println("***************************************XXX");
		
		people.forEach(n -> System.out.println(n.name));

		
		System.out.println("************** All list ******************");
		// using lambda to filter data

		Stream<Product> filtered_data = people.stream().filter(p -> p.price > 20000);

		// using lambda to iterate through collection on filtered output
		filtered_data.forEach(product -> System.out.println(product.name + ": " + product.price));
		Stream<Product> data = people.stream().filter(p -> p.name.startsWith("S"));
		
		System.out.println("************************************************************");
		data.forEach(product -> System.out.println(product.name));
		
		
	}

}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}