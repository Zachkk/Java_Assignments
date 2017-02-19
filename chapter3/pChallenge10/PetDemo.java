package chapter3.pChallenge10;

import java.util.Scanner;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 10
 * 
 */
public class PetDemo {

	public static void main(String[] args)
	{
		String name, typeOfAnimal;
		int age;
		
		// Initialize Scanner for user input
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("What's the name of your pet?: ");
		name = keyboard.nextLine();
		
		System.out.print("What type of pet is it?: ");
		typeOfAnimal = keyboard.nextLine();
		
		System.out.print("How old is your pet?: ");
		age = keyboard.nextInt();
		
		// Create an instance of Pet
		Pet pet = new Pet(name, typeOfAnimal, age);
		
		// Display pet information to user
		System.out.printf("\nPet's Name: \t%s\n"+
							"Pet's Type: \t%s\n"+
							"Pet's Age: \t%d", 
							name, typeOfAnimal, age);
	}
}
