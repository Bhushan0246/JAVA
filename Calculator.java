import java.util.Scanner;
class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("1. Addition (+)\n2. Subtraction (-)\n3. Multiplicaton (*)\n4. Division (/)\n");
		System.out.print("Enter choice number: ");
		int choice = sc.nextInt();
		strike();
		System.out.print("Enter first number: ");
		float num1 = sc.nextFloat();
		System.out.print("Enter second number: ");
		float num2 = sc.nextFloat();
		float res = 0;
		switch (choice){
		case 1:
			res = num1 + num2;
			break;
		case 2:
			res = num1 - num2;
			break;
		case 3:
			res = num1 * num2;
			break;
		case 4:
			res = num1 / num2;
			break;
		default:
			System.out.println("Invalid Choice!");
		}
		System.out.println("Result: " + res);
	}
	public static void strike(){
		for(int i = 0; i < 30; i++)
			System.out.print("--");
		System.out.println(" ");
	}
}