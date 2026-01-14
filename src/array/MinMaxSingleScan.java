package array;

import java.util.Scanner;

public class MinMaxSingleScan {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		for (int num : arr) {
			if (num < min)
				min = num;
			if (num > max)
				max = num;
		}

		System.out.println("Max : " + max + "\nMin : " + min);
	}
}
