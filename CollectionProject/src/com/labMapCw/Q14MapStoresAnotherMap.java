package com.labMapCw;

import java.util.HashMap;
import java.util.Set;

//14.        WAP to create a Map which stores another Map as a value.
//15.        WAP to iterate the elements in the Map stored in the above Map

public class Q14MapStoresAnotherMap {

	public static void main(String[] args) {

		HashMap<String, Integer> subMarksMap1 = new HashMap<>();

		subMarksMap1.put("PHY", 79);
		subMarksMap1.put("MTH", 88);
		subMarksMap1.put("ELC", 95);
		
		
		HashMap<String, HashMap<String, Integer>> hashMap1 = new HashMap<>();
		
		hashMap1.put("Swapnil", subMarksMap1);
		
		System.out.println(hashMap1);
		
		
		Set<java.util.Map.Entry<String, HashMap<String, Integer>>>entries = hashMap1.entrySet();
		
		for(java.util.Map.Entry<String, HashMap<String, Integer>> e : entries) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
		

		
		System.out.println("--------------------------------------------------");

		HashMap<Integer, String> stdMap = new HashMap<>();
		stdMap.put(101, "Rahul");
		stdMap.put(102, "Shital");
		stdMap.put(103, "Amit");

		HashMap<String, Integer> subMarksMap = new HashMap<>();

		subMarksMap.put("PHY", 79);
		subMarksMap.put("MTH", 88);
		subMarksMap.put("ELC", 95);

		HashMap<HashMap<Integer, String>, HashMap<String, Integer>> nestedMap = new HashMap<>();

		nestedMap.put(stdMap, subMarksMap);

		System.out.println(nestedMap);
	}

}
