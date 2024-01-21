package com.setdemo;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		
		HashSet<Item> hs = new HashSet<>();
		
		hs.add(new Item(1, "Sugar", 40));
		hs.add(new Item(2, "Flour", 100));
		hs.add(new Item(3, "Tea", 90));
		hs.add(new Item(4, "Salt", 20));
		hs.add(new Item(1, "Sugar", 60));
		
		
		for(Item i : hs) {
			System.out.println(i);
		}
	}

}
