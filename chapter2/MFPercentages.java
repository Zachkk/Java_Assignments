package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack 
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 11
 * 
 * Write a program that asks the user for the number of males and the number of females
 * 		registered in a class. 
 * The program should display the percentage of males and females in the class.
 * 
 * Hint: Suppose there are 8 males and 12 females in a class. 
 * There are 20 students in the class. 
 * The percentage of males can be calculated as 8 ÷ 20 = 0.4, or 40%. 
 * The percentage of females can be calculated as 12 ÷ 20 = 0.6, or 60%.
 */
public class MFPercentages {

	public static void main(String[] args)
	{
		double males, females, malePercent, femalePercent, students;
		
		// Initialize Keyboard for input
		Scanner keyboard = new Scanner(System.in);
		
		// Input Male Students
		System.out.print("How many male students?: ");
		males = keyboard.nextDouble();
		
		// Input Female Students
		System.out.print("How many female students?: ");
		females = keyboard.nextDouble();
		
		// Calculate total students
		students = males + females;
		
		// Calculate male percentage
		malePercent = males / students;
		
		// Calculate female percentage
		femalePercent = females / students;
		
		// Display Male & Female Numbers
		System.out.printf("\nMale Students: %.0f\n"+
						"Female Students: %.0f\n"+
						"Total Students: %.0f\n"+
						"Male Percentage: %.3f\n"+
						"Female Percentage: %.3f", 
						males, females, students, malePercent, femalePercent);
	}
}
