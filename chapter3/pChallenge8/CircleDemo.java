package chapter3.pChallenge8;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 8
 * 
 */
public class CircleDemo {

	public static void main(String[] args)
	{
		// Create instance of a circle with 24.5 radius
		Circle circle = new Circle(24.5);
		
		// Display radius, diameter, area, and circumference
		System.out.printf("Radius: \t%.2f\n"+
						"Diameter: \t%.2f\n"+
						"Area: \t\t%.2f\n"+
						"Circumference: \t%.2f", 
						circle.getRadius(), circle.getDiameter(),
						circle.getArea(), circle.getCircumference());
	}
}
