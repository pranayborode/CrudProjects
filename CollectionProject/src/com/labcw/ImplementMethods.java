package com.labcw;

import java.util.ArrayList;

public class ImplementMethods {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Red");
		list1.add("Blue");
		list1.add("Orange");

		System.out.println(list1);

		System.out.println("get Method");
		System.out.println(list1.get(1));

		System.out.println("------------------------------------");

		System.out.println("set Method");
		list1.set(2, "Green");
		System.out.println(list1);

		System.out.println("------------------------------------");

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Black");
		list2.add("Blue");
		list2.add("White");
		
		list1.retainAll(list2);
		System.out.println(list1);
		
		System.out.println("------------------------------------");
		
		list1.removeAll(list2); //Removes from this list all of its elements that are contained in thespecified collection
		
		System.out.println(list1);
		
		

	}

}
