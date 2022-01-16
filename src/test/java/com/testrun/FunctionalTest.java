package com.testrun;

import com.practice.Animal;

public class FunctionalTest {
	public static void main(String[] args) {
		// Create an object of animal class
		// ClassName object = new ClassName();
		Animal obj = new Animal();// obj is an object of Animal class
		// call out method: object.methodName;
		obj.getVoidMethod();

		// call out static void method--> no need to create an object
		// ClassName.MethodName();
		Animal.getStaticVoid();

		// call out return method
		// non-static method --> create an object
		obj.getReturnMethod();

		// call out static return method
		// static method --> no need to create an object

		Animal.getStaticReturnMethod();
		
		obj.getSalary();
		obj.getMoney();
		System.out.println(obj.getMoney());
		
		Animal.getIncome();
		
		int a = 12;
		double b = 12.44;
		String c = "Iram";
		
		System.out.println(a + b + c);
		
//		Animal.getAge();
//		Animal.getHairColor;
		
	}

}
