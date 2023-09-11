package assignment2;

import java.util.Scanner;

public class removewhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string to remove white spaces :");
		String str1 = sc.nextLine();

		str1 = str1.replaceAll("\\s+", ""); // Removes the white spaces using regex

		System.out.println("String after removing all the white spaces : " + str1);
	}
}
