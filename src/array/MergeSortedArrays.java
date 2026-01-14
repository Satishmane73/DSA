package array;

import java.util.Scanner;

public class MergeSortedArrays {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] arr1 = new int[5];
		System.out.println("Enter First Array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scr.nextInt();
		}
		int[] arr2 = new int[5];
		System.out.println("Enter Second Array");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scr.nextInt();
		}
		int[] arr3 = mergeArray(arr1, arr2);
		for (int num : arr3) {
			System.out.print(num + " ");
		}
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		int k = 0;
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				i++;
			} else {
				arr3[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		return arr3;
	}
}