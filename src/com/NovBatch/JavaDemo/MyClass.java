package com.NovBatch.JavaDemo;

public class MyClass {
	final int i = 10;
	String str = "Vamsi";

	MyClass(){
		System.out.println("Default Constructor call .........");
	}
	
	MyClass(String uName){
		System.out.println("Parameter Constructor call ........." + uName);
	}
	
	public void greeting() {
		System.out.println("Greeting method....");	
		 		
	}
	
	public static void myGreets() {
		System.out.println("Static Greetings .....");
	}
	
	
	public static void main(String[] args) {
		
		MyClass mycs = new MyClass();
		
		
		mycs.greeting();
		
		myGreets();
		
		MyClass myc = new MyClass("Vamsi");
		//mycs.
		
		
	}
	

}
