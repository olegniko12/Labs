//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window, 200, 150, 100, 200, Color.BLACK, Color.YELLOW);
      
      //call other methods
      
   }

   public void head(Graphics window, int xValue, int yValue, int width, int height, Color color1, Color color2)
   {
      drawSquare(window, xValue+width/2-width/8, yValue-height/4, width/4, height/2, color1, color2);
      drawCircle (window, xValue, yValue-2*height/3, width, height/2, color1, color2);			
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

		drawCircle (window, xValue, yValue-2*height/3, width, height/2, color1, color2);
	}

   public void upperBody( Graphics window )
   {

	   drawSquare(window, xValue, yValue, width, height, color1, color2);
	   drawCircle (window, xValue, yValue, width, height, color1, color2);
   }

   public void lowerBody( Graphics window )
   {

		//add more code here

   }
}