package chapter3.pChallenge2;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 2
 *
 * Write a class named Car that has the following fields:
 * 		- yearModel. The yearModel field is an int that holds the car’s year model.
 * 		- make. The make field is a String object that holds the make of the car.
 * 		- speed. The speed field is an int that holds the car’s current speed.
 * 
 * In addition, the class should have the following methods.
 * 		- Constructor. The constructor should accept the car’s year model and make 
 * 			as arguments. These values should be assigned to the object’s yearModel 
 * 			and make fields. The constructor should also assign 0 to the speed field.
 * 		- Accessor. The appropriate accessor methods get the values stored in an object’s
 *			yearModel, make, and speed fields.
 * 		- accelerate. The accelerate method should add 5 to the speed field each time it is
 * 			called.
 * 		- brake. The brake method should subtract 5 from the speed field each time it is called.
 * 
 * Demonstrate the class in a program that creates a Car object, and then calls the accelerate
 * 	method five times. 
 * After each call to the accelerate method, get the current speed of the car and display it. 
 * Then, call the brake method five times. After each call to the brake method,
 * 	get the current speed of the car and display it.
 */
public class Car {

	private int yearModel;		// Hold the year of the car
	private String make;		// Hold the model of the car
	private int speed;			// Hold the speed of the car
	
	/**
	 * Constructor
	 * @param y
	 * @param m
	 */
	public Car(int y, String m)
	{
		yearModel = y;
		make = m;
		speed = 0;
	}
	
	/**
	 * Set the year of the car
	 * @param y
	 */
	public void setYear(int y)
	{
		yearModel = y;
	}
	
	/**
	 * Set the make of the car
	 * @param m
	 */
	public void setMake(String m)
	{
		make = m;
	}
	
	/**
	 * Set the speed of the car
	 * @param s
	 */
	public void setSpeed(int s) 
	{
		speed = s;
	}
	
	/**
	 * Return the year of the car
	 * @return yearModel
	 */
	public int getYear()
	{
		return yearModel;
	}
	
	/**
	 * Return the make of the car
	 * @return make
	 */
	public String getMake()
	{
		return make;
	}
	
	/**
	 * Return the speed of the car
	 * @return speed
	 */
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * Each time accelerate is called, add 5 to the speed
	 */
	public void accelerate() 
	{
		speed += 5;
	}
	
	/**
	 * Each time brake is called, subtract 5 from speed
	 */
	public void brake() 
	{
		speed -= 5;
	}
}
