package chapter2;

/**
 * 
 * @author Zack
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 16
 * 
 * A soft-drink company recently surveyed 15,000 of its customers and 
 * 	found that approximately 18 percent of those surveyed purchase 
 * 	one of more energy drinks per week. 
 * Of those customers who purchase energy drinks, approximately 58 percent 
 * 	of them prefer citrus flavored energy drinks. 
 * Write a program that displays the following:
 * 		The approximate number of customers in the survey who purchase one or more
			energy drinks per week
 *		The approximate number of customers in the survey who prefer citrus-
 *			flavored energy drinks
 */
public class EnergyDrink {

	public static void main(String[] args)
	{
		int numCustomers = 15000;
		double purchased = 0.18;
		double citrus = 0.58;
		double customersPurchased, citrusDrinkers;
		
		// How many drink one or more a week
		customersPurchased = numCustomers * purchased;
		
		// How many prefer citrus
		citrusDrinkers = customersPurchased * citrus;
		
		// Display Total Customers & Citrus Drinkers
		System.out.printf("Customers: \t\t%.0f\n"+
						"Citrus Drinkers: \t%.0f", 
						customersPurchased, citrusDrinkers);
		
	}
}
