import java.util.Scanner;
class GreaterEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1>n2){
            System.out.print(n1 + " is greater and ");
            if((n1%2)==0)
                System.out.println("Even number.");
            else
                System.out.println("Odd number.");
        }
        else{
            System.out.print(n2 + " is greater and ");
            if((n2%2)==0)
                System.out.println("Even number.");
            else
                System.out.println("Odd number.");
        }
    }
}