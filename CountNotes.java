import java.util.Scanner;
class CountNotes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int mny = sc.nextInt();
		int temp = mny;
		int arr[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i] + " notes: " + (temp/arr[i]));
			temp %= arr[i];
		}
	}
}