package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GsArrayListPrac {
	public void ogArray() {
		
	}
	public static void main(String[] args) {
		//can't create a list object without upcasting
		//String = var and class hence it works as shown below
		// for int use Integer/ for double use Double
		
		int [] a = {2, 3, 5, 7};
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		System.out.println(a[3]);
		System.out.println("\n");
		
		List<Integer> myList = new ArrayList<>();
		myList.add(3);
		myList.add(2);
		myList.add(5);
		myList.add(7);
		myList.add(5);
		myList.add(6);
		System.out.println("Size of myList is "+ myList.size());
		System.out.println("myList in print format " + myList);//prints just the list in bracket format
		System.out.println("myList value at index 0 " +myList.get(0));
		
		//1st for loop to print the values as ints without the list format
		for( int i =0; i < myList.size(); i++) {
			System.out.print(myList.get(i));
		}
		System.out.print("\n");
		
		//2nd level = advance for loop
		//for(dataType anyVarName: userCollectionObjectName
		for (Integer x:myList) {
			System.out.print(x);
		}
		System.out.print("\n");
		
		//3rd level = for each for loop
		//collectionObjectName.foreach
		//java 8 way
		myList.forEach(v -> System.out.print(v));
	}
}
