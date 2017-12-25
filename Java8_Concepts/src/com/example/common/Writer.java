package com.example.common;

import java.util.List;

/**
 * @author Vidit 
   25-Dec-2017 6:57:19 PM
 */
public class Writer {

		private String name;
		private List<Book> books;
		public Writer(String name, List<Book> books) {
			this.name = name;
			this.books = books;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Book> getBooks() {
			return books;
		}
		public void setBooks(List<Book> books) {
			this.books = books;
		}
	}
