package array;

import java.util.Scanner;

//it count a frequency of elements when and array is in sorted form
public class FrequencyOfElements {
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

		System.out.println("Frequency:");

		for (int i = 0; i < arr.length; i++) {
			int count = 1;

			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				count++;
				i++;
			}

			System.out.println(arr[i] + " -> " + count);
		}

	}
}
