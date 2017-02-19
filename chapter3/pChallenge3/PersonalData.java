package chapter3.pChallenge3;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 3
 *
 * Design a class that holds the following personal data: name, address, age, and phone number.
 * Write appropriate accessor and mutator methods. 
 * Demonstrate the class by writing a program that creates three instances of it. 
 * One instance should hold your information, and the other two should hold your 
 * 	friends’ or family members’ information.
 */
public class PersonalData {

	private String name;			// Hold's the name
	private String address;			// Hold's the address
	private int age;				// Hold's the age
	private String phone;			// Hold's the phone
	
	
	/**
	 * Constructor
	 */
	public PersonalData(String n, String add, int a, String p)
	{
		name = n;
		address = add;
		age = a;
		phone = p;
	}
	
	/**
	 * Set name of the individual
	 * @param n
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * Set address of the individual
	 * @param a
	 */
	public void setAddress(String a)
	{
		address = a;
	}
	
	/**
	 * Set the age of the individual
	 * @param a
	 */
	public void setAge(int a)
	{
		age = a;
	}
	
	/**
	 * Set the phone of the individual
	 * @param p
	 */
	public void setPhone(String p)
	{
		phone = p;
	}
	
	
	/**
	 * Return the individual's name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Return the individual's address
	 * @return address
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * Return the individual's age
	 * @return age
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * Return the individual's phone number
	 * @return phone
	 */
	public String getPhone()
	{
		return phone;
	}
}
