package youtube.swingtutorial;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Quiz extends JFrame
{
	JPanel p = new JPanel();
	CardLayout cards = new CardLayout();
	int numQs;
	int wrongs = 0;
	int total = 0;
	
	String[][] answers = {};
	
	
	
	
	RadioQuestion questions[] = 
	{
	new RadioQuestion(
			"What's the capital of Holland?",
			answers[0],
			1,this),
	new RadioQuestion(
			"What's a kerf?",
			answers[1],
			3,this),
	};
	
	
	public static void main(String[] args)
	{
		
	}
	
	// constructor
	public Quiz()
	{
		super("Quiz Game");
		setResizable(true);
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p.setLayout(cards);
		add(p);
		setVisible(true);
	}
	
	public void next()
	{
		
	}
}