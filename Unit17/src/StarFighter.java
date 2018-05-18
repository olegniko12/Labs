//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

public class StarFighter extends JFrame
{
	private int width;
	private int height;

	public StarFighter()
	{
		super("STARFIGHTER");
		
setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		width = (int) screenSize.getWidth();
		height = (int) screenSize.getHeight();
		
		System.out.println(width + " " + height);
		
		setSize(WIDTH,HEIGHT);

		OuterSpace theGame = new OuterSpace();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	public static void main( String args[] )
	{
		StarFighter run = new StarFighter();
	}
}