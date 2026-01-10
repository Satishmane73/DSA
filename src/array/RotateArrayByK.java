package array;

import java.util.Scanner;

public class RotateArrayByK {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter Array Elements");

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		System.out.println("Enter a value to rotate array");
		int k = scr.nextInt();

		System.out.println("\nArray Before Rotate");
		for (int num : arr) {
			System.out.print(num + "\t");
		}

		for (int i = 0; i < k; i++) {
			int temp = arr[0];

			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}

		System.out.println("\nArray After Rotate by k");

		for (int num : arr) {
			System.out.print(num + "\t");
		}

	}
}
