import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }

  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
  }
  
  public void keepOnlyRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setRed(0);
      }
    }
  }
  
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(255-pixelObj.getGreen());
        pixelObj.setRed(255-pixelObj.getRed());
        pixelObj.setBlue(255-pixelObj.getBlue());
      }
    }
  }
  
  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(pixelObj.getGreen()-40);
        pixelObj.setRed(pixelObj.getRed()-40);
        pixelObj.setBlue(pixelObj.getBlue()-40);
      }
    }
  }
  
  public void grayScale()
  {
    Pixel[][] pixels = this.getPixels2D();
    
    
    
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int average = (pixelObj.getBlue()+pixelObj.getGreen()+pixelObj.getRed())/3;
        pixelObj.setGreen(average);
        pixelObj.setRed(average);
        pixelObj.setBlue(average);
      }
    }
  }
  
  public void encode(Picture messagePict){
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] originalPixels = getPixels2D();
	  Pixel currentPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  for(int row = 0; row< getHeight(); row++){
		  for(int col = 0; col < getWidth(); col++){
			  /*
			  currentPixel = originalPixels[row][col];
			  
			  if (currentPixel.getBlue() % 2 == 0){
				  currentPixel.setAlpha(currentPixel.getAlpha()-1);
			  }
			  messagePixel = messagePixels[row][col];
			  if(messagePixel.colorDistance(Color.BLACK) > 50){
				  currentPixel.setBlue(currentPixel.getBlue()+1);
				  count++;
			  }
			  */
			  currentPixel = originalPixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if(messagePixel.colorDistance(Color.BLACK) > 50){
				  currentPixel.setAlpha(170);
				  System.out.println(currentPixel.getAlpha());
				  count++;
			  } else {
				  System.out.println("Test");
			  }
			  
		  }
	  }
	  System.out.println(count);
  }
  
  public Picture decode(){
	  Pixel[][] pixels = this.getPixels2D();
	  int height = getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height, width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row<getHeight(); row++){
		  for (int col = 0; col < getWidth(); col++){
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if(currPixel.getAlpha() < 254){
				  messagePixel.setColor(Color.WHITE);
				  //System.out.println("SET TO WHITE");
				  count++;
			  } else {
				  messagePixel.setColor(Color.BLACK);
				  //System.out.println("SET TO BLACK");
			  }
		  }
	  }
	  System.out.println(count);
	  return messagePicture;
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 294;
    Pixel bottomPixel = null;
    Pixel topPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 163; row < 197; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 100; col < 171; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[row+70]                       
                         [col-7];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
    for (int row = 171; row < 197; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 237; col < 294; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[row+78]                       
                         [col+7];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
  }  
  
  public void mirrorGull()
  {
    int mirrorPoint = 294;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 235; row < 310; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 236; col < 345; col++)
      {
    	  rightPixel = pixels[row][col];      
    	  leftPixel = pixels[row-10]                       
                         [col-110];
    	  leftPixel.setColor(rightPixel.getColor());
      }
    }
    
    for (int row = 300; row < 325; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 250; col < 320; col++)
      {
    	  rightPixel = pixels[row][col];      
    	  leftPixel = pixels[row-10]                       
                         [col-110];
    	  leftPixel.setColor(rightPixel.getColor());
      }
    }
    
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void blur(int x, int y, int w, int h){
	  System.out.println("Oleg Nikolaev\nPeriod 1\n4/24/2018\nComputer number: 31\n\n");
	  
	  Pixel[][] pixels = this.getPixels2D();
	  
	  
	  Pixel thisPixel = null;
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  
	  for (int row = y; row < y+h; row++)
	    {
	      for (int col = x; col < x+w ; col++)
	      {
	    	
	    	thisPixel = pixels[row][col];
	        leftPixel = pixels[row][col-1];
	        rightPixel = pixels[row][col+1];
	        topPixel = pixels[row-1][col];
	        bottomPixel = pixels[row+1][col];
	        
	        Pixel[] newPixels = new Pixel[5];
	        newPixels[0] = thisPixel;
	        newPixels[1] = leftPixel;
	        newPixels[2] = rightPixel;
	        newPixels[3] = topPixel;
	        newPixels[4] = bottomPixel;

	        int avgGreen = 0;
	        int avgRed = 0;
	        int avgBlue = 0;
	        
	        for (Pixel p: newPixels){
	        	avgGreen+=p.getGreen();
	        	avgRed+=p.getRed();
	        	avgBlue+=p.getBlue();
	        }
	        
	        avgGreen/=5;
	        avgRed/=5;
	        avgBlue/=5;
	        
	        thisPixel.setGreen(avgGreen);
	        thisPixel.setRed(avgRed);
	        thisPixel.setBlue(avgBlue);
	        
	    }
	  } 
	  
  }
  
  /*
    
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
  }
  
   */
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
