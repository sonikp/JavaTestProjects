package youtube.swingtutorial;

import javax.swing.JOptionPane;

public class FillInTheBlankTest
{
	
	public static void main(String[] args)
	{
		
		int count = 0;
		String options[] = {"Place","Adjective","Verb ending with -ing",
				"Famous person","Friend","Present tense verb","Room","Musical instrument"};
		String answers[] = new String[8];
		
		for ( String input : answers)
		{
			answers[count] = JOptionPane.showInputDialog(null, (options[count] + "?"), "eh?", JOptionPane.PLAIN_MESSAGE);
			count++;
		}
		
//		answers[0] = JOptionPane.showInputDialog(null, (options[0] + "?"), "eh?", JOptionPane.PLAIN_MESSAGE);
//		answers[1] = JOptionPane.showInputDialog(null, (options[1] + "?"), "eh?", JOptionPane.PLAIN_MESSAGE);
//		answers[2] = JOptionPane.showInputDialog(null, (options[2] + "?"), "eh?", JOptionPane.PLAIN_MESSAGE);
//		answers[3] = JOptionPane.showInputDialog(null, (options[3] + "?"), "eh?", JOptionPane.PLAIN_MESSAGE);
//		answers[4] = JOptionPane.showInputDialog(null, (options[4] + "?"), "eh?", JOptionPane.PLAIN_MESSAGE);
//		answers[5] = JOptionPane.showInputDialog(null, (options[5] + "?"), "eh?", JOptionPane.PLAIN_MESSAGE);
//		answers[6] = JOptionPane.showInputDialog(null, (options[6] + "?"), "eh?", JOptionPane.PLAIN_MESSAGE);
//		answers[7] = JOptionPane.showInputDialog(null, (options[7] + "?"), "eh?", JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "All a Dream\n\n" +

				"I fell asleep yesterday listening to an old album that my mom had.\n" +
				"I really enjoyed it, though I had a weird dream. \n" +
				"It was kind of like one of the old songs.\n\n" +
				
				"I've been workin' in " + answers[0] + ",\n" +
				"All the " + answers[1] + " day.\n" +
				"I've been workin' in " + answers[0] + ",\n" +
				"Just to pass the time away.\n\n" +
				"Don't you hear the whistle " + answers[2] + "?\n" +
				"Rise up so early in the morn.\n" +
				"Don't you hear " + answers[3] + " shouting\n" +
				"\"" + answers[4] + ", " + answers[5] + " your horn? \"\n\n" +
				
				answers[4] + ", won't you " + answers[5] + ",\n" +
				answers[4] + ", won't you " + answers[5] + ",\n" +
				answers[4] + ", won't you " + answers[5] + " your horn?\n" +
				answers[4] + ", won't you " + answers[5] + ",\n" +
				answers[4] + ", won't you " + answers[5] + ",\n" +
				answers[4] + ", won't you " + answers[5] + " your horn?\n\n" +
				
				"Someone's in the " + answers[6] + " with " + answers[4] + ".\n" +
				"Someone's in the " + answers[6] + ", I know.\n" +
				"Someone's in the " + answers[6] + " with " + answers[4] + "\n" +
				"Noodling on the old " + answers[7] + ".\n\n" +
				
				"It was the weirdest dream I've had in a long time! ");

	
		}
}