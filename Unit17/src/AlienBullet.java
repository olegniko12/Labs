import java.awt.Color;
import java.awt.Graphics;

public class AlienBullet extends MovingThing{
	private int speed;

	public AlienBullet()
	{
		this(0,0,0);
	}

	public AlienBullet(int x, int y)
	{
		this(x,y,5);
	}

	public AlienBullet(int x, int y, int s)
	{
		setX(x);
		setY(y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   speed =s;
	}

	public int getSpeed()
	{
	   return speed;
	}


	public void draw( Graphics window )
	{
		window.setColor(Color.yellow);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	
	public void move(String direction)
	{
		setY(getY()+speed);
	}

	public String toString()
	{
		return "";
	}
}
