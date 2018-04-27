//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	
	private boolean touchedRight = false;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		this(x, y, 30, 30, 10);
	}

	public Alien(int x, int y, int s)
	{
		this(x, y, 30, 30, s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("H:\\Labs\\Labs\\Unit17\\src\\alien.JPG"));
		}
		catch(Exception e)
		{
			System.out.println("Cannot find alien JPG");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move()
	{
	   if(touchedRight == true){
		   setX(getX()-speed);
	   } else {
		   setX(getX()+speed);
	   }
	}
   
   public void touchedSide(){
	   touchedRight = !touchedRight;
	   moveDown();
   }
   
   public void moveDown(){
	   setY(getY()+getHeight()*12/10);
   }

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		
	}
}
