package com.labMapCw;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//1. WAP to add elements to a HashMap without using generics (ie do not use <>) 
//   and print content of it. Use Integer as Key and String as Value. 
//   In second HashMap add elements of String type as Key and Integer as Value.

public class Q1HashMapWithoutGeneric {
	
	
	
	public static void searchElement(HashMap<Integer,String> newHm,int key) {
	}


	public static void main(String[] args) {

		HashMap hm1 = new HashMap();

		hm1.put(101, "Pravin");
		hm1.put(102, "Riya");
		hm1.put(103, "Gaurav");
		hm1.put(104, "Sahil");

		System.out.println(hm1);

		HashMap hm2 = new HashMap();

		hm2.put("Pravin", 24000);
		hm2.put("Riya", 55000);
		hm2.put("Gaurav", 45000);
		hm2.put("Sahil", 34000);

		System.out.println(hm2);

		// -----------------------------------------------------------------------------------------------
		// 2. WAP to get all the entries from a HashMap. Iterate the entries and print
		// the Key & Value values

		Set<Entry<Integer, String>> entries = hm1.entrySet();

		for (Entry<Integer, String> en : entries) {
			System.out.println(en.getKey() + " --> " + en.getValue());
		}

		// -----------------------------------------------------------------------------------------------------
		// 3.WAP to get only the Keys from a HashMap

		Set<Integer> keys = hm1.keySet();

		System.out.println("Iterate only HashMap keys");

		for (Integer i : keys) {
			System.out.println(i);
		}

		// -----------------------------------------------------------------------------------------------------
		// 4.WAP to get only the Values from a HashMap

		Collection<String> val = hm1.values();

		System.out.println("Iterate only HashMap values");

		for (String s : val) {
			System.out.println(s);
		}

		// -----------------------------------------------------------------------------------------------------
		// WAP to copy all of the mappings from the specified HashMap to another map

		HashMap newMap = new HashMap();

		newMap.putAll(hm1);

		System.out.println("Copy all Elements to another Map: " + newMap);

		// -----------------------------------------------------------------------------------------------------
		// 6. WAP to search for an element from HashMap using key

		System.out.println("Search Element: using key");
		
		System.out.println(hm1.get(102));

		// -----------------------------------------------------------------------------------------------------
		// 7.WAP to test if a HashMap contains a mapping for the specified value

		boolean b = hm1.containsValue("Gaurav");
		System.out.println("HashMap Contains Mapping for Specified value: " + b);

		// -----------------------------------------------------------------------------------------------------
		// 8.WAP to remove an element from HashMap using key

		hm1.remove(104);
		System.out.println("Remove Elemet from HashMap using key");
		System.out.println(hm1);

		// -----------------------------------------------------------------------------------------------------
		// 9.WAP to empty Map. (Hint - Get keys and iterate through the keys to remove
		// entries from Map)

		
		
		Iterator<Map.Entry<Integer, String>> iterator = hm1.entrySet().iterator();
		
		while(iterator.hasNext()) {
			
			Map.Entry<Integer, String> entry = iterator.next();
			iterator.remove();
		}
		System.out.println(hm1);
		
		// -----------------------------------------------------------------------------------------------------
		
	}

}
