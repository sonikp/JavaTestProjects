package game.play;

//Layouts
import java.awt.BorderLayout;
import java.awt.GridLayout;

//panel
import javax.swing.JFrame;
import javax.swing.JPanel;

//panel / components
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JProgressBar;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.lang.Thread;
import java.lang.Runnable;



public class T123HangTestUI extends JFrame implements ActionListener
{
	// variables
	Primes primes = new Primes(1000);
	byte process = 0; 
	/*
	 * 0:inactive
	 * 1:test
	 * 2:list
	 */
	
	String userInput;
	
//	Hangman hMan = new Hangman();
	
	// Organization / Design
	JPanel mainPanel = new JPanel();	// contains Everything
	
	// center
	JTextArea primes_list = new JTextArea();
	JScrollPane primes_scroll = new JScrollPane(
			primes_list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	// west
	JPanel west = new JPanel();			// contains all the buttons
	JButton test = new JButton("Test");
	JButton start = new JButton("Start");
	JButton wordInput = new JButton("Word Input");
	
	// south
	JPanel south = new JPanel(); 		// contains input along with variables
	JLabel inputLabel = new JLabel("Input");
	JTextField input = new JTextField(10);
	
	
	// constructor
	public T123HangTestUI()
	{
		super("Prime Number Generation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(600,400);
		setResizable(false);
		
//		Hangman hangM = new Hangman();
		
		// define layout
		mainPanel.setLayout(new BorderLayout());
		
		// Prime number output (center)
		primes_list.setEditable(false);
		primes_list.setLineWrap(true);
		primes_list.setWrapStyleWord(true);
		mainPanel.add(primes_scroll,BorderLayout.CENTER);
		
		
		// Buttons (west)
		west.setLayout(new GridLayout(10,1));
		
		// add listeners
		test.addActionListener(this);
		start.addActionListener(this);
		wordInput.addActionListener(this);
		
		// add buttons to west panel
		west.add(test);
		west.add(start);
		west.add(wordInput);
		mainPanel.add(west, BorderLayout.WEST);
		
		// Variable/progress (south)
		south.add(input);
		mainPanel.add(south, BorderLayout.SOUTH);
		
		add(mainPanel);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		// object to decide where the event came from
		Object src = e.getSource();
		
		//test
		if (src.equals(test))
		{
			process = 1;
			int num = Integer.parseInt(input.getText());
			// ensure that primes object has a long enough range
			if (primes.getLength() < num)
			{
				primes = new Primes(num, primes);
			}
			// finds prime from object
			if (primes.test(num))
			{
				print(num + " is prime");
//				primesFound.setText("1");
			}
			else
			{
				print(num + " is not prime");
//				primesFound.setText("0");
			}
			printEnd();
			process = 0;
		}
		
		//start
		if (src.equals(start))
		{	
			Hangman hm = new Hangman();



			print(hm.greeting1 + "\n");
//			print(hMan.greeting2  + "\n");

			
		}
		
		//wordInput
		if (src.equals(wordInput))
		{	
//			new Hangman();
			userInput = input.getText();
			


			print(userInput);
//			hMan.inputWord();
			
		}
		
	}
	
	public void print(String text)
	{
		int pos = primes_list.getText().length();
		primes_list.insert(text, pos);
		System.out.println(text);
	}
	
	public void printEnd()
	{
		print("\n\n---------------------------------------" + 
				"------------------------\n\n");
	}
	
	
	public static void main(String[] args)
	{
		new T123HangTestUI();
//		new PrimeGen();
	}
	
}