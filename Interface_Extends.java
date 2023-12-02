interface A{
    void msg1();
    String msg2();
}
interface B extends A{
    void msg3();
}
class MyClass implements B{
    public void msg1(){
        System.out.println("Hello! Bhushan");
    }
    public String msg2(){
        return "This is Java,";
    }
    public void msg3(){
        System.out.println("Interfaces.");
    }
}
class ItfTest{
    public static void main(String[] args){
        MyClass ob = new MyClass();
        ob.msg1();
        System.out.println(ob.msg2());
        ob.msg3();
    }
}