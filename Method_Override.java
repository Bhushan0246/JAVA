class Parent{
    int a, b;
    Parent(int i, int j){
        a = i;
        b = j;
    }
    void sum(){
        System.out.println("Sum a & b: " + (a+b));
    }
}
class Child extends Parent{
    int c;
    Child(int i, int j, int k){
        super(i, j);
        c = k;
    }
    void sum(){
        super.sum();
        System.out.println("Sum a,b & c: " + (a+b+c));
    }
}
class Method_Override{
    public static void main(String[] args){
        Child ob = new Child(1, 23, 61);
        ob.sum();
    }
}