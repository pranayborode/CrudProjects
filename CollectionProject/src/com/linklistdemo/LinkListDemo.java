package com.linklistdemo;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {

		LinkedList<String> comp = new LinkedList<>();

		// System.out.println(comp.getFirst());
		System.out.println(comp.peek());

		// System.out.println(comp.remove());
		System.out.println(comp.poll());
		
		comp.add("HCL");
		comp.add("Infosys");
		comp.add("Congnizant");
		comp.add("Dell");
		comp.add(null);
		comp.add("HCL");
		
		System.out.println(comp);
		
		System.out.println("--------------------------------");
		
		comp.addFirst("HP");//void
		comp.offerFirst("Genpact");//boolean
		
		comp.add(2, "Wipro");
		System.out.println(comp);
		
		

	}

}
