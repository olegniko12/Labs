//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed =5;
   }

   public Paddle(int x, int y)
   {
	  super(x,y);
      speed =5;
   }
   
   public Paddle(int x, int y, int s)
   {
	  super(x,y);
      speed =s;
   }
   
   public Paddle(int x, int y, int h, int w)
   {
	  super(x,y,w,h);
      speed =5;
   }
   
   public Paddle(int x, int y, int h, int w, Color c)
   {
	  super(x,y,w,h,c);
      speed =5;
   }
   
   public Paddle(int x, int y, int h, int w, Color c, int s)
   {
	  super(x,y,w,h,c);
      speed =s;
   }
   
   public Paddle(int x, int y, int h, int w, int s)
   {
	  super(x,y,w,h);
      speed =s;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   Paddle thisPaddle = new Paddle(getX(),getY()-getHeight()-speed, getHeight(), getWidth(), Color.WHITE);
	   thisPaddle.draw(window);
	   setY(getY()+speed);
	   thisPaddle = new Paddle(getX(),getY()+speed, getHeight(), getWidth(), getColor());
	   thisPaddle.draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   Paddle thisPaddle = new Paddle(getX(),getY()+getHeight()+speed, getHeight(), getWidth(), Color.WHITE);
	   thisPaddle.draw(window);
	   setY(getY()-speed);
	   thisPaddle = new Paddle(getX(),getY()-speed, getHeight(), getWidth(), getColor());
	   thisPaddle.draw(window);
   }

   public boolean equals(Object obj)
	{
		Paddle oB = (Paddle) obj; //oB = otherPaddle, the one we are comparing to
		if (getWidth() == oB.getWidth() && getHeight() == oB.getHeight()){
			if(getColor() == oB.getColor()){
				if (getX() == oB.getX() && getY() == oB.getY()){
					if(getSpeed() == oB.getSpeed()){
						return true;
					}
				}
			}
		}



		return false;
	}   
   
   public int getSpeed() {
	   return speed;
   }
   
   public String toString(){
   	String output = "";
		
		output += "XPos: " + getX() + "\nYPos: " + getY() + "\nWidth: " + getWidth() + "\nHeight: " + getHeight() + "\nColor: " + getColor() + "\nSpeed: " + speed + "\n\n"; 
		
		return output;
   }
}