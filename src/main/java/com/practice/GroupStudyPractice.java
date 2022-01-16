package com.practice;

public class GroupStudyPractice {
	// method is a task
	// return is result of the task if need**
	public static int addition(int a, int b) {
		return (a + b);
	}

	public static void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		System.out.println(GroupStudyPractice.addition(2, 4));
		GroupStudyPractice.subtraction(2, 4);
	}
}
