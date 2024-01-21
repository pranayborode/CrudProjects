package com.arraylist;

import java.util.ArrayList;

public class FriquencyArrayList {

	static void finsFrequency(ArrayList<String> list) {

		int count;

		for (int i = 0; i < list.size(); i++) {
			count = 1;

			if (list.get(i).equals("Visited"))
				continue;
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).equals(list.get(j))) {

					count++;
					list.set(j, "Visited");
				}
			}
			System.out.println(list.get(i) + " --> " + count);
		}
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("C");
		list.add("D");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("D");
		list.add("A");

		finsFrequency(list);
	}

}
