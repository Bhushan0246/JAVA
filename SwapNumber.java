import java.util.Scanner;
class SwapNumber{
    public static void Third_var(float num1, float num2){
        float temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Using third variable.");
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);
    }
    public static void Without_var(float a, float b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Without using third variable.");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers (a & b): ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        Third_var(n1, n2);
        Without_var(n1, n2);
    }
}