package array;

import java.util.Scanner;

public class SubArrayWithGivenSumOnlyPositive {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter Array Elements");
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		System.out.println("Enter Target Sum to find subarray");
		int target = scr.nextInt();

		int start = 0;
		int sum = 0;

		for (int end = 0; end < arr.length; end++) {
			sum += arr[end];
			while (sum > target && start <= end) {
				sum -= arr[start];
				start++;
			}
			if (sum == target) {
				System.out.println("Found Give Sum From index " + start + " to " + end);
				return;
			}
		}
		System.out.println("Subarray not found with given sum");
	}
}
