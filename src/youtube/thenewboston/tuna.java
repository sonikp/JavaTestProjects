package youtube.thenewboston;

import javax.swing.JOptionPane;

import java.awt.FlowLayout;	// basic layout
import javax.swing.JFrame;	// basic window
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class tuna extends JFrame
{
	// variables
	private String message = "The title bar";
	private JLabel item1;
	private JTextField item2;
	private JTextField item3;
	private JTextField item4;
	private JPasswordField passwordField;
	
	// constructor
	public tuna(String message)
	{
		super(message);
		setLayout(new FlowLayout());
		
		item1 = new JLabel("this is a sentence");
		item1.setToolTipText("this is gona show up on hover");
		add(item1);
	}
	
	public tuna()
	{
		super("the title");
		setLayout(new FlowLayout());
		
		item2 = new JTextField(10);
		add(item2);
		
		item3 = new JTextField("enter text here");
		add(item3);
		
		item4 = new JTextField("uneditable", 20);
		item4.setEditable(false);
		add(item4);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		theHandler handler = new theHandler();
		
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		item4.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	
	// methods
	private class theHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String string = "";
			
			if (event.getSource() == item2)
			{
				string = String.format("field 1: %s", event.getActionCommand());
			}
			else if (event.getSource() == item3)
			{
				string = String.format("field 2: %s", event.getActionCommand());
			}
			else if (event.getSource() == item4)
			{
				string = String.format("field 3: %s", event.getActionCommand());
			}
			else if (event.getSource() == passwordField)
			{
				string = String.format("password field is : %s", event.getActionCommand());
			}
			
			// create a window
			JOptionPane.showMessageDialog(null, string);
		}
	}


	
	
	
}