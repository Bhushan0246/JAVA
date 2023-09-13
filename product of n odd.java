import java.util.Scanner;
class Product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = sc.nextInt();
        long product = 1; 
        int i=3;
        while(i <= limit){
            product *= i;
            i += 2;
        }
        System.out.println("Product of 1 to " + limit + " odd numbers: " + product);
    }
}