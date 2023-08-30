import java.util.Scanner;
class SumOfN{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num, sum = 0, count;
		System.out.println("Sum of N positive numbers.");
		System.out.print("How many numbers? ");
		count = sc.nextInt();
		System.out.println("Enter numbers:");
		for (int i = 0; i<count; i++) {
			num = sc.nextInt();
			if(num < 0)
				System.out.printf(num + " is not a positive number.\nSkipped " + num);
			sum += num;
		}
		System.out.println("Sum = " + sum);
	}
}