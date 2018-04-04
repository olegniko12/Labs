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
import java.util.Random;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	
	private int leftScore;
	private int rightScore;
	
	public Pong()
	{
		//set up all variables related to the game
		//Right border is x= 784
		//Bottom border is y = 528
		ball = new Ball(382,254,20,20, Color.BLACK, 3,3);
		
		leftPaddle = new Paddle(40,100,100,30, Color.BLUE, 5);
		rightPaddle = new Paddle(714,100,100,30, Color.BLUE, 5);

		keys = new boolean[4];

		leftScore = rightScore = 0;
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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

		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		ball.moveAndDraw(graphToBack);
		


		//see if ball hits left wall or right wall
		if((ball.getX()<=0))
		{
			rightScore++;
			ball.draw(graphToBack,Color.WHITE);
			ball = new Ball(382,generateRandomNum(5,400),20,20, Color.BLACK, -3,3);
		} 
		else if (ball.getX()>=784-ball.getWidth())
		{
			leftScore++;
			ball.draw(graphToBack,Color.WHITE);
			ball = new Ball(382,generateRandomNum(5,400),20,20, Color.BLACK, 3,3);
		}

		
		//see if the ball hits the top or bottom wall 
		if(ball.getY()>=528-ball.getHeight()|| ball.getY()<=0){
			ball.setYSpeed(-ball.getYSpeed());
		}
		


		//see if the ball hits the left paddle
		if(ball.getX()<=leftPaddle.getX()+leftPaddle.getWidth()){
			if(ball.getY() > leftPaddle.getY()-ball.getHeight() && ball.getY()+ball.getHeight()<=leftPaddle.getY()+leftPaddle.getHeight()){
				System.out.println("Hit left paddle!");
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		
		//see if the ball hits the right paddle
		if(ball.getX()+ball.getWidth()>=rightPaddle.getX()){//If paddle and ball same X value
			if(ball.getY() > rightPaddle.getY()-ball.getHeight() && ball.getY()+ball.getHeight()<(rightPaddle.getY()+rightPaddle.getHeight())){
				System.out.println("Hit right paddle!");
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		
		

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			if (leftPaddle.getY()>0){
				leftPaddle.moveDownAndDraw(graphToBack);
			}
			
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			
			if (leftPaddle.getY()<428){
				leftPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[2] == true)
		{
			if (rightPaddle.getY()>0){
				rightPaddle.moveDownAndDraw(graphToBack);
			}
		}
		if(keys[3] == true)
		{
			if (rightPaddle.getY()<428){
				rightPaddle.moveUpAndDraw(graphToBack);
			}
		}
		
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(0, 498, 100, 20);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("LEFT: " + leftScore, 10, 508);
		
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(704, 498, 100, 20);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("RIGHT: " + rightScore, 704, 508);
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}
	
	public int generateRandomNum(int min, int max){
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}