package com.NovBatch.JavaDemo;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, String> hTable = new Hashtable<String, String>();
		
		hTable.put("city", "Guntur");
		hTable.put("FirstName", "Vamsi");
		hTable.put("LastName", "Krishna");
		hTable.put("State", "AP");
		hTable.put("Education", "Graduate");
		
		System.out.println(hTable.get("city"));
		
		System.out.println(hTable.get("State"));
		
		System.out.println("Integer table Values are below : ");
		
		Hashtable<Integer, String> intTable = new Hashtable<Integer, String>();
		
		
		intTable.put(0, "guntur");
		intTable.put(1, "Vamsi");
		intTable.put(2, "guntur");
		intTable.put(3, "guntur");
		intTable.put(4, "guntur");
		
		for(int i = 0; i< intTable.size(); i++) {
			
			System.out.println(intTable.get(i));
			
		}
		
		
		HashMap<String, String> hMap = new HashMap<String, String>();
		
		hMap.put("city", "Hyderabad");
		System.out.println("Integer Map Values are below : ");
		
		System.out.println(hMap.get("city"));
		
	}

}
