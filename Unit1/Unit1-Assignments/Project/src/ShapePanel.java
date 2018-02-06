//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
		
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);
		
		drawMonster(window, 300, 200, 50, 60, Color.BLACK, Color.YELLOW);

		
	}
	
	public void drawSquare (Graphics window, int xValue, int yValue, int width, int height, Color color1, Color color2) {
		window.setColor(color1);
		window.fillRect(xValue,yValue,width,height);
		window.setColor(color2);
		window.fillRect(xValue+5, yValue+5, width-10, height-10);		
	}
	
	public void drawCircle (Graphics window, int xValue, int yValue, int width, int height, Color color1, Color color2) {
		window.setColor(color1);
		window.fillOval(xValue, yValue, width, height);
		window.setColor(color2);
		window.fillOval(xValue+5, yValue+5, width-10, height-10);		
	}
	
	public void drawMonster (Graphics window, int xValue, int yValue, int width, int height, Color color1, Color color2) {
		drawSquare(window, xValue+width/8, yValue+height/4, width/3, height, color1, color2);
		drawSquare(window, xValue+ width-width/3-width/8, yValue+height/4, width/3, height, color1, color2);
		drawSquare(window, xValue+width/2-width/8, yValue-height/4, width/4, height/2, color1, color2);
		drawSquare(window, xValue, yValue, width, height, color1, color2);
		drawCircle (window, xValue, yValue, width, height, color1, color2);
		drawCircle (window, xValue, yValue-2*height/3, width, height/2, color1, color2);
	}
	
}