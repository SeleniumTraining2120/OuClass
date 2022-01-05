package com.NovBatch.JavaDemo;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] obj = new Object[4];
		
		obj[0] = "Traing";
		obj[1] = 30;
		obj[2] = "H";
		obj[3] = true;
		
		
		for(int p = 1; p < obj.length; p++) {
			
			System.out.println(obj[p]);
			
		}
		
		System.out.println("Exit For Loop...");
		
	}

}
