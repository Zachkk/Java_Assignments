package chapter2;

/**
 * 
 * @author Zack Flowers
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 6
 * 
 * The East Coast sales division of a company generates 65 percent of total sales. 
 * Based on that percentage, write a program that will predict how much the East 
 * 		Coast division will generate if the company has $8.3 million in sales this year.
 * Hint: Use the value 0.65 to represent 65 percent.
 */
public class SalesPrediction {

	public static void main(String[] args) 
	{
		
		double totalSales = 8300000;			// Hold Total Sales
		double eastCoastPortion = 0.65;			// Hold 65% 
		double eastTotal;						// East Coast's total sales
		
		// Calculate East Coast Divisions sales
		eastTotal = totalSales * eastCoastPortion;
		
		// Output the total sales
		System.out.printf("East Coast Division will make $%,.2f this year.", eastTotal);
	}
}
