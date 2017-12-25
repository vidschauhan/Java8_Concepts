package com.stream.flatmaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Vidit 
   25-Dec-2017 6:56:52 PM
 */
public class FlatMapASet {

	public static void main(String[] args) {

		Student st = new Student();
		st.addBook("Moh Maya");
		st.addBook("Panchag");
		st.addBook("Hare Krishna");
		st.addBook("Bikano");
		st.addBook("Night at Call center");
		
		Student st1 = new Student();
		st1.addBook("The last love!");
		st1.addBook("Bikano");
		st1.addBook("Three States");
		st1.addBook("Night at Call center");
		
		
		List<Student> listobj = new ArrayList<>();
		listobj.add(st);
		listobj.add(st1);
		
		
		List<String> collect = listobj.stream()
				.map(stobj -> stobj.getBook()) 			////Stream<Set<String>>
				.flatMap(x -> x.stream()) 				//Stream<String>
				.distinct()
				.collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
	}

}


class Student {

    private String name;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}

	private Set<String> book;

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }
}
