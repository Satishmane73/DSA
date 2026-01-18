package array;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayWithGivenSomeAny {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}
		System.out.println("Enter Target Sum");
		int target = scr.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == target) {
				System.out.println("SubArray Found at index 0 to " + i);
				return;
			}
			if (map.containsKey(sum - target)) {
				int start = map.get(sum - target) + 1;
				System.out.println("Subarray Found at index " + start + " to " + i);
				return;
			}
			map.put(sum, i);
		}
		System.out.println("Subarray not Found With Given Sum");

	}
}
