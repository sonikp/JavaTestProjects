// https://www.youtube.com/watch?v=av3HQLtir50&index=9&list=PLywxFF6tce1-yXyp0qSPYPl2-Mdx7l0A-

package youtube.swingtutorial;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JTabbedPane;
import javax.swing.JSlider;

import javax.swing.BoxLayout;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;



public class DimConverter extends JFrame implements ChangeListener
{
	// variables
	JTabbedPane tabs = new JTabbedPane();
	JPanel panelTemp = new JPanel();
	JPanel panelMass = new JPanel();
	JPanel panelWeight = new JPanel();
	JPanel panelSpeed = new JPanel();
	JSlider slider = new JSlider(0, 500);
	
	JPanel panelValues = new JPanel();
	JTextField fieldKelvin = new JTextField(5);
	JTextField fieldCelcius = new JTextField(5);
	JTextField fieldFahrenheit = new JTextField(5);
	
	public DimConverter()
	{
		// swing stuff
		super("Dimensional Analysis");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		// setup temperature
		panelTemp.setLayout(new BoxLayout(panelTemp,BoxLayout.Y_AXIS));
		slider.addChangeListener(this);
		panelTemp.add(slider);
		updateTemp();
		panelValues.add(fieldKelvin);
		panelValues.add(fieldCelcius);
		panelValues.add(fieldFahrenheit);
		panelTemp.add(panelValues);
		tabs.add(panelTemp, "Temperature");
		
		// setup mass
		tabs.add(panelMass,"Mass");
		
		// setup weight
		tabs.add(panelWeight,"Weight");
		
		// setup speed
		tabs.add(panelSpeed,"Speed");
				
		add(tabs);
		setVisible(true);
		
	}
	
	void updateTemp()
	{
		int baseTemp = slider.getValue();
		
		int tKelvin = baseTemp;
		int tCelcius = baseTemp - 273;
		int tFahrenheit = (int)(tCelcius * (9f / 5) + 32);
		
		fieldKelvin.setText(tKelvin + " K");
		fieldCelcius.setText(tCelcius + " \u00b0C");
		fieldFahrenheit.setText(tFahrenheit + " \u00b0F");
		
	}
	
	public void stateChanged(ChangeEvent evt)
	{
		Object src = evt.getSource();
		if (src == slider)
		{
			updateTemp();
		}
		
	}
	
	public static void main(String[] args)
	{
		new DimConverter();
	}
}

