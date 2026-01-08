package array;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("Enter array Elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

//		this logic to check an array is empty or not
//		if(arr==null || arr.length==0)
//			throw new IllegalArgumentException("Array is empty");

//		logic to check largest element
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		System.out.println("Max element from this array is " + max);
	}
}
