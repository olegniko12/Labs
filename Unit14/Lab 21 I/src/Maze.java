//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		out.println(size);
		char[] sArray = line.toCharArray();
		for (char c: sArray){
			out.println(c);
		}
		int tempInt = 0;
		for (int i = 0; i<maze[i].length;i++){
			for (int x = 0; x < maze.length; x++){
				maze[i][x]= (int) sArray[tempInt];
			}
		}
	}

	public boolean hasExitPath(int r, int c)
	{

		return false;
	}

	public String toString()
	{
		String output="";

		for (int i = 0; i < maze.length; i++) {
		    for (int j = 0; j < maze[i].length; j++) {
		    	output+=(maze[i][j] + " ");
		    }
		    output+="\n";
		}



		return output;
	}
}