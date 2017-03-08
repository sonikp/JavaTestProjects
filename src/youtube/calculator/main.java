package youtube.calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class main
{
	private JFrame frame;
	
	/**
	 * Launch application
	 */
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					main window = new main();
					//window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
}