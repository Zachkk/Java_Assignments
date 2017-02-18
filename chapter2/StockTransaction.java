package chapter2;

/**
 * 
 * @author Zack Flowers
 * Date: 2/18/2017
 * Chapter: 2
 * Programming Challenge 18
 * 
 * Last month Joe purchased some stock in Acme Software, Inc. 
 * Here are the details of the purchase:
 * 		- The number of shares that Joe purchased was 1,000.
 *		- When Joe purchased the stock, he paid $32.87 per share.
 *		- Joe paid his stockbroker a commission that amounted to 2% of the amount he paid
 *			 for the stock.
 *
 * Two weeks later Joe sold the stock. Here are the details of the sale:
 *		- The number of shares that Joe sold was 1,000.
 *		- He sold the stock for $33.92 per share.
 *		- He paid his stockbroker another commission that amounted to 2% of the amount he
 * 			 received for the stock.
 * 
 * Write a program that displays the following information:
 * 		- The amount of money Joe paid for the stock.
 * 		- The amount of commission Joe paid his broker when he bought the stock.
 * 		- The amount that Joe sold the stock for.
 *		- The amount of commission Joe paid his broker when he sold the stock.
 * 		- Display the amount of profit that Joe made after selling his stock and 
 *			 paying the two commissions to his broker. 
 * 
 * (If the amount of profit that your program displays is a negative number, 
 * 		then Joe lost money on the transaction.)
 */
public class StockTransaction {

	public static void main(String[] args)
	{
		// Bought & Sold 1k stocks
		int numShares = 1000;
		
		// Starting cost of the stock
		double startingPrice = 32.87;
		
		// Ending selling price for the stock
		double endingPrice = 33.92;
				
		// Commission for before & after transactions
		double commissionPrice = 0.02;
		
		double totalSPrice, totalSComm, totalEPrice, totalEComm, totalProfit;
		
		// Total Starting Stock Price
		totalSPrice = numShares * startingPrice;
		
		// Total Starting Commission Price
		totalSComm = totalSPrice * commissionPrice;
		
		// Total Ending Stock Price
		totalEPrice = numShares * endingPrice;
		
		// Total Ending Commission Price
		totalEComm = totalEPrice * commissionPrice;
		
		// Total profit = Ending price - Starting Price - Commissions
		totalProfit = totalEPrice - totalSPrice - totalSComm - totalEComm;
		
		// Display output
		// Format : Formatted to commas, two decimal places, right align
		System.out.printf("Stock Purchase: \t$%,10.2f\n"+
						"Purchase Comm: \t\t$%,10.2f\n"+
						"Selling Price: \t\t$%,10.2f\n"+
						"Selling Comm: \t\t$%,10.2f\n"+
						"Total Profit: \t\t$%,10.2f", 
						totalSPrice, totalSComm, totalEPrice, totalEComm, totalProfit);
	}
}
