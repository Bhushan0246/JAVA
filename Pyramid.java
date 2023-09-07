import java.util.Scanner;
class Pyramid{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		for(int i = 0; i<row; i++){
			for(int sp = (row-i-1); sp>0; sp--)
				System.out.print(" ");
			for(int j = 0; j<((2*i)+1); j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}