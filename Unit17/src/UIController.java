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

public class UIController {
	
	private int score;
	private int aliensLeft;
	private int missedShots;
	
	private String currentMessage = "";
	private int framesLeft = 0;
	
	public UIController (int aL){
		score = 0;
		aliensLeft = aL;
		
		missedShots = 0;
	}
	
	public void addScore(){
		score++;
	}
	
	public void shotMissed(){
		missedShots++;
	}
	
	public void removeAlien(){
		aliensLeft--;
	}
	
	public int totalScore(){
		return score;
	}
	
	public int alienNumber(){
		return aliensLeft;
	}
	
	public int missedShots(){
		return missedShots;
	}
	
	public void newMessage(String nM){
		currentMessage = nM;
		System.out.println("Set new message!");
		framesLeft = 795;
	}
	
	public String updateInfo(){
		return "Aliens: " + alienNumber() + "   Total score: " + totalScore() + "   Missed shots: " + missedShots();
	}
	
	public void fadeMessage(Graphics window, int x, int y){
		fadeVisual(window, x,y);
		fadeVisual(window,x,y);
	}
	//(20,40)
	
	public void fadeVisual(Graphics window, int x, int y){
		float cValue = framesLeft/3;
		if (cValue > 265){
			cValue = 265;
		}
		
		Color fadeColor = new Color (cValue/265, cValue/265, cValue/265);
		window.setColor(fadeColor);
		window.drawString(currentMessage, x, y);
		window.setColor(Color.black);
		window.fillRect(x, y, 900, 5);
		
		if (framesLeft>0){
			framesLeft--;
		}
		
		cValue = framesLeft/3;
		if (cValue > 265){
			cValue = 265;
		}
		fadeColor = new Color (cValue/265, cValue/265, cValue/265);
		window.setColor(fadeColor);
		window.drawString(currentMessage, x, y);
		window.setColor(Color.black);
		window.fillRect(x, y, 900, 5);
		
		if (framesLeft>0){
			framesLeft--;
		}
		
	}
	
	public void winScreen(Graphics window){
		window.setColor(Color.BLUE);
		window.drawString("CONGRATULATIONS! YOU WIN!", 300, 250);
	}
	
}
