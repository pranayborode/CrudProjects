package com.queuedemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Float>adq = new ArrayDeque<>();
		// null not allowed 
		// maintains insertion order
		
		adq.add(78.4f);
		adq.add(34.3f);
		adq.add(98.4f);
		
		//adq.add(null);

		adq.addFirst(89.4f);
		adq.offerFirst(90.3f);
		
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.poll());
	}

}
