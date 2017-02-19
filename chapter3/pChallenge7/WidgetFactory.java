package chapter3.pChallenge7;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 7
 * 
 * Design a class for a widget manufacturing plant. 
 * The class should have a method whose argument is the number of widgets that must be produced.
 * The class should have another method that calculates how many days it will take to produce 
 * 	the number of widgets.
 * (Assume that 10 widgets can be produced each hour. 
 * The plant operates two shifts of eight hours each per day.)
 * 
 * Demonstrate the class by writing a separate program that creates an instance of the class.
 * The program should pass a number of widgets to the object and call the object’s method
 * 	that displays the number of days it will take to produce that many widgets.
 */ 
public class WidgetFactory {

	private final int WIDGETS_HOUR = 10;		// Number of widgets made per hour
	private final int HOURS_OPEN = 16;			// Number of hours factory is opened
	
	private double widgets;						// Hold the amount of widgets to be produced
	
	/**
	 * Default Constructor
	 */
	public WidgetFactory() 
	{
		widgets = 0;
	}
	
	/**
	 * Constructor that accepts the amount of widgets to produce
	 * @param w
	 */
	public WidgetFactory(double w)
	{
		widgets = w;
	}
	
	/**
	 * Set the amount of widgets to be produced
	 * @param w
	 */
	public void setWidgets(double w)
	{
		widgets = w;
	}
	
	/**
	 * Return how many widgets need to be produced
	 * @return widgets
	 */
	public double getWidgets()
	{
		return widgets;
	}
	
	/**
	 * Return the amount of days needed to produce said number of widgets
	 * @return days
	 */
	public double getProductionTime()
	{
		return (widgets / (HOURS_OPEN * WIDGETS_HOUR));
	}
	
}
