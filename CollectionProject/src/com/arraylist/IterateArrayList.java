package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>(5);

		al.add("Kiwi");
		al.add("Orange");
		al.add("Banana");
		al.add("Apple");
		al.add("Cherries");

		System.out.println(al);

		System.out.println("----------------------------------");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("-----------------------------------");

		for (String s : al) {
			System.out.println(s);
		}

		System.out.println("-----------------------------------");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------------------------------");

		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("-----------------------------------");

		ListIterator<String> litr1 = al.listIterator(al.size());
		while (litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}

	}

}
