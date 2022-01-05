package com.NovBatch.JavaDemo;

public class EncapsulationDemo {
	
	private String name;
	private String course;
	private String city;	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EncapsulationDemo encapDemo = new EncapsulationDemo();
		
		System.out.println(encapDemo.getName());
		
		encapDemo.setCourse("CSE");
		encapDemo.setName("Ajay");
		encapDemo.setCity("Guntur");
		
		System.out.println(encapDemo.getCity());
		
		System.out.println(encapDemo.getName());
		
		System.out.println(encapDemo.getCourse());
		
	}
	
	
	
	
	
}
