package com.NovBatch.JavaDemo;

public class Parent {
	
	public static String str = "Hello Parent Selenium Trainig";
	int i = 3;
	private String privateString;
	
	
	
	
	public void greetingsFromParent() {		
		
	
		System.out.println("Hi greeting From Parent....");
		
		
	}
	

	
	public static void greeting() {
		System.out.println("Hi Static method stuff.." + str);
	}
	
	public void greetingsFromParent(String uName) {	
		
		System.out.println("Hi Good Morning Overloading.... " + uName + privateString);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent pr = new Parent();
		
		greeting();
		
		pr.greetingsFromParent();
		pr.greetingsFromParent("Vamsi");
	}

}
