package array;

import java.util.Scanner;

public class LeftRotateByOne {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter Array Elements");

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		System.out.println("Array before left rotate by one");

		for (int num : arr) {
			System.out.print(num + "\t");
		}
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;

		System.out.println("\nArray after left rotate by one");
		for (int num : arr) {
			System.out.print(num + "\t");

		}
	}
}
