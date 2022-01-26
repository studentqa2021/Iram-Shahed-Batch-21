package com.prac;

public class GetDuplicate {
	public void getDuplicate(int[] b) {
		//First loop is to iterate through the entire array for a comparison
		for (int i = 0; i < b.length; i++) {
			//second loop is to add a second value to compare the first loops value with
			for (int j = (i + 1); j < b.length; j++) {
				//compare b index with the j index if they are equal then print the j value
				if (b[i] == b[j]) {
					System.out.println(b[j]);
				}

			}
		}
	}

	public static void main(String[] args) {
		int[] b = { 2, 3, 3, 4, 5, 6, 6, 7 };
		GetDuplicate obj = new GetDuplicate();
		obj.getDuplicate(b);
	}

}
