package array;

import java.util.Scanner;

public class MissingNoInArray {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter Array Elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Missing Elements Of Array");

		int temp = 1;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != temp) {
				if (arr[i] == temp)
					break;
				System.out.print(temp + "\s");
				temp++;
			}
		}

	}
}
