package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] arr = new int[5];

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Array Elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.nextInt();
		}

		System.out.println(containsDuplicateUsingHashSet(arr));
	}

//	this is simple way to fine is array contains duplicate but the 
//	time complexity of this approach is O(n*n) 
//	not recommended

	public static boolean containsDubplicateBruteForse(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					return true;
			}
		}
		return false;
	}

//	In this approach the time complexity O(n log n) and space O(n) / O(log n)  
	public static boolean containsDuplicateUsingSorting(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				return true;
		}

		return false;
	}

//	this is a HashSet method and its best 
//  recommended  time and space complexity both is O(n)
	public static boolean containsDuplicateUsingHashSet(int[] arr) {
		HashSet<Integer> set = new HashSet<>();

		for (int nums : arr) {
			if (set.contains(nums))
				return true;
			set.add(nums);

		}
		return false;
	}
}
