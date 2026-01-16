package array;

import java.util.Scanner;

public class MoveAllZeroToEnd {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter Array Elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}
		int end = arr.length - 1;

		for (int i = 0; i <= end; i++) {
			if (arr[i] == 0) {
				int temp = arr[i];
				int j = i;

				while (j < end) {
					arr[j] = arr[j + 1];
					j++;
				}
				arr[end] = temp;
				end--;
				i--;
			}
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
