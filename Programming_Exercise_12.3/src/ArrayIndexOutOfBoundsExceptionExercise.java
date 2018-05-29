import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExercise
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[100];
		int index;
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int) (Math.random() * 10);
		}
		
		try
		{
			System.out.print("Enter an index: ");
			index = input.nextInt();
			System.out.println("The number at index " + index + " is: " + numbers[index]);				
		} catch (IndexOutOfBoundsException ex)
		{
			System.out.println("Out Of Bounds");
		}
	}
}
