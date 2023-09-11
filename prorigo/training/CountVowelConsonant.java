package assignment2;

import java.util.Scanner;

public class CountVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vCount = 0, cCount = 0; // Counter variable to store the count of vowels and consonant
		System.out.println("enter the String :");
		String str = sc.next();

		str = str.toLowerCase(); // Converting entire string to lower case to reduce the comparisons

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') { // Checks whether a character is a vowel

				vCount++; // Increments the vowel counter
			}

			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') { // Checks whether a character is a consonant

				cCount++; // Increments the consonant counter
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}
}
