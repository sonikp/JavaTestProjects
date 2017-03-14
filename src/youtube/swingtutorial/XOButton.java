package youtube.swingtutorial;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;	// listener
import java.awt.event.ActionEvent;

public class XOButton extends JButton implements ActionListener
{
	// variables
	ImageIcon X,O;
	byte value = 0;
	/*
	 0:nothing
	 1:X
	 2:O
	 */
	
	// constructor
	public XOButton()
	{
//		X = new ImageIcon(this.getClass().getResource("img/tic-tac-toe-clipart-X.png"));
//		O = new ImageIcon(this.getClass().getResource("img/tic-tac-toe-clipart-O.png"));
		X = new ImageIcon(this.getClass().getResource("/tic-tac-toe-clipart-X.png"));
		O = new ImageIcon(this.getClass().getResource("/tic-tac-toe-clipart-O.png"));
		
		// adding the listener to listen and trigger on the same event
		this.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		value++;
		value %= 3;	// divides LH operand by RH operand; puts remainder in LH operand
		switch(value)
		{
		case 0:
			setIcon(null);
			break;
		case 1:
			setIcon(X);
			break;
		case 2:
			setIcon(O);
			break;
		
		}
	}
}