package chapter2;

/**
 * 
 * @author Zack Flowers
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 14
 * 
 * Kathryn bought 1000 shares of stock at a price of $25.50 per share. 
 * She must pay her stock broker a 2 percent commission for the transaction. 
 * Write a program that calculates and displays the following:
 * 		The amount paid for the stock alone (without the commission)
 *		The amount of the commission
 *		The total amount paid (for the stock plus the commission)
 */
public class StockCommission {

	public static void main(String[] args)
	{
		int numStocks = 1000;
		double priceOfStock = 25.50;
		double commissionPrice = 0.02;
		
		double stockPrice;
		double totalComm, totalPrice;
		
		// Calculate stock price w/o commission
		stockPrice = priceOfStock * numStocks;
		
		// Calculate Commission total
		totalComm = stockPrice * commissionPrice;
		
		// Calculate total
		totalPrice = totalComm + stockPrice;
		
		// Display Output
		System.out.printf("Stock Price: \t$%,.2f\n"+
						"Commission: \t$%,.2f\n"+
						"Total Price: \t$%,.2f", 
						stockPrice, totalComm, totalPrice);
	}
}
