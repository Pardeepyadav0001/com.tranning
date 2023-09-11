package assignment3;

import java.util.Scanner;

public class checkleapyear {

	boolean isLeapYr(int y) { // method declareing

		if ((y % 100) == 0) { // if condition that handles
								// the century year
			if ((y % 400) == 0) {
				return true;
			} else {
				return false;
			}

		}

		if ((y % 4) == 0) { // if condition that handles the
							// non century year
			return true;
		}

		return false;
	}

	// main method
	public static void main(String argvs[]) {
		Scanner sc = new Scanner(System.in);
		// creating an object of the class checkLeapYear
		checkleapyear obj = new checkleapyear();

		// getting input
		System.out.println("enter year to check leap year :");
		int year = sc.nextInt();

		if (obj.isLeapYr(year)) { // by calling method check the year with help of ittration
			System.out.println("The year " + year + " is a leap year.");
		} else {
			System.out.println("The year " + year + " is not a leap year.");
		}

		System.out.println();

	}

}
