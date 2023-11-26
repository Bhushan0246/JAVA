import java.util.Scanner;
class Factorial_Recursion{
    long fact(int n){
        if(n == 1)
            return 1;
        long res = fact(n-1) * n;
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        Factorial_Recursion ob = new Factorial_Recursion();
        System.out.print("Factorial = " + ob.fact(n));
    }
}