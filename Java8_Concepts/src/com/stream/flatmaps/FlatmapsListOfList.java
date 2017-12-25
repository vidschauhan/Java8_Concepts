package com.stream.flatmaps;

import java.util.Arrays;
import java.util.List;

import com.test.common.Book;

/**
 * @author Vidit 
   25-Dec-2017 6:56:56 PM
 */
public class FlatmapsListOfList {

	public static void main(String[] args) {

		
		List<Book> list1 = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
    	List<Book> list2 = Arrays.asList(new Book(30, "XXX"), new Book(15, "ZZZ"));
    	
    	
    	List<List<Book>> finalList = Arrays.asList(list1,list2);  // storing list of lists.
    	
		Book bookobj = finalList.stream()
				.flatMap(x -> x.stream()) // flaten list to get lists of book.
				.max((b1, b2) -> b1.getPrice() - b2.getPrice()).get(); //  Compare using comparator.
    	
    	System.out.println("Max book price :::::" + bookobj.getName() + " : " + bookobj.getPrice());
    	

	}

}
