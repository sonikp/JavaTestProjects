package game.play;

// test stuff: 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestMiniHangman
{
	char guessLetter = 'i';
	String guessLetterString;
	String userInput = "mississippi";
	int arraySize;
	
	char[] wordToGuess;
	char[] guessAttempts;
	
	// constructor
	public TestMiniHangman()
	{
		// empty constructor
		populateArrays();
	}
	
	public char getGuessLetter()	
	{		
		System.out.println("GuessLetter: " + guessLetter);
		getGuessLetterString();
		prettify();
		return guessLetter;
	}
	
	public String getGuessLetterString()
	{
		guessLetterString = Character.toString(guessLetter);
		System.out.println("GuessLetterString: " + guessLetterString);
		return guessLetterString;
	}
	
	public void setGuessLetter(char L)
	{
		this.guessLetter = L;
	}
	
	public String getWord()
	{
		arraySize = userInput.length();
		StringBuilder buffer = new StringBuilder();
		buffer.append("userInput:" + userInput + " arraySize " + arraySize);
		
		System.out.println("Word: " + userInput + " arraySize " + arraySize);
		return userInput;
	}
	
	public void setWord(String w)
	{
		this.userInput = w;
		arraySize = userInput.length();
		wordToGuess = new char[arraySize];
		guessAttempts = new char[arraySize];
	}

	
	public void guessLetterInWord()
	{
		
		System.out.println("1. guessLetterInWord()");
		arraySize = userInput.length();
		System.out.println("userInput:" + userInput + " && guessLetter: " + guessLetter
				+ " && arraySize: " + arraySize);

	}
	
	public String populateArrays()
	{
		StringBuilder buffer = new StringBuilder();
		System.out.println("2. populateArrays()");
		arraySize = userInput.length();
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

	}
	
	
	
	public String printGuessArray()
	{
		System.out.println("\nprintGuessArray");

		StringBuilder buffer = new StringBuilder();
		// read
		for ( char r: guessAttempts)
		{
			buffer.append(r + " ");
		}
		return buffer.toString();
	}
	
	
	// experimental
	public String printArraysUI()
	{
		StringBuilder buffer = new StringBuilder();
		buffer.append("3. printArrays()");
		buffer.append("\n======READ=FROM=WORD=ARRAY================");
		// read
		for ( char r: wordToGuess)
		{
			buffer.append(r + " ");
		}
		buffer.append("\n======READ=FROM=GUESS=ARRAY================");
		// read
		for ( char r: guessAttempts)
		{
			buffer.append(r + " ");
		}
		
		buffer.append("\n=======================\n");	
		prettify();
		return buffer.toString();
	}
	
	
	public void checkIfLetterExistsInWord()
	{
		getGuessLetter();
//		populateArrays();
		
		// to set up buffer size
//		arraySize = userInput.length();
//		wordToGuess = new char[arraySize];
//		guessAttempts = new char[arraySize];
		
		
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
			printGuessArray();
		}
		else
		{
			System.out.println("DOES NOT EXIST!");
			doesNotExist();
		}
		
	}
	
	public String doesNotExist()
	{
		
		StringBuilder buffer = new StringBuilder();
		buffer.append("Does Not Exist");
		return buffer.toString();
		

	}
	
	public void updateIfLetterExistsInWord()
	{
		/*
		guessLetter = 'm';
		ifGuessExists();
	
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
		*/
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