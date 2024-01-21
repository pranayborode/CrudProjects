package com.linkedhashmapdemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		LinkedHashMap<String, Double> lmap= new LinkedHashMap<>();
		lmap.put("Abhay", 89.7);
		lmap.put("Arpita", 56.4);
		lmap.put("Neelam", 90.3);
		lmap.put("Simran", 94.2);
		lmap.put("Mansi", 23.5);
		
		for(Map.Entry<String, Double> e:lmap.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
			
		}
		
		System.out.println(lmap.get("Neelam"));
	}

}
