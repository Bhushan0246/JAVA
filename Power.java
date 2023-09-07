import java.util.Scanner;
class Power{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base: ");
		int base = sc.nextInt();
		System.out.print("Enter Exponent: ");
		int exp = sc.nextInt();
		int product = 1;
		for(int i = 0; i<exp; i++)
			product *= base;
		System.out.println("Result = " + product);
	}
}