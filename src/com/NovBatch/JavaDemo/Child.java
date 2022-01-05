package com.NovBatch.JavaDemo;

public class Child extends Parent{
	
	public static String str = "Hello child selenium testing...";
	
	Child(){
		super();
	}

	public void greetingFromChild() {	
		
		System.out.println("Hi Good Morning From Child....");				
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent.greeting();
		
		Child ch = new Child();
		
		ch.greetingFromChild();

		//Parent.greeting();

	}

}
