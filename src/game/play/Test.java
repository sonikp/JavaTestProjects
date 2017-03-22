package game.play;

// test stuff: 
import java.util.ArrayList;

public class Test
{
	int arraySize;
//	String storeLetter[] = new String[arraySize];
	String storeLetter[] = {"m","i","s","s","i","p","p","i"};
	int guessLocation[] = new int[arraySize];
	int guessLocNum;
	
	
	
	
	public Test()
	{
		System.out.println("......running.....");
		
		// should by user input, & configure array size
		//String userInput = "mississippi";
		
		
		//arraySize = userInput.length();
		arraySize = storeLetter.length;
		String guessedLetter = "i";
		
		// show information about word
//		System.out.println("\n\nword entered\t: " + userInput);
//		System.out.println("word size\t: " + userInput.length());

		System.out.println(storeLetter[0]);
		
		for (int i = 0; i < storeLetter.length; i++)
		{
			System.out.println(storeLetter[i]);
			guessLocNum = 0;
			if ( storeLetter[i] == guessedLetter)
			{
				System.out.println(true);
				System.out.println("Location " + i);
				guessLocation[guessLocNum] = i;
				guessLocNum++;
			}
		}
		
		
		
		/*
		// works
		for (String letter : storeLetter)
		{
			System.out.println(letter);
		}
		*/
		
		// reads if letter in string
		//System.out.println(userInput.indexOf(guessedLetter) + 1);
		
		
		
		/*
		// add string to character array
		storeLetter = userInput.next();	// userInput.toCharArray()
		System.out.println(storeLetter[0]);
		*/
		/*
		// shows characters - display only
		for ( int i = 0; i <= userInput.length(); i++)
		{
			
			System.out.println(storeLetter[i] + " " + i);
			
			if ( String.valueOf(storeLetter).contains("m") )
			{
				System.out.println("true");
			}
			else
			{
				//System.out.println("false");
			}
			
		

		}
		*/
	}
	
	public static void main(String[] args)
	{
		new Test();
	}
}