package com.hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, String> hmap = new HashMap<>();

		hmap.put("India", "+91");
		hmap.put("USA", "+1");
		hmap.put("UAE", "+971");
		hmap.put("Germany", "+49");

		// put()- returns null if the key is not present

		System.out.println(hmap.put(null, "+0"));

		// put() - returns the old value of the key and replaces with new value

		System.out.println(hmap.put(null, "+100"));

		hmap.put("South Korea", null);
		hmap.put("Italy", null);

		System.out.println(hmap);

		System.out.println("Size : " + hmap.size());

		// get

		System.out.println("---------------------------------");

		System.out.println(hmap.get("USA"));

		System.out.println(hmap.containsKey("Spain"));
		System.out.println(hmap.containsValue("+49"));

		System.out.println("---------------------------------");

		// return null if old value is null and replaced by new value
		// return same value if not null
				

		// only add the value if it is null
		System.out.println(hmap.putIfAbsent("Italy", "+39"));
		System.out.println(hmap);

		System.out.println(hmap.putIfAbsent("Italy", "+31"));
		System.out.println(hmap);
		
		hmap.clear();
	}

}
