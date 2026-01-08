package array;

import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] arr = new int[3];

		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		boolean foundSecond = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secMin = min;
				min = arr[i];
				if (secMin != Integer.MAX_VALUE) {
					foundSecond = true;
				}
			} else if (arr[i] > min && arr[i] < secMin) {
				secMin = arr[i];
				foundSecond = true;
			}
		}

		if (!foundSecond) {
			throw new IllegalArgumentException("Second Smallest Element Not Found");
		}

		System.out.println("Second Smallest element is " + secMin);
	}
}
