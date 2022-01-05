package com.NovBatch.JavaDemo;

public class HelloWorld {

int i = 2;

	public int addition(int a, int b) {
		
		int i = a + b;		
		return i;	
		
	}
	
	public int addition(int a, int b, int c, int e) {
		
		int f = a + b + c + e;
		return i;		
		
	}
	
	public int addition(int a) {
		return i;
		
	}
	
	public String addition(String uName, String pass) {
		
		System.out.println(uName + " " + pass);
		
		return uName;
		
	}
	
	public void greetings() {		
		System.out.println("Hi Good Morning");
	}
	
	public boolean flag() {		
		boolean status = false;		
		return status;
	}
	
	public void login(String userName, String passWord) {
		
		System.out.println("User Name Value : " + userName);
		System.out.println("Password Value : " + passWord);
	}

	

	public static void main(String[] args) {
	
		HelloWorld hw = new HelloWorld();	
		
		hw.greetings();		
		System.out.println("Performing Addition:");
		System.out.println(hw.addition(246, 342));
		System.out.println(hw.flag());
		hw.login("Traning", "Java@123");
		
		System.out.println(hw.addition(2, 10, 23, 76));
		
		System.out.println(hw.addition(10));
		
		hw.addition("Traning", "Java@123");
		
	}

}
