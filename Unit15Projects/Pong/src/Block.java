//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(100);
		setY(150);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y){
		setX(x);
		setY(y);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int h){
		setX(x);
		setY(y);
		setWidth(10);
		setHeight(h);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, Color c){
		setX(x);
		setY(y);
		setWidth(10);
		setHeight(10);
		setColor(c);
	}
	
	public Block(int x, int y, int w, int h, Color c){
		setX(x);
		setY(y);
		setColor(c);
		setWidth(w);
		setHeight(h);
	}
	
	public Block(int x, int y, int w, int h){
		setX(x);
		setY(y);
		setColor(Color.BLACK);
		setWidth(w);
		setHeight(h);
	}

   public void setColor(Color col)
   {
	   color = col;
   }
   public void setWidth(int w){
	   width = w;
   }
   public void setHeight(int h){
	   height = h;
   }
   
   public Color getColor(){
	   return color;
   }
   public int getWidth(){
	   return width;
   }
   public int getHeight(){
	   return height;
   }
   
   @Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos =x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos = y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}   
   
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
	   window.setColor(color);
       window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
       window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{




		return false;
	}

	

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		String output = "";
		
		output += "XPos: " + getX() + "\nYPos: " + getY() + "\nWidth: " + getWidth() + "\nHeight: " + getHeight() + "\nColor: " + getColor() + "\n\n"; 
		
		return output;
	}
}