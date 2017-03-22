package game.play;

// test stuff: 
import java.util.ArrayList;

public class Test
{
	int arraySize;
	char storeLetter[] = new char[arraySize];
	
	
	
	
	
	public Test()
	{
		System.out.println("......running.....");
		
		// should by user input, & configure array size
		String userInput = "mississippi";
		arraySize = userInput.length();
		String guessedLetter = "c";
		
		// show information about word
		System.out.println("\n\nword entered\t: " + userInput);
		System.out.println("word size\t: " + userInput.length());
		
		// add string to character array
		storeLetter = userInput.toCharArray();

		
		// shows characters - display only
		for ( int i = 0; i < userInput.length(); i++)
		{
			
			System.out.println(storeLetter[i] + " " + i);
			if ( String.valueOf(storeLetter).contains("m") )
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}

		}
		
	}
	
	public static void main(String[] args)
	{
		new Test();
	}
}