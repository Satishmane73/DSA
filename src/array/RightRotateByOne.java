package array;

import java.util.Scanner;

public class RightRotateByOne {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter Array Elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		System.out.println("Array before right rotate");
		for (int num : arr) {
			System.out.print(num + "\t");
		}

		int temp = arr[arr.length - 1];

		for (int i = arr.length - 1; i >0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;

		System.out.println("\nArray after right rotate");
		for (int num : arr) {
			System.out.print(num + "\t");
		}
	}
}
