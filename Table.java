import java.util.Scanner;
class Table{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tableOf, count;
		System.out.print("Multiplication table of? ");
		tableOf = sc.nextInt();
		for (count = 1; count <= 10; count++) {
			System.out.println(tableOf + " * " + count + " = " + (tableOf*count));
		}
	}
}