package game.play;

// test stuff: 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestMiniHangman
{
	char guessLetter = 'i';
	String userInput = "mississippi";
	int arraySize;
	
	char[] wordToGuess;
	char[] guessAttempts;
	
	// constructor
	public TestMiniHangman()
	{
		// empty constructor
	}
	
	public char getGuessLetter()	
	{		
		System.out.println("GuessLetter: " + guessLetter);
		prettify();
		return guessLetter;
	}
	
	public void setGuessLetter(char L)
	{
		this.guessLetter = L;
	}
	
	public String getWord()
	{
		StringBuilder buffer = new StringBuilder();
		buffer.append("userInput:" + userInput + " arraySize " + arraySize);
		
		System.out.println("Word: " + userInput + " arraySize " + arraySize);
		return userInput;
	}
	
	public void setWord(String w)
	{
		this.userInput = w;
	}

	
	public void guessLetterInWord()
	{
		
		System.out.println("1. guessLetterInWord()");
		arraySize = userInput.length();
		System.out.println("userInput:" + userInput + " && guessLetter: " + guessLetter
				+ " && arraySize: " + arraySize);
		
		prettify();
	}
	
	public void populateArrays()
	{
		System.out.println("2. populateArrays()");
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
		
		prettify();
	}
	
	public void printArrays()
	{
		System.out.println("3. printArrays()");
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
		prettify();
	}
	
	public void checkIfLetterExistsInWord()
	{
		getGuessLetter();
		populateArrays();
		int ifGuessExists = userInput.indexOf(guessLetter);	
		System.out.println(ifGuessExists);
		if ( ifGuessExists != -1)
		{
			System.out.println("EXISTS!");
			for (int i = 0; i < userInput.length(); i++)
			{
				
				if ( guessLetter == wordToGuess[i] )
				{
					guessAttempts[i] = guessLetter;
				}
						
			}
			// read
			for ( char r: guessAttempts)
			{
				System.out.print(r + " ");
			}
		}
		else
		{
			System.out.println("DOES NOT EXIST!");
		}
		
	}
	
	public void updateIfLetterExistsInWord()
	{
		guessLetter = 'm';
		ifGuessExists();
		/*
		int ifGuessExists = userInput.indexOf(guessLetter);	
		System.out.println(ifGuessExists);
		if ( ifGuessExists != -1)
		{
			System.out.println("EXISTS!");
			for (int i = 0; i < userInput.length(); i++)
			{
				
				if ( guessLetter == wordToGuess[i] )
				{
					guessAttempts[i] = guessLetter;
				}
						
			}
		}*/
	}
	
	public void ifGuessExists()
	{
		int ifGuessExists = userInput.indexOf(guessLetter);	
		System.out.println(ifGuessExists);
		if ( ifGuessExists != -1)
		{
			System.out.println("EXISTS!");
			for (int i = 0; i < userInput.length(); i++)
			{
				
				if ( guessLetter == wordToGuess[i] )
				{
					guessAttempts[i] = guessLetter;
				}
						
			}
		}
		
	}
	
	public void checkGuessArray()
	{
		System.out.println("\ncheckGuessArray()");
		// read
		for ( char r: guessAttempts)
		{
			System.out.print(r + " ");
		}
		prettify();
	}
	
	public void prettify()
	{
		System.out.println("\n==============================================\n");
	}


	
	public static void main(String[] args)
	{
		TestMiniHangman playgame = new TestMiniHangman();
		
//		playgame.getWord();

		// gameplay
		playgame.guessLetterInWord();
		playgame.populateArrays();
		playgame.printArrays();
		playgame.getGuessLetter();
		playgame.setGuessLetter('m');
		playgame.checkIfLetterExistsInWord();
		playgame.updateIfLetterExistsInWord();
		playgame.checkGuessArray();
		/*
		//===========================
		playgame.setGuessLetter('i');
		playgame.getGuessLetter();
		playgame.checkIfLetterExistsInWord();
		playgame.updateIfLetterExistsInWord();
		playgame.checkGuessArray();
		//===========================
		playgame.setGuessLetter('p');
		playgame.getGuessLetter();
		playgame.checkIfLetterExistsInWord();
		playgame.updateIfLetterExistsInWord();
		playgame.checkGuessArray();
		//===========================
		playgame.setGuessLetter('s');
		playgame.getGuessLetter();
		playgame.checkIfLetterExistsInWord();
		playgame.updateIfLetterExistsInWord();
		playgame.checkGuessArray();
		*/
		
		
		/*
		playgame.populateArrays();
		playgame.printArrays();
		playgame.checkIfLetterExistsInWord();
		playgame.checkGuessArray();
		playgame.updateIfLetterExistsInWord();
		playgame.checkGuessArray();
		*/
		
		
	}
}