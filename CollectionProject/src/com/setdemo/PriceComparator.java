package com.setdemo;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		
		return (int) (b1.getPrice()-b2.getPrice());
	}

}
