package game.play;

/**
 * UI based on PrimesGen & Primes
 */

//import game.play.Hangman;
import youtube.swingtutorial.List;
import youtube.swingtutorial.Primes;

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

public class HangmanUI extends JFrame implements ActionListener
{
	// variables
	Hangman playgame = new Hangman();
	
	// Organization / Design
	JPanel mainPanel = new JPanel();	// contains Everything
	
	// center
	JTextArea hangman_list = new JTextArea();
	JScrollPane hangman_scroll = new JScrollPane(
			hangman_list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	// west
	JPanel west = new JPanel();			// contains all the buttons
	JButton next = new JButton("Next");
	JButton guess_word = new JButton("Guess Word");
	JButton finish = new JButton("Finish");
	
	// south
	JPanel south = new JPanel(); 		// contains input along with variables
	JLabel inputLabel = new JLabel("Word/Letter");
	JTextField input = new JTextField(10);
	JProgressBar progress = new JProgressBar();
	JLabel progressFoundLabel = new JLabel("Results");
	JTextField lettersFound = new JTextField(10);
	
	
	// constructor
	public HangmanUI()
	{
		super("Hangman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(600,400);
		setResizable(false);
		
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
		next.addActionListener(this);
		guess_word.addActionListener(this);
		finish.addActionListener(this);
		
		
		// add buttons to west panel
		west.add(next);
		west.add(guess_word);
		west.add(finish);
		mainPanel.add(west, BorderLayout.WEST);
		
		// Variable/progress (south)
		progress.setString("Waiting");
		progress.setStringPainted(true);
		lettersFound.setEditable(false);
		south.add(inputLabel);
		south.add(input);
		south.add(progress);
		south.add(progressFoundLabel);
		south.add(lettersFound);
		mainPanel.add(south, BorderLayout.SOUTH);
		add(mainPanel);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		// object to decide where the event came from
		Object src = e.getSource();
		
		//test
		if (src.equals(next))
		{
			
			Hangman playgame = new Hangman();
//			playgame.inputWord();


			
//			process = 1;
//			int num = Integer.parseInt(input.getText());
//			playgame.userInput();
//			printEnd();
			
			/*
			// ensure that primes object has a long enough range
			if (playgame.getLength() < num)
			{
				playgame = new Primes(num, primes);
			}
			// finds prime from object
			if (primes.test(num))
			{
				print(num + " is prime");
				primesFound.setText("1");
			}
			else
			{
				print(num + " is not prime");
				primesFound.setText("0");
			}
			printEnd();
//			process = 0;
			*/
			
		}
		
		//list
		if (src.equals(guess_word))
		{
			/*
			switch(process)
			{
			case 0:
				process = 2;
				stop = false;
				Thread th = new Thread(new List(this));
				th.start();
				list.setText("Stop");
				break;
			case 2:
				stop = true;
				break;
			
			}
			*/

		}
		
		// clear
		if (src.equals(finish))
		{
			hangman_list.setText("");
		}
	}
	
	public void print(String text)
	{
		int pos = hangman_list.getText().length();
		hangman_list.insert(text, pos);
		System.out.println(text);
	}
	
	public void printEnd()
	{
		print("\n\n---------------------------------------" + 
				"------------------------\n\n");
	}
	
	public static void main(String[] args)
	{
		new HangmanUI();
	}
}