package youtube.swingtutorial;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class TicTacToe extends JFrame
{
	// variables
	JPanel panel = new JPanel();
	XOButton button[] = new XOButton[9];
	
	// constructor 
	public TicTacToe()
	{
		super("TicTacToe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setResizable(false);
		
		// define grid layout for the buttons
		panel.setLayout(new GridLayout(3,3)); 
		
		// create the 9 buttons
		for ( int i = 0; i < 9; i++)
		{
			button[i] = new XOButton();
			panel.add(button[i]);
		}
		add(panel);
		
		setVisible(true);
		
		
		
	}
	

	
	
	public static void main(String[] args)
	{
		new TicTacToe();
	}
}