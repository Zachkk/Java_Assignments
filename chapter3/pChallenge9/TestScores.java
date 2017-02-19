package chapter3.pChallenge9;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 9
 * 
 * Design a TestScores class that has fields to hold three test scores. 
 * 
 * The class should have accessor and mutator methods for the test score fields 
 * 	and a method that returns the average of the test scores. 
 * 
 * Demonstrate the class by writing a separate program that creates an instance of the class. 
 * 
 * The program should ask the user to enter three test scores, which are
 * 	stored in the TestScores object. 
 * 
 * Then the program should display the average of the scores, as reported by the TestScores 
 * 	object.
 */
public class TestScores {

	// Constant value for number of tests
	private final int NUM_TESTS = 3;
	
	// Three fields to hold test scores
	private double test1, test2, test3;
	
	/**
	 * Default Constructor
	 */
	public TestScores() {
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}
	
	/**
	 * Constructor to accept 3 test scores
	 */
	public TestScores(double t1, double t2, double t3)
	{
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}
	
	/**
	 * Set test score for test 1
	 * @param t1
	 */
	public void setTest1(double t1)
	{
		test1 = t1;
	}
	
	/**
	 * Set test score for test 2
	 * @param t2
	 */
	public void setTest2(double t2)
	{
		test2 = t2;
	}
	
	/**
	 * Set test score for test 3
	 * @param t3
	 */
	public void setTest3(double t3)
	{
		test3 = t3;
	}
	
	/**
	 * Return test score for test 1
	 * @return
	 */
	public double getTest1()
	{
		return test1;
	}
	
	/**
	 * Return test score for test 2
	 * @return
	 */
	public double getTest2()
	{
		return test2;
	}
	
	/**
	 * Return test score for test 3
	 * @return
	 */
	public double getTest3()
	{
		return test3;
	}
	
	/**
	 * Return the average of three test scores
	 * @return
	 */
	public double getAverage()
	{
		return ((test1 + test2 + test3) / NUM_TESTS);
	}
}
