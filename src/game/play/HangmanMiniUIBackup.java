package game.play;

/**
 * Backup after stringbuilder added
 * cleanup to finish game today
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

public class HangmanMiniUIBackup extends JFrame implements ActionListener
{
	// variables
	HangmanMini playgame = new HangmanMini("word");
	
	// Organization / Design
	JPanel mainPanel = new JPanel();	// contains Everything
	
	// center
	JTextArea hangman_list = new JTextArea();
	JScrollPane hangman_scroll = new JScrollPane(
			hangman_list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	// west
	JPanel west = new JPanel();			// contains all the buttons
	JButton word = new JButton("Word");
	JButton newWord = new JButton("Update Word");
	JButton character = new JButton("Character");
	JButton displayNumber = new JButton("DisplayNumbers");
	JButton newGuessLetter = new JButton("Get Letter");
	JButton testMethod = new JButton("Test Method");
	
	// south
	JPanel south = new JPanel(); 		// contains input along with variables
	JLabel inputLabel = new JLabel("Word/Letter");
	JTextField input = new JTextField(10);
	JProgressBar progress = new JProgressBar();
	JLabel progressFoundLabel = new JLabel("Results");
	JTextField lettersFound = new JTextField(10);
	
	
	// constructor
	public HangmanMiniUIBackup()
	{
		super("Hangman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(600,400);
		setResizable(false);

		// test values
		System.out.println("HM UI : Main Method");
		System.out.println(playgame.userInput);
		System.out.println(playgame.guessLetter);

		// define layout
		mainPanel.setLayout(new BorderLayout());
		
		// Prime number output (center)
		hangman_list.setEditable(false);
		hangman_list.setLineWrap(true);
		hangman_list.setWrapStyleWord(true);
		mainPanel.add(hangman_scroll,BorderLayout.CENTER);
		
		// Buttons (west)
		west.setLayout(new GridLayout(10,1));
		
		
		// add listeners
		word.addActionListener(this);
		newWord.addActionListener(this);
		character.addActionListener(this);
		displayNumber.addActionListener(this);
		newGuessLetter.addActionListener(this);
		testMethod.addActionListener(this);
		
		
		// add buttons to west panel
		west.add(word);
		west.add(newWord);
		west.add(character);
		west.add(displayNumber);
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
		
		//display 'hardcoded' word
		if (src.equals(word))
		{
			// display 'hard-coded' word to be guessed by clicking the button
			System.out.println(playgame.userInput);
			print(playgame.userInput);
			
			// make space
			String space = "\n\n";
			System.out.println(space);
			print(space);
			printEnd();

		}
		
		// Sets a new word from input
		if (src.equals(newWord))
		{
			// display number from input field in textArea
//			int num = Integer.parseInt(input.getText());
			String inputString = input.getText();
			print(inputString + " <= is the new word");
//			input.setText("Letter Submitted!");
			
			playgame.setInputWord(inputString);
			printEnd();

		}
		
		//display 'hardcoded' character
		if (src.equals(character))
		{
			// display 'hard-coded' word to be guessed by clicking the button
			print(playgame.guessLetterString);
			
			// make space
			String space = "\n\n";
			System.out.println(space);
			print(space);
			printEnd();
			

		}
		
		// DisplayNumber from input field
		if (src.equals(displayNumber))
		{
			// display number from input field in textArea
			int num = Integer.parseInt(input.getText());
			print(num + " is a number");
			input.setText("Number Submitted!");
			printEnd();

		}
		
		// Display Letter to guess from input field
		if (src.equals(newGuessLetter))
		{
			// display letter from input field in textArea
			String inputString = input.getText();
			print(inputString + " is a letter");
//			input.setText("Letter Submitted!");
			
			printEnd();

		}
		
		// Display Letter to guess from input field
		if (src.equals(testMethod))
		{

			

			String buffer = playgame.populateArrays();
			hangman_list.setText(buffer);
//			System.out.println(buffer);
			

			
			

			/*
			// display number from input field in textArea
//			int num = Integer.parseInt(input.getText());
			String inputString = input.getText();
			print(inputString + " <= is the new word");
			input.setText("Letter Submitted!");
			
			playgame.setInputWord(inputString);
			printEnd();
			*/

		}
	}
	
	public void print(String text)
	{
		int pos = hangman_list.getText().length();
		hangman_list.insert(text, pos);
//		System.out.println(text);
	}
	
	

	
	public void printEnd()
	{
		print("\n\n---------------------------------------" + 
				"------------------------\n\n");
	}
	
	public static void main(String[] args)
	{
		
		new HangmanMiniUIBackup();
	}
}