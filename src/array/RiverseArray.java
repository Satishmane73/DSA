package array;

import java.util.Scanner;

public class RiverseArray {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		int[] a = new int[6];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = scr.nextInt();
		}

		System.out.println("Array before rotate");

		for (int num : a) {
			System.out.print(num);
		}

		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		System.out.println("\nArray after rotate");

		for (int num : a) {
			System.out.print(num);
		}
	}
}
