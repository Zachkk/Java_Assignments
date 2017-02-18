package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack Flowers
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 13
 * 
 * Write a program that computes the tax and tip on a restaurant bill. 
 * The program should ask the user to enter the charge for the meal. 
 * The tax should be 7.5 percent of the meal charge.
 * The tip should be 18 percent of the total after adding the tax. 
 * Display the meal charge, tax amount, tip amount, and total bill on the screen.
 */
public class RestaurantBill {
	
	public static void main(String[] args)
	{
		// Hold the percentage values for tax & tip amounts
		double taxRate = 0.075, tipRate = 0.18;
		
		double mealPrice;			// Hold regular meal price
		double taxAmount;			// Hold total tax amount
		double tipAmount;			// Hold total tip amount
		double total;				// Hold total bill
		
		// Initialize keyboard for input
		Scanner keyboard = new Scanner(System.in);
		
		// Input Meal Price
		System.out.print("What was the price of your meal?: ");
		mealPrice = keyboard.nextDouble();
		
		// Calculate Total Tax Amount
		taxAmount = mealPrice * taxRate;
		
		// Calculate total Tip Amount
		tipAmount = (mealPrice + taxAmount) * tipRate;
		
		// Calculate Total
		total = mealPrice + tipAmount + taxAmount;
		
		// Display Prices to user
		System.out.printf("Meal Price: $%.2f\n"+
						"Tax Amount: $%.2f\n"+
						"Tip Amount: $%.2f\n"+
						"Total Bill: $%.2f", 
						mealPrice, taxAmount, tipAmount, total);
	}
}
