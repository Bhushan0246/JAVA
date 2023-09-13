import java.util.Scanner;
class SquareNumPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++)
                System.out.print(i*j + " ");
            System.out.println("");
        }
    }
}