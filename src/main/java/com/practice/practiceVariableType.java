package com.practice;

public class practiceVariableType {
	String name = "Waris";
	
	//special class constructor
	practiceVariableType(String b){
		name = b;
	}
	public void getName() {
		System.out.println(name);
	}
	public void getAnotherName() {
		String lname = "Shahed";
		System.out.println(name);
	}
	public static void main(String[] args) {
		practiceVariableType str = new practiceVariableType("Iram");
		str.getName();
		str.getAnotherName();
	}
}
