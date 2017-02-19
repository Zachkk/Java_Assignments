package chapter3.pChallenge1;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 1
 *
 * This class demonstrates class Employee
 */
public class EmployeeDemo {

	public static void main(String[] args)
	{
		// Use constructor to input Susan & Mark's info
		Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
		
		// Set Joy's information to show that it works
		Employee joy = new Employee();
		
		joy.setName("Joy Rogers");
		joy.setIdNumber(81774);
		joy.setDepartment("Manufacturing");
		joy.setPosition("Engineer");
		
		// Display Title Header
		System.out.println("Name\t\tId Number\tDepartment\tPosition");
		
		// Display Susan's information
		System.out.println(susan.getName() +"\t"+susan.getId()+"\t\t"+susan.getDepartment()+
						"\t"+susan.getPosition());
		
		// Display Marks Information
		System.out.println(mark.getName() +"\t"+mark.getId()+"\t\t"+mark.getDepartment()+
				"\t\t"+mark.getPosition());
		
		// Display Joy's information
		System.out.println(joy.getName() +"\t"+joy.getId()+"\t\t"+joy.getDepartment()+
				"\t"+joy.getPosition());
	}
}
