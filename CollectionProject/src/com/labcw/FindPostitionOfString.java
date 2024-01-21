package com.labcw;

import java.util.ArrayList;

// create arraylist of string find postion of String given by the use.

public class FindPostitionOfString {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		
		name.add("Rohit");
		name.add("Sunil");
		name.add("Riya");
		name.add("Gaurav");
		name.add("Ankita");
		
		String findName = "Gaurav";
	  int pos = name.indexOf(findName);
	  
	  System.out.println(findName+ " is at "+pos+" postition");

	}

}
