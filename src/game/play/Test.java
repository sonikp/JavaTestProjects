package game.play;

// test stuff: 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test
{
	int arraySize;
	String storeLetter[] = new String[arraySize];
//	String storeLetter[] = {"m","i","s","s","i","p","p","i"};
	char[] guessWord;
	int guessLocation[] = new int[arraySize];
	int guessLocNum;
	int guesses = 6;
	String guessLetter;
	
	
	
	
	public Test()
	{

		
		System.out.println("......running.....");

		
		String userInput = "wooloomooloo";  // 	mississippi
		//String userGuess = "o";
		Test nextLetter = new Test();
		String userGuess = "o";
		guessLetter = nextLetter.nextGuess();
		int index = 0;
		int count = 0;
		
		while ( guesses != 0)
		{
			//userGuess = 

			while ( index != -1)
			{
				index = 0;		// reset 
				System.out.println("The letter \" " + userGuess + " \" you chose appears in the following locations: ");
				for ( int i = 0; i <= userInput.length(); i++)
				{
	
					index = userInput.indexOf(userGuess, i );
					i = index;
					if ( index == -1)
					{
						i = userInput.length();
						if ( index == -1 && count == 0)
						{
							System.out.println("letter does not appear");
						}
					}
					else if ( index >= 0)
					{
						System.out.print(userInput.indexOf(userGuess, i ) + ", ");
					}
					count++;
				}
			}
			guesses--;
			System.out.println("\nYou have " + guesses + " guesses remaining, continue?");
			Scanner continueChoice = new Scanner(System.in);
			System.out.print("y or n:\t");
			String again = continueChoice.nextLine();
			if ( again == "n" )
			{
				index = -1;
				System.out.println(index);
			}
			else
			{
				System.out.println("time for another letter");
				//nextGuess();
			}
		}

	}
	
	public String nextGuess()
	{
		System.out.println("Please guess a letter ");
		Scanner continueChoice = new Scanner(System.in);
		
		String guessLetter = continueChoice.nextLine();
		return guessLetter;
	}
	
	
	public void theStringDemo()
	{
		// empty

	   

	}
	
	public static void main(String[] args)
	{
		new Test();
//		aTest.theStringDemo();
		
		
	}
}