import java.util.Scanner;

class NonUniform_Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        int arr[][] = new int[row][];
        for(int i=0; i<row; i++)
            arr[i] = new int[i+1];
        // Assigning values to array
        for(int i=0, k=100; i<row; i++){
            for(int j=0; j<=i; j++){
                arr[i][j] = k;
                k--;
            }
        }
        // Printing array
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++)
                System.out.print(arr[i][j] + "  ");
            System.out.println("");
        }
        
    }
}