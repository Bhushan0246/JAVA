class Access{
    int a = 15;
    public double b = 20.5;
    private double c;
    void setc(double x){
        c = x;
    }
    double getc(){
        return c;
    }
    double sum(){
        return a + b + c;
    }
}
class TestAccess{
    public static void main(String[] args){
        Access ob = new Access();
        System.out.println("a = " + ob.a);
        System.out.println("b = " + ob.b);
        ob.setc(30);
        System.out.println("c = " + ob.getc());
        System.out.println("Sum = " + ob.sum());
    }
}