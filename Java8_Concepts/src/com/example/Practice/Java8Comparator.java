package com.example.Practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Comparator {

	public static void main(String[] args) {
		
		List<Developer> listDevs = getDevelopers();
		
		System.out.println("Before Sorting...");
		for (Developer developer : listDevs) {
			System.out.println(developer.toString());
		}
		
		System.out.println("After Sorting on Name...");
		Collections.sort(listDevs,(d1,d2) -> d1.getName().compareTo(d2.getName()));
		listDevs.forEach(System.out::println);
		
		Collections.sort(listDevs, new Comparator<Developer>() {
			
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println("After Sorting on Age...");
		listDevs.forEach(System.out::println);

		System.out.println("****************************************");
		
		listDevs.forEach(items -> {
			if(items.getName().equalsIgnoreCase("Vidit")) {
				System.out.println(items);
			}
		});
		
		System.out.println("****************************************");
		//Extracting value from list of Object ---> returning String from list of objects.
		String name = listDevs.stream().filter(x ->x.getName().equalsIgnoreCase("Vidit")).map(Developer::getName).findAny().orElse(null);
		System.out.println(name);
	}

	public static List<Developer> getDevelopers() {
		List<Developer> list = new ArrayList<Developer>();
		list.add(new Developer("Vidit", new BigDecimal("70000"), 33));
		list.add(new Developer("Anukool", new BigDecimal("80000"), 20));
		list.add(new Developer("Ram", new BigDecimal("100000"), 10));
		list.add(new Developer("Amit", new BigDecimal("170000"), 55));
		return list;
	}
}

class Developer {
	private String name;
	private BigDecimal salary;
	private int age;

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	public Developer(String name, BigDecimal salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}