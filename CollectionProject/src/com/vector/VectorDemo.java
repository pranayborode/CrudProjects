package com.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> lang = new Vector<>(5,2);//double if not given
		
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		
		lang.add("C");
		lang.add("Java");
		lang.add("Python");
		lang.add("Angular");
		lang.add(".Net");
		
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		
		lang.add("C++");
		
		System.out.println("---------------------------------------");
		
		System.out.println(lang.capacity());
		System.out.println(lang.size());

		System.out.println("---------------------------------------");
		
		System.out.println(lang.get(2));
		System.out.println(lang.elementAt(2));
		
		System.out.println("---------------------------------------");
		
		System.out.println(lang.remove(2));
		System.out.println(lang.removeElement("C++"));
		
		System.out.println("---------------------------------------");
		
		lang.set(1, "C++");
		System.out.println(lang);
		
		System.out.println("---------------------------------------");
		
		lang.setElementAt("AWS", 2);
		System.out.println(lang);
		
		
		
		
	}

}
