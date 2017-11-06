package session2assignments; // Package declaration
/**
 * This class prints the highest amongst three numbers
 *
 */
public class HighestNumber
{
	/**
	 * This is the main method which accepts command line arguments and returns no value
	 *
	 */
	public static void main(String[] args)
	{
		int firstNumber = 32, secondNumber = 11, thirdNumber = 89; // Initialization of three variables

		if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) // If condition statement to check whether a is the highest number 
		{
			System.out.println("The highest number is: " + firstNumber); // Prints a as the highest number if above condition is true
			
		}
		else // else block if above condition is false
		{
			int highest = (secondNumber > thirdNumber) ? secondNumber : thirdNumber; // Ternary operator ?: is used to check the highest number between b and c
			System.out.println("The highest number is: " + highest); // Prints the highest number
		} // else block closed
	} // main method closed
} // class closed
