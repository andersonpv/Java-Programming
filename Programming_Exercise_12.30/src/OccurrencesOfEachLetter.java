import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OccurrencesOfEachLetter 
{
	public static void main(String[] args) throws FileNotFoundException
	{	
		Scanner input = new Scanner(System.in);
		ArrayList<Character> alphabet = new ArrayList<>();
		int[] count = new int[26];
		
		/* Generate alphabet */
		for(char i = 'A'; i <= 'Z'; i++)	
		{
			alphabet.add(i);
		}

		System.out.print("Enter a filename: ");
		String fileName = input.next();
		File file = new File(fileName);
		
		try(Scanner read = new Scanner(file))
		{
			while(read.hasNext())
			{
				String word = read.next().toUpperCase();	// Letters are case-insensitive
				/* Count each letter */
				for(int k = 0; k < word.length(); k++)
				{
					int index = alphabet.indexOf(word.charAt(k));
					if(index != -1)
					{						
						count[index]++;
					}
				}				
			}
		}
		
		/* Display result */
		for(int i = 0; i < count.length; i++)
		{
			System.out.println("Number of " + alphabet.get(i) + "'s: " + count[i]);
		}	
	}
}
