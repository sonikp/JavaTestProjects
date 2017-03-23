package game.play;

// test stuff: 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test
{
	int arraySize;
//	String storeLetter[] = new String[arraySize];
//	String storeLetter[] = {"m","i","s","s","i","p","p","i"};
	char[] guessWord;
	int guessLocation[] = new int[arraySize];
	int guessLocNum;
	
	
	
	
	public Test()
	{
		System.out.println("......running.....");
		// 1. User Input COMPLETED
//		Scanner userInput= new Scanner(System.in);
//		System.out.println("Enter word");
//		String word = userInput.nextLine();
//		System.out.println("You entered: " + word);
		// should by user input, & configure array size
		//2. put word into array
		String userInput = "mississippi";
//		guessWord = userInput.toCharArray();
//		System.out.println(Arrays.toString(guessWord));
		System.out.println("You entered: " + userInput);
		System.out.println(userInput.indexOf("i", 11));
		
		
		
		//arraySize = userInput.length();
//		arraySize = storeLetter.length;
		String guessedLetter = "i";
		
		// show information about word
//		System.out.println("\n\nword entered\t: " + userInput);
//		System.out.println("word size\t: " + userInput.length());

//		System.out.println(storeLetter[0]);
		// 3. read and identify letter
		
		for (int i = 0; i < userInput.length(); i++)
		{
//			System.out.println(storeLetter[i]);
//			System.out.println(userInput.charAt(i));;
			
			System.out.print(userInput.indexOf("s", i));;		//guessedLetter
//			userInput.indexOf(guessedLetter, i);
			
		

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