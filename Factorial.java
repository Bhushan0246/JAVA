import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		int original = num;
		long fact = 1;
		while(num != 1){
			fact *= num;
			num--;
		}
		System.out.println("Factorial of " + original + " is: " + fact);
	}
}