package com.prac;

public class VariableSwap {
	// actual code should be in another method
	//a = 2 b = 1 
	public void makeSwap(int a, int b) {
		System.out.println("a before swapping is " + a + "\n" + "b before swapping is " + b);
		a = a + b;// change a's value to a + b a = 2+1--> a = 3 
		b = a - b;//change b's value to a - b b = 3-1 --> b = 2
		a = a - b;// change a's value to a -b a = 3-2 --> a = 1
		System.out.println("a swapped with b value is " + a + "\n" + "b swapped with a value is " + b);
	}

	public static void main(String[] args) {
		VariableSwap obj = new VariableSwap();
		obj.makeSwap(2, 1);
	}
}
