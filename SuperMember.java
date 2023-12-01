class A{
    int i;
}
class B extends A{
    int i;
    B(int a){
        super.i = a;
        i = a + 9;
    }
    void display(){
        System.out.println("SuperClass i: " + super.i);
        System.out.println("SubClass i:" + i);
    }
}
class SuperMember{
    public static void main(String[] args){
        B ob = new B(12);
        ob.display();
    }
}