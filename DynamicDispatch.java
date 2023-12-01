class A{
    int a, b;
    A(){
      a = 20;
      b = 6;  
    }
    void operate(){
        System.out.println("a * b = " + (a*b));
    }
}
class B extends A{
    void operate(){
        System.out.println("a / b = " + (a/b));
    }
}
class C extends A{
    void operate(){
        System.out.println("a % b = " + (a%b));
    }
}
class DynamicDispatch{
    public static void main(String[] args){
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();
        // reference of type A
        A ref;
        ref = ob1;
        ref.operate();
        ref = ob2;
        ref.operate();
        ref = ob3;
        ref.operate();
    }
}