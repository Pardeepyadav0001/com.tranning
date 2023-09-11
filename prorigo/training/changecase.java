package assignment2;

import java.util.Scanner;

public class changecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String :");
		String str1 = sc.next(); // getting input
		StringBuffer newStr = new StringBuffer(str1);

		for (int i = 0; i < str1.length(); i++) {

			if (Character.isLowerCase(str1.charAt(i))) { // Checks for lower case character

				newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i))); // Convert it into upper case using
																			// toUpperCase() function
			}

			else if (Character.isUpperCase(str1.charAt(i))) { // Checks for upper case character

				newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i))); // Convert it into upper case using
																			// toLowerCase() function
			}
		}
		System.out.println("String after case conversion : " + newStr);
	}
}
