package game.play;

/**
 * Create a two player version of hangman. The program should first ask for the first player to enter a word and save the word. 
 * Next, the second player shout be allowed to guess letters. If a letter appears in the word, then the should be told at what position.
 * After 6 guesses the player has one shot of guessing the word. 
 * 
 * Use a for loop to iterate through all the guesses. Use a nested for loop to iterate through all the characters of the word.
 * When there is a hit, (i.e, the user character matches a word character, report the value of the index of the character in the word.
 * Don't forget to add one to the results because the characters of a string are counted at index 0. 
 * 
 * 1:file make logic
 * 2:make gui
 * Other Notes worth reading:
 * http://codereview.stackexchange.com/questions/90328/word-guessing-game
 */
/**
 * I'm stuck on, I have 0 guesses remaining, continue? Need better logic
 */

import java.util.ArrayList;

import java.util.Scanner;




public class Hangman
{
	// variables
	
	static String word;
	static String guessedLetter;
	int arraySize;
	int letterLocation = 0;
	int count = 0;
	String storeLetter[] = new String[arraySize];
	String userGuess;
	String userInput;
	
	boolean playSomeMore = true;
	boolean finishRound = false;
	
	int guessLocation[] = new int[arraySize];
	int guessLocNum;
	int numOfGuesses = 2;
	String setMessageOne = "The letter \" ";
	String setMessageTwo = " \" you chose";
	String setMessageDoes = " appears in the following locations: ";
	String setMessageDoesNot = " does not appears in the word";
	
	
	// constructor
	public Hangman()
	{
		System.out.print("Lets play hangman\t");
		System.out.println("you get 6 guesses, you have:  " + numOfGuesses);
		inputWord();
		arraySize = word.length();
		
		
		//word = "wooloomooloo";		// mississippi
		

		
		while (numOfGuesses != 0)
		{
			if ( playSomeMore == true)
			{
				System.out.println("Ok, lets guess some letters");
				guessedLetter = guessLetter();
				System.out.println("(Hangman method: chosen letter = " + guessedLetter + ")");
				finishRound = false;
				//numOfGuesses--;	// trying for zero bug
				checkForLetter(guessedLetter);
			}
			else
			{
				System.out.println("Game Over");
				numOfGuesses = 0;
				playSomeMore = false;
			}
			

		}
	}
	
	public void inputWord()
	{
		// 1. (enter word, add characters in a) User Input COMPLETED
		Scanner userInput= new Scanner(System.in);
		System.out.print("\nEnter word:\t");
		word = userInput.nextLine();
		arraySize = word.length();
		System.out.println("You entered:\t " + word);
		System.out.println("Word has " + arraySize + " letters");
		
	}
	
	public String guessLetter()
	{
		// 2. Guess letter
		System.out.println("\n\nPlease guess a letter ");
		Scanner continueChoice = new Scanner(System.in);
		guessedLetter = continueChoice.nextLine();
		System.out.println("DEBUG : " + guessedLetter);
		//numOfGuesses--;	// trying for zero bug
		return guessedLetter;
	}
	
	public boolean continuePlay()
	{
		System.out.println("\nYou have " + numOfGuesses + " guesses remaining, continue?");

		Scanner continueChoice = new Scanner(System.in);
		System.out.print("y or n:\t");
		String again = continueChoice.next();
		System.out.println("again " + again);
		
		if ( again.equals("n") )
		{
			numOfGuesses = 0;
			playSomeMore = false;
			return false;
		}
		else
		{
			playSomeMore = true;
			//numOfGuesses--;	// trying for zero bug
			System.out.println("time for another letter");
			//guessLetter();
			return true;
			
		}
		
	}
	
	public void checkForLetter(String guess)
	{
		userGuess = guess;
		userInput = word;
		
		System.out.println(guess + " " + userGuess);
		System.out.println(word + " " + userInput);
		
		
		while ( finishRound == false )	// removing to break loop "numOfGuesses != 0"
		{
			letterLocation = 0;		// reset 
			while ( letterLocation != -1)
			{

				System.out.println("The letter \" " + userGuess + " \" you chose appears in the following locations: ");
				for ( int i = 0; i <= userInput.length(); i++)
				{
					letterLocation = userInput.indexOf(userGuess, i );
					//System.out.println("." + letterLocation + " " + userInput.length() + " " + i );  // => debug
					if ( letterLocation >= 0)
					{
						i = letterLocation;
						System.out.print((userInput.indexOf(userGuess, i ) + 1 ) + " ");
						
					}
					
					else if (letterLocation == -1 && i == 0)
					{
						System.out.println("....does not appear in the word");
						
					}

				}
				if ( numOfGuesses == 0)
				{
					System.out.println("Finished");
					//finishRound = true; // issues with zero bug
				}
				else
				{
					finishRound = true;
					numOfGuesses--;
					continuePlay();  // on num of guessses continue, stays in this method, does not return to line = 62
					
				}
				
	

			}
			

			
		}
		
	}
	
	public static void main(String[] args)
	{
		//guessedLetter = "o";
		new Hangman();
		//System.out.println("You entered:\t " + word);
		
	}
}