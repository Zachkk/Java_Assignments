package chapter2;

import java.util.Scanner;

/**
 * 
 * @author Zack Flowers
 * Date: 2/17/1007
 * Chapter: 2
 * Programming Challenge 1
 * 
 * Write a program that declares the following:
 * 		a String variable named name
 * 		an int variable named age
 *		a double variable named annualPay
 * Store your age, name, and desired annual income as literals in these variables. 
 * The program should display these values on the screen in a manner similar to the following:
 * My name is Joe Mahoney, my age is 26
 *
 */
public class NameAgeIncome {

	public static void main(String[] args) {
		String name;
		int age;
		double annualPay;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Input Name
		System.out.print("What is your name?: ");
		name = keyboard.nextLine();
		
		// Input Age
		System.out.print("What is your age?: ");
		age = keyboard.nextInt();
		
		// Input Annual Pay
		System.out.print("What is your annual pay?: ");
		annualPay = keyboard.nextDouble();
		
		// Output Name, Age, & Income
		System.out.printf("My name is " + name + ", my age is " + age +
				" with an annual pay of $%,.2f.", annualPay);
	}
}
