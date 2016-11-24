import java.util.Random;
Public class CoinFlip {

public static void main(String[]args) {
		//Sam- this is our randomized coin flip
		 String[] HeadsTails = {"Heads","Tails"};
		 Random random = new Random();
		 int index = random.nextInt(HeadsTails.length);
		 //Sam- with every "RUN" it will generate a random
		 //between Heads and Tails only
		 System.out.println(HeadsTails[index]);
		
	}



}
