package assignment2;

import java.util.Scanner;

public class charactermin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] freq = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i, j, min, max;

		char string[] = str.toCharArray(); // Converts given string into character array

		for (i = 0; i < string.length; i++) { // Count each word in given string and store in array frequency
			freq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;

					string[j] = '0'; // Set string[j] to 0 to avoid printing visited character
				}
			}
		}

		min = max = freq[0]; // Determine minimum and maximum occurring characters
		for (i = 0; i < freq.length; i++) {

			// If min is greater than frequency of a character
			// then, store frequency in min and corresponding character in minChar
			if (min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = string[i];
			}
			// If max is less than frequency of a character
			// then, store frequency in max and corresponding character in maxChar
			if (max < freq[i]) {
				max = freq[i];
				maxChar = string[i];
			}
		}

		System.out.println("Minimum occurring character: " + minChar);
		System.out.println("Maximum occurring character: " + maxChar);
	}

}
