package com.collection;

import java.util.Arrays;

public class ArrayPrac {
	static int a= 10;
	
	static int b [] = {10,20,30,30,20,15};//[] = single dimensional array
	static int c [][] = {{8,9,7,6},{9,10,4,5}};
	static String[][] e = {{"Joe", "Jim"}, {"Peter", "Frank"}};
	static String[] d = {"Iram", "John", "Paul"};
 	
	public static void main(String[] args) {
		System.out.println(a);
		
		System.out.println(Arrays.toString(b)); //to print an array
		System.out.println(b[0]);
		System.out.println(b.length);// length of array
		
		System.out.println(Arrays.deepToString(c)); //to print a 2D array
		System.out.println(Arrays.deepToString(e)); // print 2D string array
		
		System.out.println(Arrays.toString(d));// print string array
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("The array value at the "+ i + " index is " + b[i]);
			//print array values through for loop 
		}
		
		//nested loop to find duplicates in array
		// 
		for(int i = 0; i < b.length; i++) {
			for(int j = (i+1); j < b.length; j++) {
				if (b[i] == b[j]) {
					System.out.print(b[j] + " ");
				}
	
			}
			
		}
	}
}
