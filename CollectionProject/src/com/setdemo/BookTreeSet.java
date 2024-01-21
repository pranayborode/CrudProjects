package com.setdemo;

import java.util.TreeSet;

public class BookTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Book> ts = new TreeSet<>(new PriceComparator());
		
		ts.add(new Book(11, "Hamlet", 560));
		ts.add(new Book(22, "Julius Caesar", 780));
		ts.add(new Book(33, "Life", 900));
		ts.add(new Book(44, "secret", 300));
		
		for(Book b : ts) {
			System.out.println(b);
		}
	}

}
