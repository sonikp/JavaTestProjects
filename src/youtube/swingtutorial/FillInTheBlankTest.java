package youtube.swingtutorial;

import javax.swing.JOptionPane;

public class FillInTheBlankTest
{
	
	public static void main(String[] args)
	{

		
		String answers[] = new String[5];
		


				
		answers[0] = JOptionPane.showInputDialog(null, "what is your favourite colour?");
		
		
	
		answers[1] = JOptionPane.showInputDialog("InputDialog");
		
		JOptionPane.showMessageDialog(null, answers[0] + answers[1], "color", JOptionPane.PLAIN_MESSAGE);
	
	
//		new FillInTheBlankTest();
//		
//		String[] colours = {"Orange","Green","Blue","Yellow","Red","Purple"};
//		
//		int colour_index = JOptionPane.showOptionDialog(null, "What's your favourite colour?", 
//				"Colour", 0, JOptionPane.QUESTION_MESSAGE, null, colours, 0);
//		
//		// save response
//		answer[0] = colours[colour_index];
//		System.out.println(answer[0]);
	
	

		}
}