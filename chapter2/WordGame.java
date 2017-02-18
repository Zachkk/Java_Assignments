package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack Flowers
 * Date: 2/17/2017
 * Chapter: 2
 * Programming Challenge 17
 * 
 * Write a program that plays a word game with the user. 
 * The program should ask the user to enter the following:
 *		His or her name
 *		His or her age
 *		The name of a city
 *		The name of a college
 *		A profession
 *		A type of animal
 *		A pet’s name
 * After the user has entered these items, the program should display the following story,
 * 	inserting the user’s input into the appropriate locations:
 * 		There once was a person named NAME who lived in CITY. 
 * 		At the age of AGE, NAME went to college at COLLEGE. 
 * 		NAME graduated and went to work as a PROFESSION. 
 * 		Then, NAME adopted a(n) ANIMAL named PETNAME. 
 * 		They both lived happily ever after!
 */
public class WordGame {

	public static void main(String[] args)
	{
		String name, city, college, profession, animal, petName;
		int age;
		
		// Initialize scanner for input
		Scanner keyboard = new Scanner(System.in);
		
		// Input name
		System.out.print("What is your name?: ");
		name = keyboard.nextLine();
		
		// Input age
		System.out.print("What is your age?: ");
		age = keyboard.nextInt();
		
		// To clear the \n
		keyboard.nextLine();
		
		// Input city
		System.out.print("Where do you live?: ");
		city = keyboard.nextLine();
		
		// Input college
		System.out.print("What college do you go to?: ");
		college = keyboard.nextLine();
		
		// Input profession
		System.out.print("What profession do you want?: ");
		profession = keyboard.nextLine();
		
		// Input animal
		System.out.print("Name a type of animal: ");
		animal = keyboard.nextLine();
		
		// Input name of pet
		System.out.print("What's a name for a pet?: ");
		petName = keyboard.nextLine();
		
		// Display story
		System.out.println("There once was a person named " + name + " who"+
						" lived in "+city+ ".\nAt the age of " +age+ ", " +name+
						" went to college at "+college+". \n"+name+ " graduated"+
						" and went to work as a "+profession+".\nThen, "+name+
						" adopted a(n) "+animal+ " named "+petName+".\nThey both "+
						"lived happily ever after!");
	}
}
