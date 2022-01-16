package com.practice;

public class RunEncapsulation extends PracticeEncapsulation {
	public static void main(String[] args) {
		RunEncapsulation obj = new RunEncapsulation();
		
		System.out.println(obj.getName());
		obj.setName("Iram");
		System.out.println(obj.getName());
		
		System.out.println(obj.getId());
		obj.setId(1000);
		System.out.println(obj.getId());
	}
}
