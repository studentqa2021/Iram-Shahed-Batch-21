package com.testrun;

public class LoopPrac {
	String name = "Iram";
	
	 void positiveForLoop() {
		//System.out.println(name.length());
		for(int i = 0; i < name.length(); i++) { //first part initial index value, 
												//second part ending index value
												//third part is the positive or negative increment
			System.out.println(name.charAt(i));//print every character at the specified index in the string
			System.out.println(i);// printing each index every iteration of the loop 
		}
	}
	
	 void reverseString() {
		for(int i = name.length()-1; i >= 0; i--) {// first part initial value length of string - 1 
													//since index is from (0-3) but length is 4 
													// ending index is anything greater than or equal to 0 
													//as zero is the first index
													// since we are going down the indexes we do --
			System.out.println(name.charAt(i));
			
		}
	}
	
	
	public static void main(String[] args) {
		LoopPrac prac = new LoopPrac();
		//prac.positiveForLoop();
		prac.reverseString();
	}
}
