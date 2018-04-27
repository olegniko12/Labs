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

public class Bullets
{
	private ArrayList<Ammo> ammo;
	private ArrayList<AlienBullet> alienAmmo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
		alienAmmo = new ArrayList<AlienBullet>();
	}

	public void add(ArrayList<Ammo> list, Ammo al)
	{
		list.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (Ammo a: ammo){
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Ammo a : ammo){
			a.move("UP");
		}
		for (AlienBullet a : alienAmmo){
			a.move("UP");
		}
	}

	public void cleanEmUp()
	{
		for (int i = 0; i<ammo.size(); i++){
			if (ammo.get(i).getY()<0){
				ammo.remove(i);
			}
		}
		for (int i = 0; i<alienAmmo.size(); i++){
			if (alienAmmo.get(i).getY()>600){
				alienAmmo.remove(i);
			}
		}
	}

	public ArrayList<Ammo> getAmmoList()
	{
		return ammo;
	}
	
	public ArrayList<AlienBullet> getAlAmmoList()
	{
		return alienAmmo;
	}

	public String toString()
	{
		return "";
	}
}
