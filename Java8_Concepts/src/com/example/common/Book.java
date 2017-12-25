package com.example.common;

/**
 * @author Vidit 
   25-Dec-2017 6:57:13 PM
 */
public class Book {

		private int price;
		private String name;
		public Book(int price, String name) {
			this.price = price;
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
