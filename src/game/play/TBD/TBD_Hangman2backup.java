package game.play.TBD;

/**
 * Create a two player version of hangman. The program should first ask for the first player to enter a word and save the word. 
 * Next, the second player should be allowed to guess letters. If a letter appears in the word, then the should be told at what position.
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
 * Status: 
 * need to add to an array to display the characters guessed
 * need the after 6 guesses, one shot to guess the word
 */

import java.util.ArrayList;

import java.util.Scanner;




public class TBD_Hangman2backup
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
	int numOfGuesses = 6;
	String setMessageOne = "The letter \" ";
	String setMessageTwo = " \" you chose";
	String setMessageDoes = " appears in the following locations: ";
	String setMessageDoesNot = " does not appears in the word";
	
	
	// constructor
	public TBD_Hangman2backup()
	{
		System.out.println("Lets play hangman\t");
		System.out.println("You get 6 guesses, you still have:  " + numOfGuesses + " remaining");
		inputWord();
		arraySize = word.length();
		
		
		while (numOfGuesses != 0)
		{
			if ( playSomeMore == true)
			{
				// DEBUG
//				System.out.println("Ok, lets guess some letters");
				guessedLetter = guessLetter();
				// DEBUG
//				System.out.println("(Hangman method: chosen letter = " + guessedLetter + ")");
				finishRound = false;
				checkForLetter(guessedLetter);
			}
			else
			{
				// ?? Outright guess? create logic to complete the game and guess the word
				System.out.println("Game Over");
				numOfGuesses = 0;
				playSomeMore = false;
			}
			

		}
		
		System.out.println("Big Bad Final Game Over");
	}
	
	public void inputWord()
	{
		// 1. (enter word, add characters in a) User Input COMPLETED
		Scanner userInput= new Scanner(System.in);
		System.out.print("\nEnter word:\t");
		word = userInput.nextLine();
		arraySize = word.length();
		System.out.println("You entered:\t " + word);
		// DEBUG
//		System.out.println("Word has " + arraySize + " letters");
		
	}
	
	public String guessLetter()
	{
		// 2. Guess letter
		System.out.println("\n\nPlease guess a letter ");
		Scanner continueChoice = new Scanner(System.in);
		guessedLetter = continueChoice.nextLine();
		return guessedLetter;
	}
	
	public boolean continuePlay()
	{
		System.out.println("\n\nYou have " + numOfGuesses + " guesses remaining, continue?");
		
		if ( numOfGuesses == 0)
		{
			System.out.println("Thanks you've used up all your guesses ");
			playSomeMore = false;
			return false;
		}

		Scanner continueChoice = new Scanner(System.in);
		System.out.print("y or n:\t");
		String again = continueChoice.next();
		// DEBUG
//		System.out.println("again " + again);
		
		if ( again.equals("n") )
		{
			numOfGuesses = 0;
			playSomeMore = false;
			return false;
		}
		else
		{
			playSomeMore = true;
			// DEBUG
//			System.out.println("time for another letter");
			return true;
			
		}
		
	}
	
	public void checkForLetter(String guess)
	{
		userGuess = guess;
		userInput = word;
		
		// DEBUG
//		System.out.println(guess + " " + userGuess);
//		System.out.println(word + " " + userInput);
		
		
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
						System.out.println("\n....does not appear in the word");
						
					}

				}
				if ( numOfGuesses == 0)
				{
					System.out.println("Finished");
				}
				else
				{
					finishRound = true;
					numOfGuesses--;
					continuePlay();  
					
				}
				
	

			}
			

			
		}
		
	}
	
	public static void main(String[] args)
	{
		
		new TBD_Hangman2backup();
	
		
	}
}