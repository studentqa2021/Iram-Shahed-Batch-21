package com.practice;

public class Animal {
	String name = "Iram";
	static int a = 12;
//	public class Dog{
//		protected void getDogAge() {
//			System.out.println("Yellow");
//		}
//	}
	public void getVoidMethod() {// non static void method
		String age = "21";
		System.out.println(age);
	}

	public static void getStaticVoid() {// static void method
		System.out.println("This is a static void method ");
	}

	public String getReturnMethod() {// non void return method
		System.out.println("this is a return method");
		return "Batch21";
	}

	public static String getStaticReturnMethod() {// non void static return method
		System.out.println("This is a static return method");
		return "Batch 21";
	}

	public void getSalary() {
		int salary = 5000;
	}
	public String getMoney() {
		String myName = "Iram";
		return myName;
	}
	public static void getIncome() {
		int income = 100000;
	}
//	private static void getAge() {
//		System.out.println("22");
//	}
	public static void getHairColor() {
		System.out.println("Blue");
	}
	protected static void getDogColor() {
		System.out.println("brown");
	}

}