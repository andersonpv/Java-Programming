import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExercise
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean isInteger = false;	// Controls the do-while loop
		
		do
		{
			try
			{
				System.out.print("Enter two integers: ");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				isInteger = true;	// "true" if correct inputs are entered 
			} 
			catch (InputMismatchException ex)
			{
				System.out.println("Incorrect input, please try again");
				input.nextLine(); // Discard current input line so that the user can enter a new line of input
			}
		} while (!isInteger);	// run loop while isInteger is false
		
	}
	
	

}
