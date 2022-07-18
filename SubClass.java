package com.java.langpack;

public class SubClass extends SuperClass {

	public boolean m1() {

		return false;

	}
	
	public static void main(String[] args) {
		
		SuperClass super1 = new SubClass();
		
		System.out.println(super1.m1());
		
		
		
	}
	
	

	
	

}
