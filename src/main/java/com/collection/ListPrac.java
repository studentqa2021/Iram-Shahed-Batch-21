package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPrac {
	//can't create a list object without upcasting
	//String = var and class hence it works as shown below
	// for int use Integer/ for double use Double
	
	static int [] myArray = {2,3,4};
	static List<Integer> myList = new ArrayList<>();//java 7
	
	public static void main(String[] args) {
		myList.add(2);
		myList.add(3);
		myList.add(5);
		myList.add(7);
		
		System.out.println(myArray.length);
		System.out.println(Arrays.toString(myArray)+"\n");
		
		System.out.println(myList.size());
		System.out.print("\n");
		
		//1st for loop 
		for (int i = 0; i < myList.size(); i++){
			System.out.println(myList.get(i));
		}
		System.out.print("\n");
		
		//2nd level = advance for loop
		//for(dataType anyName: collectionName
		for (Integer x:myList) {
			System.out.println(x);
		}
		System.out.print("\n");
		
		//3rd level = for each for loop
		//collectionObjectName.foreach
		myList.forEach(v -> System.out.println(v));
		
	}
}

