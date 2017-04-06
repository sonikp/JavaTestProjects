package game.play;

import java.util.Scanner;

public class Test_HangmanMini
{
	//variables
	String userInput = "mississippi";
	String guessLetterString = "p";
	int arraySize;
	char guessLetter = 'r';
	char[] wordToGuess;
	char[] guessAttempts;
	
	// constructor
	public Test_HangmanMini()
	{
		// empty constructor
	}
	
	public Test_HangmanMini(String word)
	{
		setInputWord(word);
	}
	
	public void checkForGuessLetter()
	{
		System.out.println("word " + userInput + " GuessLetter " + guessLetter);
		
		int ifGuessExists = userInput.indexOf(guessLetter);		// check if guessed letter exists in word, -1 is not present
		
		if ( ifGuessExists != -1)
		{
			// find out if array contains a particular guessed letter (guessLetter) and if where
			for (int i = 0; i < userInput.length(); i++)
			{
				
				if ( guessLetter == wordToGuess[i] )
				{
					guessAttempts[i] = guessLetter;
//					correctGuess++;
				}
				/*
				if ( guessLetter == wordToGuess[i] )
				{
					guessAttempts[i] = guessLetter;
//					correctGuess++;
				}
					
				*/
			}
			
//			displayGuessResults();

		}
		else
		{
			System.out.println("\n-----Letter does not exist!!!------");
//			displayGuessResults();
		}

		
	}
	
//	public void populateArrays()
//	{
//		
//		System.out.println("userInput:" + userInput + " arraySize " + arraySize);
//		arraySize = userInput.length();
//		
//		// scoring
////		correctGuess = arraySize;
//		
//		
//		
//		wordToGuess = new char[arraySize];
//		guessAttempts = new char[arraySize];
//		
//		// Populate array with userInput
//		for (int i = 0; i < userInput.length(); i++)
//		{
//			wordToGuess[i] = userInput.charAt(i);
//		}
//		
//		// Populate guessAttempt with --
//		for (int i = 0; i < userInput.length(); i++)
//		{
//			guessAttempts[i] = '-';
//		}
//		
//		// DEBUG CODE
//		System.out.println("\n======READ=FROM=WORD=ARRAY================");
//		// read
//		for ( char r: wordToGuess)
//		{
//			System.out.print(r + " ");
//		}
//		System.out.println("\n======READ=FROM=GUESS=ARRAY================");
//		// read
//		for ( char r: guessAttempts)
//		{
//			System.out.print(r + " ");
//		}
//		
//		System.out.println("\n=======================\n");	
//		
//	}
	
	public String populateArrays()
	{
		StringBuilder buffer = new StringBuilder();
		buffer.append("userInput:" + userInput + " arraySize " + arraySize);
		
		arraySize = userInput.length();
		
		// scoring
//		correctGuess = arraySize;
		
		
		
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
		
		// DEBUG CODE
		buffer.append("\n======READ=FROM=WORD=ARRAY================\n");
		// read
		for ( char r: wordToGuess)
		{
			buffer.append(r + " ");
		}
		buffer.append("\n======READ=FROM=GUESS=ARRAY================\n");
		// read
		for ( char r: guessAttempts)
		{
			buffer.append(r + " ");
		}
		
		buffer.append("\n=======================\n");	
		
		return buffer.toString();
	}
	
	
	
	public static void main(String[] args)
	{
		Test_HangmanMini hm = new Test_HangmanMini("Wooloomooloo");
		System.out.println("HangmanMini:Main Method\n");
		System.out.println(hm.userInput);
		System.out.println(hm.guessLetter);
		hm.populateArrays();
		
	}
	
	public void setGuessLetter(String userInput)
	{
//		String chooseLetter = userInput;
//		guessLetter = chooseLetter.next().charAt(0);
	}
	
	
	
	public void setInputWord(String userInput)
	{
		this.userInput = userInput;
		// create an array from the word 
		arraySize = userInput.length();
		wordToGuess = new char[arraySize];
		guessAttempts = new char[arraySize];
	}
	
	public String getInputWord()
	{
		return userInput;
	}
	
	public void setWordToGuessArray(String userInput)
	{
		for (int i = 0; i < userInput.length(); i++)
		{
			wordToGuess[i] = userInput.charAt(i);
		}
	}
	
	public char[] getWordToGuessArray(String userInput2)
	{
		return wordToGuess;
	}
	
	public void setGuessAttemptArray()
	{
		// Populate guessAttempt with --
		for (int i = 0; i < userInput.length(); i++)
		{
			guessAttempts[i] = '-';
		}
	}
	
	public char[] getGuessAttemptArray(char[] guessAttempts)
	{
		// read guessAttempts
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		return guessAttempts;
	}
	
	/*
	public char guessLetter()	
	{		
		// Guess letter
		System.out.println("\n\nPlease guess a letter ");
		Scanner continueChoice = new Scanner(System.in);
		guessLetter = continueChoice.next().charAt(0);
		return guessLetter;

	}
	*/
	
	/*
	public boolean checkCharInWord(String userInput, char guessLetter)	
	{
		int ifGuessExists = userInput.indexOf(guessLetter);	
		if ( ifGuessExists != -1)
		{
			// find out if array contains a particular guessed letter (guessLetter) and if where
			for (int i = 0; i < userInput.length(); i++)
			{
				
				if ( guessLetter == wordToGuess[i] )
				{
					guessAttempts[i] = guessLetter;
				
				}
						
			}
			
			return true;
			

		}
		else
		{
			System.out.println("\n-----Letter does not exist!!!------");
		
			return false;
		}
		
		
	}
	*/
	
	

}