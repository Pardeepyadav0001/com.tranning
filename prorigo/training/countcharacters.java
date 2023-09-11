package assignment2;
import java.util.Scanner;
public class countcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String :");
		String s = sc.next();
		int count = 0;

		for (int i = 0; i < s.length(); i++) { // Counts each character except space
			if (s.charAt(i) != ' ')
				count++;
		}

		System.out.println("Total number of characters in a string: " + count); // Displays the total number of
																				// characters present in the given
																				// string
	}
}
