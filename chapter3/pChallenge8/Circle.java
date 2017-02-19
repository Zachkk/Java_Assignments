package chapter3.pChallenge8;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 8
 * 
 * Write a Circle class that has the following fields:
 * 		- radius: a double
 * 		- PI: a final double initialized with the value 3.14159
 * 
 * The class should have the following methods:
 * 		- Constructor. Accepts the radius of the circle as an argument.
 * 		- setRadius. A mutator method for the radius field.
 * 		- getRadius. An accessor method for the radius field.
 * 		- getArea. Returns the area of the circle, which is calculated as
 *				area = PI * radius * radius
 * 		- getDiameter. Returns the diameter of the circle, which is calculated as
 * 				diameter = radius * 2
 * 		- getCircumference. Returns the circumference of the circle, which is calculated as
 * 				circumference = 2 * PI * radius
 * 
 * Write a program that demonstrates the Circle class by asking the user for the circle’s
 * 		radius, creating a Circle object, and then reporting the circle’s area, diameter, and
 * 		circumference.
 */
public class Circle {

	private final double PI = 3.14159;		// Holds PI
	private double radius; 					// Holds the radius of a circle
	
	/**
	 * Default Constructor
	 */
	public Circle() {
		radius = 0;
	}
	
	/**
	 * Constructor that accepts a radius
	 * @param r
	 */
	public Circle(double r)
	{
		radius = r;
	}
	
	/**
	 * Set the radius of a circle
	 * @param r
	 */
	public void setRadius(double r)
	{
		radius = r;
	}
	
	/**
	 * Return the radius of a circle
	 * @return
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * Returns the area of a circle
	 * @return PI*r^2
	 */
	public double getArea() 
	{
		return (PI * (radius * radius));
	}
	
	/**
	 * Returns the diameter of a circle
	 * @return radius * 2
	 */
	public double getDiameter()
	{
		return (radius * 2);
	}
	
	/**
	 * Returns the circumference of a circle
	 * @return 2 * PI * radius
	 */
	public double getCircumference()
	{
		return (2 * PI * radius);
	}
}
