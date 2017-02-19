package chapter3.pChallenge6;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 6
 * 
 * Design a Payroll class that has fields for an employee’s name, ID number, hourly pay rate,
 * 	and number of hours worked. 
 * Write the appropriate accessor and mutator methods and a constructor that accepts the 
 * 	employee’s name and ID number as arguments. 
 * The class should also have a method that returns the employee’s gross pay, 
 * 	which is calculated as the number of hours worked multiplied by the hourly pay rate. 
 * Write a program that demonstrates the class by creating a Payroll object, 
 * 	then asking the user to enter the data for an employee. 
 * The program should display the amount of gross pay earned.
 */
public class Payroll {

	private String name; 			// Hold Employee's name
	private int idNumber;			// Hold Employee's Id Number
	private double payRate;			// Hold Employee's Pay Rate
	private int hoursWorked;		// Hold Employee's Hours Worked
	
	/**
	 * Default Constructor
	 */
	public Payroll() {
		name = "";
		idNumber = 0;
		payRate = 0;
		hoursWorked = 0;
	}
	
	/**
	 * Constructor
	 */
	public Payroll(String n, int id, double pay, int hours) 
	{
		name = n;
		idNumber = id;
		payRate = pay;
		hoursWorked = hours;
	}
	
	/**
	 * Set name for employee
	 * @param n
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * Set id for employee
	 * @param id
	 */
	public void setId(int id)
	{
		idNumber = id;
	}
	
	/**
	 * Set pay rate for employee
	 * @param pay
	 */
	public void setPayRate(double pay)
	{
		payRate = pay;
	}
	
	/**
	 * Set hours worked for employee
	 * @param hours
	 */
	public void setHoursWorked(int hours)
	{
		hoursWorked = hours;
	}
	
	/**
	 * Return the gross pay of an employee
	 * @return hoursWorked * payRate
	 */
	public double getGrossPay()
	{
		return (hoursWorked * payRate);
	}
	
	/**
	 * Return name of employee
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Return id number of employee
	 * @return idNumber
	 */
	public int getId()
	{
		return idNumber;
	}
	
	/**
	 * Return pay rate of employee
	 * @return payRate
	 */
	public double getPayRate()
	{
		return payRate;
	}
	
	/**
	 * Return hours worked of employee
	 * @return hoursWorked
	 */
	public int getHoursWorked()
	{
		return hoursWorked;
	}
}
