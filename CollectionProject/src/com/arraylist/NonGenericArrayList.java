package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayList {

	public static void main(String[] args) {

		List list1 = new ArrayList();

		list1.add(12);
		list1.add("Pranay");
		list1.add(78.4f);
		list1.add('a');

		System.out.println(list1);

		for (int i = 0; i < list1.size(); i++) {

			System.out.println(list1.get(i));
			int data = (int) list1.get(i) + 10;
			list1.set(i, data);

		}

		System.out.println(list1);

	}

}
