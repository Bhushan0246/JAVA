import java.util.Scanner;
class Diamond{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		//Pyramid
		for(int i = 0; i < row-1; i++){
			for(int sp = 0; sp < row-i-1; sp++)
				System.out.print(" ");
			for(int j = 0; j < 2*i+1; j++)
				System.out.print("*");
			System.out.println("");
		}
		//invert pyramid
		for(int i = 0; i < row; i++){
			for(int sp = 0; sp < i; sp++)
				System.out.print(" ");
			for(int j = 0; j < 2*(row-i)-1; j++)
				System.out.print("*");
			System.out.println("");
		} 
	}
}