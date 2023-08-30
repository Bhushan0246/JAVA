import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check for Even or Odd.");
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int remainder = num % 2;
		if(remainder == 0)	//check for Even
			System.out.print("Entered number is Even ");
		else
			System.out.print("Entered number is Odd ");
		if(num > 0)	//check for positive
			System.out.println("positive number.");
		else
			System.out.println("Negative number.");
	}
}