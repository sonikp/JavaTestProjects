package youtube.swingtutorial;



//+ image icon
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
//frame + button
import javax.swing.*;




public class TestImageIcon
{
	
	// constructor
	public TestImageIcon()
	{
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
	    // Creating Button          
	    JButton button = new JButton("Click Me..");
	    try
	    {
	    	Image img = ImageIO.read(getClass().getResource("X.png"));
            button.setIcon(new ImageIcon(img));
	    }
	    catch (IOException ex)
	    { }
	   
	    button.setBounds(50,50,90, 50);  
	         
	    //Adding button onto the frame
	    frame.add(button);  
	              
	    // Setting Frame size. This is the window size
	    frame.setSize(300,200);
	    frame.setResizable(false);
	    
	    frame.setLayout(null);  
	    frame.setVisible(true);  
	              
	    
	}
	
	
	
	public static void main(String[] args)
	{
		// reference everything from a non-static perspective
		// sets up the object without declaring a name, cannot reference this in the future
		new TestImageIcon();
	}
}