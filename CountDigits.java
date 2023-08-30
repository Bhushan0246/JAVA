import java.util.Scanner;
class CountDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check number of digits in a number.");
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int count = 0;
		while(num != 0){
			num /= 10;
			count++;
		}
		System.out.println("Entered number contains " + count + " digits.");
	}
}