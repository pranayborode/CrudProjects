package com.queuedemo;

import java.util.PriorityQueue;

public class CustomerQueue {

	
	public static void main(String[] args) {
		
		PriorityQueue<Customer> pcq = new PriorityQueue<>(new CategoryComparator());
		
		pcq.add(new Customer(101, 1, "Pranay"));
		pcq.add(new Customer(103, 3, "Reetu"));
		pcq.add(new Customer(102, 1, "Pranali"));
		pcq.add(new Customer(107, 2, "Arpita"));
		pcq.add(new Customer(106, 3, "Prachi"));
		pcq.add(new Customer(104, 2, "Bhaskar"));
		
		for(Customer c : pcq) {
			System.out.println(c);
		}
		
	}
}
