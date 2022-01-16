package com.practice;

public class PracticeEncapsulation {
//	private static int salary = 5000;
	private static int id = 2000;
	
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		PracticeEncapsulation.id = id;
	}

	private String name = "Mike";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public static int getId() {
//		return id;
//	}
//
//	public static void setId(int id) {
//		PracticeEncapsulation.id = id;
//	}
//
//	
//	public static int getSalary() {
//		return salary;
//	}
//
//	public static void setSalary(int salary) {
//		PracticeEncapsulation.salary = salary;
//	}
	public static void main(String[] args) {

	}
}
