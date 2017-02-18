package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack 
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 9
 * 
 * A car’s miles-per-gallon (MPG) can be calculated with the following formula:
 * 		MPG = Miles driven / Gallons of gas used
 * 
 * Write a program that asks the user for the number of miles driven and the gallons of gas used. 
 * It should calculate the car’s MPG and display the result on the screen.
 */
public class MilesPerGallon {

	public static void main(String[] args)
	{
		double milesDriven, gasUsed, mpg;
		
		// Initalize keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Input miles driven
		System.out.print("How many miles did you drive?: ");
		milesDriven = keyboard.nextDouble();
		
		// Input Gas Used
		System.out.print("How many gallons of gas used?: ");
		gasUsed = keyboard.nextDouble();
		
		// Calculate MPG
		mpg = milesDriven / gasUsed;
		
		// Display MPG
		System.out.printf("The car's total MPG is: %.2f", mpg);
	}
}
