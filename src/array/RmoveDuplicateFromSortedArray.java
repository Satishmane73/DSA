package array;

import java.util.*;

public class RmoveDuplicateFromSortedArray {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] arr = new int[5];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				arr[i] = Integer.MIN_VALUE;
			}
		}

		for (int num : arr) {
			if (!(num == Integer.MIN_VALUE)) {
				System.out.print(num + "\s");
			}
		}

	}
}
