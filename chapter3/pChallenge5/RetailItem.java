package chapter3.pChallenge5;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 5
 * 
 * Write a class named RetailItem that holds data about an item in a retail store. 
 * The class should have the following fields:
 * 		- description. The description field is a String object that holds a brief description
 * 			of the item.
 * 		- unitsOnHand. The unitsOnHand field is an int variable that holds the number of units
 * 			currently in inventory.
 * 		- price. The price field is a double that holds the item’s retail price.
 * 
 * Write appropriate mutator methods that store values in these fields and accessor methods
 * 	that return the values in these fields. Once you have written the class, 
 * 	write a separate program that creates three RetailItem objects and stores 
 * 	the following data in them.
 */
public class RetailItem {

	private String description;		// Hold Description of an item
	private int unitsOnHand;		// Hold Units On Hand of item
	private double price;			// Hold the price of an item
	
	/**
	 * Default Constructor
	 */
	public RetailItem() {
		description = "";
		unitsOnHand = 0;
		price = 0;
	}
	
	/**
	 * Constructor
	 */
	public RetailItem(String d, int u, double p)
	{
		description = d;
		unitsOnHand = u;
		price = p;
	}
	
	/**
	 * Set Description of an item
	 * @param d
	 */
	public void setDescription(String d)
	{
		description = d;
	}
	
	/**
	 * Set how many units of an item
	 * @param u
	 */
	public void setUnitsOnHand(int u)
	{
		unitsOnHand = u;
	}
	
	/**
	 * Set price of an item
	 * @param p
	 */
	public void setPrice(double p)
	{
		price = p;
	}
	
	/**
	 * Return description of an item
	 * @return description
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * Return Units on hand of an item
	 * @return unitsOnHand
	 */
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	
	/**
	 * Return Price of an item
	 * @return price
	 */
	public double getPrice()
	{
		return price;
	}
}
