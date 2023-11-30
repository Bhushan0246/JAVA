class Static$Block{
    static int a = 451;
    static int b;
    final double PI = 3.1475;
static{
    System.out.println("Inside static block.");
    b = a + 2;
}
    public static void main(String[] args){
        Static$Block ob = new Static$Block();
        System.out.println("a = " + ob.a);
        System.out.println("b = " + Static$Block.b);
        System.out.println("fiinal PI = " + ob.PI);
    }
}
