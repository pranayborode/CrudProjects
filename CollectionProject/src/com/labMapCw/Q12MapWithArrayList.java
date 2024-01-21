package com.labMapCw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//12.WAP to create a map which stores an arraylist as a value

//13.WAP to iterate the elements in the arraylist stored in the above Map.
public class Q12MapWithArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		
		HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
		
		hashMap.put("List1", arrayList);
		hashMap.put("List2", arrayList);
		hashMap.put("List3", arrayList);
		
		System.out.println(hashMap);
		
		
		Set<String> keys=hashMap.keySet();

		Iterator<String> itr=keys.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		

		
//		Set<Entry<String, ArrayList<Integer>>> entries = hashMap.entrySet();
//		
//		for(Entry<String, ArrayList<Integer>> e : entries) {
//			
//			System.out.println("Keys : "+e.getKey()+" --> Values : "+e.getValue());
//		}
		
		

	}

}
