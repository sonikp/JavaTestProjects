 package youtube.swingtutorial;

// Layouts
import java.awt.BorderLayout;
import java.awt.GridLayout;

// panel
import javax.swing.JFrame;
import javax.swing.JPanel;

// panel / components
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



public class PrimeGen extends JFrame implements ActionListener
{
	// variables
	Primes primes = new Primes(1000);
	byte process = 0; 
	/*
	 * 0:inactive
	 * 1:test
	 * 2:list
	 */
	
	boolean stop = false;		// stops the list process if list process is taking too long
	int numPrimes = 0;
	int numProgress = 0;
	String text = "";
	
	
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
	JButton list = new JButton("List");
	JButton clear = new JButton("Clear");
	
	// south
	JPanel south = new JPanel(); 		// contains input along with variables
	JLabel inputLabel = new JLabel("Input");
	JTextField input = new JTextField(10);
	JProgressBar progress = new JProgressBar();
	JLabel primesFoundLabel = new JLabel("Primes Found");
	JTextField primesFound = new JTextField(10);
	
	public static void main(String[] args)
	{
		new PrimeGen();
	}
	
	// constructor
	public PrimeGen()
	{
		super("Prime Number Generation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,400);
		setResizable(false);
		
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
		list.addActionListener(this);
		clear.addActionListener(this);
		
		// add buttons to west panel
		west.add(test);
		west.add(list);
		west.add(clear);
		mainPanel.add(west, BorderLayout.WEST);
		
		// Variable/progress (south)
		progress.setString("Waiting");
		progress.setStringPainted(true);
		primesFound.setEditable(false);
		south.add(inputLabel);
		south.add(input);
		south.add(progress);
		south.add(primesFoundLabel);
		south.add(primesFound);
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
				primesFound.setText("1");
			}
			else
			{
				print(num + " is not prime");
				primesFound.setText("0");
			}
			printEnd();
			process = 0;
		}
		
		//list
		if (src.equals(list))
		{
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

		}
		
		// clear
		if (src.equals(clear))
		{
			primes_list.setText("");
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
}









