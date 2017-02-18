package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 15
 * 
 * A cookie recipe calls for the following ingredients:
 * 		1.5 cups of sugar
 * 		1 cup of butter
 *		2.75 cups of flour
 *
 * The recipe produces 48 cookies with these amounts of the ingredients. 
 * Write a program that asks the user how many cookies he or she wants to 
 * 		make and then displays the number of cups of each ingredient needed 
 * 		for the specified number of cookies.
 */
public class IngridientAdjuster {

	public static void main(String[] args)
	{
		double numCookies;
		
		// Default Variables
		double dSugar = 1.5, dButter = 1, dFlour = 2.75;
		
		// Total Variables
		double totalSugar, totalButter, totalFlour;
		
		// Initialize Scanner for input
		Scanner keyboard = new Scanner(System.in);
		
		// Retrieve Number of cookies
		System.out.print("How many cookies do you want to make?: ");
		numCookies = keyboard.nextDouble();
		
		totalSugar = (numCookies / 48) * dSugar;
		totalButter = (numCookies / 48) * dButter;
		totalFlour = (numCookies / 48) * dFlour;
		
		// Display Formatted output 
		System.out.printf("Number of Cookies: \t%.0f\n"+
						"Cups of Sugar: \t\t%.2f\n"+
						"Cups of Butter: \t%.2f\n"+
						"Cups of Flour: \t\t%.2f", 
						numCookies, totalSugar, totalButter, totalFlour);
	}
}
