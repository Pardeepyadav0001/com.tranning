package com.prorigo.training;
import java.util.Scanner;
public class addtion {

	
		// TODO Auto-generated method stub
		 // Import the Scanner class

		
		  public static void main(String[] args) {
		    int x, y, sum;
		    Scanner myObj = new Scanner(System.in); // Create a Scanner object
		    System.out.println("Type a number:");
		    x = myObj.nextInt(); // Read user input

		    System.out.println("Type another number:");
		    y = myObj.nextInt(); // Read user input

		    sum = x + y;  // Calculate the sum of x + y
		    System.out.println("Sum is: " + sum); // Print the sum
		    myObj.close();
		  }
		} 
	


