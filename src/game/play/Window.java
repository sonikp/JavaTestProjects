package game.play;

// library for firstWindow
import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window 
{

    // constructor
	public Window()
	{
		
	}
	
	public void firstWindow()
	{
		JFrame jFrame = new JFrame("Window");
        jFrame.setSize(100, 100);
        jFrame.setVisible(true);
	}
	
	public void secondWindow()
	{
//		import javax.swing.JFrame;
//		import javax.swing.JTextField;
		
		JFrame jFrame = new JFrame("Window");
        JTextField textField = new JTextField();
        textField.setText("poop");
        jFrame.setSize(100, 100);
        jFrame.add(textField);
        jFrame.setVisible(true);
		
	}
	
	public void thirdWindow()
	{
//		import java.awt.Dimension;
//		import java.awt.FlowLayout;
//		import java.awt.event.ActionEvent;
//		import java.awt.event.ActionListener;
//
//		import javax.swing.JButton;
//		import javax.swing.JFrame;
//		import javax.swing.JTextField;
		
		JFrame jFrame = new JFrame("Window");
        JTextField textField = new JTextField();
        textField.setText("poop");
        Dimension dim = new Dimension();
        
        JButton button = new JButton( "Button" );
        button.addActionListener( new ActionListener() {
            int i=0;
            public void actionPerformed( ActionEvent e ) {
                textField.setText( "poop"+i++);
            }
        });
        
        jFrame.setSize(100, 100);
        jFrame.setLayout(new FlowLayout());
        jFrame.add(textField);
        jFrame.add(button);
        jFrame.setVisible(true);
        
	}
	
	public void fourthWindow()
	{
		JFrame jFrame = new JFrame("Window");
        JTextField textField = new JTextField();
        textField.setText("poop");
        Dimension dim = new Dimension();
        dim.setSize(100, 20);
        textField.setPreferredSize(dim);
        
        JButton button = new JButton( "Button" );
        button.addActionListener( new ActionListener() {
            int i=0;
            public void actionPerformed( ActionEvent e ) {
                textField.setText( "poop"+i++);
            }
        });
        
        jFrame.setSize(150, 200);
        jFrame.setLayout(new FlowLayout());
        jFrame.add(textField);
        jFrame.add(button);
        jFrame.setVisible(true);
	}
	
	public void anotherWindows()
	{
        JFrame jFrame = new JFrame("Window");
        JTextField textField = new JTextField();
        textField.setText("poop");
        Dimension dim = new Dimension();
        
        JButton button = new JButton( "Button" );
        button.addActionListener( new ActionListener() {
            int i=0;
            public void actionPerformed( ActionEvent e ) {
                textField.setText( "poop"+i++);
            }
        });
        
        jFrame.setSize(100, 100);
        jFrame.setLayout(new FlowLayout());
        jFrame.add(textField);
        jFrame.add(button);
        jFrame.setVisible(true);
	}
	
	public static void main( String args[] ) 
    {
		Window w = new Window();
		w.firstWindow();

        
    }
}