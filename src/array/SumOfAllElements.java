package array;

import java.util.Scanner;

public class SumOfAllElements {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("Enter Array Elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		int sum = 0;

		for (int num : arr) {
			sum = sum + num;
		}

		System.out.println("Sum of all element sof array is " + sum);
	}
}
