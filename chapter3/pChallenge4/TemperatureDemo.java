package chapter3.pChallenge4;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 4
 */
public class TemperatureDemo {

	public static void main(String[] args)
	{
		// Create an instance of Temperature
		Temperature temp = new Temperature(100);
		
		// Display & Convert 100 Degrees fahrenheit
		System.out.printf("Fahrenheit: \t%.2f\n"+
						"Celcius: \t%.2f\n"+
						"Kelvin: \t%.2f", 
						temp.getFahrenheit(), temp.getCelcius(), temp.getKelvin());
						
	}
}
