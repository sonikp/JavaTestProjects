package game.play;

/**
 * UI based on PrimesGen & Primes
 */

//import game.play.Hangman;
//import youtube.swingtutorial.List;
//import youtube.swingtutorial.Primes;

import java.awt.event.ActionListener;

import javax.swing.JButton;
//panel
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// action events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestMiniHangmanUI extends JFrame implements ActionListener
{
	// variables
	TestMiniHangman playgame = new TestMiniHangman();


	
	// Organization / Design
	JPanel mainPanel = new JPanel();	// contains Everything
	
	// center
	JTextArea hangman_textarea = new JTextArea();
	JScrollPane hangman_scroll = new JScrollPane(
			hangman_textarea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	// west
	JPanel west = new JPanel();			// contains all the buttons
	JButton displayWord = new JButton("Display Word");
	JButton displayLetter = new JButton("Display Letter");
	JButton updateWord = new JButton("Update Word");
	JButton updateLetter = new JButton("Update Letter");
	JButton letterInWord = new JButton("Check If Letter Exists");
	JButton newWord = new JButton("-(Clear Arrays)-Update Word-");
	JButton newGuessLetter = new JButton("!Display Guess Status!");
	JButton testMethod = new JButton("!Display Game Status!");
	
	// south
	JPanel south = new JPanel(); 		// contains input along with variables
	JLabel inputLabel = new JLabel("Word/Letter");
	JTextField input = new JTextField(10);
	JProgressBar progress = new JProgressBar();
	JLabel progressFoundLabel = new JLabel("Results");
	JTextField lettersFound = new JTextField(10);
	
	
	// constructor
	public TestMiniHangmanUI()
	{
		super("Hangman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(600,400);
		setResizable(false);
		
//		// populate arrays
//		playgame.populateArrays();
//		playgame.printArrays();
		
		// test values
		System.out.println("HM UI : Main Method");
		System.out.println(playgame.userInput);
		System.out.println(playgame.guessLetter);

		// define layout
		mainPanel.setLayout(new BorderLayout());
		
		// Prime number output (center)
		hangman_textarea.setEditable(false);
		hangman_textarea.setLineWrap(true);
		hangman_textarea.setWrapStyleWord(true);
		hangman_textarea.setText("New Hangman Game");
		mainPanel.add(hangman_scroll,BorderLayout.CENTER);
		
		// Buttons (west)
		west.setLayout(new GridLayout(10,1));
		
		
		// add listeners
		displayWord.addActionListener(this);
		displayLetter.addActionListener(this);
		updateWord.addActionListener(this);
		updateLetter.addActionListener(this);
		letterInWord.addActionListener(this);
		newWord.addActionListener(this);
		newGuessLetter.addActionListener(this);
		testMethod.addActionListener(this);
		
		
		// add buttons to west panel
		west.add(displayWord);
		west.add(displayLetter);
		west.add(updateWord);
		west.add(updateLetter);
		west.add(letterInWord);
		west.add(newWord);
		west.add(newGuessLetter);
		west.add(testMethod);
		mainPanel.add(west, BorderLayout.WEST);
		
		// Variable input (south)
		south.add(input);
		mainPanel.add(south, BorderLayout.SOUTH);
		
		add(mainPanel);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		// object to decide where the event came from
		Object src = e.getSource();
		
		//display word - COMPLETED
		if (src.equals(displayWord))
		{
			
			String buffer = playgame.getWord();
			hangman_textarea.setText(buffer);

		}
		
		//display letter - COMPLETED
		if (src.equals(displayLetter))
		{
			String buffer = playgame.getGuessLetterString();
			hangman_textarea.setText(buffer);
			
			// update both the CharArray and StringArray
//			playgame.getGuessLetter();
//			playgame.getGuessLetterString();
			/*
			// display 'hard-coded' word to be guessed by clicking the button
			print(playgame.guessLetterString);
			
			// make space
			String space = "\n\n";
			System.out.println(space);
			print(space);
			printEnd();
			*/

		}
		
		//display 'hardcoded' letter as String
		if (src.equals(updateWord))
		{

			String inputString = input.getText();
			hangman_textarea.setText(inputString);
//			print(inputString + " <= is the new word");
//			input.setText("Letter Submitted!");
			
			playgame.setWord(inputString);
			input.setText("");
//			printEnd();

			
			
			/*
			String buffer = playgame.getGuessLetterString();
			hangman_textarea.setText(buffer);
			

			playgame.getGuessLetter();
			playgame.getGuessLetterString();
			*/
			/*
			// display 'hard-coded' word to be guessed by clicking the button
			print(playgame.guessLetterString);
			
			// make space
			String space = "\n\n";
			System.out.println(space);
			print(space);
			printEnd();
			*/

		}
		
		//change letter COMPLETED
		if (src.equals(updateLetter))
		{

			String inputString = input.getText();
			char chr = inputString.charAt(0);
			playgame.setGuessLetter(chr);
			hangman_textarea.setText(inputString);
			input.setText("");
//			hangman_textarea.setText("      <=new letter");

		}
		
		// Sets a new word from input
		if (src.equals(newWord))
		{
			String buffer = playgame.populateArrays();
			hangman_textarea.setText(buffer);
//			playgame.populateArrays();


		}
		

		
		
		// DisplayNumber from input field
		if (src.equals(letterInWord))
		{
			playgame.checkIfLetterExistsInWord();
			String buffer = playgame.printGuessArray();
			hangman_textarea.setText(buffer);
		}
		

		
		// Display Letter to guess from input field
		if (src.equals(newGuessLetter))
		{
			
			String buffer = playgame.printGuessArray();
			hangman_textarea.setText(buffer);

		}
		
		// Display Letter to guess from input field
		if (src.equals(testMethod))
		{
			
			String buffer = playgame.populateArrays();
			hangman_textarea.setText(buffer);

		}
	}
	
	public void print(String text)
	{
		int pos = hangman_textarea.getText().length();
		hangman_textarea.insert(text, pos);

	}
	
	

	
	public void printEnd()
	{
		print("\n\n---------------------------------------" + 
				"------------------------\n\n");
	}
	
	public static void main(String[] args)
	{
		

		new TestMiniHangmanUI();

	}
}