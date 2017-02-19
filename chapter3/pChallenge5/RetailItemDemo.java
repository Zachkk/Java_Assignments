package chapter3.pChallenge5;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 5
 * 
 */
public class RetailItemDemo {

	public static void main(String[] args)
	{
		// Initialize with default constructor
		RetailItem item = new RetailItem();
		
		item.setDescription("This item does stuff!");
		item.setUnitsOnHand(123);
		item.setPrice(3.99);
		
		// Initialize with constructor
		RetailItem item2 = new RetailItem("This item doesn't do things", 50, 4.99);
		
		// Display both items
		System.out.println(item.getDescription() +"\t\t"+item.getUnitsOnHand()+"\t"+
							item.getPrice());
		
		System.out.println(item2.getDescription() +"\t"+item2.getUnitsOnHand()+"\t"+
							item2.getPrice());	
	}
}
