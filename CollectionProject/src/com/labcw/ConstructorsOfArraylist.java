package com.labcw;

import java.util.ArrayList;
import java.util.Arrays;

//Create a arraylist of Double using all three constructors of arraylist
public class ConstructorsOfArraylist {

	public static void main(String[] args) {
		
		ArrayList<Double> list1 = new ArrayList<>();
		list1.add(12.44);
		list1.add(35.5);
		list1.add(75.2);
		
		System.out.println(list1);
		
		System.out.println("-------------------------------------------");
		
		ArrayList<Double> list2 = new ArrayList<>(3);
		list2.add(18.4);
		list2.add(13.8);
		list2.add(67.0);
		
		System.out.println(list2);
		
		System.out.println("-------------------------------------------");
		
		ArrayList<Double> list3 = new ArrayList<>(list2);
		
		for(Double d : list3) {
			System.out.println(d);
		}
		
		System.out.println("-------------------------------------------");
		
		
	}

}
