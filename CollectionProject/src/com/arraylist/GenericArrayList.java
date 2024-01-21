package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(12);
		list1.add(34);
		list1.add(18);
		list1.add(76);
		
		System.out.println(list1);
		
		for(int i = 0; i<list1.size(); i++) {
			
			System.out.println(list1.get(i));
			int data = list1.get(i)+10;
		    list1.set(i, data);
		}
		System.out.println(list1);

	}

}
