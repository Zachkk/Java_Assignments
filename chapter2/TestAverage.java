package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack Flowers
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 10
 * 
 * Write a program that asks the user to enter three test scores. 
 * The program should display each test score, as well as the average of the scores.
 */
public class TestAverage {

	public static void main(String[] args)
	{
		double test1, test2, test3, total, average;
		
		// Initialize for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Input test scores
		System.out.print("What was the test scores for test #1?: ");
		test1 = keyboard.nextDouble();
		
		System.out.print("What was the test scores for test #1?: ");
		test2 = keyboard.nextDouble();
		
		System.out.print("What was the test scores for test #1?: ");
		test3 = keyboard.nextDouble();
		
		// Calculate Total
		total = test1 + test2 + test3;
		
		// Calculate average
		average = total / 3;
		
		// Display Average;
		System.out.printf("The total test score average was %.2f.", average);
	}
}
