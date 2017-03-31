package game.play;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window {

    public static void main( String args[] ) {
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
}