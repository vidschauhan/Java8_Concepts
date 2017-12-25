package com.example.flatmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.common.Book;
import com.example.common.Writer;

/**
 * @author Vidit 
   25-Dec-2017 6:57:07 PM
 */
public class FlatmapWithList {

	public static void main(String[] args) {
		
		List<Book> book = Arrays.asList(new Book(300,"The first book"), new Book(221,"The second book"),new Book(20,"The final book"));
		List<Book> book1 = Arrays.asList(new Book(500,"New book"), new Book(5300,"Old book"),new Book(20,"No book"));
		
		Writer writer1 = new Writer("Vidit",book);
		Writer writer2 = new Writer("Sohan",book1);
		
		List<Writer> writerList = new ArrayList<>();
		writerList.add(writer1);
		writerList.add(writer2);
		
		
		/*
		After flatMap(writer -> writer.getBooks().stream()), find the stream of books.
		{      
		   {10,"AAA"}, 
		   {20,"BBB"},
		   {30,"XXX"}, 
		   {15,"ZZZ"}
		}*/

		// To find Book with minimum price
		
		Book books = writerList.stream()
				.flatMap(x-> x.getBooks().stream())  // flaten list into book object.  returning list of book objects.
				.min((Book b1,Book b2)-> b1.getPrice() - b2.getPrice()).get(); // using comparator to compare book prices.
		
		
		
		
		System.out.println("Min price :::::  " + books.getName() + " :" + books.getPrice());
		
		
		
		
		
	}

}

