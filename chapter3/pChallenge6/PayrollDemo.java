package chapter3.pChallenge6;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 6
 * 
 */
public class PayrollDemo {

	public static void main(String[] args)
	{
		// Initalize Payroll 
		Payroll zack = new Payroll("Zack F", 12345, 14.50, 45);
		
		// Display Employee's information
		System.out.printf("Employee's Name: \t%s\n"+
						"Employee's ID: \t\t%d\n"+
						"Employee's Pay: \t$%.2f\n"+
						"Employee's Hours: \t%d\n\n"+
						"Employee's Gross Pay: \t$%,.2f", 
						zack.getName(), zack.getId(), zack.getPayRate(), zack.getHoursWorked(),
						zack.getGrossPay());
	}
}
