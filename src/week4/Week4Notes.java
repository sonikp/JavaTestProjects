package week4;

public class Week4Notes
{
	
}
/*

Example of code/project:
https://github.com/bekkam/retro

Assignment 1
- polymorphism media/classes


- make abstract media class
- then make CD class that extends media

- need to add interface (java interface)
- implement an interface
	- figure out what 'implements' is, and how to use it.
- documentation
- 

Week 4 
Important.
- JComponent classes maintain a listener list, therefore other objects can register, so long as they implement one of the listener interfaces.
- All JComponent has a register(), 
- JPanels, looking at the more advanced features, and the layout managers

Chapter 22


Example
fig 22.3

fig 22.5
	- establishes arrays of constants 
	- colors are immutable, select a new color, but can't change any of the defined colors
	- JMenu
	- an actionListener is generally called an // anonymous inner class
		- because it has no name, the compiler needs a name, which the compiler will need to construct a class name in order for the compiler to use them
		- having no name means this can't be re-addressed (or called) therefore it is only literally being used when it is being used.
	- In order for a menu to be usable, it has to be attached to a JMenuBar.
	- what do ButtonGroups do? make is so the JRadioButtons will be enabled at the one time. Enabling one button will de-select the previous button.
		- the function of de-selecting the other button is handled by the buttonGroup
	- for re-use, an anonymous class can be implemented in a implement class for code reuse. This is for more efficient code re-use.
	- a private inner class can only be used inside that particular class. If you need to reuse the class, then make a class from it.
	- repaint() => re-deploy graphically. This is a request to the java program manager.
	- separator provides visual separation within a menu
	
	- key features; 
	- the use of parallel arrays
	- the importance of a menu bar
	- there is a lot of choice in the order for which you do these things, add's to menu items
	- try to have a systematic approach to how you choose to code.
	- 
	
Fig 22.7
	- uses of parallel arrays
	- JPopupMenu provides context sensitive help information in just the right place
	
	
	
	- what does an adapter class do?
		- allows you to write the contracts for the generic interfaces
		
Fig 22.11
	- static = belongs in the class and there will only be a single instance of that object
	- final = means this stays the same for the entire operation of the application and will not change
	- paint component get's called when you run repaint(). Never call paintComponent yourself.
	- *** this one won't work. this fails because it doesn't add the frame with images to JPanel
		

Fig 22.13
	- JTabbedPane
	
Fig 22.16
	- BoxLayout
	
Fig 22.21
	- the most complicated layout manager
	- 
	
Project 2:
- create swing GUI
- JFC Swing Tutorial book <== available on line as a PDF
- https://www.amazon.com/JFC-Swing-Tutorial-Guide-Constructing/dp/0201914670












*/