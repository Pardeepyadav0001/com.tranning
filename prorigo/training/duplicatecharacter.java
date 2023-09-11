package assignment2;

import java.util.Scanner;

public class duplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String :");
		String string1 = sc.next();
		int count;

		char string[] = string1.toCharArray(); // Converts given string into character array

		System.out.println("Duplicate characters in a given string: ");

		for (int i = 0; i < string.length; i++) { // Counts each character present in the string
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;

					string[j] = '0'; // Set string[j] to 0 to avoid printing visited character
				}
			}

			if (count > 1 && string[i] != '0') {// A character is considered as duplicate if count is greater than 1

				System.out.println(string[i]);
			}
		}
	}
}
