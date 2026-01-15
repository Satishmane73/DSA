package array;

import java.util.*;

public class UnionOfTwoArray {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] arr = new int[5];
		int[] arr2 = new int[5];

		System.out.println("Enter first array elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		System.out.println("Enter second array elements");

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scr.nextInt();
		}

		int[] arr3 = unionOfArray(arr, arr2);

		for (int num : arr3) {
			System.out.print(num + " ");
		}
	}

	public static int[] unionOfArray(int[] arr, int[] arr2) {

		TreeSet<Integer> set = new TreeSet<>();

		for (int num : arr) {
			set.add(num);
		}

		for (int num : arr2) {
			set.add(num);
		}

		int[] arr3 = new int[set.size()];
		int k = 0;
		for (int num : set) {
			arr3[k++] = num;
		}

		return arr3;
	}
}
