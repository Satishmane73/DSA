package array;

import java.util.Scanner;

public class ArraySortedOrNot {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("Enter Elements in array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		int temp = arr[0];

		for (int num : arr) {
			if (!(num >= temp)) {
				System.out.println("\"Array is not sorted\"");
				return;
			}
			temp = num;
		}

		System.out.println("Array is sorted");
	}
}
