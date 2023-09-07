import java.util.Scanner;
class Average_N{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int count = sc.nextInt();
		int num, sum = 0, avg = 0;
		System.out.print("Enter numbers: ");
		for(int i = 0; i<count; i++){
			num = sc.nextInt();
			sum += num;
		}
		avg = sum/count;
		System.out.println("Average of " + count + " is: " + avg);
	}
}