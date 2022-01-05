package com.NovBatch.JavaDemo;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> aryList = new ArrayList<String>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		aryList.add("Salmon");
		aryList.add("Salmon");
		aryList.add("Salmon");
		aryList.add("Salmon");
		aryList.add("Salmon");
		
		
		intList.add(10);
		intList.add(15);
		intList.add(20);
		intList.add(25);
		intList.add(30);
		
		
		
		System.out.println("Printing all values in Array List.");
		
		for(int i = 0; i < aryList.size(); i++) {
			
			//System.out.println(intList.get(i));
			System.out.println(aryList.get(i));
			
			
		}
		
		
	}

}
