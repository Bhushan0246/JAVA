class Outer{
    int x = 101;
    void displayInner(){
    Inner in = new Inner();
    in.show();
    System.out.println("Inner y = " + in.y);
    }
    class Inner{
        static int y = 202;
        void show(){
            System.out.println("Outer x = " + x);
        }
    }
}
class Nested_Class{
    public static void main(String[] args){
        Outer out = new Outer();
        out.displayInner();
        System.out.println("Sum x & y = " + (Outer.Inner.y + out.x));
    }
}