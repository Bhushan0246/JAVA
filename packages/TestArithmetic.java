package mathematics;
import java.util.Scanner;

import mathematics.Arithmetic;

class TestArithmetic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        Arithmetic ob = new Arithmetic(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Addition: " + ob.add());
        System.out.println("Subtraction: " + ob.sub());
        System.out.println("Multiplication: " + ob.mul());
        System.out.println("Division: " + ob.div());
        System.out.println("Modulus: " + ob.mod());
        ob.smaller();
        ob.greater();
        ob.quadEqn();
    }
}