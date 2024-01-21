package com.setdemo;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	    
		TreeSet<String> hs = new TreeSet<>();
		
		hs.add("Chocolates");
		hs.add("Chips");
		hs.add("Juce");
		//hs.add(null);
		hs.add("Cold Drink");
		
		System.out.println(hs);
		
		
		System.out.println("-----------------------------------");
		
		for(String s : hs) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------");

		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------");

		Iterator<String> itr1 = hs.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("-----------------------------------");
		
		NavigableSet<String>nm = hs.descendingSet();
		
		for(String s: nm) {
			System.out.println(s);
		}
	}

}
