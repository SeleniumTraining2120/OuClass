package com.NovBatch.JavaDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetExample {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> str =  new HashSet<String>();
		str.add("Vamsi");
		str.add("Vamsi");
		str.add("Vamsi");
		str.add("Vamsi");
		str.add("Training");
		str.add("Krishna");
		str.add("Jani");
		
		Iterator<String> itr = str.iterator();
		
		System.out.println(str.size());
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		
	}

}
