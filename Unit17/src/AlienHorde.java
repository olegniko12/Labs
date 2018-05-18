//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private ArrayList<Alien> aliens;

	
	public AlienHorde(int size, Ship p)
	{

		aliens = new ArrayList<Alien>();
		int xValue = 10;
		int yValue = 10;
		int speed = 1;
		
		for (int i=0; i<size; i++){
			aliens.add(new Alien(xValue, yValue, 40,40,speed));
			xValue+=50;
			if(xValue>=740){
				speed *= -1;
				xValue = 10;
				yValue+=50;
			}
		}
		
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a: aliens){
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien a: aliens){
			if(a.getX()<=0){
				a.touchedSide();
			} else if (a.getX()>=700 + a.getWidth()) {
				a.touchedSide();
			}
			a.move();
		}
	}

	public void removeDeadOnes(List<Ammo> shots,UIController UIC)
	{
		for (Alien al: aliens){
			for (Ammo a: shots){
				if (a.getX()>al.getX()-a.getWidth() && a.getX()<al.getX()+al.getWidth()){
					if (a.getY()>al.getY()-a.getHeight() && a.getY()<al.getY()+al.getHeight()){
						aliens.remove(aliens.indexOf(al));
						shots.remove(shots.indexOf(a));
						UIC.removeAlien();
						UIC.addScore();
						UIC.newMessage("ALIEN KILLED!");
					}
					
				}
			}
		}
		
	}

	public int returnLength(){
		return aliens.size();
	}

	public String toString()
	{
		return "";
	}
}
