package chapter2;

/**
 * 
 * @author Zack
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 7
 * 
 * One acre of land is equivalent to 43,560 square feet. 
 * Write a program that calculates the number of acres in a tract of land with 389,767 square feet.
 * Hint: Divide the size of the tract of land by the size of an acre to get the number of acres.
 */
public class LandCalculation {

	public static void main(String[] args)
	{
		double acre = 43560;		// Hold size of an acre
		double land = 389767;		// Hold size of land
		double totalAcres;			// Hold total acres
		
		// Calculate total acres
		totalAcres = land / acre;
		
		// Output the total acres
		System.out.printf("The tract of land is %.3f acres.", totalAcres);
	}
}
