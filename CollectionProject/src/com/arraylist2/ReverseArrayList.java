package com.arraylist2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	static void reverseList(ArrayList<String> list) {

		for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {

			String temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(5);

		al.add("Kiwi");
		al.add("Orange");
		al.add("Banana");
		al.add("Apple");
		al.add("Cherries");

		System.out.println(al);
		reverseList(al);

		// Collections.reverse(al);
		// Collections.sort(al);

		System.out.println(al);

	}

}
