//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 400;

	public GraphicsRunner()
	{
		super("Test");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new Robot());

		setVisible(true);
		
		
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
		System.out.print("hello");
	}
}