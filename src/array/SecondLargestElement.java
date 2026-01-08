package array;

import java.util.Scanner;

public class SecondLargestElement {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		
		//logic to find second large element
		int max;
		int secMax;

		if (arr[0] > arr[1]) {
			max = arr[0];
			secMax = arr[1];
		} else {
			max = arr[1];
			secMax = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > max) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] < max && arr[i] > secMax) {
				secMax = arr[i];
			}
		}
		
		//if all elements are same there is no second large 
		if(max==secMax)
			throw new IllegalArgumentException("Not Second Largest Element Found");
		
		System.out.println("Second Largest element is " + secMax);
	}
}
