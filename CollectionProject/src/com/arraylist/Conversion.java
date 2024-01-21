package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Conversion {

	public static void main(String[] args) {

		String colors[] = { "Red", "Green", "Blue", "Black" };

		System.out.println(Arrays.toString(colors));
		System.out.println("---------------------------------");

		// 1st way
		List<String> l1 = Arrays.asList(colors);
		System.out.println(l1);

		System.out.println("---------------------------------");

		// 2nd way
		ArrayList<String> al = new ArrayList<>(Arrays.asList(colors));
		System.out.println(al);

		System.out.println("---------------------------------");

		// 3rd way
		ArrayList<String> al2 = new ArrayList<>();
		Collections.addAll(al2, colors);
		System.out.println(al2);

		System.out.println("---------------------------------");

		// 1st way
		Object[] col = al.toArray();
		System.out.println(Arrays.toString(col));

		for (int i = 0; i < col.length; i++) {
			col[i] = ((String) col[i]).concat(" colour");
		}

		System.out.println(Arrays.toString(col));

		// 2nd way : Type safe

		String[] col2 = new String[al.size()];
		al.toArray(col2);

		for (int i = 0; i < col2.length; i++) {
			col2[i] = col2[i].concat(" Colour");
		}
		System.out.println(Arrays.toString(col2));
	}

}
