//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean[][] tfMaze;
   private boolean found;

	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		tfMaze = new boolean[size][size];
		found = false;
		
		Scanner sc = new Scanner(line);
		maze = new int[size][size];
		int[] iArray = new int[size*size];
		for (int i = 0; i<iArray.length;i++){
			iArray[i]= sc.nextInt();
		}
		int tempInt = 0;
		for (int i = 0; i<size;i++){
			for (int x = 0; x < size; x++){
				maze[i][x]= iArray[tempInt];	
				tempInt++;
			}
		}
		
	}

	public boolean hasExitPath(int r, int c)
	{
		if(r<maze.length && r>=0 && c<maze.length && c>=0 && maze[r][c]==1){
			if(tfMaze[r][c]==false){
				tfMaze[r][c] = true;				
				if(c==(maze.length-1)){
					found = true;
					return true;
				}
				
				if(r>0){
					hasExitPath(r-1,c);
				}
				
				if(r<maze.length){
					hasExitPath(r+1,c);
				}			
				
				if(c>0){
					hasExitPath(r,c-1);
				}					
				
				if(c<maze.length){
					hasExitPath(r,c+1);
				}			
			}
		}
		if(found){
			return true;
		} else {
			return false;
		}
		
	}

	public String toString()
	{
		String output="";

		for (int i = 0; i < maze.length; i++) {
		    for (int j = 0; j < maze.length; j++) {
		    	output+=(maze[i][j] + " ");
		    }
		    output+="\n";
		}

		if(hasExitPath(0,0)){
			output+= "Exit found\n";
		}else {
			output += "Exit not found\n";
		}

		return output;
	}
}