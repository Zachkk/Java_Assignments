package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack Flowers
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 8
 * 
 * Write a program that will ask the user to enter the amount of a purchase. 
 * The program should then compute the state and county sales tax. 
 * Assume the state sales tax is 5.5 percent and the county sales tax is 2 percent. 
 * The program should display the amount of the purchase,
 * 		the state sales tax, the county sales tax, the total sales tax, and the total of the sale 
 * 		(which is the sum of the amount of purchase plus the total sales tax).
 * Hint: Use the value 0.02 to represent 2 percent, and 0.055 to represent 5.5 percent.
 */
public class SalesTax {

	public static void main(String[] args) 
	{
		double purchase, totalStateTax, totalCountyTax, totalTax, total;
		double stateTax = 0.055, countyTax = 0.02;
		
		// Initialize Keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Input purchase price
		System.out.print("How much is the purchase?: ");
		purchase = keyboard.nextDouble();
		
		// Calculate Taxes 
		totalStateTax = purchase * stateTax;
		totalCountyTax = purchase * countyTax;
		totalTax = totalStateTax + totalCountyTax;
		
		// Calculate total
		total = purchase + totalTax;
		
		// Display Total Price
		System.out.printf("Purchase Price: $%,.2f\n", purchase);
		System.out.printf("State Tax: %.3f\tCounty Tax: %.2f\n", stateTax, countyTax);
		System.out.printf("Sales Tax: $%,.2f"+
						"\tCounty Tax: $%,.2f"+
						"\tTotal Tax: $%,.2f\n", 
						totalStateTax, totalCountyTax, totalTax);
		System.out.printf("Total Price: $%,.2f", total);
	}
}
