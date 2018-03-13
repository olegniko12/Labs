import java.util.Random;
import java.util.Arrays;

public class LotteryTicket {
	private String nameOfBuyer;
	private static int[] numberList;
	
	public static void main(String[] args){
	
		LotteryTicket lT = new LotteryTicket("Jeff");
		int[] jeffsTicket = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(lT.getPercentThatMatch(jeffsTicket)); 
		//Shows percentage that match in decimals.
		System.out.println("The closest ticket belongs to: " + lT.getName() + ". They won with a " + (int) ( (lT.getPercentThatMatch(jeffsTicket)* 100) % 100)+ "% match!"); 
		//
	}
	
	private static boolean search(int toFind){
		for (int i: numberList) { //Goes through each winning number and checks if the given int is found
			if (toFind == i){
				return true;
			}
		}
		
		return false;
		
	}
	
	public LotteryTicket(String name){
		//Part B
		numberList = new int[10];
		for (int i = 0; i<numberList.length; i++){
			
			
			boolean findingNum = true;
			
			while (findingNum == true){
				int tempInt = CreateRandomInt(50);
				
				int timesFound = 0;
				
				if (search(tempInt)){
					timesFound++;
				}
				
				if (timesFound == 0){
					numberList[i] = tempInt;
					findingNum = false;
				}
				
			}
			
			System.out.println("Set number " + (i+1) + " to " + numberList[i]); 
			//Above line shows all ticket numbers that are being set.
			
		}
		
		nameOfBuyer = name;
		
	}
	
	public int CreateRandomInt(int limit){
		Random random = new Random();
		int randomInt = random.nextInt(limit)+1;
		return randomInt;
	}
	
	public double getPercentThatMatch(int[] winningNumbers){
		//Part C
		double percentage = 0.0;
		for (int i: winningNumbers){
			if(search(i)==true){
				percentage += .1;
			}
		}
		return percentage;
	}
	
	public String getName() {
		return nameOfBuyer;
	}
	
}
