import java.util.Scanner;
class Neon_Number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		//Squaring the number
		int square = num * num, temp_sq = square;
		int last, sum = 0;
		while(square > 0){
			last = square % 10;
			sum += last;
			square /= 10;
		}
		if(sum == num)
			System.out.println("Neon number.");
		else
			System.out.println("Not a Neon number.");
	}
}