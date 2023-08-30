import java.util.Scanner;
import java.lang.Math;
class Armstrong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		long num = sc.nextLong();
		long original = num, sum = 0, last = 0;;
		int digits = 0;
		//Counting number of digits
		while(num > 0){
			num /= 10;
			digits++;
		}
		//Re-assign the original number
		num = original;
		//Calculate for number being an Armstrong
		while(num > 0){
			last = num % 10;
			sum += Math.pow(last, digits);
			num /= 10;
		}
		//Test for Armstrong number
		if(original == sum)
			System.out.println("Armstrong!");
		else
			System.out.println("Not an Armstrong!");
	}
}