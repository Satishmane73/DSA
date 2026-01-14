package array;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateFromUnsortedArray {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		int k = removeDuplicate(arr);

		System.out.println("Array After Removing Duplicates");
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int removeDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<>();

		int k = 0;

		for (int num : arr) {
			if (!set.contains(num)) {
				set.add(num);
				arr[k] = num;
				k++;
			}
		}
		return k;
	}
}
