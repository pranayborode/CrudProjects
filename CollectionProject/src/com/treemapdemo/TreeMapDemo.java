package com.treemapdemo;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, Double> tmap = new TreeMap<>();
		tmap.put("Abhay", 89.7);
		tmap.put("Arpita", 56.4);
		tmap.put("Neelam", 90.3);
		tmap.put("Simran", 94.2);
		tmap.put("Mansi", 23.5);

		// Iterating

		System.out.println(tmap);

		//
		System.out.println("-----------------------------------");
		Set<String> keys = tmap.keySet();

		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + tmap.get(key));
		}

		System.out.println("-----------------------------------");

		for (Map.Entry<String, Double> e : tmap.entrySet()) {
			System.out.println(e.getKey() + e.getValue());
		}
//////////////////////
		System.out.println("-----------------------------------");
 
		Set<Entry<String,Double>> entries=tmap.entrySet();

		for (Entry<String,Double> e : entries) {
			System.out.println(e.getKey() + e.getValue());
		}
		
		///////////////////////////////////////////////
		
		// reversing map
		System.out.println("-----------------------------------");
		
		NavigableMap<String, Double> ns= tmap.descendingMap();
		for(Map.Entry<String,Double>e: ns.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}

		System.out.println("-----------------------------------");
		
		NavigableSet<String> ks =tmap.navigableKeySet();
		for(String k:ks)
		{
			System.out.println(k+"->"+tmap.get(k));
		}
		
	}

}
