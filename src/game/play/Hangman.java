package game.play;

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




public class Hangman
{
	
	// variables
	
	char[] guessWord;
	char[] wordToGuess;
	char[] guessAttempts;
	char guessLetter;
	
//	static String guessedLetter;
	
	String userInput;
	static String guessedLetter;
	int arraySize;
	
	int correctGuess = 0;
	int numOfGuesses = 6;
	Boolean finishRound = false;
	Boolean playSomeMore = true;
	
	char guess;
	
	// constructor
	public Hangman()
	{
		System.out.println("Lets play hangman\t");
		System.out.println("You get 6 guesses, you still have:  " + numOfGuesses + " remaining");
		
		
		inputWord();
		checkCharInWord();
		
		
		
	}
	
	public void inputWord()
	{
		/*
		
		// 1. (enter word, add characters in a) User Input COMPLETED
		Scanner userInput= new Scanner(System.in);
		System.out.print("\nEnter word:\t");
		word = userInput.nextLine();
		arraySize = word.length();
		System.out.println("You entered:\t " + word);
		
		*/
		userInput = "wooloomooloo";  // 	mississippi
//		guessLetter();
		arraySize = userInput.length();
		//storeLetter = new String[arraySize];
		wordToGuess = new char[arraySize];
		guessAttempts = new char[arraySize];

//		userGuess = "m"; 
		System.out.println("meth: " + userInput + "\t" + guessLetter + "\t" + arraySize + "\n");
		
		// Fill array with userInput
		for (int i = 0; i < userInput.length(); i++)
		{
//			char foo = userInput.charAt(i);
//			System.out.print(foo);
			wordToGuess[i] = userInput.charAt(i);
		}
		
		// fill guessAttempt with --
		for (int i = 0; i < userInput.length(); i++)
		{
//			char foo = userInput.charAt(i);
//			System.out.println(foo);
			guessAttempts[i] = '-';
		}
		/*
		// DEBUG read
		for ( char r: wordToGuess)
		{
			System.out.print(r + " ");
		}
		System.out.println();
		// DEBUG read
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		System.out.println();
		*/

	}
	
	public char guessLetter()	// was a return method
	{
		guessLetter = 'o';
//		return guessedLetter;
		
		// 2. Guess letter
		System.out.println("\n\nPlease guess a letter ");
		Scanner continueChoice = new Scanner(System.in);
//		guessedLetter = continueChoice.nextLine();
//		return guessedLetter;
		guessLetter = continueChoice.next().charAt(0);
		return guessLetter;
		
	}
	
	public void checkCharInWord()	//char guessLetter
	{
//		guessLetter = 'l';
		

		
		System.out.println("chrchk: " + userInput + "\t" + guessLetter + " " + arraySize + "\n");
		

		
		
		
		while ( finishRound == false && numOfGuesses != 0 )	// removing to break loop "numOfGuesses != 0"
		{
			// call guess letter method here
			guessLetter();
			int ifGuessExists = userInput.indexOf(guessLetter);
			System.out.println("DEBUG::ifGuessExists= " + ifGuessExists);
			int guessNumber = 0;
		
			if ( ifGuessExists != -1)
			{
				// find out if array contains a particular guessed letter (guessLetter) and if where
				for (int i = 0; i < userInput.length(); i++)
				{
					
					if ( guessLetter == wordToGuess[i] )
					{
						/*
						System.out.println("+++");
						
						System.out.println(guessAttempts[i]);
						System.out.println(guessLetter);
						
						System.out.println("+++");
						*/
						
						guessAttempts[i] = guessLetter;
					}
							
				}
				
				displayGuessResults();

			}
			else
			{
				System.out.println("Letter does not exist");
				
			}
			
			//finishRound = true;
			continuePlay();
		}

		
		/*
		while ( finishRound == false )
		{
			
			while ( ifGuessExists != -1 || guessNumber ==  arraySize)
			{
				
				for (int i = 0; i < userInput.length(); i++)
				{
					if (guessLetter == wordToGuess[i])
					{
						guessAttempts[i] = guessLetter;
						correctGuess++;
						guessNumber++;
					}

				}
				
				finishRound = true;
				System.out.println("\n=======================\n");	
				
				if (ifGuessExists != -1 || guessNumber == 6 )
				{
					guessNumber++;
				}
			}
		}
		*/
	}
	
	public void displayGuessResults()
	{
		System.out.println("\n=======================");
		
		// read guessAttempts
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================\n");
		
		
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
			numOfGuesses--;
			// DEBUG
//			System.out.println("time for another letter");
			return true;
			
		}
		
	}
	
	/*
	public void checkForLetter(String guess)
	{
		System.out.println("chrchk: " + userInput + "\t" + guessLetter + " " + arraySize + "\n");
		
	}
	*/
	
	
		
	
	
	public static void main(String[] args)
	{
		
		new Hangman();
	
		
	}
}