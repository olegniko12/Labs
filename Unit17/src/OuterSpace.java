//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private boolean hasFired;
	
	private AlienHorde horde;
	
	private UIController UIC;
	
	private boolean gameOver = false;
	
	private int framesLeft = 780;
	private String currentMessage = "";

	private Bullets shots;
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		ship = new Ship(380, 280, 40,40,5);
		horde = new AlienHorde(30, ship);
		UIC = new UIController(horde.returnLength());
		shots = new Bullets(ship, UIC);
		
		alienOne = new Alien(200,100, 40, 40, 2);
		alienTwo = new Alien(250,100, 40, 40, 2);
		
		this.addKeyListener(this);
		new Thread(this).start();	

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if (horde.returnLength()<=0){
			UIC.winScreen(graphToBack);
			gameOver = true;
		} else {
			UIC.fadeMessage(graphToBack,20,40);
			
			horde.drawEmAll(graphToBack);
			horde.moveEmAll();
			horde.removeDeadOnes(shots.getAmmoList(), UIC);
			
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString(UIC.updateInfo(), 20, 20);
			graphToBack.setColor(Color.BLACK);
			
			ship.draw(graphToBack);
			
			if(keys[0] == true)
			{
				if (ship.getX()>0)
					ship.move("LEFT");
			} else if(keys[1] == true)
			{
				if (ship.getX()+ship.getWidth()<785)
					ship.move("RIGHT");
			}
			
			if(keys[2] == true)
			{
				if (ship.getY()>350)
					ship.move("UP");
			} else if(keys[3] == true)
			{
				if (ship.getY()<515)
					ship.move("DOWN");
			}
			
			if(keys[4] == true && !hasFired)
			{
				
				shots.add(shots.getAmmoList(), new Ammo(ship.getX()+ship.getWidth()/2-5, ship.getY()));
				hasFired = true;
				System.out.println(shots.getAmmoList().size());
				
				if(gameOver){
					new OuterSpace();
				}
				
			} else if(keys[4] == false){
				hasFired = false;
			}
			
			shots.moveEmAll();
			shots.drawEmAll(graphToBack);
			shots.cleanEmUp();
		}
		
		
		
		/*
		for(Ammo a: shots.getList()){
			
			if(a.getX()>)
		}
		*/

		//add code to move Ship, Alien, etc.


		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

