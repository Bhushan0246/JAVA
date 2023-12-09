package mathematics;

interface MathOperation{
    int add();
    int sub();
    int mul();
    int div();
    int mod();
    void greater();
    void smaller();
    void quadEqn();
}
public class Arithmetic implements MathOperation{
    int a, b, c;
    Arithmetic(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int add(){return a + b;}
    public int sub(){return a - b;}
    public int mul(){return a * b;}
    public int div(){return a / b;}
    public int mod(){return a % b;}
    public void greater(){
        if(a < b)
            System.out.println(b + " is greater.");
        else
            System.out.println(a + " is greater.");
    }
    public void smaller(){
        if(a > b)
            System.out.println(b + " is smaller.");
        else
            System.out.println(a + " is smaller.");
    }
    public void quadEqn(){
        double x = (-b+Math.sqrt((b*b)-4*a*c))/2*a;
        double y = (-b-Math.sqrt((b*b)-4*a*c))/2*a;
        System.out.println("Roots of Equation: "+ x + ", " + y);
    }
}
