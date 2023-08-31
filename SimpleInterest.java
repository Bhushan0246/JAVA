import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal amount: ");
		float p = sc.nextFloat();
		System.out.print("Enter the Interest Rate: ");
		float r = sc.nextFloat();
		System.out.print("Enter the Time (in year): ");
		int t = sc.nextInt();
		double si = (p*r*t)/100;
		System.out.print("Simple Interest: " + si); 
	}
}