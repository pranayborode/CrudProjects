package com.arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterater {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>(5);

		al.add("Kiwi");
		al.add("Orange");
		al.add("Banana");
		al.add("Apple");
		al.add("Cherries");
		
		System.out.println(al);
		
		Iterator<String>iterator = al.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals("Apple")) {
				al.add("Pineapple");   //java.util.ConcurrentModificationException
			}
		}
		
		System.out.println(al);
	}

}
