package array;

import java.util.Scanner;

public class AvarageOfArrayElements {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("Enter Elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		int sum = 0;
		for (int num : arr) {
			sum = sum + num;
		}

		double avr = (double) sum / arr.length;

		System.out.println("Avarage of array Elements : " + avr);
	}
}
