package com.NovBatch.JavaDemo;

public class EncapsulationChild {
	
	public static void main(String[] args) {
		
		EncapsulationDemo encapDemo = new EncapsulationDemo();
		
		encapDemo.setCourse("CSE");
		encapDemo.setName("Ajay");
		encapDemo.setCity("Guntur");
		
        System.out.println(encapDemo.getCity());
		
		System.out.println(encapDemo.getName());
		
		System.out.println(encapDemo.getCourse());
	
	}
	
	

}
