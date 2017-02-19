package chapter3.pChallenge9;

import java.util.Scanner;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 9
 * 
 */
public class TestScoresDemo {

	public static void main(String[] args)
	{
		// Hold the three test scores
		double test1, test2, test3;
		
		// Initialize scanner for user input
		Scanner keyboard = new Scanner(System.in);
		
		// Retrieve test score #1
		System.out.print("Enter test score for Test #1: ");
		test1 = keyboard.nextDouble();
		
		// Retrieve test score #2
		System.out.print("Enter test score for Test #2: ");
		test2 = keyboard.nextDouble();
		
		// Retrieve test score #3
		System.out.print("Enter test score for Test #3: ");
		test3 = keyboard.nextDouble();
		
		// Create instance of TestScores
		TestScores test = new TestScores(test1, test2, test3);
		
		// Display the test scores and the average overall
		System.out.printf("Test Score #1: \t%.2f\n"+
						"Test Score #2: \t%.2f\n"+
						"Test Score #3: \t%.2f\n\n"+
						"Test Average: \t%.2f", 
						test1, test2, test3, test.getAverage());
	}
}
