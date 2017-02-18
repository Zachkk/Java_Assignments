package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 5
 * 
 * A bag of cookies holds 40 cookies. 
 * The calorie information on the bag claims that there are 10 servings 
 * 		in the bag and that a serving equals 300 calories. 
 * Write a program that lets the user enter the number of cookies he or 
 * 		she actually ate and then reports the number of total calories consumed.
 */
public class CookieCalories {
	
	public static void main(String[] args) 
	{
		int calories = 75;
		double numCookies;
		double numCalories;
		
		// Initialize keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Input how many cookies
		System.out.print("How many cookies did you eat?: ");
		numCookies = keyboard.nextDouble();
		
		// Calculate calories
		numCalories = numCookies * calories;
		
		// Display Calories
		System.out.printf("You have consumed: %.0f calories.", numCalories);
		
	}
}
