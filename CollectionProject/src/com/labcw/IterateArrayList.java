package com.labcw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {

		ArrayList<Float> list = new ArrayList<>();

		list.add((float) 13.25);
		list.add((float) 15.5);
		list.add((float) 33.2);
		list.add((float) 18.0);

		System.out.println("---------ForLoop----------");
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}
		
		System.out.println("---------Enhanced For Loop------------");
		for(float f : list)
		{
			System.out.println(f);
		}
		
		System.out.println("----------Iterator-------------");
		Iterator<Float> iteratro = list.iterator();
		
		while(iteratro.hasNext()) {
			System.out.println(iteratro.next());
		}
		
		System.out.println("---------List Iterator Forward--------");
		ListIterator<Float> li = list.listIterator();
		
		while(li.hasNext()) {
			
			System.out.println(li.next());
		}
		
		System.out.println("---------List Iterator Backward--------");
		ListIterator<Float>li2 = list.listIterator(list.size());
		
		while(li2.hasPrevious()) {
			System.out.println(li2.previous());
		}
		
	}

}
