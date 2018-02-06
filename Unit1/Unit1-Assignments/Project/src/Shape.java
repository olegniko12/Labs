//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos=x;
		yPos=y;
		width=wid;
		height=ht;
		color=col;
		System.out.print("hello");
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      System.out.print("hello");

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

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}