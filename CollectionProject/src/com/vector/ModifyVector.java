package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ModifyVector {

	public static void main(String[] args) {

		Vector<String> lang = new Vector<>(5, 2);// double if not given

		System.out.println(lang.capacity());
		System.out.println(lang.size());

		lang.add("C");
		lang.add("Java");
		lang.add("Python");
		lang.add("Angular");
		lang.add(".Net");

		Enumeration<String> en = lang.elements();

		while (en.hasMoreElements()) {
			if (en.nextElement().equals("Python")) { 
				lang.add("C++");
			}
		}
		System.out.println(lang);
	}

}
