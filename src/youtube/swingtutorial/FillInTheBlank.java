package youtube.swingtutorial;

// https://www.youtube.com/watch?v=UQgh1vRh68k&list=PLywxFF6tce1-yXyp0qSPYPl2-Mdx7l0A-&index=2

import javax.swing.JOptionPane;

public class FillInTheBlank
{
	public static void main(String[] args)
	{
		boolean done = false;
		String answer[] = new String[11];
		
		new FillInTheBlank();
		{
			
			while (!done)
			{
				done = true;
			
				//start us off
				JOptionPane.showMessageDialog(null, "Make a story :)",
						"Fill In The Blank Game...",JOptionPane.INFORMATION_MESSAGE);
				
				// Start program
				// 1. input options - Color
				String[] colours = {"Orange","Green","Blue","Yellow","Red","Purple"};
				
				// get selection
				int colour_index = JOptionPane.showOptionDialog(null, "What's your favourite colour?", 
						"Colour", 0, JOptionPane.QUESTION_MESSAGE, null, colours, 0);
				
				// save response
				answer[0] = colours[colour_index];
				
				// 2. input options - Liquid
				String liquid_index = JOptionPane.showInputDialog(null, "What is your favourite drink?",
						"Liquid", JOptionPane.QUESTION_MESSAGE);
				
				// save response
				answer[1] = liquid_index;
				
				// 3. input: plural noun
				answer[2] = JOptionPane.showInputDialog(null, "Name something you bring to a party?\n(plural noun)",
						"Plural Noun", JOptionPane.QUESTION_MESSAGE);
				
				// 4. input: adjective
				answer[3] = JOptionPane.showInputDialog("What is one aspect you would want an imaginary friend to have?\n(adjective)");
				
				// 5. input: present tense verb
				answer[4] = JOptionPane.showInputDialog("What is something you do when you drive a car?\n(present tense verb)");
				
				// 6. input: plural noun
				answer[5] = JOptionPane.showInputDialog("Name something you own multiple of?\n(plural noun)");
				
				// 7. input: singular noun
				answer[6] = JOptionPane.showInputDialog("What is something you might find in the USA?\n(singular noun)");
				
				// 8. input: adjective
				answer[7] = JOptionPane.showInputDialog("Describe your currrent leader in one word\n(adjective)");
				
				// 9. input: present tense verb
				answer[8] = JOptionPane.showInputDialog("What is something you do while traveling?\n(present tense verb)");
				
				// 10. input: present tense verb
				answer[9] = JOptionPane.showInputDialog("Name something you do in the gym?\n(present tense verb)");
				
				// 11. input: singular noun
				answer[10] = JOptionPane.showInputDialog("If you could have one thing in the world, what would it be?\n(singular noun)");
				
				// confirm with user, using a trick loop
				// default = yes/no/cancel
				int input = JOptionPane.showConfirmDialog(null, "Want to see the results?"); 
			
				// exit routine
				if (input == 1 || input == 2)
				{
					done = false; 
				
				}
				else
				{
					input = JOptionPane.showConfirmDialog(null, "Really? ...last chance...?", "", JOptionPane.YES_NO_OPTION);
					if (input ==  1)
					{
						done = false;
					}
					else
					{
						input = JOptionPane.showConfirmDialog(null, "OK, but you can still press cancel", "", JOptionPane.OK_CANCEL_OPTION);
					}
				}
			}	// end while loop
			if (done)
			{
				JOptionPane.showMessageDialog(null, "Each spring, the sky turns " + answer[0] + ". Giant drops of " + answer[1] + 
						" fall from the sky.\nAll this " + answer[1] + " helps the grass and the " + 
						answer[2] + " to grow, but it can make things \nreally " + answer[3] + " too. \n\n"

						+ "Some places get so much " + answer[1] + ", that rivers " + answer[4] +
						" into the streets.\nDriving can be tricky when this happens, so some people put special " + 
						answer[5] + " on \ntheir cars. \n\n"

						+ "And when the " + answer[1] + " is falling, don't forget your " + answer[6] + 
						". Otherwise, \nyour feet might get " + answer[7] + " if you " + answer[8] + " in puddles! \n\n"

						+ "After all the " + answer[1] + " has fallen, the skies begin to " + answer[9] + 
						". If you are lucky, \nyou might see a huge " + answer[10] + " stretched across the sky. \n\n");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "OK, we'll start over then");
			}
		}	// end FillInTheBlank() method
	}
			
}