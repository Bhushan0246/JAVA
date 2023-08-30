import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int last, reverse = 0, original;
		original = num;
		while(num > 0){
			last = num % 10;
			reverse = (reverse * 10) + last;
			num /= 10;
		}
		if(reverse == original)
			System.out.println("Palindrome number.");
		else
			System.out.println("Not a Palindrome number.");
	}
}