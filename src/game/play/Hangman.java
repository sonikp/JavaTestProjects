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

import java.util.ArrayList;




public class Hangman
{
	// variables
	int arraySize;
	String storeLetter[] = new String[arraySize];
	int guessLocation[] = new int[arraySize];
	int guessLocNum;
	
	
	// constructor
	public Hangman()
	{
		System.out.println("test");
	}
	
	public void inputWord()
	{
		// enter word, add characters in a
	}
	
	public static void main(String[] args)
	{
		new Hangman();
	}
}