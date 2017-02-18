package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack Flowers
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 12
 * 
 * Write a program that asks the user to enter the name of his or her favorite city. 
 * Use a String variable to store the input. The program should display the following:
 * 		The number of characters in the city name
 *		The name of the city in all uppercase letters
 * 		The name of the city in all lowercase letters
 * 		The first character in the name of the city
 */
public class StringManip {

	public static void main(String[] args)
	{
		String city;
		
		// Initialize Keyboard for input
		Scanner keyboard = new Scanner(System.in);
		
		// Retrieve input for favorite city 
		System.out.print("What is your favorite city?: ");
		city = keyboard.nextLine();
		
		// Display number of characters
		System.out.println("Number of characters: " + city.length());
		
		// Display City in caps
		System.out.println("Uppercase: " + city.toUpperCase());
		
		// Display City in lowercase
		System.out.println("Lowercase: " + city.toLowerCase());
		
		// Display First Character in the city
		System.out.println("First Character: " + city.charAt(0));
	}
}
