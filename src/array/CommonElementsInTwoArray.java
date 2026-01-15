package array;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsInTwoArray {

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

		int arr3[] = commonElements(arr, arr2);

		System.out.println("Common Elements from the above array");
		for (int num : arr3) {
			System.out.print(num + " ");
		}

	}

	public static int[] commonElements(int[] arr, int[] arr2) {

		HashSet<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		HashSet<Integer> commonSet = new HashSet<>();
		for (int num : arr2) {
			if (set.contains(num)) {
				commonSet.add(num);
			}
		}

		int[] arr3 = new int[commonSet.size()];
		int k = 0;
		for (int num : commonSet) {
			arr3[k++] = num;
		}

		return arr3;
	}
}
