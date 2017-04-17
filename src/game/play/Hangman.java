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
 * Status: need to add scoring so if word is guessed game ends immediately, use correctGuess
 * 
 * sonikP 04-2017
 * 
 * 1:file make logic
 * 2:make gui
 * Other Notes worth reading:
 * http://codereview.stackexchange.com/questions/90328/word-guessing-game
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Hangman
{
	
	// variables		// have made all variables 'public'
	
	public String userInput;
	
	public char[] wordToGuess;
	public char[] finalGuess;
	public char[] guessAttempts;
	public char guessLetter;
	
	public int arraySize;
	public int correctGuess = 0;
	public int numOfGuesses = 6;
	
	public Boolean finishRound = false;
	public Boolean playSomeMore = true;
	public Boolean finalGuessCorrect;
	
	// additional for GUI
	public String greeting1 = "greeting1";
	public String greeting2 = "greeting2";

	
	// constructor
	public Hangman()
	{
		
//		greeting = "Lets play hangman\t";
//		System.out.println(greeting);
		System.out.println("Lets play hangman\t");
		System.out.println("You get 6 guesses, you still have:  " + numOfGuesses + " remaining");

		inputWord();
		
		while (numOfGuesses != 0)
		{
			if ( playSomeMore == true)
			{
				finishRound = false;
				checkCharInWord();
			}
			else 
			{
				System.out.println("Game Over");
				numOfGuesses = 0;
				playSomeMore = false;
			}
		}
		
		if (numOfGuesses == 0 && finishRound == false )
		{
			System.out.println("-----Would you like to outright guess?----");
			finalGuess();
		}
		else 
		{
			System.out.println("Big Bad Final Game Over");
		}

	}
	
	public void inputWord()
	{

		// User Input, define word to guess
		Scanner getInput = new Scanner(System.in);
		System.out.print("\nEnter word:\t");
		userInput = getInput.nextLine();
		System.out.println("You entered:\t " + userInput);
		
		arraySize = userInput.length();
		
		// scoring
//		correctGuess = arraySize;
		
		System.out.println("correctGuess:" + correctGuess + " arraySize " + arraySize);
		
		wordToGuess = new char[arraySize];
		guessAttempts = new char[arraySize];
		
		// Populate array with userInput
		for (int i = 0; i < userInput.length(); i++)
		{
			wordToGuess[i] = userInput.charAt(i);
		}
		
		// Populate guessAttempt with --
		for (int i = 0; i < userInput.length(); i++)
		{
			guessAttempts[i] = '-';
		}

	}
	
	public char guessLetter()	
	{		
		// Guess letter
		System.out.println("\n\nPlease guess a letter ");
		Scanner continueChoice = new Scanner(System.in);
		guessLetter = continueChoice.next().charAt(0);
		return guessLetter;

	}
	
	public void checkCharInWord()	
	{
		
		while ( finishRound == false && numOfGuesses != 0 )	// removing to break loop "numOfGuesses != 0"
		{
			// call guess letter method here
			guessLetter();
			int ifGuessExists = userInput.indexOf(guessLetter);		// check if guessed letter exists in word, -1 is not present
		
			if ( ifGuessExists != -1)
			{
				// find out if array contains a particular guessed letter (guessLetter) and if where
				for (int i = 0; i < userInput.length(); i++)
				{
					
					if ( guessLetter == wordToGuess[i] )
					{
						guessAttempts[i] = guessLetter;
						correctGuess++;
					}
							
				}
				
				displayGuessResults();

			}
			else
			{
				System.out.println("\n-----Letter does not exist!!!------");
				displayGuessResults();
			}

			continuePlay();
		}

	}
	
	public void displayGuessResults()
	{
		System.out.println("\n=======================");
		
		// read guessAttempts
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================");
		System.out.println("correctGuess:" + correctGuess + " arraySize " + arraySize);

	}
	
	public void finalGuess()
	{
		Scanner getInput = new Scanner(System.in);
		System.out.print("\nEnter final guess:\t");
		userInput = getInput.nextLine();
		System.out.println("You entered:\t " + userInput);
		
		arraySize = userInput.length();
		finalGuess = new char[arraySize];
		
		// Populate array with userInput
		for (int i = 0; i < userInput.length(); i++)
		{
			finalGuess[i] = userInput.charAt(i);
		}
		
		
		finalGuessCorrect = Arrays.equals(wordToGuess ,finalGuess);
		
		if ( finalGuessCorrect == true)
		{
			System.out.println("Well Done, correct guess!!");
		}
		else // finalGuessCorrect == false
		{
			System.out.println("Sorry, that's not correct!!");
		}
		
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
		
		if ( again.equals("n") )
		{
			numOfGuesses = 0;
			playSomeMore = false;
			return false;
		}
		/*
		else if ( correctGuess == arraySize )
		{
			System.out.println("Game Over");
			numOfGuesses = 0;
			playSomeMore = false;
		}
		*/
		else
		{
			playSomeMore = true;
			numOfGuesses--;
			return true;
		}
		
	}
	
	/*
	public static void main(String[] args)
	{
		
		new Hangman();

	}
	*/
}