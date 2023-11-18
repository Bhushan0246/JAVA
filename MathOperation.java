import java.util.Scanner;
class MathOperation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value: ");
        double num = sc.nextDouble();
        System.out.println("Ceil value: " + Math.ceil(num));
        System.out.println("Floor value: " + Math.floor(num));
        System.out.println("Square root: " + Math.sqrt(num));
        System.out.println("cube root: " + Math.cbrt(num));
    }
}