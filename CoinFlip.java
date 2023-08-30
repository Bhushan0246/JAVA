import java.util.Random;
class CoinFlip{
	public static void main(String[] args) {
		//Create  object of Random class
		Random rnd = new Random();
		//Generate random float number from 0 to 3
		float flip = rnd.nextFloat(3);
		if(flip < 1 || flip == 1.4)
			System.out.println("Head");
		else
			System.out.println("Tail");
	}
}