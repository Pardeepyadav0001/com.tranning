package assignment3;

import java.util.regex.*;
import java.util.*;

public class checkmail {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a email id :");
		String emails = sc.next(); // getting the input

		Pattern pattern = Pattern.compile("^(.+)@(.+)$"); // pattern that to be checked in string
		Matcher macher = pattern.matcher(emails);

		if (macher.matches()) {
			System.out.println("valid email");
		} else {
			System.out.println("invalid email");
		}
	}

}
