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
	
	// ===Panel section====
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

	
	// used for testing RadioQuestion.java
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("RadioButton Test");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		String[] answers = {"wrong1","right","wrong2"};
		frame.add(new RadioQuestion("what's right?", answers, 1));
		
		frame.setVisible(true);
		
	} 
	
	
	
	
	// constructor for RadioQuestion.java class
	public RadioQuestion(String q, String[] options, int ans)	// , Quiz quiz
	{
//		this.quiz = quiz;		// not used, calling only local class
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		correctAns = ans;
		
		// question (top)
		qPanel.add(new JLabel(q));
		add(qPanel);
		
		// answer (middle)
		responses = new JRadioButton[options.length];
		for (int i = 0; i < options.length; i++)
		{
			responses[i] = new JRadioButton(options[i]);
			responses[i].addActionListener(this);
			group.add(responses[i]);
			aPanel.add(responses[i]);
		}
		add(aPanel);
		
		// bottom (bottom)
		next.addActionListener(this);
		finish.addActionListener(this);
		botPanel.add(next);
		botPanel.add(finish);
		add(botPanel);
	}
	
	// constructor for Quiz.java class
	public RadioQuestion(String q, String[] options, int ans, Quiz quiz)	 
	{
		this.quiz = quiz;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		correctAns = ans;
		
		// question (top)
		qPanel.add(new JLabel(q));
		add(qPanel);
		
		// answer (middle)
		responses = new JRadioButton[options.length];
		for (int i = 0; i < options.length; i++)
		{
			responses[i] = new JRadioButton(options[i]);
			responses[i].addActionListener(this);
			group.add(responses[i]);
			aPanel.add(responses[i]);
		}
		add(aPanel);
		
		// bottom (bottom)
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
		
		//finish button
		if (src.equals(finish))
		{
			quiz.showSummary();
		}
		
		// radio buttons
		for (int i = 0; i < responses.length; i++)
		{
			if (src == responses[i])
			{
				selected = i;
			}
		}
	}
	
	
	public void showResult()
	{
		String text = responses[selected].getText();
		quiz.total++;
		if (selected == correctAns)
		{
			JOptionPane.showMessageDialog(null, text + " is correct\nWell Done :)");
		}
		else
		{
			quiz.wrongs++;
			JOptionPane.showMessageDialog(null, text +" is wrong\nSorry :(");
		}
	}
	



}