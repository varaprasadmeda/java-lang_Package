package com.java.langpack;

public class Child extends Parent {

	public static void main(int[] args) {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.main(args);
	}

}
