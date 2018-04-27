/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\beach.jpg");
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\beach.jpg");
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\beach.jpg");
    beach.keepOnlyRed();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\beach.jpg");
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\beach.jpg");
    beach.grayScale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\water.jpg");
    beach.fixUnderwater();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\beach.jpg");
    beach.negate();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\beach.jpg");
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\temple.jpg");
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\beach.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\beach.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testBlur(int x, int y, int w, int h, int n)
  {
	 //System.out.println("Oleg Nikolaev\nPeriod 1\n4/24/2018");
     Picture redMoto = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\redMotorcycle.jpg");
     for (int i = 0; i<n; i++){
        redMoto.blur(x,y,w,h);
     }
     redMoto.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	Picture beach = new Picture("H:\\Labs\\Labs\\Unit16\\src\\images\\redMotorcycle.jpg");
	//beach.explore();  
	testBlur(1,1,638,478,100); 
	//testZeroBlue();
	//testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
	//testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}