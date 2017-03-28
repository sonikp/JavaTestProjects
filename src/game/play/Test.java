package game.play;

// test stuff: 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test
{
	int arraySize;
	String storeLetter[]; // = new String[arraySize];
	String storedLetter[] = {"m","i","s","s","i","s","s","i","p","p","i"};
	String storesLetter[] = {"-","-","-","-","-","-","-","-","-","-","-"};
	String userInput;
	ArrayList<String> storeLetterList = new ArrayList<>();
	
	
	char[] guessWord;
	char[] wordToGuess;
	char[] guessAttempts;
	char guessLetter;
	
	int guessLocation[] = new int[arraySize];
	int guessLocNum;
	int guesses = 6;
	
	// new
	
	int letterLocation;
	String userGuess;
	
	
	
	public Test()
	{
		

		
		System.out.println("......running.....");

		
		userInput = "wooloomooloo";  // 	mississippi
		guessLetter = 'l';
		arraySize = userInput.length();
		//storeLetter = new String[arraySize];
		wordToGuess = new char[arraySize];
		guessAttempts = new char[arraySize];

		userGuess = "m"; 
		System.out.println(userInput + "\t" + userGuess + " " + arraySize + "\n");
		
		//toArrayTest();
		for (int i = 0; i < userInput.length(); i++)
		{
			char foo = userInput.charAt(i);
			System.out.println(foo);
			wordToGuess[i] = userInput.charAt(i);
		}
		
		// fill guessAttempt with --
		for (int i = 0; i < userInput.length(); i++)
		{
			char foo = userInput.charAt(i);
			System.out.println(foo);
			guessAttempts[i] = '-';
		}
		
		System.out.println("\n=======================");
		
		// read
		for ( char r: wordToGuess)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================");
		
		// read
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================\n");	
		
		// find out if array contains a particular guessed letter (guessLetter) and if where
		for (int i = 0; i < userInput.length(); i++)
		{
			System.out.print(guessLetter + " ");
			
			if ( guessLetter == wordToGuess[i] )
			{
				System.out.println("+++");
				
				System.out.println(guessAttempts[i]);
				System.out.println(guessLetter);
				
				System.out.println("+++");
				
				guessAttempts[i] = guessLetter;
			}
						
		}
		
		System.out.println("\n=======================");
		
		// read guessAttempts
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================\n");	
		
	}
	
	public void toArrayTest()
	{
		// read arrays
		for ( String s: storesLetter)
		{

			System.out.print(s);

		}
		
		System.out.println("\nfoo\n");
		
		// read arrays
		for ( int i = 0; i < storedLetter.length; i++)
		{

			System.out.print(storedLetter[i]);

		}
		System.out.println("\nfoo\n");
		
		System.out.println(storeLetter[0]);
		
		// to string array
		for ( int i = 0; i < userInput.length(); i++)	//arraySize	
		{
			storeLetter[i] = "t";
			System.out.print(storeLetter[i]);
		}
		
		System.out.println("\nfoo");
		
		// to char array
		for ( int i = 0; i < userInput.length(); i++)	//arraySize	
		{
			guessWord[i] = '-';
			System.out.print(guessWord[i]);
		}
		
		System.out.println("\nfoo");
	}
	
	
	
	public char nextGuess()
	{
		/*
		System.out.println("Please guess a letter ");
		Scanner continueChoice = new Scanner(System.in);
		
		String guessLetter = continueChoice.nextLine();
		*/
		return guessLetter;

	}
	
	
	public void theStringDemo()
	{
		// empty

	   

	}
	
	public static void main(String[] args)
	{
		new Test();

		
		
	}
}