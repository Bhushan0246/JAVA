import java.util.Scanner;
class Multiple_N{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int res = n2%n1;
        if(res == 0)
            System.out.println(n1 + " is a multiple of " + n2);
        else
            System.out.println(n1 + " is not a multiple of " + n2);
    }
}