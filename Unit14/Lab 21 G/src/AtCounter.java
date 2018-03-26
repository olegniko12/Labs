//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.ArrayList;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   
   private boolean[][] pointsChecked = new boolean[10][10];

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							 {'@','@','@','-','@','@','-','@','-','@'},
							 {'-','-','-','-','-','-','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','-','@'},
							 {'-','@','-','@','-','@','-','@','-','@'},
							 {'@','@','@','@','@','@','-','@','@','@'},
							 {'-','@','-','@','-','@','-','-','-','@'},
							 {'-','@','@','@','-','@','-','-','-','-'},
							 {'-','@','-','@','-','@','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		
		if(r>=0 && r<atMat.length && c>=0 && c<atMat[0].length && atMat[r][c] == '@'){
			if(pointsChecked[r][c] != true){
				pointsChecked[r][c]=true;
				atCount++;
				atCount = countAts(r+1,c);
				atCount = countAts(r-1,c);
				atCount = countAts(r,c+1);
				atCount = countAts(r,c-1);
			}

		}

		return atCount;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}