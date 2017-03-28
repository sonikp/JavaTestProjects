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




public class HangmanThis
{
	// variables
	
	char[] guessWord;
	char[] wordToGuess;
	char[] guessAttempts;
	char guessLetter;
	
	int correctGuess = 0;
	
	char guess;
	
	
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
	public HangmanThis()
	{
		System.out.println("Lets play hangman\t");
		System.out.println("You get 6 guesses, you still have:  " + numOfGuesses + " remaining");
		
		//
		inputWord();
		checkCharInWord();
		
		
//		System.out.println("const: " + userInput + "\t" + guessLetter + "\t" + arraySize + " ");	// DEBUG

		/*
		// DEBUG CODE
		System.out.println("\n======READ=FROM=WORD=ARRAY================");
		// read
		for ( char r: wordToGuess)
		{
			System.out.print(r + " ");
		}
		System.out.println("\n======READ=FROM=GUESS=ARRAY================");
		// read
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================\n");	
		*/
		
		
		

//		checkCharInWord();
		
		
		/*
		while (numOfGuesses != 0)
		{
			if ( playSomeMore == true)
			{
				//checkIfCharInWord(guessLetter);
			}
			else
			{
				
			}
		}
		
		System.out.println("Big Bad Final Game Over");
		*/
		/*
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
		*/
	}
	
	public void inputWord()
	{
		
		userInput = "wooloomooloo";  // 	mississippi
		guessLetter = 'o';
		arraySize = userInput.length();
		//storeLetter = new String[arraySize];
		wordToGuess = new char[arraySize];
		guessAttempts = new char[arraySize];

//		userGuess = "m"; 
		System.out.println("meth: " + userInput + "\t" + guessLetter + "\t" + arraySize + "\n");
		

		
		/*
		// 1. (enter word, add characters in a) User Input COMPLETED
		Scanner userInput= new Scanner(System.in);
		System.out.print("\nEnter word:\t");
		word = userInput.nextLine();
		arraySize = word.length();
		System.out.println("You entered:\t " + word);
		// DEBUG
//		System.out.println("Word has " + arraySize + " letters");
		*/
		
		
		// fill wordToGuess[] with characters from word
		for (int i = 0; i < userInput.length(); i++)
		{
			/*
			// TBD -------------
			char foo = userInput.charAt(i);
			System.out.println(foo);
			*/
			wordToGuess[i] = userInput.charAt(i);
		}
		
		// fill guessAttempts[] with --
		for (int i = 0; i < userInput.length(); i++)
		{
			/*
			// TBD -------------
			char foo = userInput.charAt(i);
			System.out.println(foo);
			*/
			guessAttempts[i] = '-';
		}
				
		
		
		
	}
	
	public void checkCharInWord()	//char guessLetter
	{
		
		System.out.println("chrchk: " + userInput + "\t" + guessLetter + " " + arraySize + "\n");
		
		guessLetter = 'w';
		
		int ifGuessExists = userInput.indexOf(guessLetter);
		System.out.println(ifGuessExists);
		int guessNumber = 0;
		
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
		
		
		/*
		int foo = userInput.indexOf(guessLetter);
		System.out.println(foo);
		
		
		// DEBUG CODE
		System.out.println("\n======READ=FROM=WORD=ARRAY================");
		// read
		for ( char r: wordToGuess)
		{
			System.out.print(r + " ");
		}
		System.out.println("\n======READ=FROM=GUESS=ARRAY================");
		// read
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================\n");	
		
		
		guessLetter = 't';
		foo = userInput.indexOf(guessLetter);
		System.out.println(foo);
		// guessing function
		for (int i = 0; i < userInput.length(); i++)
		{
			if ( guessLetter != wordToGuess[i] )
			{
				System.out.print("NO ");
				
			} 
			else if (guessLetter == wordToGuess[i])
			{
				guessAttempts[i] = guessLetter;
				correctGuess++;
			}

		}
		System.out.println("\n=======================\n");	
		
		// read
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================\n");	
		
		guessLetter = 'm';
		foo = userInput.indexOf(guessLetter);
		System.out.println(foo);
		// guessing function
		for (int i = 0; i < userInput.length(); i++)
		{
			if ( guessLetter == wordToGuess[i])
			{
				guessAttempts[i] = guessLetter;
				correctGuess++;
			}

		}
		
		// read
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================\n");	
		
		guessLetter = 'l';
		foo = userInput.indexOf(guessLetter);
		System.out.println(foo);
		// guessing function
		for (int i = 0; i < userInput.length(); i++)
		{
			if ( guessLetter == wordToGuess[i])
			{
				guessAttempts[i] = guessLetter;
				correctGuess++;
			}

		}
		
		// read
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================\n");
		
		guessLetter = 'o';
		foo = userInput.indexOf(guessLetter);
		System.out.println(foo);
		// guessing function
		for (int i = 0; i < userInput.length(); i++)
		{
			if ( guessLetter == wordToGuess[i])
			{
				guessAttempts[i] = guessLetter;
				correctGuess++;
			}

		}
		
		// read
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n=======================\n");
		*/
		/*
		for (int i = 0; i < userInput.length(); i++)
		{
			if (guessLetter == wordToGuess[i])	//	guessLetter != wordToGuess[i]
			{
				System.out.println("Letter IS In Word");
			}
			else if (guessLetter == wordToGuess[i])	//	guessLetter == wordToGuess[i]
			{
				System.out.println("Letter Not In Word");	//		guessAttempts[i] = guessLetter
			}
			
		}
		*/
		
		
//		while ( finishRound == false )
//		{
//			
//
//		}
		
		
		/*
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
		*/
		
		/*
		System.out.println("\n======READ=FROM=WORD=ARRAY================");
		
		// read
		for ( char r: wordToGuess)
		{
			System.out.print(r + " ");
		}
		
		System.out.println("\n======READ=FROM=GUESS=ARRAY================");
		
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
		*/
	}
	
	public String guessLetter()
	{
		
		/*
		// 2. Guess letter
		System.out.println("\n\nPlease guess a letter ");
		Scanner continueChoice = new Scanner(System.in);
		guessedLetter = continueChoice.nextLine();
		*/
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
		
		new HangmanThis();
	
		
	}
}