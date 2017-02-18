package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack Flowers
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 2
 * 
 * Write a program that has the following String variables: 
 * 		firstName, middleName, and lastName. 
 * Initialize these with your first, middle, and last names. 
 * The program should also have the following char variables: 
 * 		firstInitial, middleInitial, and lastInitial. 
 * Store your first, middle, and last initials in these variables. 
 * The program should display the contents of these variables on the screen.
 *
 */
public class NameInitials {

	public static void main(String[] args)
	{
		// String variables to hold first, middle, & last name
		String first, middle, last;
		
		// Char varaibles to hold first, middle, & last initials
		char fInitial, mInitial, lInitial;
		
		// Initalize input from keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Input First Name
		System.out.print("What is your first name?: ");
		first = keyboard.nextLine();
		
		// Input Middle Name
		System.out.print("What is your middle name?: ");
		middle = keyboard.nextLine();
		
		// Input Last name
		System.out.print("What is your last name?: ");
		last = keyboard.nextLine();
		
		// Retrieve Initials from first, middle, & last names
		fInitial = first.charAt(0);
		mInitial = middle.charAt(0);
		lInitial = last.charAt(0);
		
		// Display Name & Initials
		System.out.println("First Name: " + first + "\tFirst Initial: "+ fInitial + ".");
		System.out.println("Middle Name: " + middle + "\tMiddle Initial: "+ mInitial + ".");
		System.out.println("Last Name: " + last + "\tlast Initial: "+ lInitial + ".");
	}
}
