package com.treemapdemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(1, "Java");
		tmap.put(2, ".Net");
		tmap.put(3, "Python");
		tmap.put(4, "Android");
		tmap.put(5, "Fluter");
		tmap.put(6, "SQL");
		System.out.println(tmap);
		// method
		// sorted map

		System.out.println("First Key: " + tmap.firstKey());
		System.out.println("Last Key: " + tmap.lastKey());

		System.out.println("------------------------------------");

		SortedMap<Integer, String> s1 = tmap.subMap(3, 6);// 3 include //6 exclude
		System.out.println(s1);

		SortedMap<Integer, String> s2 = tmap.headMap(3); // entries before 3 and 3 is include
		System.out.println(s2);

		SortedMap<Integer, String> s3 = tmap.tailMap(3); // entries after 3 and 3 is include
		System.out.println(s3);
		
         //Methods
		// Navigabel Map
		
		System.out.println("____________________________________________________");
		
		System.out.println("Lower key: "+tmap.lowerKey(4));// strictly less
		System.out.println("Floor key: "+tmap.floorKey(4));// less or than equal to 
		
		System.out.println("Higer Key: "+tmap.higherKey(4));//strictly higher
		System.out.println("Ceiling Key: "+tmap.ceilingKey(4));// equal to or greater than
		
		SortedMap<Integer, String>s4 = tmap.subMap(3, false,6, true); //3(from) included : true
		System.out.println(s4);
		
		SortedMap<Integer, String> s5 = tmap.headMap(3, true);//by default: entries before 3 and 3
		System.out.println(s5);

		SortedMap<Integer, String> s6 = tmap.tailMap(3,false); //by default: entries after 3 and 3
		System.out.println(s6);
		
		//by default
		//from:included
		//to : excluded
		
		

	}

}
