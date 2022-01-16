package com.practice;

public class BaseLogin {
	public static void main(String[] args) {
		//PracticeEncapsulation.getSalary();
	}

	static String name;// null ==> null pointer exception

	public BaseLogin(String name) {
		this.name = name;
	}

	public void getLogin() {
		System.out.println(name);
	}
}
