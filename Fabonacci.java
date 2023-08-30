import java.util.Scanner;
class Fabonacci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 1, num3;
		System.out.print("Enter the limit: ");
		int count = sc.nextInt();
		System.out.print("Fabonacci Series: " + num1 + " " + num2);
		for (int i = 2; i < count; i++) {
			num3 = num2 + num1;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
}