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
	ArrayList<String> storeLetterList = new ArrayList<>();
	
	
	char[] guessWord;
	int guessLocation[] = new int[arraySize];
	int guessLocNum;
	int guesses = 6;
	String guessLetter;
	// new
	
	int letterLocation;
	String userGuess;
	
	
	
	public Test()
	{
		

		
		System.out.println("......running.....");

		
		String userInput = "wooloomooloo";  // 	mississippi
		arraySize = userInput.length();
		storeLetter = new String[arraySize];

		userGuess = "m"; 
		System.out.println(userInput + "\t" + userGuess + " " + arraySize + "\n");
		
		// read arrays
		for ( String s: storesLetter)
		{

			System.out.print(s);

		}
		
		System.out.println("\nfoo\n");
		
		for ( int i = 0; i < storedLetter.length; i++)
		{

			System.out.print(storedLetter[i]);

		}
		System.out.println("\nfoo\n");
		
		System.out.println(storeLetter[0]);
		for ( int i = 0; i < userInput.length(); i++)	//arraySize	
		{
			storeLetter[i] = "t";
			System.out.print(storeLetter[i]);
		}
		
		System.out.println("\nfoo");
		
		/*
		// read
		for ( int i = 0; i <= userInput.length(); i++)
		{
			
			System.out.println(storeLetter[i]);
		}
		*/
	}
	
	
	
	
	
	public String nextGuess()
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