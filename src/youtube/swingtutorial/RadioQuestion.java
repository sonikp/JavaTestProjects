// https://www.youtube.com/watch?v=JULCMBNrdaE&list=PLywxFF6tce1-yXyp0qSPYPl2-Mdx7l0A-&index=6

package youtube.swingtutorial;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import javax.swing.JLabel;
import javax.swing.BoxLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class RadioQuestion extends JPanel implements ActionListener
{
	int correctAns;
	Quiz quiz;
	int selected;
	boolean used;
	
	
	// questions
	JPanel qPanel = new JPanel();
	// answers
	JPanel aPanel = new JPanel();
	JRadioButton[] responses;
	ButtonGroup group = new ButtonGroup();
	// bottom 
	JPanel botPanel = new JPanel();
	JButton next = new JButton("Next");
	JButton finish = new JButton("Finish");
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("RadioButton Test");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		String[] answers = {"wrong1","right","wrong2"};
		frame.add(new RadioQuestion("what's right?", answers[0], 1, this));
		
		frame.setVisible(true);
		
	} 
	
	
	
	
	// constructor
	public RadioQuestion(String q, String[] options, int ans, Quiz quiz)	//
	{
//		super();
		this.quiz = quiz;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		correctAns = ans;
		// question
		qPanel.add(new JLabel(q));
		add(qPanel);
		// answer
		responses = new JRadioButton[options.length];
		for (int i = 0; i < options.length; i++)
		{
			responses[i] = new JRadioButton(options[i]);
			responses[i].addActionListener(this);
			group.add(responses[i]);
			aPanel.add(responses[i]);
		}
		add(aPanel);
		// bottom
		next.addActionListener(this);
		finish.addActionListener(this);
		botPanel.add(next);
		botPanel.add(finish);
		add(botPanel);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object src = e.getSource();
		// next button
		if (src.equals(next))
		{
			showResult();
			if (selected == correctAns)
			{
				used = true;
				quiz.next();
			}
		}
		
	}
	
	
	public void showResult()
	{
		
	}
	



}