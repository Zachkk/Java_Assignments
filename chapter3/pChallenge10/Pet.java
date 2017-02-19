package chapter3.pChallenge10;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 10
 * 
 * Design a class named Pet, which should have the following fields:
 * 		- name. The name field holds the name of a pet.
 * 		- type. The type field holds the type of animal that a pet is. 
 * 			Example values are “Dog”, “Cat”, and “Bird”.
 * 		- age. The age field holds the pet’s age.
 * 
 * The Pet class should also have the following methods:
 * 		- setName. The setName method stores a value in the name field.
 * 		- setType. The setType method stores a value in the type field.
 * 		- setAge. The setAge method stores a value in the age field.
 * 		- getName. The getName method returns the value of the name field.
 * 		- gettype. The getType method returns the value of the type field.
 * 		- getAge. The getAge method returns the value of the age field.
 * 
 * Once you have designed the class, design a program that creates an object of the class and
 * prompts the user to enter the name, type, and age of his or her pet. 
 * 
 * This data should be stored in the object. 
 * 
 * Use the object’s accessor methods to retrieve the pet’s name, type, and age and display 
 * 	this data on the screen.
 */
public class Pet {

	private String name;			// Hold the name of an animal
	private String typeOfAnimal;	// Hold the type of animal
	private int age;				// Hold the age of the animal
	
	/**
	 * Default Constructor
	 */
	public Pet()
	{
		name = "";
		typeOfAnimal = "";
		age = 0;
	}
	
	/**
	 * Constructor that accepts name, type, and age of an animal
	 */
	public Pet(String n, String t, int a)
	{
		name = n;
		typeOfAnimal = t;
		age = a;
	}
	
	/**
	 * Set the name of an animal
	 * @param n
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * Set the type of animal
	 * @param t
	 */
	public void setType(String t)
	{
		typeOfAnimal = t;
	}
	
	/**
	 * Set the age of an animal
	 * @param a
	 */
	public void setAge(int a)
	{
		age = a;
	}
	
	/**
	 * Return name of an animal
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Return type of animal
	 * @return typeOfAnimal
	 */
	public String getType()
	{
		return typeOfAnimal;
	}
	
	/**
	 * Return age of animal
	 * @return age
	 */
	public int getAge()
	{
		return age;
	}
}
