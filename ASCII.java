import java.util.Scanner;
class ASCII{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		int val = ch;
		System.out.println("ASCII value is " + val);
	}
}