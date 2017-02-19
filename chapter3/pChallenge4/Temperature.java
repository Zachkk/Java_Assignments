package chapter3.pChallenge4;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 4
 * 
 * Write a Temperature class that will hold a temperature in Fahrenheit and provide methods
 * 	to get the temperature in Fahrenheit, Celsius, and Kelvin. 
 * The class should have the following field:
 * 		- ftemp. A double that holds a Fahrenheit temperature.
 * 
 * The class should have the following methods:
 * 		- Constructor: The constructor accepts a Fahrenheit temperature (as a double ) and
 * 			stores it in the ftemp field.
 * 		- setFahrenheit: The setFahrenheit method accepts a Fahrenheit temperature (as a
 * 			double ) and stores it in the ftemp field.
 * 		- getFahrenheit: Returns the value of the ftemp field, as a Fahrenheit temperature (no
 * 			conversion required).
 * 		- getCelsius: Returns the value of the ftemp field converted to Celsius.
 * 		- getKelvin: Returns the value of the ftemp field converted to Kelvin.
 * 
 * Use the following formula to convert the Fahrenheit temperature to Celsius:
 * 		- Celsius = (5/9) * (Fahrenheit - 32)
 * 
 * Use the following formula to convert the Fahrenheit temperature to Kelvin:
 * 		- Kelvin = ((5/9) * (Fahrenheit - 32)) + 273
 * 
 * Demonstrate the Temperature class by writing a separate program that asks the user for a
 * 	Fahrenheit temperature. 
 * The program should create an instance of the Temperature class, with the value entered by 
 * 	the user passed to the constructor. 
 * The program should then call the object’s methods to display the temperature in 
 * 	Celsius and Kelvin.
 */
public class Temperature {

	private double ftemp;		// Holds the Fahrenheit temperature
	
	/**
	 * Constructor
	 * @param temp
	 */
	public Temperature(double temp)
	{
		ftemp = temp;
	}
	
	/**
	 * Set the Fahrenheit temperature
	 * @param temp
	 */
	public void setFahrenheit(double temp)
	{
		ftemp = temp;
	}
	
	/**
	 * Return the Fahrenheit temperature
	 * @return ftemp
	 */
	public double getFahrenheit()
	{
		return ftemp;
	}
	
	/**
	 * Return Fahrenheit temperature into celcius
	 * @return
	 */
	public double getCelcius()
	{
		return (5 * (ftemp - 32) / 9);
	}
	
	/**
	 * Return Fahrenheit temperature into kelvin
	 * @return
	 */
	public double getKelvin()
	{
		return (( 5 * (ftemp - 32)) / 9) + 273;
	}
}
