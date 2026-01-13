package String;

import java.util.Scanner;

public class ValidAnagram {
	public static void main(String[] args) {
		String str, str2;
		Scanner scr = new Scanner(System.in);

		System.out.println("enter first String");
		str = scr.nextLine();
		System.out.println("enter Second String");
		str2 = scr.nextLine();

		char[] charArray = str.toCharArray();
		char[] charArray2 = str2.toCharArray();
		boolean flag = false;

		if (!(charArray.length == charArray2.length)) {
			System.out.println("String is not anagram");
			return;
		}

		for (int i = 0; i < charArray.length; i++) {
			flag = false;
			for (int j = 0; j < charArray2.length; j++) {
				if ((charArray[i] == charArray2[j])) {
					charArray2[j] = '0';
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("String is not anagram");
				return;
			}
		}
		System.out.println("String is anagram");
	}
}
