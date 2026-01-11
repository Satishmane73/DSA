package array;

import java.util.Scanner;

public class FindEvenAndOdd {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		int even = 0, odd = 0;

		for (int num : arr) {
			if (num % 2 == 0)
				even++;
			else
				odd++;
		}

		System.out.println("\nEven numbers : " + even + "\nOdd numbers : " + odd);
	}
}
