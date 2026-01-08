package array;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		// this for loop finds the smallest element form the array
		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < small)
				small = arr[i];
		}
		System.out.println("Smallest element in the array is " + small);
	}
}
