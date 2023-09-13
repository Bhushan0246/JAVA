import java.util.Scanner;
class MinMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Minimum and Maximum of five numbers.");
		System.out.print("Enter five numbers: ");
		int arr[] = new int[5], max = 0;
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {	// check for maximum element
			if(arr[i] > max)
				max = arr[i];
		}
		int min = max;
		for(int i = 0; i<arr.length; i++){	// check for minimum element
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Minimum = " + min);
		System.out.println("Maximim = " + max);
	}
}