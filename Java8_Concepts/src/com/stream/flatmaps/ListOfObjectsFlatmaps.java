package com.stream.flatmaps;

import java.util.Arrays;
import java.util.List;
import com.test.common.Book;
import com.test.common.Writer;

/**
 * @author Vidit 
   25-Dec-2017 6:57:10 PM
 */
public class ListOfObjectsFlatmaps {

	public static void main(String[] args) {
		

		List<Book> book = Arrays.asList(new Book(500,"JournledDev"),new Book(1000,"Java on Tips"));
		Writer writer1 = new Writer("Vidit",book);
		
		book = Arrays.asList(new Book(1500,"Java Book"),new Book(12120,"JavaTpoint"));
		Writer writer2 = new Writer("Sumit",book);
		
		book = Arrays.asList(new Book(500,"JournledDev"),new Book(1000,"Java on Tips"));
		Writer writer3 = new Writer("Karan",book);
		
		book = Arrays.asList(new Book(500,"Maths Book"),new Book(1000,"Java on Tips"));
		Writer writer4 = new Writer("Nikhil",book);
		
		Writer[][] writerArray = {{writer1,writer2},{writer3,writer4}};
		
		Book bookobj = Arrays.stream(writerArray) // converting Array into streams.
				.flatMap(rows -> Arrays.stream(rows)) // Returns stream of objects (both Writer obj and Book obj) present in array.
				.flatMap(x -> x.getBooks().stream()) //  Returns stream of List  of List<Book> book.
				.max((b1, b2) -> b1.getPrice() - b2.getPrice()).get(); // compare and get values.
		
		System.out.println(bookobj.getPrice() +  bookobj.getName());
		

	}

}
