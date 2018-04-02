//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

import sun.java2d.loops.DrawRect;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y){
		super (x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h) {
		super (x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c) {
		super (x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c, int m, int n) {
		super (x,y,w,h,c);
		xSpeed = m;
		ySpeed = n;
	}
   
	public void setXSpeed(int xS){
		xSpeed = xS;
	}
	
	public void setYSpeed(int yS){
		ySpeed = yS;
	}
	
	public void setSpeed(int xS, int yS){
		xSpeed =xS;
		ySpeed = yS;
	}
	
	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}
	

	public void moveAndDraw(Graphics window)
    {
	   //draw a white ball at old ball location
	   Ball nB = new Ball(getX(),getY());

       setX(getX()+xSpeed);
       setY(getY()+getYSpeed());

       nB = new Ball(getX(),getY());
    }
   
	public boolean equals(Object obj)
	{
		Ball oB = (Ball) obj; //oB = otherBall, the one we are comparing to
		if (getWidth() == oB.getWidth() && getHeight() == oB.getHeight()){
			if(getColor() == oB.getColor()){
				if (getX() == oB.getX() && getY() == oB.getY()){
					if(getXSpeed() == oB.getXSpeed() && getYSpeed() == oB.getYSpeed()){
						return true;
					}
				}
			}
		}



		return false;
	}   

    //add the get methods

    public String toString(){
    	String output = "";
		
		output += "XPos: " + getX() + "\nYPos: " + getY() + "\nWidth: " + getWidth() + "\nHeight: " + getHeight() + "\nColor: " + getColor() + "\nXSpeed: " + getXSpeed() + "\nYSpeed: " + getYSpeed() + "\n\n"; 
		
		return output;
    }
   
}