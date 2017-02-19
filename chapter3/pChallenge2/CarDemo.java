package chapter3.pChallenge2;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 2
 *
 * This class demonstrates class Car
 */
public class CarDemo {

	public static void main(String[] args)
	{
		// Create a car object
		Car car = new Car(1993, "Ford F150");
		
		// Begin Accelerating 5 times
		System.out.println("Begin accelerating...");
		for (int i = 0; i < 5; i++) {
			car.accelerate();
			System.out.println("Current Speed: "+ car.getSpeed());
		}
		
		// Begin to brake 5 times
		System.out.println("Begin to brake...");
		for (int i = 0; i < 5; i++) {
			car.brake();
			System.out.println("Current Speed: "+ car.getSpeed());
		}
	}
}
