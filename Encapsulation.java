package com.java.langpack;

public class Encapsulation {

	//data
	private int id = 123456;
	private String name = "Veeraia";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation encap = new Encapsulation();
		
		encap.method();
	}
	
	//behaviour
	public void method() {		
		System.out.println(id);
		System.out.println(name);
	}
	
	

}
