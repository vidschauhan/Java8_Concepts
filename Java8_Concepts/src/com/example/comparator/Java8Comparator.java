package com.example.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Vidit 
   25-Dec-2017 6:55:57 PM
 */
public class Java8Comparator {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("Vidit", 1, "Maths"),
				new Student("Amit", 3, "Science"),
				new Student("Rohit", 10, "Chemistry"), 
				new Student("Sumit", 18, "English"),
				new Student("Alok", 12, "Hindi"), 
				new Student("Singh", 5, "Physics"));
		
		
		
		// Conventional sorting using java 7
		Collections.sort(studentList,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}
		});
		
		studentList.forEach(System.out::println);
	
		//Sort using Collections.sort.
		Collections.sort(studentList,(o1,o2) -> o1.getName().compareTo(o2.getName()));
		
		System.out.println("*************************Sorting By Name************************************");
		studentList.forEach(s->System.out.println(s)); // using lambda expression.
		
		
		//Another way to use sort method
		studentList.sort((s1,s2) -> s1.getSubject().compareTo(s2.getSubject()));
		
		System.out.println("*************************Sorting By Subject************************************");
	
		studentList.forEach(System.out::println);
		
		
		System.out.println("*************************** Using stream  & filters");
		
		studentList.stream().filter(s1 -> s1.getName().startsWith("V")).forEach(System.out::println);;
		
	}


}

class Student {

	private String name;
	private int id;
	private String subject;

	@Override
	public String toString() {
		return String.format("name :" + name + "," + "id:" + id + "," + "subject:" + subject);
	}

	Student(String name, int id, String subject) {

		this.name = name;
		this.id = id;
		this.subject = subject;

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

}
