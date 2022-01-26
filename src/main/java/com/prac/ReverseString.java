package com.prac;

public class ReverseString {
	public void reverseString(String s) {
		//print string last to first
		for(int i = (s.length() - 1); i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println("\n");
		
		//print string first to last
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		String str = "Iram";
		System.out.println(str.length());
		System.out.println(str.charAt(3));

		ReverseString obj = new ReverseString();
		obj.reverseString("Iram");
	}
}
