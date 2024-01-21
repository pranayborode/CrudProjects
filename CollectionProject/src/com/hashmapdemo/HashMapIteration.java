package com.hashmapdemo;

import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {

		HashMap<String, Float> hm = new HashMap<>();

		hm.put("Reetu", 89.0f);
		hm.put("Pranali", 96.0f);
		hm.put(null, 0f);
		hm.put("Pooja", 59.0f);
		hm.put("Bhaskar", 76.0f);

		System.out.println("-------------1st-----------------");

		System.out.println(hm);

		System.out.println("-------------2st-----------------");

		Set<String> keys = hm.keySet();

		for (String s : keys) {
			System.out.println(s + "-->" + hm.get(s));
		}

		System.out.println("-------------3st-----------------");

		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String k = itr.next();
			System.out.println(k + "-->" + hm.get(k));
		}

		System.out.println("-------------4st-----------------");

		Collection<Float> marks = hm.values();
		for (Float m : marks) {
			System.out.println(m);
		}
		System.out.println("-------------5st-----------------");

		Set<java.util.Map.Entry<String, Float>> entries = hm.entrySet();

		for (java.util.Map.Entry<String, Float> en : entries) {
			System.out.println(en.getKey() + "-->" + en.getValue());
		}

		System.out.println("-------------6st-----------------");

		for (Map.Entry<String, Float> e : hm.entrySet()) {
			System.out.println(e.getKey() + "-->" + e.getValue());
		}
	}

}
