package chapter3.pChallenge3;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 3
 */
public class PersonalDataDemo {

	public static void main(String[] args)
	{
		// Create 3 instances of PersonalData
		PersonalData dan = new PersonalData("Dan", "123 Main Street", 35, "123-456-7890");
		PersonalData sue = new PersonalData("Sue", "456 hwy 54", 27, "098-765-4321");
		PersonalData zack = new PersonalData("Zack", "999 Street", 23, "111-222-3333");
		
		// Display all three instances
		System.out.println(dan.getName() + "\t"+ dan.getAddress()+"\t"+dan.getAge()+
				"\t"+dan.getPhone());

		System.out.println(sue.getName() + "\t"+ sue.getAddress()+"\t"+sue.getAge()+
				"\t"+sue.getPhone());
		
		System.out.println(zack.getName() + "\t"+ zack.getAddress()+"\t"+zack.getAge()+
				"\t"+zack.getPhone());
	}
}
