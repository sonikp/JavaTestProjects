package youtube.swingtutorial;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;		//dialog boxes

public class BasicSwing extends JFrame
{
	
	// setup JPanel
	JPanel panel = new JPanel();
	
	// setup JButton
	JButton button = new JButton("Hello");
	
	// setup JTextField
	JTextField text = new JTextField("Hi",20);
	
	// setup JTextArea
	JTextArea textArea = new JTextArea("How\nAre\nYou?",5,20);
	
	// setup JLabel
	JLabel label = new JLabel("G'day");
	
	// setup JComboBox
	String choices[]= {"Hallo","Boo!","BonJovi"};
	JComboBox box = new JComboBox(choices);
	
	public static void main(String[] args)
	{
		new BasicSwing();
	}
	
	// constructor
	public BasicSwing()
	{
		super("Basic Swing App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// must add always
		setSize(400,300);
		setResizable(true);
		
		// add components to panel
		panel.add(button);
		panel.add(text);
		panel.add(textArea);
		panel.add(label);
		panel.add(box);
		
		// add panel to JFrame
		add(panel);
		
		setVisible(true);	// always has to be last
	}
}