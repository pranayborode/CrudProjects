package com.setdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<>();
		
		System.out.println(hs.isEmpty());
		
		hs.add("Chocolates");
		hs.add("Chips");
		hs.add("Juice");
		hs.add(null);
		hs.add("Cold Drink");
		System.out.println(hs.add("Chips"));
		
		System.out.println(hs);
		
		HashSet<String> hs2= new HashSet<>();
		hs2.add("Chips");
		hs2.add("Juice");
		hs2.add("Cheese");
		
		System.out.println(hs2);
		
		//union
//		hs.addAll(hs2);
//		System.out.println(hs);
		
		// difference
//		hs.removeAll(hs2);
//		System.out.println(hs);
		
		// intersection
		hs.retainAll(hs2);
		System.out.println(hs);
		

		System.out.println("---------------------------------");
		
		for(String s: hs)
		{
			System.out.println(s);
		}
		
		System.out.println("---------------------------------");
		
		
		Iterator<String> itr= hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(hs.contains("Chips"));
		
		System.out.println(hs.remove("Chips"));
		
		
		
		
	}

}
