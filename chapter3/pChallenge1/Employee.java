package chapter3.pChallenge1;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 1
 * 
 * Write a class named Employee that has the following fields:
 * 		- name. The name field is a String object that holds the employee’s name.
 * 		- idNumber. The idNumber is an int variable that holds the employee’s ID number.
 * 		- department. The department field is a String object that holds the name of the 
 * 			department where the employee works.
 * 		- position. The position field is a String object that holds the employee’s job title.
 * 
 * Write appropriate mutator methods that store values in these fields and accessor methods
 * 	that return the values in these fields. 
 * Once you have the written the class, write a separate program that creates 
 * 	three Employee objects to hold the following data.
 * 
 * Name				ID Number		Department		Position
 * Susan Meyers		47899			Accounting		Vice President
 * Mark Jones		39119			IT				Progammer
 * Joy Rogers		81774			Manufacturing	Engineer
 * 
 * The program should store this data in the three objects and then display the 
 * 	data for each employee on the screen.
 */
public class Employee {

	private String name;			// Hold the name of the employee
	private int idNumber;			// Hold the id number of the employee
	private String department;		// Hold the department of the employee
	private String position; 		// Hold the position of the employee
	
	/**
	 * Default Constructor
	 */
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	/**
	 * Constructor
	 */
	public Employee(String n, int i, String d, String p)
	{
		name = n;
		idNumber = i;
		department = d;
		position = p;
	}
	
	/**
	 * Set the name of the employee
	 * @param n
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * Set the id number of the employee
	 * @param i
	 */
	public void setIdNumber(int i)
	{
		idNumber = i;
	}
	
	/**
	 * Set the department of the employee
	 * @param d
	 */
	public void setDepartment(String d)
	{
		department = d;
	}
	
	/**
	 * Set the position of the employee
	 * @param p
	 */
	public void setPosition(String p)
	{
		position = p;
	}
	
	/**
	 * Return the name of the employee
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Return the id number of the employee
	 * @return
	 */
	public int getId()
	{
		return idNumber;
	}
	
	/**
	 * Return the department of the employee
	 * @return
	 */
	public String getDepartment()
	{
		return department;
	}
	
	/**
	 * Return the position of the employee
	 * @return
	 */
	public String getPosition()
	{
		return position;
	}
}
