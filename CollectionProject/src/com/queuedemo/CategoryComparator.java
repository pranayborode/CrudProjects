package com.queuedemo;

import java.util.Comparator;

public class CategoryComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		
		if(c1.getCategory() == c2.getCategory()) {
			return c1.getId() - c2.getId();
		}else {
			return c1.getCategory() - c2.getCategory();
		}
		
	}

//	@Override
//	public int compare(Customer c1, Customer c2) {
//		
//		if(c1.getCategory() == c2.getCategory()) {
//			
//			if(c1.getId() ==c2.getId());
//			return 0;
//		else 
//			if(c1.getId()<c2.getId());
//				return -1;
//				else 
//					return 1;
//					
//				
//		}else {
//			if(c1.getCategory()<c2.getCategory())
//				return -1;
//			else 
//				return 1;
//			
//		}
//		
//	}

}
